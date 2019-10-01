package won;

import java.util.ArrayList;

public class Account {
	private String accountNo;
	private String name;
	private long balance;
	private ArrayList<Transaction> transactions;
	private int index;
	public Account() {
		transactions = new ArrayList<Transaction>();
		index = 0;
	}
	public Account(String accountNo, String name){ // 계좌생성시 적은 계좌번호, 이름 정보 저장
		transactions = new ArrayList<Transaction>();
		this.accountNo = accountNo;
		this.name = name;
		index = 0;
	}
	
	public void deposit(long amount) { // 입금 
		transactions.add(new Transaction("입금"));
		transactions.get(index).setAmount(amount);
		this.balance += amount;
		transactions.get(index).setBalance(balance);
		index++;
		System.out.println(amount + "원이 입금 되었습니다");
	}
	public void withdraw(long amount) { // 출금
		if(this.balance < amount) {
			System.out.println("잔액이 부족합니다");
		} else {
			transactions.add(new Transaction("출금"));
			transactions.get(index).setAmount(amount);
			this.balance -= amount;
			transactions.get(index).setBalance(balance);
			index++;
			System.out.println(amount + "원이 출금 되었습니다");
		}
	}
	
	public long getBalance() {
		return balance;
	}
	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "계좌번호 : " + accountNo + ", 이름 : " + name;
	}
	
}
