package lee;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Bank_lee {
	private HashSet<Account_lee> accounts;//계좌들의 유일성을 보장하기 위해 Set 사용
	private int totalAccount;//총 계좌수

	private String accountNoRegex = "^[0-9]{9}$";//계좌번호 형식 숫자 9자리


	public Bank_lee() {//생성자
		this.accounts = new HashSet<>();
		this.totalAccount = 0;
	}

	private boolean accountNoisRight(String accountNo){
		return accountNo.matches(accountNoRegex);
	}//계좌형식 확인 함수

	private boolean accountNoisNew(String accountNo){//기존에 없는 계좌번호인지 확인하는 함수
		boolean isNew = true;
		Iterator<Account_lee> it = accounts.iterator();
		while(it.hasNext()){
			if(accountNo.equals(it.next().getAccountNo())){
				isNew = false;
				break;
			}
		}
		return isNew;
	}

	public void addAccount(String accountNo, String name) {
		if(!accountNoisRight(accountNo)){//계좌형식에 맞는지 체크
			System.out.println("Wrong Account Number");
		}else if(!accountNoisNew(accountNo)){//존재하지 않는 계좌인지 체크
			System.out.println("AccountNumber is already exist");
		} else{
			accounts.add(new Account_lee(accountNo,name));//계좌 생성
			totalAccount++;//총 계좌수 추가
		}


	}
	
	public Account_lee getAccount(String accountNo) {
		Account_lee result = null;
		Iterator<Account_lee> finding = accounts.iterator();
		while(finding.hasNext()){
			Account_lee founded = finding.next();
			if(founded.getAccountNo().equals(accountNo)){
				result = founded;
				break;
			}
		}
		return result;
	}
	
	public ArrayList<Account_lee> findAccounts(String name) {
		ArrayList<Account_lee> result = new ArrayList<>();
		Iterator<Account_lee> it = accounts.iterator();
		while(it.hasNext()){
			Account_lee founded = it.next();
			String foundedName = founded.getName();
			if (foundedName.equals(name)){
				result.add(founded);
			}
		}

		return result;

	}

	public HashSet<Account_lee> getAccounts() {
		return accounts;

	}
	
	public int getTotalAccount() {
		return totalAccount;
		
	}
	
}
