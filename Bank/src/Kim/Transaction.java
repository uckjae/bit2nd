package Kim;

import java.text.SimpleDateFormat;

public class Transaction {
	private SimpleDateFormat transactionDate; // 거래날짜
	private SimpleDateFormat transactionTime; // 거래시간
	private String kind; // 거래종류
	private long amount; // 거래금액
	private long balance; // 잔액 
	
	public Transaction(SimpleDateFormat ss, SimpleDateFormat ss2,String kind, long amount, long balance) { //생성자 초기화하기 위해 생성
		this.transactionDate = ss; // 거래 날짜 초기화
		this.transactionTime = ss2; // 거래 시간 초기화
		this.amount = amount; // 거래금액 초기화
		this.balance = balance; // 잔액 초기화
		this.kind = kind; // 거래종류 초기화
	}

	@Override
	public String toString() {
		return "[거래 날짜: " + transactionDate + ", 거래 시간 =" + transactionTime + ", 거래 종류"
				+ kind + ", 거래금액  : " + "$" + amount + ", 잔액 :" + "$" + balance + "]";
	}
	
	
}
