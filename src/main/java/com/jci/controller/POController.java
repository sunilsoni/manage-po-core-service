package com.jci.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jci.domain.E2Open;
import com.jci.model.request.FlatFileRequest;
import com.jci.model.request.PullPoDataRequest;
import com.jci.model.response.PoNumDataResponse;
import com.jci.model.response.PullPoDataResponse;
import com.jci.repository.PORepository;
import com.jci.utils.CommonUtils;
import com.jci.utils.Constants;
import com.jci.utils.PrepareQueryData;
import com.univocity.parsers.csv.CsvParser;
import com.univocity.parsers.csv.CsvParserSettings;

@RestController
@RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
public class POController {

    @Inject
    PORepository poRepository;

    @Autowired
    @Qualifier("jdbcPostgresqlTemplate")
    private JdbcTemplate jdbcPostgresqlTemplate;
    
    @Autowired
    @Qualifier("jdbcOpenedgeTemplate")
    private JdbcTemplate jdbcOpenedgeTemplate;
    
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello(){
        return "Hello there !";
    }

/*    @RequestMapping(value = "/po/{po_num}", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public PO create(@PathVariable int po_num) {
    	System.out.println("po_num--->"+po_num);
        return poRepository.save(new PO(po_num));
    }

    @RequestMapping(value = "/po/save", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public PO save(@RequestBody final PO saveRequest) {
    	System.out.println("saveRequest--->"+saveRequest);
    	
        return poRepository.save(saveRequest);
    }
    
    @RequestMapping(value = "/po", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<PO> findAll() {
    	System.out.println("#### Starting findAll ####");
        final List<PO> resultList = new ArrayList<>();
        
        final Iterable<PO> all = poRepository.findAll();
        
        
        all.forEach(new Consumer<PO>() {
            @Override
            public void accept(PO appUser) {
                resultList.add(appUser);
            }
        });
		
        System.out.println("resultList.size--->"+resultList.size());
        //System.out.println("#### Ending findAll ####"+resultList);
        return resultList;
    }*/
   
    @RequestMapping(value = "/pullPoData", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public  PullPoDataResponse getPoData(@RequestBody PullPoDataRequest request){
    	System.out.println(" Starting getPoData(core)--->"+request);
    	
    	List<Integer> status = new ArrayList<>();
    	status.add(Constants.STATUS_INTRANSIT);
    	status.add(Constants.STATUS_ERRO_IN_PROCESS);
    	
    	List<E2Open> poList = poRepository.findByStatusIn(status);
    	System.out.println(" Ending getPoData(core)--->"+poList);
		return CommonUtils.preparePullPoDataResponse(poList);
    }
    	
	@RequestMapping(value = "/getPoNumData", method = RequestMethod.POST, headers = "Accept=application/json")
    public  PoNumDataResponse getPoNumData(@RequestBody FlatFileRequest request){
		System.out.println(" Starting processPoData(core)--->"+request);
		//getAndSaveSymixData("2013-05-03");
		
		PoNumDataResponse res = new PoNumDataResponse();
		
		List<String> poNums =  request.getPoNums();
		int poIdsSize = (poNums == null) ? 0 : poNums.size();
    	System.out.println("poIdsSize--->"+poIdsSize);
    	
    	if(poIdsSize==0){
    		res.setErrorMsg("Please select atleast 1 PO!");
    	}
    	
    	if(poIdsSize>0){
    		List<E2Open> poList = poRepository.findByOrderNumberIn(poNums);
    		int poListSize = (poList == null) ? 0 : poList.size();
    		System.out.println("poListSize--->"+poListSize);
    		
    		if(poListSize==0){
        		res.setErrorMsg("Data is not available for the give PO numbers!");
        	}
    		
    		if(poListSize>0){
    			try{
    				List<String> lines =  CommonUtils.fixedLengthString(poList);
            		res.setLines(lines);
            		
            		//For now we are assuming that we will get only one po from UI to generate only one file at a time
            		//System.out.println("poNums.get(0)--->"+poNums.get(0));
            		res.setPoNum(poNums.get(0));
            		res.setFileName(CommonUtils.getFileName(poNums.get(0)));            		
    			}catch(Exception e){
    				res.setError(true);
    				e.printStackTrace();
    			}
    		}
    	}
    	System.out.println(" Ending processPoData(core)--->");
		return res;
    }
    
    

    
  private int getAndSaveSymixData(String dateStr){
    	Date date = CommonUtils.stringToDate(dateStr);
        Object[] parameters = new Object[] {date};
        
        List<Map<String,Object>> rows =    jdbcOpenedgeTemplate.queryForList(Constants.SIMUX_QUERY,parameters);
        System.out.println("rows size--->"+rows.size());
        
        try{
        	CsvParser parser = new CsvParser(new CsvParserSettings());
     		CommonUtils data = new CommonUtils();
     		
     		List<String[]> allCsvRows = parser.parseAll(data.getReader());
     		
     		String[] columnNames =null;
     		int allCsvRowsSize = allCsvRows==null ? 0:allCsvRows.size();
     		for (int i=2;i<allCsvRowsSize;i++) {
     			String[] rowVal = allCsvRows.get(i);
     			if(rowVal!=null && "Symix".equalsIgnoreCase(rowVal[0])){
     				columnNames = rowVal;
     			}
     		}
     		if(allCsvRowsSize<3 || columnNames==null || columnNames.length<1){
     			return 0;
     		}
     		
     	   for (Map<String,Object> row : rows) {
     		   E2Open e2Open = PrepareQueryData.prepareE2OpenData(row,columnNames); 
         	   poRepository.save(e2Open);
        	}
        }catch(Exception e){
     	   System.out.println("### Exception in  MultiDatasource.testQuery ###"+e.getMessage());
     	   e.printStackTrace();
        }
    	return rows.size();
    }
    
}
