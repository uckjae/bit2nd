package kr.or.bit;

import java.util.Calendar;

public class Transaction { //***거래내역***
	private String transactionDate;
	private String transactionTime;
	private String kind;
	private long amount;//거래금액
	private long balance;

	public Transaction(String king, long amount, long balance) {
		Calendar cal = Calendar.getInstance();
		int y = cal.get(Calendar.YEAR);
		int m = cal.get(Calendar.MONTH);
		int d = cal.get(Calendar.DATE);
		int h = cal.get(Calendar.HOUR);
		int mi = cal.get(Calendar.MINUTE);
		int s = cal.get(Calendar.SECOND);
		this.transactionDate=y+"-"+m+"-"+d;
		this.transactionTime=h+":"+mi+":"+s;
		this.kind=kind;
		this.amount=amount;
		this.balance=balance;
	}

	//public long getBalance() {
	//	return balance;
	//}

	@Override
	public String toString() {
		return " 날짜=" + transactionDate + " / 시간=" + transactionTime +
				" / 거래유형="+ kind + " / 거래금액=" + amount + " / 잔액=" + balance;
	}
}
