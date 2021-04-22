package org.howard.edu.lsp.exam.question40;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiger tiger = new Tiger();
		Goose goose = new Goose();
		Airplane airplane = new Airplane();
		
		
		tiger.move();
		tiger.speak();
		
		goose.move();
		goose.speak();
		
		airplane.fly();
		
		Flying G = (Flying) goose;
		Flying A = (Flying) airplane;
	
		/***
		 * Testing if both can be casted to Flying type
		 * 
		 */
		G.fly();
		A.fly();

	}

}
