package DataStructures;

/**
 * This class information about the account coupled with the two e-mail 
 * sites that the account manages. 
 * @author Clark Chambers
 * @since 1.0
 */
public final class Account {
	private AccountInfo accountInfo;
	private Site local;
	private Site remote;

	public Account(AccountInfo ai){
		accountInfo = ai;
		local = new Site();
		remote = new Site();
	}

	public AccountInfo getAccountInfo() { return accountInfo; }


    /**
     * OVERRIDE. Determines and returns the string representation for the object
     * @return          The string representation of the object
     */
	@Override
	public String toString() {
		return accountInfo.toString();
	}
}
