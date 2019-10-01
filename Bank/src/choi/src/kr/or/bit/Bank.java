package kr.or.bit;

import java.util.ArrayList;

public class Bank {
	private ArrayList<Account>accounts;//계좌
	private int totalAccount;
	
	public Bank() {
		this.accounts = new ArrayList<Account>();
	}
	
	public void addAccount(String accountNo, String name) {//계좌생성
		this.accounts.add(new Account(accountNo,name));//계좌번호,이름 입력시 계좌클래스로 ㄱ
		this.totalAccount++; //계좌수 추가
		System.out.println(name+"계좌가 생성되었습니다.");
	}
	
	public Account getAccount(String accountNo) {//계좌찾기(번호)
		Account findNum=null;
		for(int i=0; i<accounts.size(); i++) {
			if(accounts.get(i).getAccountNo().equals(accountNo)) {
				findNum=accounts.get(i);
			}else if(findNum==null) {
				System.out.println("찾는계좌가 없습니다.");
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
				System.out.println("찾는계좌가 없습니다");
			}
		
		}
		return findNamelist;
	}
	
	public ArrayList<Account>getAccounts(){//계좌목록보기
		return accounts; //??
	}
	public int getTotalAccount() { //총계좌수 반환
		return totalAccount;//??
	}

}
