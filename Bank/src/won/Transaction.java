package won;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Transaction {
	private String transactionDate;
	private String transactionTime;
	private String kind;
	private long amount;
	private long balance;
	
	public Transaction(String kind) { // 입출금 내역 입력 .. 거래시간, 입/출금 내역, 잔액
		Calendar calendar = Calendar.getInstance();
		this.transactionDate = DateString(calendar);
		this.transactionTime = TimeString(calendar);
		this.kind = kind;
	}

	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public String getTransactionDate() {
		return transactionDate;
	}
	public String getTransactionTime() {
		return transactionTime;
	}
	public String getKind() {
		return kind;
	}
	public static String DateString(Calendar date) {
		return date.get(Calendar.YEAR) + "년"
				+ date.get(Calendar.MONTH) + "월"
				+ date.get(Calendar.DATE) + "일";
	}
	public static String monthFormat_DateString(Calendar date) {
        return null;
    }
	public static String TimeString(Calendar time) {
        return time.get(Calendar.HOUR) + ":" 
        		+ time.get(Calendar.MINUTE) + ":" 
        		+ time.get(Calendar.SECOND);
    }
	
	@Override
	public String toString() {
		return "날짜 : " + transactionDate + ", 시간 : " + transactionTime + ", 입/출금 종류 : "
				+ kind + ", 금액 : " + amount + ", 잔액 : " + balance + "\n";
	}
}

//eturn new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
