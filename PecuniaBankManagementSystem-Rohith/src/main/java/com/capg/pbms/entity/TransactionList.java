package com.capg.pbms.entity;

import java.util.List;

import com.capg.pbms.entity.Transaction;

/*******************************************************************************************************************************
-Author                   :     K.Rohith Kumar
-Created/Modified Date    :     05-10-2020
-Description              :     Transaction List Bean Class

*******************************************************************************************************************************/
public class TransactionList {

	private List<Transaction> transactions;

	public TransactionList(List<Transaction> transactions) {
		super();
		this.transactions = transactions;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	@Override
	public String toString() {
		return "TransactionList [transactions=" + transactions + "]";
	}
	
}
