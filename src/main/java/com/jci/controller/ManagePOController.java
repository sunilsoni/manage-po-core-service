package com.jci.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jci.model.ManagePO;
import com.jci.model.ManagePOCollectionResponse;
import com.jci.service.ManagePOService;

@RestController
public class ManagePOController {
	
	@Autowired
	private ManagePOService transactionService;

    @RequestMapping(value="/accounts/{accountNumber}/transactions", method = RequestMethod.GET, headers = "Accept=application/json")
    public ManagePOCollectionResponse getTransactions(
    		@PathVariable("accountNumber") String accountNumber) {
    	
    	ManagePOCollectionResponse response = new ManagePOCollectionResponse();
    	response.setTransactions(transactionService.getTransactions(accountNumber));
    	return response;
    }
    
    @RequestMapping("/accounts/{accountNumber}/transactions/{transactionId}")
    public ManagePO getTransactionDetail(
    		@PathVariable("accountNumber") String accountNumber,
    		@PathVariable("transactionId") long transactionId
    		) {
        return transactionService.getTransactionDetail(transactionId);
    }
    
}
