//EXERCISE 6.1
public class CheckingAccount extends BankAccount
{
	private int monthlyChecks;

	public CheckingAccount(double initialBalance)
	{
		monthlyChecks = 0;
		balance = initialBalance;
	}

	public void deposit(double amount) 
	{ 
		balance += amount; 
    	monthlyChecks++;
	}

    public void withdraw(double amount) 
    {
    	balance -= amount;
    	monthlyChecks++;
	}

	public void deductFees() 
	{
		int checks = monthlyChecks - 5;
		if(checks < 0) { checks = 0; }
		balance -= checks * 1;
		monthlyChecks = 0;
	}
}
