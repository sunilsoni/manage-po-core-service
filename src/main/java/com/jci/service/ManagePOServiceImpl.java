package com.jci.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jci.model.ManagePO;

@Service
public class ManagePOServiceImpl implements ManagePOService{

	@Override
	public ManagePO getTransactionDetail(long transactionId) {
		ManagePO transaction = new ManagePO(transactionId, "123", "FromAcc-Detail", "2014-12-12", transactionId);
		return transaction;
	}

	@Override
	public List<ManagePO> getTransactions(String accountId) {
		List<ManagePO> transactions = new ArrayList<ManagePO>();
		for(int i=0; i<3; i++){
			ManagePO transaction = new ManagePO(i, accountId, "FromAcc-"+i, "2014-12-12", 10);
			transactions.add(transaction);
		}
		
		return transactions;
	}

}
