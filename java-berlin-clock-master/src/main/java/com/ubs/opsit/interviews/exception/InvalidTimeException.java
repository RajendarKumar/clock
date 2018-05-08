/**
 * 
 */
package com.ubs.opsit.interviews.exception;

/**
 * @author Rajendar Kumar
 *
 */
public class InvalidTimeException extends IllegalArgumentException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6184677218946335394L;

	/**
	 * 
	 */
	public InvalidTimeException() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param s
	 */
	public InvalidTimeException(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public InvalidTimeException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public InvalidTimeException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

}
