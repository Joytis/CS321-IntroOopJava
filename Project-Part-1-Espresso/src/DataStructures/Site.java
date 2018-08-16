package DataStructures;
import java.util.List;
import java.util.ArrayList;


public class Site {
	private List<Email> inbox; 
	private List<Email> sent;
	private List<Email> trash;

	public Site() {
		inbox = new ArrayList<Email>(); 
		sent = new ArrayList<Email>(); 
		trash = new ArrayList<Email>(); 
	}

	public void recieveEmail(Email e) {
		if(e != null) inbox.add(e);
	}

	public void sendMail(Email e) {
		if(e != null) sent.add(e);
	}

	// Passes in a list of indices of emails to delete.
	public void removeEmail(List<Integer> indices) {

	}

	public void removeEmail(int index) {

	}

	public void deleteEmail(List<Integer> indices) {

	}

	public void deleteEmail(int index) {

	}
}
