package Kim;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Account {
	private String accountNo; //계좌번호 
	private String name; //이름 
	private long balance; //잔액 
	private ArrayList<Transaction> transactions; //거래내역 
	public Account (String accountNo, String name ) { //계좌 (계좌 번호 , 이름)
		this.transactions = new ArrayList<Transaction>(); //거래 내역을 리스트로 생성
		this.accountNo = accountNo; //계좌번호를 초기화
		this.name = name; // 이름을 초기화
	}
	
	public void deposit(long amount) { //입금
		ArrayList<Transaction> tr = new ArrayList<Transaction>();
		SimpleDateFormat ss = new SimpleDateFormat("YYY년MM월 E요일"); //날짜 생성
		SimpleDateFormat ss2 = new SimpleDateFormat("HH시 mm분 ss초"); //시간 생성
		this.balance += amount; // 잔액에 입금액을 누적 
		tr.add(new Transaction(ss, ss2, "입금", balance, amount));
	}
	
	public void withdraw(long amount) { //출금 
		SimpleDateFormat ss = new SimpleDateFormat("YYY년MM월 E요일"); //날짜 생성 
		SimpleDateFormat ss2 = new SimpleDateFormat("HH시 mm분 ss초"); //시간 생성
		if(balance >= amount) { // 잔액이 출금액과 같거나 크면 
			this.balance -= amount; // 잔액에서 출금액을 뺀다
			transactions.add(new Transaction(ss, ss2, "출금" ,amount,balance));
		}else { // if 조건이 만족을 못하면 잔액이 안빠진다
			System.out.println("잔액이 부족합니다");
		}
		
	}
	
	public long getBalance() { //잔액을 보여줌 
		return balance; //잔액을 return
		
	}
	
	public ArrayList<Transaction> getTransactions() { // 거래 내역 리스트를 보여줌 
		return transactions; //거래 내역을 return
		
	}

	public String getAccountNo() { //getter 
		return accountNo;
	}

	public String getName() { //getter 
		return name;
	}
	
}
