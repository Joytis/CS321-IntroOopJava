package Exceptions;

public class ElementDNEException extends Exception{
	public ElementDNEException() { super(); }
	public ElementDNEException(String message) { super(message); }
	public ElementDNEException(String message, Throwable cause) { super(message, cause); }
	public ElementDNEException(Throwable cause) { super(cause); }
}
