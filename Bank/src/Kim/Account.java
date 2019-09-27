package Kim;

import java.util.ArrayList;

public class Account {
	private String accountNo;
	private String name;
	private long balance;
	ArrayList<Transaction> transactions;
	public Account (String accountNo, String name ) {
		transactions = new ArrayList<Transaction>();
		this.accountNo = accountNo;
		this.name = name;
	}
	
	public void deposit(long amount) { //입금
		ArrayList<Transaction> de = new ArrayList<Transaction>();
		this.balance += amount;
		System.out.println("�Աݾ� : " + amount);
		System.out.println("�Ա��� �ݾ� : " + amount );
	}
	
	public void withdraw(long amount) { //���
		if(balance >= amount) { //�ܾ��� ��ݾ׺��� ���ų� ������ 
			this.balance -= amount; //�ܾ׿��� ��ݾ��� ����
			System.out.println("��ݾ� : " + amount);
			System.out.println("�ܾ� : " + balance);
		}else { // if ���ǿ� �ȸ����� �Ⱥ�����.
			System.out.println("�ܾ��� �����ϴ�.");
		}
		
	}
	
	public long getBalance() { //�����ܾ�
		return balance;
		
	}
	
	public ArrayList<Transaction> getTransactions() {
		return transactions;
		
	}

	public String getAccountNo() {
		return accountNo;
	}

	public String getName() {
		return name;
	}
	
}
