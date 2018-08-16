package Controllers;

import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

import Exceptions.*;
import DataStructures.*;

/**
 * This class is responsible for loading, storing, and keeping track of 
 *	user information.
 * @author Clark Chambers
 * @since 1.0
 */
public class UserController {

	List<User> users; // Just a list of users

	public UserController() {
		users = new ArrayList<User>();
	}


	/**
	 * Adds a user to the list of users. References UUID
	 * @param u 		User to add
	 * @throws ElementPresentException Throws when user already exists
	 */
	public void addUser(User u) throws ElementPresentException {
		// Add a user to the controller list
	}

	/**
	 * Removes a user by their UUID
	 * @param u 		User to remove;
	 * @throws ElementDNEException Throws when user doesn't exist in the list
	 */
	public void removeUser(User u) throws ElementDNEException {
		// Remove a user from the controller list
	}


}
