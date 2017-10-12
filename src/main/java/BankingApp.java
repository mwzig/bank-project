import java.util.Collection;
import java.util.Scanner;

public class BankingApp {

	public static void main(String[] args) {
		Bank myBank = new Bank();

		BankAccount account1 = new BankAccount("1111", "Checking", 500.00);
		BankAccount account2 = new BankAccount("2222", "Savings", 2500.00);

		myBank.addBankAccount(account1);
		myBank.addBankAccount(account2);

		showAccountsBrief(myBank);

		promptUserForSelection(myBank);
	}

	public static void showAccountsBrief(Bank myBank) {
		System.out.println("Here are your accounts at our bank:");
		Collection<BankAccount> accounts = myBank.accounts();
		for (BankAccount account : accounts) {
			System.out.println(account.getType() + "\t" + account.getBalance());
		}
		for (BankAccount account : accounts) {
			System.out.println("toPrint = " + account);
		}

	}

	public static void showAccounts(Bank myBank) {
		System.out.println("Here are your accounts:");
		Collection<BankAccount> accounts = myBank.accounts();
		for (BankAccount account : accounts) {
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
			case "1":
				System.out.println("you pressed 1");
				handleDeposit(myBank);
				break;
			case "2":
				System.out.println("you pressed 2");
				handleWithDrawal(myBank);
				break;
			case "3":
				System.out.println("you pressed 3");
				System.out.println("Here are your accounts");

				for (BankAccount account : myBank.accounts()) {
					System.out.println("toPrint = " + account);
				}				
				break;
			case "4":
				System.out.println("you pressed 4");
				handleClosingAccount(myBank);
				break;
			case "-1":
				System.out.println("you pressed -1 to exit");
				break;

			}

		} while (!userAction.equals("-1"));
		System.out.println("Now you are out of the loop");
		showAccounts(myBank);
	}

	public static void handleDeposit(Bank myBank) {
		/*
		 * You want to deposit. Here are your accounts (1111) Checking 500.0 (2222)
		 * Savings 100.0 Select the account by (acct num) to perform this transaction.
		 * 1111 You have selected 1111 Enter the amount to deposit: 2000 Your updated
		 * balance is now 2500.0
		 */
		System.out.println("You want to deposit");
		System.out.println("Here are your accounts");

		for (BankAccount account : myBank.accounts()) {
			System.out.println("toPrint = " + account);
		}
		System.out.println("Select the account by (acct number) to perform this transaction.");
		Scanner input = new Scanner(System.in);
		String acctNbr = input.nextLine();
		System.out.println("You have selected " + acctNbr);
		System.out.println("Enter the amount to deposit");
		double depositAmount = input.nextDouble();
		input.nextLine(); // we need to do this because nextDouble above leaves the crlf
		BankAccount checkingAccount = myBank.getAccount(acctNbr);
		checkingAccount.deposit(depositAmount);
		System.out.println("Your updated balance is now " + checkingAccount.getBalance());

	}

	public static void handleClosingAccount(Bank myBank) {
		/*
		 * You want to deposit. Here are your accounts (1111) Checking 500.0 (2222)
		 * Savings 100.0 Select the account by (acct num) to perform this transaction.
		 * 1111 You have selected 1111 Enter the amount to deposit: 2000 Your updated
		 * balance is now 2500.0
		 */
		System.out.println("You want to close an account");
		System.out.println("Here are your accounts");

		for (BankAccount account : myBank.accounts()) {
			System.out.println("toPrint = " + account);
		}
		System.out.println("Enter the account number of the account you would like to close.");
		Scanner input = new Scanner(System.in);
		String acctNbr = input.nextLine();
		System.out.println("You have selected " + acctNbr);
		myBank.closeBankAccount(acctNbr);
		System.out.println("You are closing account number: "  + acctNbr);
		System.out.println("Here are your remaining accounts:");
		for (BankAccount account : myBank.accounts()) {
			System.out.println("toPrint = " + account);
		}

	}
	

	public static void handleWithDrawal(Bank myBank) {
		/*
		 * You want to deposit. Here are your accounts (1111) Checking 500.0 (2222)
		 * Savings 100.0 Select the account by (acct num) to perform this transaction.
		 * 1111 You have selected 1111 Enter the amount to deposit: 2000 Your updated
		 * balance is now 2500.0
		 */
		System.out.println("You want to withdraw funds");
		System.out.println("Here are your accounts");

		for (BankAccount account : myBank.accounts()) {
			System.out.println("toPrint = " + account);
		}
		System.out.println("Select the account by (acct number) to perform this transaction.");
		Scanner input = new Scanner(System.in);
		String acctNbr = input.nextLine();
		System.out.println("You have selected " + acctNbr);
		System.out.println("Enter the amount to withdraw");
		double withdrawAmount = input.nextDouble();
		input.nextLine(); // we need to do this because nextDouble above leaves the crlf
		BankAccount selectedAccount = myBank.getAccount(acctNbr);
		selectedAccount.withDraw(withdrawAmount);
		System.out.println("Your updated balance is now " + selectedAccount.getBalance());

	}
}