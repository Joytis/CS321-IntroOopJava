package Controllers;

import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Date;
import java.util.UUID;

import Exceptions.*;
import DataStructures.*;

/**
 * This controller allows for the sending of Emails to the system; 
 * @author Clark Chambers
 * @since 1.0
 */
public class EmailSender {
	UserController users;

	public EmailSender(UserController use) {
		users = use;
	}

	/**
	 * This method first checks the validity of the to addresses for the email
	 * and sends it if everything is cool
	 * @param email 		Email to send
	 * @throws InvalidToException Thrown when the list of users TO address has an invalid member
	 */

	public void SendEmail(Email email) throws InvalidToException {

	}

	// public void 
}
