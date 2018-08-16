//EXERCISE 6.1
public class Main {
	public static void main(String[] args){
		CheckingAccount acc = new CheckingAccount(100);
		System.out.println(acc.getBalance());
		
		for(int i = 0; i < 10; i++) {
			acc.withdraw(1.0);
		}
		acc.deductFees();

		System.out.println(acc.getBalance());
	}
}	
