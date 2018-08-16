package Exceptions;

public class InvalidToException extends Exception{
	public InvalidToException() { super(); }
	public InvalidToException(String message) { super(message); }
	public InvalidToException(String message, Throwable cause) { super(message, cause); }
	public InvalidToException(Throwable cause) { super(cause); }
}
