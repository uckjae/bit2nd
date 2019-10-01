package chung;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Transaction {
	private String transactionDate;
	private String transactionTime;
	private String kind;
	private long amount;
	private long balance;
	
	Transaction(String kind, long amount, long balance) {
		
<<<<<<< HEAD
		//  심플 데이터 포맷을 쓰면 값이  null이 나온다 ...
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss");
		Date date = new Date();
		String transactionDate =  sdf.format(date);
		
		String transactionTime = time.format(date);
		
		
//		Calendar cal = Calendar.getInstance();
//		int yy = cal.get(Calendar.YEAR);
//	    int MM = cal.get(Calendar.MONTH);
//	    int dd = cal.get(Calendar.DATE);
//	    int hh = cal.get(Calendar.HOUR);
//	    int mm = cal.get(Calendar.MINUTE);
//	    int ss = cal.get(Calendar.SECOND);
	    this.transactionDate = transactionDate;
	    this.transactionTime = transactionTime;
=======
		//심플 데이터 포맷을 쓰면 값이  null이 나온다 ...  this가 문제였다 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss");
		Date date = new Date();
		this.transactionDate =  sdf.format(date);
		System.out.println(transactionDate);
		this.transactionTime = time.format(date);
		
		/*
		Calendar cal = Calendar.getInstance();
		int yy = cal.get(Calendar.YEAR);
	    int MM = cal.get(Calendar.MONTH);
	    int dd = cal.get(Calendar.DATE);
	    int hh = cal.get(Calendar.HOUR);
	    int mm = cal.get(Calendar.MINUTE);
	    int ss = cal.get(Calendar.SECOND);
	    this.transactionDate = yy + "/" + MM + "/" + dd;
	    this.transactionTime = hh + ":" + mm + ":" + ss;
	    */
>>>>>>> 796f4099e5aea9c60f309871a9323b5267a98c13
		this.kind = kind;
		this.amount = amount;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Transaction [transactionDate=" + transactionDate + ", transactionTime=" + transactionTime + ", kind="
				+ kind + ", amount=" + amount + ", balance=" + balance + "]";
	}
	
}
