package yoon;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	private List<Account> accounts;
	private int totalAccount;

	public Bank() {
		accounts = new ArrayList<Account>();
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public int getTotalAccount() {
		return totalAccount;
	}

	public void addAccount(String accountNo, String name) {
		accounts.add(new Account(accountNo, name));
		totalAccount++;
	}

	public Account getAccount(String accountNo) {
		Account target = null;
		for (Account account : accounts) {
			if (account.getAccountNo().equals(accountNo)) {
				target = account;
				break;
			}
		}

		return target;
	}

	public List<Account> findAccounts(String name) {
		List<Account> targets = new ArrayList<Account>();
		for (Account account : accounts) {
			if (account.getName().equals(name))
				targets.add(account);
		}

		return targets;
	}
}
