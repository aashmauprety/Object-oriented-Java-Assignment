package org.howard.edu.lsp.exam.question40;

public class Goose extends Animal implements Flying {
	@Override 
	public String speak(){
		String msg =  "This Goose speaks"; 
		System.out.println(msg);
		return msg;
	}
	
	@Override
	public String move() {
		String msg = "This Goose moves forward" ;
		System.out.println(msg);
		return msg;
	}

	
	public String fly() {
		String msg = "This Goose Flies";
		System.out.println(msg);
		return msg;
	}

}
