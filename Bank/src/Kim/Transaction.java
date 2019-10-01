package Kim;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Transaction {
	private String ss; // 거래날짜
	private String ss2; // 거래시간
	private String kind; // 거래종류
	private long amount; // 거래금액
	private long balance; // 잔액 
	
	
	public Transaction(String kind, long amount, long balance) { //생성자 초기화하기 위해 생성
		this.amount = amount; // 거래금액 초기화
		this.balance = balance; // 잔액 초기화
		this.kind = kind; // 거래종류 초기화
		String a = new SimpleDateFormat("YYYY년MM월 E요일").format(Calendar.getInstance().getTime());
		String b = new SimpleDateFormat("HH시 mm분 ss초").format(Calendar.getInstance().getTime());
		this.ss = a;
		this.ss2 = b;
		
	}

	@Override
	public String toString() {
		return "[거래 날짜: " + ss + ", 거래 시간 : " + ss2 + ", 거래 종류 : "
				+ kind + ", 거래금액  : " + "$" + amount + ", 잔액 :" + "$" + balance + "]";
	}
	
	
}
