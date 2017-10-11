
public class BankAccount {

	private String accountNum;
	private String type;
	private double balance;

	BankAccount(String accountNum, String type, double balance) {
		this.accountNum = accountNum;
		this.type = type;
		this.balance = balance;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void withDraw(double withDrawAmount) {
		balance -= withDrawAmount;
	}
	
	public void deposit(double depositAmount) {
		balance += depositAmount;
	}
	
	public String toString() {
		return "Account Number: " + accountNum + "(" + type + ")" 
				+ " balance: " + balance;
	}
}
