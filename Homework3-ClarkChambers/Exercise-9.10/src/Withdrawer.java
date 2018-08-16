import java.util.concurrent.ThreadLocalRandom;

public class Withdrawer implements Runnable {

	private SynchronizedBankAccount account;
	private int id;
	
	public Withdrawer(SynchronizedBankAccount acc, int time) {
		account = acc;
		id = time;
	}

	@Override
	public void run() {
		while(true) {
			try {
				int rando = ThreadLocalRandom.current().nextInt(0, 101);
				account.withdraw(rando);
				System.out.println("Withdrawer -" + id + ": " + rando);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
