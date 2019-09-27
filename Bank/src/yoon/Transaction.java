package yoon;

public class Transaction {
	private String transactionDate;
	private String transactionTime;
	private String kind;
	private long amount;
	private long balance;

	public Transaction(String transactionDate, String transactionTime, String kind, long amount, long balance) {
		this.transactionDate = transactionDate;
		this.transactionTime = transactionTime;
		this.kind = kind;
		this.amount = amount;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return String.format("거래 일자 : %s\t거래 시간 : %s\t%s : %d\t남은 금액 : %d", transactionDate, transactionTime, kind,
				amount, balance);
	}
}
