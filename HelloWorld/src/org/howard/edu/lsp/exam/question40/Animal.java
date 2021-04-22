package org.howard.edu.lsp.exam.question40;

/***
 * class Animal is defined as an abstract class 
 * 
 *
 */
abstract class Animal {
	public String speak(){
		String msg =  "This animal speaks"; 
		System.out.println(msg);
		return msg;
	}
	public String move() {
		String msg = "This animal moves forward" ;
		System.out.println(msg);
		return msg;
	}
}
