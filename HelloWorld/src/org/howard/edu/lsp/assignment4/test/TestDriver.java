package org.howard.edu.lsp.assignment4.test;

import java.util.List;

import org.howard.edu.lsp.assignment4.implementation.IntegerSet;
import org.howard.edu.lsp.assignment4.implementation.IntegerSetException;

public class TestDriver {
	/**
	 * 
	 * @param obj : IntegerSet object whose set attribute is to be cleared 
	 */
	void testClear(IntegerSet obj) {
		List<Integer> temp = obj.getSet();
		obj.clear();
		System.out.println("Result of Set before clear: " + temp + " and set after clear() : " + obj.getSet() );
	}

	/**
	 *   
	 * @param expected  : Expected length of the set object obj
	 * @param obj: Actual length 
	 */
	void testLength(int expected, IntegerSet obj) {
		String msg = (expected == obj.getSet().size()) ? "SUCCESS" : "FAIL" ;
		System.out.println("TEST " +msg+ " .length() Expected length: " + expected + " Actual length: " + obj.length());
	}

	/**
	 * 
	 * @param expected: Expected boolean result of whether value of two set object equal or not
	 * @param a First set object
	 * @param b Second set object
	 */
	void testEquals(boolean expected, IntegerSet a, IntegerSet b) {
		String msg = (expected == a.equals(b)) ? "SUCCESS" : "FAIL" ;
		System.out.println("TEST "+msg+ " .equals() Expected : "+ expected + " Actual: " + a.equals(b) );
	}

	  /**
	   * 
	   * @param t : value which is to be checked 
	   * @param a: set object 
	   * @param expected: expected result of whether t is in a or not.
	   */
	void testContains(int t, IntegerSet a, boolean expected) {
		String msg = (expected == a.contains(t)) ? "SUCCESS" : "FAIL" ;
		System.out.println("TEST " + msg + " .contains() Set " + a.getSet() + " contains " + t + " is : " + a.contains(t));
	}

	/** 
	 * 
	 * @param expected : the expected value of the largest element in set if empty, -1
	 * @throws IntegerSetException 
	 */
	void testLargest(int expected, IntegerSet a) throws IntegerSetException {
		String msg = (expected == a.largest()) ? "SUCCESS" : "FAIL" ;
		System.out.println("TEST " +msg+  " .largest() Expected: "+ expected + " Actual: " + a.largest() + " from " + a.getSet());
	}

	/**
	 *   
	 * @param expected : expected smallest element in set
	 * @param : object to test
	 * @throws IntegerSetException 
	 */
	void testSmallest(int expected, IntegerSet a)  throws IntegerSetException{
		String msg = (expected == a.smallest()) ? "SUCCESS" : "FAIL" ;
		System.out.println("TEST " +msg+  " .smallest() Expected: "+ expected + " Actual: " + a.smallest() + " from " + a.getSet());
	}

	/**
	 * 
	 * @param expected : Expected list after addition 
 	 * @param obj : IntegerSet object to add the element (num) to 
	 * @param num : num to be added
	 */
	void testAdd(List<Integer> expected, IntegerSet obj, int num) {
		obj.add(num);
		String msg = (expected.equals(obj.getSet())) ? "SUCCESS" : "FAIL" ;
		System.out.println("TEST " + msg + " .add() Expected: " + expected + " Actual: " + obj.toString());
	}

	  /**
	   * 
	   * @param expected : Expected list after removal
	   * @param obj : IntegerSet object to remove the element (num) from
	   * @param num : num to be removed
	   */
	void testRemove(List<Integer> expected, IntegerSet obj, int num) {
		obj.remove(num);
		String msg = (expected.equals(obj.getSet())) ? "SUCCESS" : "FAIL";
		System.out.println("TEST " + msg + " .remove() Expected: " + expected + " Actual: " + obj.toString());
		
	}

	 /**
	  * Prints the result of union of the two objects into stdout
	  * @param objA 
	  * @param objB
	  */
	void testUnion(IntegerSet objA, IntegerSet objB) {
		objA.union(objB);
	}

	/**
	 * Prints the result of intersect of the two objects into stdout  
	 */
	void testIntersect(IntegerSet objA, IntegerSet objB) {
		objA.intersect(objB);
	}

	/**
	 * Prints the result of set operation objA - objB object's sets so that elements
	 * only present in objA is printed onto Stdout 
	 * @param objA
	 * @param objB
	 */
	void testDiff(IntegerSet objA, IntegerSet objB) {
		objA.diff(objB);
	}

	/**
	 * Tests the isEmpty() method for an object 
	 * @param expected
	 * @param obj
	 */
	void testIsEmpty(boolean expected, IntegerSet obj) {
		String msg = (expected == obj.isEmpty()) ? "SUCCESS" : "FAIL" ;
		System.out.println("TEST " + msg+  " .isEmpty() Expected: " + expected + " Actual : "+ obj.isEmpty());
	}

	
	void testToString(IntegerSet obj) {
		System.out.println("TEST .toString() Array: " + obj.getSet() + " Result from toString(): " + obj.toString());
	}
	
}
