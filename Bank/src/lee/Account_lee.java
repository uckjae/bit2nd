package lee;

import java.util.ArrayList;

public class Account_lee {
	private String accountNo;
	private String name;
	private long balance;
	private ArrayList<Transaction_lee> transactions;

	public Account_lee(String accountNo, String name) {
		this.accountNo = accountNo;
		this.name = name;
		this.balance = 0;
		this.transactions = new ArrayList<>();
	}

	public void deposit(long amount) {
		this.balance += amount;
		transactions.add(new Transaction_lee("deposit",amount,this.balance));
	}
	
	public void withdraw(long amount) {
		this.balance -=amount;
		transactions.add(new Transaction_lee("withdraw",amount,this.balance));
	}
	
	public long getBalance() {
		return balance;
	}
	
	public ArrayList getTransactions() {
		return transactions;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public String getName(){return name;}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountNo == null) ? 0 : accountNo.hashCode());
		result = prime * result + accountNo.hashCode();

		return result;


	}

	@Override
	public String toString() {
		return "Account Number" + accountNo + "Name" + name + "Balance" + balance;
	}

	public boolean equals(Account_lee account) {
		boolean result = false;
		result = (this.accountNo.equals(account.accountNo))?true:false;
		return result;
	}
}
