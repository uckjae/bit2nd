package choi.src.kr.or.bit;

import java.util.ArrayList;

public class Bank {
	private ArrayList<Account>accounts;//����
	private int totalAccount;
	
	public Bank() {
		this.accounts = new ArrayList<Account>();
	}
	
	public void addAccount(String accountNo, String name) {//���»���
		this.accounts.add(new Account(accountNo,name));//���¹�ȣ,�̸� �Է½� ����Ŭ������ ��
		this.totalAccount++; //���¼� �߰�
		System.out.println(name+"���°� �����Ǿ����ϴ�.");
	}
	
	public Account getAccount(String accountNo) {//����ã��(��ȣ)
		Account findNum=null;
		for(int i=0; i<accounts.size(); i++) {
			if(accounts.get(i).getAccountNo().equals(accountNo)) {
				findNum=accounts.get(i);
			}else if(findNum==null) {
				System.out.println("ã�°��°� �����ϴ�.");
			}
			return findNum;
		}
		return null;
		
	}
	public ArrayList<Account>findAccounts(String name){
		ArrayList<Account>findNamelist = new ArrayList<Account>();
		for(int i=0; i<accounts.size(); i++) {
			if(accounts.get(i).getName().equals(name)) {
				findNamelist.add(accounts.get(i));
			}else if(findNamelist.get(0)==null) {
				System.out.println("ã�°��°� �����ϴ�");
			}
		
		}
		return findNamelist;
	}
	
	public ArrayList<Account>getAccounts(){//���¸�Ϻ���
		return accounts; //??
	}
	public int getTotalAccount() { //�Ѱ��¼� ��ȯ
		return totalAccount;//??
	}

}
