import java.util.concurrent.ThreadLocalRandom;

public class Depositor implements Runnable {

	private SynchronizedBankAccount account;
	private int id;

	public Depositor(SynchronizedBankAccount acc, int num) {
		account = acc;
		id = num;
	}

	@Override
	public void run() {
		while(true) {
			try {
				int rando = ThreadLocalRandom.current().nextInt(0, 101);
				account.deposit(rando);
				System.out.println("Withdrawer -" + id + ": " + rando);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
