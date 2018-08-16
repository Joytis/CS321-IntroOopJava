package Exceptions;

public class ElementPresentException extends Exception{
	public ElementPresentException() { super(); }
	public ElementPresentException(String message) { super(message); }
	public ElementPresentException(String message, Throwable cause) { super(message, cause); }
	public ElementPresentException(Throwable cause) { super(cause); }
}
