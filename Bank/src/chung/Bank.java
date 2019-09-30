package chung;

import java.util.ArrayList;

public class Bank {
	private ArrayList<Account> accounts;
	private int totalAccount;
	
	Bank() {
		accounts = new ArrayList<Account>(); 
	}
	void addAccount(String accountNo, String name) {  //계좌 생성 시 계좌번호와 이름이 필요하다 
		accounts.add(new Account(accountNo,name));
		totalAccount++;
	}
	Account getAccount(String AccountNo){  //계좌번호로 계좌를 찾는다 
		for(Account account : accounts) {
			if(account.getAccountNo().equals(AccountNo)) {
				return account;  //계좌반환 
			}
		}
		return null;	
	}
	ArrayList<Account> findAccounts(String name){  //소유자명으로 계좌를 찾는다 
		ArrayList<Account> newList = new ArrayList<Account>();  //소유자가 여러 계좌를 소유할 수 있으므로 배열 하나를 만들어서 거기에 담는다 
		for(Account account : accounts) {
			if(account.getName().equals(name)) {
				newList.add(account);
			}
		}
		return newList;		
	}
	ArrayList<Account> getAccounts(){
		return accounts;	
	}
	int getTotalAccount() {
		return totalAccount;
		
	}
}
