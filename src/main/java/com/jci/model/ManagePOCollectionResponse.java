package com.jci.model;

import java.util.ArrayList;
import java.util.List;

public class ManagePOCollectionResponse {
	private List<ManagePO> transactions;

	public List<ManagePO> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<ManagePO> transactions) {
		this.transactions = transactions;
	}
	
	public void addTransaction(ManagePO transaction) {
		if (this.transactions == null) {
			this.transactions = new ArrayList<>();
		}
		this.transactions.add(transaction);
	}
}
