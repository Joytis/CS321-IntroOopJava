package DataStructures;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

import Exceptions.ElementPresentException;
import Exceptions.ElementDNEException;

/**
 * This Mailnox class is a container class that holds a bunch of Emails.
 * Should be contained within in account 'site'.
 * @author Clark Chambers
 * @since 1.0
 */
public class Mailbox {
	
	private List<Email> emails;

	public Mailbox() {
		emails = new ArrayList<Email>();
	}

	// Should I remove this? Or do I really care?
	public List<Email> getMail() { return emails; }
	public int getNumMails() { return emails.size(); }

	/**
	 * If the email is not present in the mailbox, add it to the mailbox. 
	 * @param mail 		Email to add to the mailbox
	 * @throws ElementPresentException  When a unique email already exists in list
	 */
	public void add(Email mail) throws ElementPresentException { 

		// If it exists already, throw an exception. Emails are unique. 
		for(ListIterator<Email> it = emails.listIterator(); it.hasNext();) {
			Email itmail = it.next();
			if(itmail.getUID() == mail.getUID()) {
				throw new ElementPresentException();
			}
		}

		// Otherwise just add it to the list
		emails.add(mail); 
	}



	/**
	 * This method searches for an email with the same UID as the email
	 * if it exists, remove it. 
	 * @param mail 		Email to remove
	 * @throws ElementDNEException  When the Email doesn't exist in list. 
	 */ 
	public void remove(Email mail) throws ElementDNEException{ 

		// Itterates through the list. If exists, remove
		for(ListIterator<Email> it = emails.listIterator(); it.hasNext();) {
			Email itmail = it.next();
			if(mail.getUID() == itmail.getUID()) {
				it.remove();
				return;
			}
		}
		// Else throw it out. 
		throw new ElementDNEException(); 
	}

	public void removeAll() {
		// Itterates through the list. If exists, remove
		for(ListIterator<Email> it = emails.listIterator(); it.hasNext();) {
			Email itmail = it.next();
			it.remove();	
		}
	}

}
