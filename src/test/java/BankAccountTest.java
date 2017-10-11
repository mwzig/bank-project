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

	/*
	@Test
	public void assertThatNameReturnsItemNameOfShirt() {
		Item underTest = new Item("shirt", 14.99, 1);
		String check = underTest.getName();
		assertEquals(check, "shirt");
	}
	

	@Test
	public void assertThatGetPriceReturns654Point35() {
		Item underTest = new Item("test", 654.35, 5);
		double check = underTest.getPrice();
		assertEquals(654.35, check, .01);
		//assertEquals(Double.doubleToLongBits(654.35), Double.doubleToLongBits(check));		
		//Assert.assertEquals(0, Double.compareTo(expected, result));
	}
	
	@Test
	public void assertThatGetQuantityReturnsFive() {
		Item underTest = new Item("test", 10.00, 5);
		int check = underTest.getQuantity();
		assertEquals(5, check);
	}
	
	@Test
	public void assertThatGetTotalItemsReturnsOne() {
		
		Order underTest = new Order();
		underTest.addItem(new Item("shirt", 14.99, 1));
		int check = underTest.getTotalItems();
		assertEquals(1, check);
	}
	
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
