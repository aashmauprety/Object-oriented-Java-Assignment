package org.howard.edu.lsp.exam.question40;

public class Tiger extends Animal {
	@Override 
	public String speak(){
		String msg =  "This Tiger speaks"; 
		System.out.println(msg);
		return msg;
	}
	
	@Override
	public String move() {
		String msg = "This Tiger moves forward" ;
		System.out.println(msg);
		return msg;
	}

}
