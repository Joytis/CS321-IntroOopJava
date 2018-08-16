package DataStructures;
import java.util.List;
import java.util.ArrayList;
//import java.util.ListIterator;

import Exceptions.ElementPresentException;

/**
 * This class contains all user information and cascades into the other major data 
 * structures for this project. Contains a username, a hashed password,
 * and a list of accounts associated with the user. Shoudl be contained in a list of 
 * Users in the main application 
 * @author Clark Chambers
 * @since 1.0
 */
public final class User {
	private String username;
	private String password; // Should probably be hashed
	private List<Account> accounts;

	public User(String un, String pw) { 
		username = un;
		password = pw;
		accounts = new ArrayList<Account>();
	}

	public String getUsername() { return username; }
	public String getPassword() { return password; }

	/**
	 * Adds an Account to the accounts list for the User.
	 * Compares the hash code for the account to add with accounts already in list. 
	 * Throws an exception if the hash code for the user is already found in the list. 
	 * @param 		a 					The account to be added to the list.
	 * @throws  	ElementPresentException If account already exsits, throw this exception
	 * @see 							Account
	 */
	public void addAccount(Account a) throws ElementPresentException{}

	@Override
	public int hashCode() {
		int hash = 1;
        hash = hash * 17 + username.hashCode();
        hash = hash * 31 + password.hashCode();
        hash = hash * 17 + accounts.hashCode();
        return hash;
	}

	@Override 
	public String toString() { return username; }
}
