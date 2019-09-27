package Kim;

import java.util.ArrayList;

public class Bank_Main {
	public static void main(String[] args) {
		Account aco = new Account(null, null);
		Bank bk = new Bank();
		bk.addAccount("111-111-111-111","�达");
		bk.addAccount("111-222-333-444", "�̾�");
		ArrayList<Account> aa = bk.findAccounts("����");
		for(int i= 0; i<aa.size(); i++) {
			System.out.println(aa.get(i).getName());
		}		
		aa.get(0).deposit(1000L);
		
		
	}

}
