package org.howard.edu.lsp.assignment4.implementation;

 
/**
 * This class extends parent class Exception to handle exception while performing operations on empty set.
 * @author DSCS2LAB
 *
 */
public class IntegerSetException extends Exception  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IntegerSetException(String errormessage) { //pass error message when exception occurs.
		   super(errormessage);
	   }
}


