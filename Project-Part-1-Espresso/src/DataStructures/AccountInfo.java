package DataStructures;

import java.util.UUID;

/**
 * This is a simple data structure that contains information for 
 * a specific account, which is linked to a user. 
 * @author Clark Chambers
 * @since 1.0
 */
public final class AccountInfo {
	private String name;
	private String host;
    private UUID uid;

    /**
     * Constructor for account information. NO DEFAULT
     * @param n         Name argument
     * @param h         Host argument (I.E. gmail.com)
     */
	public AccountInfo(String n, String h){
		name = n;
		host = h;
        uid = UUID.randomUUID(); // new unique ID
	}

	public String getName() { return name; }
	public String getHost() { return host; }
    public UUID getUID() { return uid; }


    /**
     * OVERRIDE. Determines and returns the string representation for the object
     * @return          The string representation of the object
     */
    @Override
    public String toString() {
    	return (name + "@" + host);
    }
}
