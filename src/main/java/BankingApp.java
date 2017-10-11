
public class BankingApp {

	public static void main(String[] args) {
		Bank myBank = new Bank();
		
		BankAccount account1 = new BankAccount("1111", "Checking", 500.00);
		BankAccount account2 = new BankAccount("2222", "Checking", 2500.00);
	
		myBank.addBankAccount(account1);
		myBank.addBankAccount(account2);
	}

}
