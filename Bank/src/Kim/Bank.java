package Kim;

import java.util.ArrayList;

public class Bank {
	private ArrayList<Account> accounts;
	private int totalAccount; // �Ѱ��¼�

	public Bank() {
		accounts = new ArrayList<Account>();
		
	}

	public void addAccount(String accountNo, String name) { // 계좌 생성 
		Account ac = new Account(accountNo, name); // 객체를 초기화 파라매터를 계좌번호랑 이름을 받음
		accounts.add(ac); // 리스트에 객체를 추가 
		this.totalAccount++; // 만들어 질때마다 계좌수 추가 
	}

	public Account getAccount(String accountNo) { // 계좌번호르 계좌찾기 
		Account ac = null; // 객체를 NULL로 초기화 
		for (int i = 0; i < accounts.size(); i++) { // 리스트 사이즈 만큼 방을 돌음
			if (accounts.get(i).getAccountNo().equals(accountNo)) { // 리스트에 있는 계좌번호를 가져와서 내가 찾는 계좌번호랑 같으면 
				ac = accounts.get(i); // 찾은 계좌번호를 객체에 저장 
			}
		}
		return ac; // 저장한것을 리턴해서 보여줌
	}

	public ArrayList<Account> findAccounts(String name) { // 이름으로 계좌번호 찾기 
		ArrayList<Account> namefind = new ArrayList<Account>(); // 리스트를 초기화 Account 타입이며 초기화 하기 위해 생성 
		for (int i = 0; i < accounts.size(); i++) { // 리스트 사이즈 만큼 방을 돌음 
			if (accounts.get(i).getName().equals(name)) { // 리스트에 있는 이름을 가져와서 내가 찾는 이름과 같으면 
				namefind.add(accounts.get(i)); // 동명 이인이 많을 수도 있어서 리스트에 저장 ㄴㄴㄴㄴ
			}
		}

		return namefind; // 그 찾은 이름을 return 해서 띄워줌
	}

	public ArrayList<Account> getAccounts() { //모든 계좌목록을 가져옴
		return accounts; // 모든 계좌목록이라 계좌를 return해줌

	}

	public int getTotalAccount() { //계좌의 수를 보여줌 
		return totalAccount; // 모든 계좌의 수를 보여줘서 총 계좌수를 return

	}

}
