package DataStructures;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Date;
import java.util.UUID;

import Exceptions.ElementPresentException;
import Exceptions.ElementDNEException;

/**
 * This Email class is the basic messaging class that goes between accounts.
 * Contains lists of users it is to be sent to, who it's from, and the message 
 * it contains
 * Identified by a unique ID
 * @author Clark Chambers
 * @since 1.0
 */
public class Email {
	private AccountInfo from;
	private List<AccountInfo> to;
	// private List<UserInfo> cc;
	private String subject;
	private String message;
	private Date timeSent;
	private UUID uid; 			// Unique ID
	private Email replyTo; 		// This thing is the email replied to. 

	public Email(AccountInfo fr, String sub, String mess) {
		from = fr;
		subject = sub;
		message = mess;
		to = new ArrayList<AccountInfo>();
		timeSent = new Date(); // Default date constructor is the CURRENT TIME
		uid = UUID.randomUUID();
		replyTo = null;
	}

	public Email(AccountInfo fr, String sub, String mess, Email reply) {
		from = fr;
		subject = sub;
		message = mess;
		to = new ArrayList<AccountInfo>();
		timeSent = new Date(); // Default date constructor is the CURRENT TIME
		uid = UUID.randomUUID();
		replyTo = reply;
	}

	public Date getTime() { return timeSent; }
	public void setTime(Date time) { timeSent = time; }
	public List<AccountInfo> getTo() {return to; }
	public UUID getUID() { return uid; }
	public Email getReply() { return replyTo; }

	/**
	 * Function that allows the user or program to add to the list of 
	 * users the Email is to be sent to 
	 * 
	 * @param a 		Account Information detailing who the Email is being sent to 
	 * @throws ElementPresentException Throws exception if account is already in list
	 */
	public void addTo(AccountInfo a) throws ElementPresentException
	{
		// If it exists in the list already, throw the exception and inform user
		for(ListIterator<AccountInfo> it = to.listIterator(); it.hasNext();) {
			AccountInfo ainfo = it.next();
			if(ainfo.getUID() == a.getUID()) {
				throw new ElementPresentException();
			}
		}
		// Otherwise just add it to the list. 
		to.add(a); 
	}

	/**
	 * This method removes the account information with matching hash code
	 * from the list of accounts the Email is to be sent to. 
	 * @param t 		Account Information to remove.  
	 * @throws ElementDNEException If t doesn't exist in the list, throw. 
	 */
	public void removeTo(AccountInfo t) throws ElementDNEException{
		// If it exists in the list, remove it 
		for(ListIterator<AccountInfo> it = to.listIterator(); it.hasNext();) {
			AccountInfo userInfo = it.next();
			if(userInfo.getUID() == t.getUID()) {
				// Remove the current iterator from the list
				it.remove();
				return;
			}
		}

		// Else throw an exception 
		throw new ElementDNEException();
	}

	/**
	 * Prints information about the Email to the console. 
	 */
	public void printInfo() {
		System.out.println("FROM USER:");
		System.out.println(from.toString());

		for(AccountInfo ai : to){
			System.out.println("\nTO USERS:");
			System.out.println(ai.toString());
		}

		System.out.println("\nMESSAGE:");
		System.out.println(message);
	}	
}
