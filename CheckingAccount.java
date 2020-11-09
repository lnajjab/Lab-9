
public class CheckingAccount extends BankAccount{

	static final double FEE = 0.15;
	
	public CheckingAccount(String name, double initialAmount) {
		super(name, initialAmount);
		super.setAccountNumber(super.getAccountNumber() + "-10");
	}

	public boolean withdraw(double amount) {
		boolean completed = true;

		if (amount <= super.getBalance())
		{
			super.setBalance(super.getBalance() - amount); 
		}
		else
		{
			completed = false;
		}
		return completed;
	}
}
