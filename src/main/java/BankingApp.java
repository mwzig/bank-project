import java.util.Collection;
import java.util.Scanner;

public class BankingApp {

	public static void main(String[] args) {
		Bank myBank = new Bank();
		
		BankAccount account1 = new BankAccount("1111", "Checking", 500.00);
		BankAccount account2 = new BankAccount("2222", "Checking", 2500.00);
	
		myBank.addBankAccount(account1);
		myBank.addBankAccount(account2);
		
		showAccountsBrief(myBank);
		
		promptUserForSelection(myBank);
	}

	public static void showAccountsBrief(Bank myBank) {
		System.out.println("Here are your accounts at our bank:");
		Collection<BankAccount> accounts = myBank.accounts();
		for (BankAccount account:accounts) {
			System.out.println(account.getType() + "\t" + account.getBalance());
		}
		
	}
	
	public static void showAccounts(Bank myBank) {
		System.out.println("Here are your accounts:");
		Collection<BankAccount> accounts = myBank.accounts();
		for (BankAccount account:accounts) {
			System.out.println("(" + account.getAccountNum() + ")\t" + account.getType() + "\t" + account.getBalance());
		}
		
	}
	public static void promptUserForSelection(Bank myBank) {
		String userAction = "";
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("What would you like to do?");
			System.out.println("Press 1 to deposit funds");
			System.out.println("Press 2 to withdraw funds");
			System.out.println("Press 3 to check balance");
			System.out.println("Press 4 to close an account");
			System.out.println("Press -1 to exit");
			userAction = input.nextLine();
			switch (userAction) {
			case "1":   System.out.println("you pressed 1");
			break;	
			case "2":	System.out.println("you pressed 2");
			break;	
			case "3":	System.out.println("you pressed 3");
			break;	
			case "4":	System.out.println("you pressed 4");
			break;	
			case "-1":	System.out.println("you pressed 5");
			break;	
			
			}
			
			
		} while (!userAction.equals("-1")); 
		System.out.println("Now you are out of the loop");
		showAccounts(myBank);
	}
	
	
	

}
