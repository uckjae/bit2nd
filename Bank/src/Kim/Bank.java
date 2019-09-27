package Kim;

import java.util.ArrayList;

public class Bank {
	private ArrayList<Account> accounts;
	private int totalAccount; // �Ѱ��¼�

	public Bank() {
		accounts = new ArrayList<Account>();
		
	}

	public void addAccount(String accountNo, String name) { // ���� ����
		Account ac = new Account(accountNo, name);
		accounts.add(ac);
		this.totalAccount++;
	}

	public Account getAccount(String accountNo) { // ���¹�ȣ�� ���� ��������
		Account ac = null; // �ϳ��� ���� �����ϴϱ� ������ ���� ����
		for (int i = 0; i < accounts.size(); i++) { // ���� �ϳ��� ���鼭 ���¹�ȣ�� Ȯ��
			if (accounts.get(i).getAccountNo().equals(accountNo)) { // ���� ���¹�ȣ�� ã����
				ac = accounts.get(i); // ��ü�� ����
			}
		}
		return ac;
	}

	public ArrayList<Account> findAccounts(String name) { // �̸����� ���� ã��
		ArrayList<Account> namefind = new ArrayList<Account>(); // �̸��� ������ ����Ʈ
		for (int i = 0; i < accounts.size(); i++) { // ���� �ϳ��� ���鼭 �����̸��� Ȯ��
			if (accounts.get(i).getName().equals(name)) { // ���� �̸��� ������
				namefind.add(accounts.get(i)); // �濡 ����
			}
		}

		return namefind; // ������ ���� return
	}

	public ArrayList<Account> getAccounts() {
		return accounts; // ��� ���¸�� ��������

	}

	public int getTotalAccount() {
		return totalAccount; // �� ���� �� ��������

	}

}
