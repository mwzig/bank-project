import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class BankAccountTest {

	
	@Test
	public void shouldBeAbleToCreateABankAccount() {
		// accountNum, type, balance passed on constructor
		BankAccount underTest = new BankAccount(null, null, 0);
		assertNotNull(underTest);
	}
	
	
	@Test
	public void shouldBeAbleToCreateABankAccountWithData() {
		// accountNum, type, balance passed on constructor
		BankAccount underTest = new BankAccount("1111", "Checking", 5000.05);
		double check = underTest.getBalance();
		assertEquals(5000.05, check, .01);
	}
	
	@Test
	public void assertThatAccountIsFound() {
		// accountNum, type, balance passed on constructor
		Bank underTest = new Bank();
		underTest.addBankAccount(new BankAccount("1111", "Checking", 5000.05));
		String check = underTest.getAccount("1111").getAccountNum();
		assertEquals("1111", check);
	}
	
	@Test
	public void shouldBeAbleToWithDrawFunds() {
		// accountNum, type, balance passed on constructor
		BankAccount underTest = new BankAccount("1111", "Checking", 5000.05);
		underTest.withDraw(500.05);
		double check = underTest.getBalance();
		assertEquals(4500.00, check, .01);
	}
	
	@Test
	public void shouldBeAbleToDepositFunds() {
		// accountNum, type, balance passed on constructor
		BankAccount underTest = new BankAccount("1111", "Checking", 5000.05);
		underTest.deposit(500.05);
		double check = underTest.getBalance();
		assertEquals(5500.10, check, .01);
	}
	
	@Test
	public void assertThatAddingAccountsChangesTotalNumAccounts() {
		
		Bank underTest = new Bank();
		underTest.addBankAccount(new BankAccount("1111", "Checking", 500.00));
		underTest.addBankAccount(new BankAccount("2222", "Savings", 2500.00));
		int check = underTest.getTotalNumOfAccounts();
		assertEquals(2, check);
	}
	
	@Test
	public void assertThatRemovingAccountChangesTotalNumAccounts() {
		Bank underTest = new Bank();
		underTest.addBankAccount(new BankAccount("1111", "Checking", 500.00));
		underTest.addBankAccount(new BankAccount("2222", "Savings", 2500.00));
		underTest.closeBankAccount("1111");
		int check = underTest.getTotalNumOfAccounts();
		assertEquals(1, check);
	}
	
	@Test
	public void assertThatGetTotalBankDollarsReturns3000() {
		
		Bank underTest = new Bank();
		underTest.addBankAccount(new BankAccount("1111", "Checking", 500.00));
		underTest.addBankAccount(new BankAccount("2222", "Savings", 2500.00));
		double check = underTest.getTotalBankDollars();
		assertEquals(3000.00, check, .01);
	}
	/*
	@Test
	public void assertThatGetTotalBoxesReturnsSeven() {
		Order underTest = new Order();
		underTest.addItem(new Item("shirt", 14.99, 3));
		underTest.addItem(new Item("shirt", 14.99, 4));
		int check = underTest.getTotalItems();
		assertEquals(7, check);
	
	}
	
	@Test
	public void assertThatRemoveItemRemovesItems() {
		Order underTest = new Order();
		underTest.addItem(new Item("shirt", 14.99, 3));
		underTest.addItem(new Item("pants", 12.99, 4));
		underTest.addItem(new Item("shirt", 15.99, 3));
		underTest.removeItem("shirt");
		int check = underTest.getTotalItems();
		assertEquals(3, check);
	
	}
	*/
}
