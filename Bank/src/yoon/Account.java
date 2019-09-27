package yoon;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Account {
	private String accountNo;
	private String name;
	private long balance;
	private List<Transaction> transactions;

	public Account(String accountNo, String name) {
		transactions = new ArrayList<Transaction>();
		this.accountNo = accountNo;
		this.name = name;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public String getName() {
		return name;
	}

	public void deposit(long amount) {
		balance += amount;
		Transaction transaction = new Transaction(MyCalendar.date(), MyCalendar.time(), "입급", amount, balance);
		transactions.add(transaction);

		System.out.println(transaction.toString());
	}

	public void withdraw(long amount) {
		if (balance - amount > 0) {
			balance -= amount;
			Transaction transaction = new Transaction(MyCalendar.date(), MyCalendar.time(), "출금", amount, balance);
			transactions.add(transaction);

			System.out.println(transaction.toString());
		} else {
			System.out.println("출금 급액 초과!. 잔여급액 : " + balance);
		}
	}

	public long getBalance() {
		return balance;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}
}
