package lee;

import java.util.Date;

public class Transaction_lee {
	private String transactionDate;
	private String transactionTime;
	private String kind;
	private long amount;
	private long balance;

	public Transaction_lee(String kind, long amount , long balance) {
		if(!kind.equalsIgnoreCase("withdraw") || !kind.equalsIgnoreCase("deposit") ){
			return;
		}else if(kind.equalsIgnoreCase("Withdraw")){
			this.kind = "Withdraw";
			this.balance -= amount;
		}else{
			this.kind = "Deposit";
			this.balance += amount;
		}
		this.transactionDate = String_Time.Date();
		this.transactionTime = String_Time.Time();
	}
}
