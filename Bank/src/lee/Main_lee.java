package lee;

import java.util.HashSet;

public class Main_lee {
	public static void main(String[] args) {
//		Account_lee a = new Account_lee("123456", "이욱재");
//		System.out.println(a.hashCode());
//		Account_lee b = new Account_lee("123456","rla");
//		System.out.println(b.hashCode());
//		
//		HashSet<Account_lee> accounts = new HashSet<Account_lee>();
//		System.out.println(accounts.add(a));
//		System.out.println(accounts.add(b));
//		
//		
		HashSet<Account_lee> account_lees= new HashSet<Account_lee>();
		Account_lee a = new Account_lee("111111", "a");
		System.out.println(a.hashCode());
		System.out.println(account_lees.add(a));
		
		Account_lee a1 = new Account_lee("222222", "a");
		System.out.println(a1.hashCode());
		System.out.println(account_lees.add(a1));
		
		Account_lee a2 = new Account_lee("333333", "a");
		System.out.println(a2.hashCode());
		System.out.println(account_lees.add(a2));
		
		Account_lee a3 = new Account_lee("411111", "a");
		System.out.println(a3.hashCode());
		System.out.println(account_lees.add(a3));
		
		Account_lee a4 = new Account_lee("111111", "aa");
		System.out.println(a4.hashCode());
		System.out.println(account_lees.add(a4));
		
		System.out.println();
	}
}
