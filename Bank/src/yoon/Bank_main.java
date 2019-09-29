package yoon;

import java.util.List;

public class Bank_main {
	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.addAccount("123", "윤다정");
		bank.getAccount("123").deposit(1000);
		bank.getAccount("123").withdraw(100);
		bank.getAccount("123").withdraw(100);
		bank.getAccount("123").withdraw(100);

		bank.addAccount("1234", "윤다정");
		bank.getAccount("1234").deposit(1000);
		bank.getAccount("1234").withdraw(1000);
		bank.getAccount("1234").withdraw(1000);

		System.out.println("-----------------------------------");
		List<Account> targets = bank.findAccounts("윤다정");
		for (Account account : targets) {
			System.out.println("계좌주 : " + account.getName());
			System.out.println("계좌 : " + account.getAccountNo());
			System.out.println("잔액 : " + account.getBalance());
			for (Transaction transaction : account.getTransactions())
				System.out.println(transaction.toString());
		}
		System.out.println();
	}
}
