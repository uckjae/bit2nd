package chung;

public class Main_chung {
	public static void main(String[] args) {
		
		Bank bank = new Bank();
		bank.addAccount("110-987-347655", "정은아");
		bank.findAccounts("정은아");
		System.out.println(bank.findAccounts("정은아"));
		bank.getAccount("110-987-347655").deposit(100000);
		
		System.out.println(bank.getAccount("110-987-347655").getBalance());
		System.out.println(bank.getAccount("110-987-347655").getTransactions());
		bank.getAccount("110-987-347655").withdraw(20000);
		System.out.println(bank.getAccount("110-987-347655").getTransactions());		
	}
}

