
public class SynchronizedBankAccount {
	private int balance;

	public SynchronizedBankAccount() {
		balance = 0;
	}

	public void withdraw(int amnt) {
		synchronized(this) {
			balance -= amnt;
		}
	}

	public void deposit(int amnt) {
		synchronized(this) {
			balance += amnt;
		}
	}
}