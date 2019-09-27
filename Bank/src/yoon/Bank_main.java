package yoon;

public class Bank_main {
	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.addAccount("123", "윤다정");
		bank.findAccounts("윤다정");
		bank.getAccount("123").deposit(1000);
		bank.getAccount("123").withdraw(100);
		bank.getAccount("123").withdraw(100);
		bank.getAccount("123").withdraw(100);
	}
}
