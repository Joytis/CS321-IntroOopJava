import java.util.List;
import DataStructures.*;
import Exceptions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public final class TestCases {
	public TestCases() {}

	public void testAccounts() {
		List<Account> accounts = new ArrayList<Account>();
		String n = "";
		String s = "";

		// Test creation
		System.out.println("ACCOUNT CONSTRUCTOR:");
		for(int i = 0; i < 10; i++) 
		{
			n = Integer.toString(i);
			s = Integer.toString(i + 1);

			AccountInfo ai = new AccountInfo(n, s);
			Account a = new Account(ai);
			accounts.add(a);
		}

		// Test info being stored
		System.out.println("TOSTRING:");
		for(Account a : accounts) {
			System.out.println(a.toString());
		}


		// Test hash codes
		System.out.println("\nHASH CODES:");
		for(Account a : accounts) {
			System.out.println(String.format("0x%08X", a.getAccountInfo().hashCode()));
		}
	}

	public void testUserStuff(){
		List<User> users = new ArrayList<User>();
		String n = "";
		String p = "";

		// Test creation
		System.out.println("USER CONSTRUCTOR:");
		for(int i = 0; i < 10; i++) 
		{
			n = Integer.toString(i);
			p = Integer.toString(i + 1);

			// UserInfo ui = new UserInfo(n, p);
			User u = new User(n, p);
			users.add(u);
		}

		// Test info being stored
		System.out.println("\nTOSTRING:");
		for(User u : users) {
			System.out.println(u.toString());
		}


		// Test hash codes
		// System.out.println("\nHASH CODES:");
		// for(User u : users) {
		// 	// System.out.println(String.format("0x%08X", u.getUserInfo().hashCode()));
		// }
	}

	// Should I test exeptions here? Or just be a cool dude?
	public void testEmailStuff() {
		System.out.println("\nTESTING the EMAIL STUFF");
		AccountInfo coolDude = new AccountInfo("cool", "dude.com");
		Mailbox box = new Mailbox();

		// Test the add and remove methods. 
		for(int i = 0; i < 100; i++) {
			Email mail = new Email(coolDude, "Wow", "An email");
			try {		
				mail.addTo(coolDude);
				mail.removeTo(coolDude);
				box.add(mail);
				box.remove(mail);
			}
			catch(ElementPresentException e) {
				System.err.println("ElementPresentException: " + e.getMessage());
			}
			catch(ElementDNEException e) {
				System.err.println("ElementDNEException: " + e.getMessage());
			}
		}

		System.out.println("Email List Size: " + box.getNumMails());

		// Different method of deletion
		for(int i = 0; i < 100; i++) {
			Email mail = new Email(coolDude, "Wow", "An email");
			try {
				mail.addTo(coolDude);
				box.add(mail);
			}
			catch(ElementPresentException e) {
				System.err.println("ElementPresentException: " + e.getMessage());
			}
		}
		System.out.println("Email List Size: " + box.getNumMails());
		box.removeAll();
		System.out.println("Email List Size: " + box.getNumMails());
	}
}






