package Kim;

import java.util.ArrayList;

public class Bank_Main {
	public static void main(String[] args) {
		Bank bk = new Bank(); // 뱅크를 생성 
		bk.addAccount("111-111-111-111","김일겸"); //계좌생성
		bk.addAccount("950-050-060-123", "윤다정"); //계좌생성
		bk.addAccount("131-252-363-744", "이욱재"); //계좌생성
		bk.addAccount("175-632-373-421", "정은아"); //계좌생성
		bk.addAccount("194-242-303-430", "원보현"); //계좌생성
		bk.addAccount("151-249-374-474", "최경열"); //계좌생성
		
		for(Account ac : bk.getAccounts()) { //계좌 목록 확인 
			System.out.println(ac.getAccountNo()+" /" + ac.getName()); //계좌번호 , 이름 확인  
		}
		System.out.println(); // 공백 추가 
		ArrayList<Account> aa = bk.findAccounts("김일겸"); //이름으로 계좌찾고 리스트에 저장 
		for(int i= 0; i<aa.size(); i++) { // 리스트를 돌아서 
			System.out.println(aa.get(i).getName() + "/" + aa.get(i).getAccountNo()); // i번째에 있는 찾을려는 이름을 출력 
		}		
		 System.out.println(); //공백추가 
		Account aa2 = bk.getAccount("950-050-060-123"); //계좌번호로 계좌 찾기 
		System.out.println("검색 한  계좌번호  : " + aa2.getAccountNo() +"/"+ aa2.getName()); //찾을려는 계좌번호와 해당하는 계좌번호의 이름 출력
		System.out.println();
		
		aa2.deposit(10000); //입금 
		aa2.deposit(20000);
		aa2.withdraw(5000); //출금
		ArrayList<Transaction> tr = aa2.getTransactions(); //거래내역의 return 값을 리스트에 저장
		for (int i = 0; i<tr.size();i++) { //리스트에 있는것을 하나씩 확인
			System.out.println(tr.get(i).toString()); //i번째 내역을 확인하고 오버라이드를 한 것을 출력
		}

		
		System.out.println();
		System.out.println("계좌 수 확인 " + bk.getTotalAccount());// 총계좌수 
		System.out.println();
		
		
		
	}

}
