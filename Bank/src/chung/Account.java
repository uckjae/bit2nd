package chung;

import java.util.ArrayList;

public class Account {
	private String accountNo;
	private String name;
	private long balance;
	private ArrayList<Transaction> transactions;
	
	Account() {
		ArrayList<Transaction> transactions = new ArrayList<Transaction>();
	}
	void deposit(long amount) {
		this.balance += amount;
		//transactions.add(e)
	}
	void withdraw(long amount) {
		this.balance -= amount;
	}
	long getBalance() {
		
		return balance;
	}
	ArrayList<Transaction> getTransactions() {
		return transactions;
	}
}
