package org.howard.edu.lsp.exam.question40;

/***
 * Airplane class implements interface Flying.
 * @author DSCS2LAB
 *
 */
public class Airplane implements Flying{
	public String fly() {
		String msg = "This Airplane flies";
		System.out.println(msg);
		return msg;
	} 
}
	