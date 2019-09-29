package chung;

import java.util.ArrayList;

public class Account {
	private String accountNo;
	private String name;
	private long balance ;
	private ArrayList<Transaction> transactions;
	
	Account(String accountNo,String name) {  
		this.accountNo = accountNo;
		this.name = name;
		transactions = new ArrayList<Transaction>();
	}
	void deposit(long amount) { //입금한다
		this.balance += amount;  //새로운 잔고 = 잔고-거래금액 
		//transactions.add(new Transaction("입금",amount,this.balance));  //입금하면 거래내역에 추가된다 
		 transactions.add(new Transaction("입금", amount, this.balance));
	}
	void withdraw(long amount) { //출금한다 
		if(this.balance > amount) { 
			this.balance -= amount; 
			transactions.add(new Transaction("출금",amount,this.balance));  //출금하면 거래내역에 추가된다 
		} else { 
			System.out.println("고객님 잔액이 부족합니다");  
		}
	}
	long getBalance() {  //잔고를 확인한다 
		return balance;
	}
	ArrayList<Transaction> getTransactions() {  //거래내역을 본다 
		return transactions;
	}
	
	public String getAccountNo() {  //계좌번호로 계좌 찾기 위해 만들어준다 
		return accountNo;
	}	
	public String getName() {  //이름으로 계좌 찾기위해 만들어준다
		return name;
	}
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", name=" + name + ", balance=" + balance + ", transactions="
				+ transactions + "]";
	}
	
}
