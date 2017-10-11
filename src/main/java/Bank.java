import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Bank {

	private Map<String, BankAccount> accounts = new HashMap<String, BankAccount>();

	public Collection<BankAccount> accounts() {
		return accounts.values();
	}

	public void addBankAccount(BankAccount newBankAccount) {
		accounts.put(newBankAccount.getAccountNum(), newBankAccount);
	}

	public double getTotalBankDollars() {
		double totalBankDollars = 0;
		for (Entry<String, BankAccount> entry : accounts.entrySet()) {
			totalBankDollars += entry.getValue().getBalance();
		}
		return totalBankDollars;
	}
}
