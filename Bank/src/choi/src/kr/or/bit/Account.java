package kr.or.bit;

import java.util.ArrayList;

public class Account {//***계좌***
	private String accountNo;//계좌번호
	private String name;//이름
	private long balance;   //잔고
	private ArrayList<Transaction> transactions;//거래내역

	public Account(String accountNo, String name) {//bank 받기위한
		this.accountNo=accountNo;
		this.name=name;
		this.balance=this.balance;
		this.transactions=new ArrayList<Transaction>(); 	
	}

	public void deposit(long amount) {//입금
		this.balance=this.balance+amount;
		this.transactions.add(new Transaction("입금",amount,this.balance));
		System.out.println(this.name+"님"+amount+"입금되었습니다.");
	}
	public void withdraw(long amount) {//출금
		if(this.balance>=amount) {
			this.balance-=amount;
			this.transactions.add(new Transaction("출금", amount, this.balance));
			System.out.println(this.name+"님"+amount+"출금되었습니다");   	
		}else
			System.out.println("잔고가 부족합니다.");
	}
	public long getBalance() {//잔고확인
		return balance;
	}
	public ArrayList<Transaction>getTransactions(){//거래내역보기
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
			return "계좌번호=" + accountNo + " / 성명=" + name + " / 잔액=" + balance + " / 트랜잭션="
					+ transactions;
		}

}
