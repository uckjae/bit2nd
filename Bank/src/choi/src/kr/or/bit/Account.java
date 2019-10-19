package choi.src.kr.or.bit;

import java.util.ArrayList;

public class Account {//***����***
	private String accountNo;//���¹�ȣ
	private String name;//�̸�
	private long balance;   //�ܰ�
	private ArrayList<Transaction> transactions;//�ŷ�����

	public Account(String accountNo, String name) {//bank �ޱ�����
		this.accountNo=accountNo;
		this.name=name;
		this.balance=this.balance;
		this.transactions=new ArrayList<Transaction>(); 	
	}

	public void deposit(long amount) {//�Ա�
		this.balance=this.balance+amount;
		this.transactions.add(new Transaction("�Ա�",amount,this.balance));
		System.out.println(this.name+"��"+amount+"�ԱݵǾ����ϴ�.");
	}
	public void withdraw(long amount) {//���
		if(this.balance>=amount) {
			this.balance-=amount;
			this.transactions.add(new Transaction("���", amount, this.balance));
			System.out.println(this.name+"��"+amount+"��ݵǾ����ϴ�");   	
		}else
			System.out.println("�ܰ� �����մϴ�.");
	}
	public long getBalance() {//�ܰ�Ȯ��
		return balance;
	}
	public ArrayList<Transaction>getTransactions(){//�ŷ���������
		return transactions;
	}

	public String getAccountNo() {
			return accountNo;
	}
	public String getName() {
			return name;
	}

	@Override
	public String toString() {
			return "���¹�ȣ=" + accountNo + " / ����=" + name + " / �ܾ�=" + balance + " / Ʈ�����="
					+ transactions;
		}

}
