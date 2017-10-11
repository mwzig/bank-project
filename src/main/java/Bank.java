import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Bank {

	private Map<String, BankAccount> accounts = new HashMap<String, BankAccount>();
	
	public Collection<BankAccount> accounts() {
		System.out.println(accounts.values());
		return accounts.values();
	}
}
