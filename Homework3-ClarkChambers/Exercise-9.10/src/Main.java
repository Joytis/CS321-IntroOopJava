class Main {
	public static void main (String argv[]) {
		SynchronizedBankAccount account = new SynchronizedBankAccount();  // shared integer buffer
		
		// start threads
		new Thread (new Withdrawer(account, 1)).start();
		new Thread (new Depositor(account, 1)).start();
		new Thread (new Withdrawer(account, 2)).start();
		new Thread (new Depositor(account, 2)).start();
	}
}