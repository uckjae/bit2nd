package Kim;

public class Transaction {
	private String transactionDate; //��¥
	private String transactionTime; //�ð�
	private String kind; // ���� �Ա� or ��� 
	private long amount; //�ݾ� 
	private long balance; //�ܾ�
	
	public Transaction(String transactionDate, String transactionTime, long amount, long balance, String kind) {
		this.transactionDate = transactionDate;
		this.transactionTime = transactionTime;
		this.amount = amount;
		this.balance = balance;
		this.kind = kind;	
	}

	@Override
	public String toString() {
		return "Transaction [�ŷ� ��¥ : " + transactionDate + ", �ŷ� �ð� =" + transactionTime + ", �ŷ� ����"
				+ kind + ", �ŷ� �ݾ�  : " + "$" + amount + ", ���� �ܾ� :" + "$" + balance + "]";
	}
	
	
}
