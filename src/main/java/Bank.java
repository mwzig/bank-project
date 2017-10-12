import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Bank {

	private Map<String, BankAccount> accounts = new HashMap<String, BankAccount>();

	// This method returns a Collection of Bank Account objects
	// It mimics the bank's database of accounts for a particular customer 
	public Collection<BankAccount> accounts() {
		return accounts.values();
	}

	// This method adds a new Bank Account
	// It mimics adding a new account for a particular customer.
	public void addBankAccount(BankAccount newBankAccount) {
		accounts.put(newBankAccount.getAccountNum(), newBankAccount);
		System.out.println("the accounts size is " + accounts.size());
	}
	
	//This method returns a BankAccount object so that actions can be
	//performed on it (deposit, withdraw, get balance).
	public BankAccount getAccount(String accountNum) {
		return accounts.get(accountNum);
	}

	public void closeBankAccount(String accountNum) {
		System.out.println("in close account");
		System.out.println("there are " + accounts.size() + " before closing");
		
		accounts.remove(accountNum);
		System.out.println("there are " + accounts.size() + " after closing");
		
	}
	
	// added for testing to verify banking accounts added and removed
	// successfully
	public double getTotalBankDollars() {
		double totalBankDollars = 0;
		for (Entry<String, BankAccount> entry : accounts.entrySet()) {
			totalBankDollars += entry.getValue().getBalance();
		}
		return totalBankDollars;
	}
	
	public int getTotalNumOfAccounts() {
		System.out.println("in getTotalNumOfAccounts and size is " + accounts.size());
		return accounts.size();
	}

}
