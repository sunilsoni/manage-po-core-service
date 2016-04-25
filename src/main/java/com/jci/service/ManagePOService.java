package com.jci.service;

import java.util.List;

import com.jci.model.ManagePO;

public interface ManagePOService {

	public ManagePO getTransactionDetail(long transactionId);
	
	public List<ManagePO> getTransactions(String accountId);
}
