package org.howard.edu.lsp.assignment4.test;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

import org.howard.edu.lsp.assignment4.implementation.IntegerSet;
import org.howard.edu.lsp.assignment4.implementation.IntegerSetException;


public class Test {
	static IntegerSet intset = new IntegerSet();
	
	public static void main(String[] args) throws IntegerSetException { //when exception occurs, contol is send to main function.
		//test1
		List<Integer> setA = new ArrayList<Integer>(Arrays.asList());
		List<Integer> setB = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7));
		IntegerSet testObjA = new IntegerSet();  
		IntegerSet testObjB = new IntegerSet();
		TestDriver t = new TestDriver();
		
		//add to respective integersets
		for (int a : setA) {
			testObjA.add(a);
		}
		
		for (int b : setB) {
			testObjB.add(b);
		}
		System.out.println(" TEST CASE 1");
		System.out.println("Set 1 = " + setA + ", Set 2 = " + setB + " Item to add = " + "8 " + " Item to remove = " + "8");
		//Tests for unary methods in IntegerSet:
		System.out.println("\nTESTING UNARY METHODS");
		t.testAdd(Arrays.asList(8) , testObjA, 8);
		t.testRemove(Arrays.asList(), testObjA, 8);
		t.testContains(1, testObjA, false);
		
		// exception handling
		// when largest() is call on empty set, an error message is thrown.
		// But the other program works fine.
		try {
			t.testLargest(0, testObjA);
		}
		catch(IntegerSetException e){
			System.out.println(e.getMessage());
			
		}
		
		try {
			t.testSmallest(1, testObjA);
		}
		catch(IntegerSetException e) {
			System.out.println(e.getMessage());
			
		}
		t.testLength(setA.size(), testObjA);
		t.testEquals(false, testObjA, testObjB); 
		t.testIsEmpty(true, testObjA);
		t.testToString(testObjB);
		
		
		//tests for binary operations
		System.out.println("\nTESTING BINARY SET OPERATIONS");
		t.testUnion(testObjA, testObjB);
		t.testIntersect(testObjA, testObjB);
		t.testDiff(testObjA, testObjB);
		//finally testing clear
		t.testClear(testObjA);

		//test2
		setA = new ArrayList<Integer>(Arrays.asList(1,2));
		setB = new ArrayList<Integer>(Arrays.asList(3));
		testObjA = new IntegerSet();  
		testObjB = new IntegerSet();
		t = new TestDriver();
		
		//add to respective integersets
		for (int a : setA) {
			testObjA.add(a);
		}
		
		for (int b : setB) {
			testObjB.add(b);
		}
		
		System.out.println(" \n\nTEST CASE 2");
		System.out.println("Set 1 = " + setA + ", Set 2 = " + setB + " Item to add = " + "8 " + " Item to remove = " + "8");
		//Tests for unary methods in IntegerSet:
		System.out.println("\nTESTING UNARY METHODS");
		t.testAdd(Arrays.asList(1,2,8) , testObjA, 8);
		t.testRemove(setA, testObjA, 8);
		t.testContains(1, testObjA, true);
		
		try {
			t.testLargest(2, testObjA); 
		}
		catch(IntegerSetException e)
		{
			System.out.println(e.getMessage());
		}
		 
		
		try {
			t.testSmallest(1, testObjA);
		}
		catch(IntegerSetException e)
		{
			System.out.println(e.getMessage());
		}
		
		t.testLength(setA.size(), testObjA);
		t.testEquals(false, testObjA, testObjB); 
		t.testIsEmpty(false, testObjB);
		t.testToString(testObjB);
		
		
		//tests for binary operations
		System.out.println("\nTESTING BINARY SET OPERATIONS");
		t.testUnion(testObjA, testObjB);
		t.testIntersect(testObjA, testObjB);
		t.testDiff(testObjA, testObjB);
		//finally testing clear
		t.testClear(testObjA);		


	
	
	//test3
			setA = new ArrayList<Integer>(Arrays.asList());
			setB = new ArrayList<Integer>(Arrays.asList());
			testObjA = new IntegerSet();  
			testObjB = new IntegerSet();
			t = new TestDriver();
			
			//add to respective integersets
			for (int a : setA) {
				testObjA.add(a);
			}
			
			for (int b : setB) {
				testObjB.add(b);
			}
			
			System.out.println(" \n\nTEST CASE 3");
			System.out.println("Set 1 = " + setA + ", Set 2 = " + setB + " Item to add = " + "6 " + " Item to remove = " + "8");
			//Tests for unary methods in IntegerSet:
			System.out.println("\nTESTING UNARY METHODS");
			t.testAdd(Arrays.asList(6) , testObjA, 6);
			t.testRemove(Arrays.asList(6), testObjA, 8);
			t.testContains(1, testObjA, false);
			t.testClear(testObjA);
			try {
				t.testLargest(7, testObjA);
			}
			catch(IntegerSetException e) {
				System.out.println(e.getMessage());
			}
			try {
				t.testSmallest(7, testObjA);
			}
			catch(IntegerSetException e) {
				System.out.println(e.getMessage());
			}
			  
		
			t.testLength(setA.size(), testObjA);
			t.testEquals(true, testObjA, testObjB); 
			t.testIsEmpty(true, testObjB);
			t.testToString(testObjB);
			
			
			//tests for binary operations
			System.out.println("\nTESTING BINARY SET OPERATIONS");
			t.testUnion(testObjA, testObjB);
			t.testIntersect(testObjA, testObjB);
			t.testDiff(testObjA, testObjB);
			//finally testing clear
					

		
	
	
	//test4
	setA = new ArrayList<Integer>(Arrays.asList(0,5));
	setB = new ArrayList<Integer>(Arrays.asList(-1, -7, 4));
	testObjA = new IntegerSet();  
	testObjB = new IntegerSet();
	t = new TestDriver();
	
	//add to respective integersets
	for (int a : setA) {
		testObjA.add(a);
	}
	
	for (int b : setB) {
		testObjB.add(b);
	}
	
	System.out.println(" \n\nTEST CASE 4");
	System.out.println("Set 1 = " + setA + ", Set 2 = " + setB + " Item to add = " + "6 " + " Item to remove = " + "0");
	//Tests for unary methods in IntegerSet:
	System.out.println("\nTESTING UNARY METHODS");
	t.testAdd(Arrays.asList(0,5,6) , testObjA, 6);
	t.testRemove(Arrays.asList(5,6), testObjA, 0);
	t.testContains(1, testObjA, false);
	
	try {
		t.testLargest(6, testObjA); 
	}
	catch(IntegerSetException e)
	{
		System.out.println(e.getMessage());
	}
	 
	
	try {
		t.testSmallest(5, testObjA);
	}
	catch(IntegerSetException e)
	{
		System.out.println(e.getMessage());
	}
	
	
	t.testLength(setA.size(), testObjA);
	t.testEquals(false, testObjA, testObjB); 
	t.testIsEmpty(false, testObjB);
	t.testToString(testObjB);
	
	
	//tests for binary operations
	System.out.println("\nTESTING BINARY SET OPERATIONS");
	t.testUnion(testObjA, testObjB);
	t.testIntersect(testObjA, testObjB);
	t.testDiff(testObjA, testObjB);
	//finally testing clear
	t.testClear(testObjA);		


	//test5
	setA = new ArrayList<Integer>(Arrays.asList(1,2,3));
	setB = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
	testObjA = new IntegerSet();  
	testObjB = new IntegerSet();
	t = new TestDriver();
	
	//add to respective integersets
	for (int a : setA) {
		testObjA.add(a);
	}
	
	for (int b : setB) {
		testObjB.add(b);
	}
	
	System.out.println(" \n\nTEST CASE 5");
	System.out.println("Set 1 = " + setA + ", Set 2 = " + setB + " Item to add = " + "3 " + " Item to remove = " + "5");
	//Tests for unary methods in IntegerSet:
	System.out.println("\nTESTING UNARY METHODS");
	t.testAdd(Arrays.asList(1,2,3) , testObjA, 3);
	t.testRemove(setA, testObjA, 5);
	t.testContains(1, testObjA, true);
	
	try {
		t.testLargest(3, testObjA); 
	}
	catch(IntegerSetException e)
	{
		System.out.println(e.getMessage());
	}
	 
	
	try {
		t.testSmallest(1, testObjA);
	}
	catch(IntegerSetException e)
	{
		System.out.println(e.getMessage());
	}
	
	t.testLength(setA.size(), testObjA);
	t.testEquals(false, testObjA, testObjB); 
	t.testIsEmpty(false, testObjB);
	t.testToString(testObjB);
	
	
	//tests for binary operations
	System.out.println("\nTESTING BINARY SET OPERATIONS");
	t.testUnion(testObjA, testObjB);
	t.testIntersect(testObjA, testObjB);
	t.testDiff(testObjA, testObjB);
	//finally testing clear
	t.testClear(testObjA);	
	
	//test6
	setA = new ArrayList<Integer>(Arrays.asList(5,6,7,9));
	setB = new ArrayList<Integer>(Arrays.asList(3,4,6,8,9,4));
	testObjA = new IntegerSet();  
	testObjB = new IntegerSet();
	t = new TestDriver();
	
	//add to respective integersets
	for (int a : setA) {
		testObjA.add(a);
	}
	
	for (int b : setB) {
		testObjB.add(b);
	}
	
	System.out.println(" \n\nTEST CASE 6");
	System.out.println("Set 1 = " + setA + ", Set 2 = " + setB + " Item to add = " + "6 " + " Item to remove = " + "0");
	//Tests for unary methods in IntegerSet:
	System.out.println("\nTESTING UNARY METHODS");
	t.testAdd(Arrays.asList(5,6,7,9) , testObjA, 6);
	t.testRemove(setA, testObjA, 0);
	t.testContains(1, testObjA, false);
	
	
	try {
		t.testLargest(9, testObjA); 
	}
	catch(IntegerSetException e)
	{
		System.out.println(e.getMessage());
	}
	 
	
	try {
		t.testSmallest(5, testObjA);
	}
	catch(IntegerSetException e)
	{
		System.out.println(e.getMessage());
	}
	
	t.testLength(setA.size(), testObjA);
	t.testEquals(false, testObjA, testObjB); 
	t.testIsEmpty(false, testObjB);
	t.testToString(testObjB);
	
	
	//tests for binary operations
	System.out.println("\nTESTING BINARY SET OPERATIONS");
	t.testUnion(testObjA, testObjB);
	t.testIntersect(testObjA, testObjB);
	t.testDiff(testObjA, testObjB);
	//finally testing clear
	t.testClear(testObjA);		
	
	
	//test7
		setA = new ArrayList<Integer>(Arrays.asList(4,7,9));
		setB = new ArrayList<Integer>(Arrays.asList(4,7,9));
		testObjA = new IntegerSet();  
		testObjB = new IntegerSet();
		t = new TestDriver();
		
		//add to respective integersets
		for (int a : setA) {
			testObjA.add(a);
		}
		
		for (int b : setB) {
			testObjB.add(b);
		}
		
		System.out.println(" \n\nTEST CASE 7");
		System.out.println("Set 1 = " + setA + ", Set 2 = " + setB + " Item to add = " + "-2 " + " Item to remove = " + "1");
		//Tests for unary methods in IntegerSet:
		System.out.println("\nTESTING UNARY METHODS");
		t.testEquals(true, testObjA, testObjB);
		t.testAdd(Arrays.asList(4,7,9,-2) , testObjA, -2);
		t.testRemove(Arrays.asList(4,7,9), testObjA, -2);
		t.testContains(7, testObjA, true);
		
		
		try {
			t.testLargest(9, testObjA); 
		}
		catch(IntegerSetException e)
		{
			System.out.println(e.getMessage());
		}
		 
		
		try {
			t.testSmallest(4, testObjA);
		}
		catch(IntegerSetException e)
		{
			System.out.println(e.getMessage());
		}
		
	
		t.testLength(setA.size(), testObjA);
//		t.testEquals(true, testObjA, testObjB); 
		t.testIsEmpty(false, testObjB);
		t.testToString(testObjB);
		
		
		//tests for binary operations
		System.out.println("\nTESTING BINARY SET OPERATIONS");
		t.testUnion(testObjA, testObjB);
		t.testIntersect(testObjA, testObjB);
		t.testDiff(testObjA, testObjB);
		//finally testing clear
		t.testClear(testObjA);
		
		
		//test8
			setA = new ArrayList<Integer>(Arrays.asList(7));
			setB = new ArrayList<Integer>(Arrays.asList());
			testObjA = new IntegerSet();  
			testObjB = new IntegerSet();
			t = new TestDriver();
			
			//add to respective integersets
			for (int a : setA) {
				testObjA.add(a);
			}
			
			for (int b : setB) {
				testObjB.add(b);
			}
			
			System.out.println(" \n\nTEST CASE 8");
			System.out.println("Set 1 = " + setA + ", Set 2 = " + setB + " Item to add = " + "7 " + " Item to remove = " + "7");
			//Tests for unary methods in IntegerSet:
			System.out.println("\nTESTING UNARY METHODS");
			t.testAdd(Arrays.asList(7) , testObjA, 7);
			t.testRemove(Arrays.asList(), testObjA, 7);
			t.testContains(1, testObjA, false);
			
			
			try {
				t.testLargest(-1, testObjA); 
			}
			catch(IntegerSetException e)
			{
				System.out.println(e.getMessage());
			}
			 
			
			try {
				t.testSmallest(0, testObjA);
			}
			catch(IntegerSetException e)
			{
				System.out.println(e.getMessage());
			}
		
			t.testLength(0, testObjA);
			t.testEquals(true, testObjA, testObjB); 
			t.testIsEmpty(true, testObjB);
			t.testToString(testObjB);
			
			
			//tests for binary operations
			System.out.println("\nTESTING BINARY SET OPERATIONS");
			t.testUnion(testObjA, testObjB);
			t.testIntersect(testObjA, testObjB);
			t.testDiff(testObjA, testObjB);
			//finally testing clear
			t.testClear(testObjA);

	}
}


