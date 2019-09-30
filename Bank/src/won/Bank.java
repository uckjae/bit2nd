package won;

import java.util.ArrayList;

public class Bank {
	private ArrayList<Account> accounts;
	private int totalAccount;
	
	public Bank(){
		this.accounts = new ArrayList<Account>();
		this.totalAccount = 0;
	}
	
	public void addAccount(String accountNo, String name) { // 계좌생성 .. 계좌번호, 이름 입력
		accounts.add(new Account(accountNo, name));
		this.totalAccount++; // 계좌 개수 체크 
		System.out.println("계좌 생성 완료");
	}
	
	public Account getAccount(String accountNo) { // 계좌번호로 계좌찾기
		for(Account acc : accounts) {
			if(acc.getAccountNo().equals(accountNo)) {
				return acc;
			}
		}
		return null;
	}
	
	public ArrayList<Account> findAccounts(String name) { // 이름으로 계좌 찾기
		ArrayList<Account> acclist = new ArrayList<Account>();
		for(Account acc : accounts) {
			if(acc.getName().equals(name)) {
				acclist.add(acc);
			}
		}
		return acclist;
	}
	
	public ArrayList<Account> getAccounts() {
		return accounts;
	}
	public int getTotalAccount() {
		return totalAccount;
	}

	@Override
	public String toString() {
		return "계좌 : " + accounts + ", 총 계좌 : " + totalAccount;
	}
}