package com.jci;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.jci.domain.Item;
import com.jci.domain.ItemDiv;
import com.jci.domain.PO;
import com.jci.domain.PoDiv;
import com.jci.domain.PoItem;
import com.jci.domain.ShipTo;
import com.jci.domain.VendAddr;
import com.jci.domain.Vendor;
import com.jci.domain.VendorDiv;
import com.jci.repository.PORepository;
import com.jci.utils.CommonUtils;
import com.jci.utils.Constants;
import com.jci.utils.PrepareQueryData;

@Component
public class MultiDatasource {

    private static Logger logger = LoggerFactory.getLogger(MultiDatasource.class);

    @Inject
    PORepository poRepository;
    
    @Autowired
    @Qualifier("jdbcPostgresqlTemplate")
    private JdbcTemplate jdbcPostgresqlTemplate;
    
    @Autowired
    @Qualifier("jdbcOpenedgeTemplate")
    private JdbcTemplate jdbcOpenedgeTemplate;

   // @Scheduled(fixedRate = 100000)
    public void testQuery(){
    	logger.info("### Starting MultiDatasource.testQuery ###");

        //Integer postgresqlCount = jdbcPostgresqlTemplate.queryForObject("SELECT count(*) FROM fe_prod_claims_postprocess",Integer.class);
        
       // Integer topenedgeCount = jdbcOpenedgeTemplate.queryForObject("SELECT count(*) from po",Integer.class);

        //System.out.println("PostgresqlCount="+postgresqlCount+"  topenedgeCount="+topenedgeCount);
       //logger.debug("PostgresqlCount {}, topenedgeCount {}",  postgresqlCount,topenedgeCount);
       
       getAndSaveSymixData("2013-05-03");
       logger.info("### Ending MultiDatasource.testQuery ###");
    }
    
 
    private int getAndSaveSymixData(String dateStr){
    	
    	Date date = CommonUtils.stringToDate(dateStr);
        Object[] parameters = new Object[] {date};
        
        //String symixQuery ="SELECT * FROM \"po\" \"poAlias\" INNER JOIN \"poitem\" \"poitemAlias\"  ON  \"poAlias\".\"po-num\" = \"poitemAlias\".\"po-num\"  INNER JOIN \"vendor\" \"vAlias\"  ON  \"poAlias\".\"vend-num\" = \"vAlias\".\"vend-num\"  INNER JOIN \"item\" \"iAlias\"  ON  \"poitemAlias\".\"item\" = \"iAlias\".\"item\"   INNER JOIN \"shipto\" \"sAlias\"  ON  \"poitemAlias\".\"drop-ship-no\" = \"sAlias\".\"drop-ship-no\" and \"poAlias\".\"drop-ship-no\" = \"sAlias\".\"drop-ship-no\" INNER JOIN \"po-div\" \"podAlias\"  ON  \"podAlias\".\"po-num\" = \"poAlias\".\"po-num\" INNER JOIN \"vendor-div\" \"vdAlias\"  ON  \"vdAlias\".\"vend-num\" = \"vAlias\".\"vend-num\"  INNER JOIN \"item-div\" \"idAlias\"  ON  \"idAlias\".\"item\" = \"iAlias\".\"item\" WHERE \"poAlias\".\"order-date\" >=  ? ";
        //System.out.println("symixQuery---->"+ symixQuery);
        
        List<Map<String,Object>> rows =    jdbcOpenedgeTemplate.queryForList(Constants.SIMUX_QUERY,parameters);
        System.out.println("size--->"+rows.size());
        
        try{
     	   for (Map<String,Object> row : rows) {
         	   //System.out.println("po-num---->"+   row.get("po-num"));
         	   
         	   //PO Details 
         	   PO po = PrepareQueryData.preparePoData(row);
         	  
         	   if(po==null){
         		   continue;
         	   }
         	   
         	   PoItem poItem = PrepareQueryData.preparePoItemData(row); 
         	   po.setPoItem(poItem);
         	   
         	   Vendor vendor = PrepareQueryData.prepareVendorData(row); 
         	   po.setVendor(vendor);
         	   
         	   Item item = PrepareQueryData.prepareItemData(row);
         	   poItem.setItemKey(item);
         	   
         	   ShipTo shipTo = PrepareQueryData.prepareShipToData(row); 
         	   po.setShipTo(shipTo);
         	   
         	   PoDiv poDiv = PrepareQueryData.preparePoDivData(row); 
         	   po.setPoDiv(poDiv);
         	   
         	   VendorDiv vendorDiv = PrepareQueryData.prepareVendorDivData(row); 
         	   vendor.setVendorDiv(vendorDiv);
         	   
         	   
         	   ItemDiv itemDiv = PrepareQueryData.prepareItemDivData(row); 
         	   item.setItemDiv(itemDiv);
         	   
         	   VendAddr vendAddr = PrepareQueryData.prepareVendAddrData(row); 
         	   vendor.setVendAddr(vendAddr);
         	   
         	  // System.out.println("po--->"+po);
         	  // poRepository.save(po);
         	   
        	}
        }catch(Exception e){
     	   System.out.println("### Exception in  MultiDatasource.testQuery ###"+e.getMessage());
     	   e.printStackTrace();
        }
        
    	return rows.size();
    }
    
}
