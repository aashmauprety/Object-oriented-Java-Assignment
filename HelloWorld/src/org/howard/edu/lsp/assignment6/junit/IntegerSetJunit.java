package org.howard.edu.lsp.assignment6.junit;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.howard.edu.lsp.assignment6.integerset.*;

public class IntegerSetJunit {
	


	@Test
	public void testLength() {
		IntegerSet obj = new IntegerSet();
		obj.add(12);
		obj.add(12);
		obj.add(11);
		int expected = 2;
		int actual = obj.length();
		assertEquals(expected,actual);
		
		IntegerSet obj1 = new IntegerSet();
		obj1.add(0);
		int expected1 = 1;
		int actual1 = obj1.length();
		assertEquals(expected1,actual1);
		
		
		IntegerSet obj2 = new IntegerSet();
		int expected2 = 0;
		int actual2 = obj2.length();
		assertEquals(expected2,actual2);
		
		
		
	}
	@Test
	public void testEquals() {
		IntegerSet obj1 = new IntegerSet();
		IntegerSet obj2 = new IntegerSet();
		obj1.add(2);
		obj2.add(2);
		
		
		boolean expected = true;
		boolean actual = obj1.equals(obj2);
		assertEquals(expected, actual);
		
		
		
		IntegerSet obj11 = new IntegerSet();
		IntegerSet obj21 = new IntegerSet();
		obj11.add(3);
		obj11.add(9);
		obj21.add(3);
		obj21.add(9);
		
		boolean expected1 = true;
		boolean actual1 = obj1.equals(obj2);
		assertEquals(expected1, actual1);
		
		
		
		IntegerSet obj12 = new IntegerSet();
		IntegerSet obj22 = new IntegerSet();
		obj12.add(3);
		obj12.add(9);
		obj22.add(-1);
		
		
		boolean expected2 = false;
		boolean actual2 = obj21.equals(obj22);
		assertEquals(expected2, actual2);
	}
	
	@Test
	public void testLargest() throws IntegerSetException {
		IntegerSet obj1 = new IntegerSet();
		obj1.add(0);
		obj1.add(1);
		obj1.add(7);
		
		int expected = 7;
		int actual = obj1.largest();
		assertEquals(expected,actual);
		
		IntegerSet obj2 = new IntegerSet();
		boolean exceptionThrown = false;
		try {
			int s = obj2.largest();
		}
		catch(IntegerSetException e){
			exceptionThrown = true;
		}
		
		assertEquals(exceptionThrown, true);
		
	}
	
	
	@Test
	public void testSmallest() throws IntegerSetException {
		IntegerSet obj1 = new IntegerSet();
		obj1.add(0);
		obj1.add(1);
		obj1.add(7);
		
		int expected = 0;
		int actual = obj1.smallest();
		assertEquals(expected,actual);
		
		IntegerSet obj2 = new IntegerSet();
		boolean exceptionThrown = false;
		try {
			int s = obj2.smallest();
		}
		catch(IntegerSetException e){
			exceptionThrown = true;
		}
		
		assertEquals(exceptionThrown, true);
		
	}
	
	
	
	@Test
	public void testAdd() {
		IntegerSet obj1 = new IntegerSet();
		obj1.add(4);
		obj1.add(3);
		obj1.add(4);
		List<Integer> expected1 = Arrays.asList(4, 3);
		List<Integer> actual1 = obj1.getSet();
		assertEquals(expected1, actual1);

		
		
		
		
		IntegerSet obj2 = new IntegerSet();
		obj2.add(0);
		obj2.add(-100);
		obj2.add(1234);
		List<Integer> expected2 = Arrays.asList(0, -100, 1234);
		List<Integer> actual2 = obj2.getSet();
		assertEquals(expected2, actual2);	
		
	}
	
	
	
	@Test
	public void testRemove() {
		IntegerSet obj1 = new IntegerSet();
		obj1.add(4);
		obj1.add(3);
		obj1.remove(4);
		List<Integer> expected1 = Arrays.asList(3);
		List<Integer> actual1 = obj1.getSet();
		assertEquals(expected1, actual1);

		
		
		
		
		IntegerSet obj2 = new IntegerSet();
		obj2.add(0);
		obj2.add(-100);
		obj2.add(1234);
		obj2.remove(9);
		obj2.remove(0);
		List<Integer> expected2 = Arrays.asList(-100, 1234);
		List<Integer> actual2 = obj2.getSet();
		assertEquals(expected2, actual2);	
		
	}
	
	
	@Test
	public void testUnion() {
		IntegerSet obj1 = new IntegerSet();
		IntegerSet obj2 = new IntegerSet();
		obj1.add(4);
		obj1.add(3);
		
		obj2.add(4);
		obj2.add(3);
		obj1.union(obj2);
		List<Integer> expected1 = Arrays.asList(4,3);
		List<Integer> actual1 = obj1.getSet();
		assertEquals(expected1, actual1);

		IntegerSet obj3 = new IntegerSet();
		IntegerSet obj4 = new IntegerSet();
		
		obj3.add(12);
		obj3.add(13);
		
		obj4.add(14);
		obj4.add(55);
		
		obj3.union(obj4);
		List<Integer> expected3 = Arrays.asList(12,13,14,55);
		List<Integer> actual3 = obj3.getSet();
		assertEquals(expected3, actual3);					
	}
	
	@Test
	public void testIntersect() {
			IntegerSet obj1 = new IntegerSet();
			IntegerSet obj2 = new IntegerSet();
			obj1.add(4);
			obj1.add(3);
			
			obj2.add(4);
			obj2.add(3);
			obj1.intersect(obj2);
			List<Integer> expected1 = Arrays.asList(4,3);
			List<Integer> actual1 = obj1.getSet();
			assertEquals(expected1, actual1);

			IntegerSet obj3 = new IntegerSet();
			IntegerSet obj4 = new IntegerSet();
			
			obj3.add(12);
			obj3.add(13);
			
			obj4.add(14);
			obj4.add(55);
			
			obj3.intersect(obj4);
			List<Integer> expected3 = new ArrayList<Integer>();
			List<Integer> actual3 = obj3.getSet();
			assertEquals(expected3, actual3);			
	}
	
	@Test
	public void testDiff() {
			IntegerSet obj1 = new IntegerSet();
			IntegerSet obj2 = new IntegerSet();
			obj1.add(4);
			obj1.add(3);
			
			obj2.add(4);
			obj2.add(3);
			obj1.diff(obj2);
			List<Integer> expected1 = new ArrayList<Integer>();
			List<Integer> actual1 = obj1.getSet();
			assertEquals(expected1, actual1);

			IntegerSet obj3 = new IntegerSet();
			IntegerSet obj4 = new IntegerSet();
			
			obj3.add(12);
			obj3.add(13);
			
			obj4.add(14);
			obj4.add(55);
			
			obj3.diff(obj4);
			List<Integer> expected3 = Arrays.asList(12,13);
			List<Integer> actual3 = obj3.getSet();
			assertEquals(expected3, actual3);			
	}

	
	@Test
	public void testIsEmpty() {
			IntegerSet obj1 = new IntegerSet();
			IntegerSet obj2 = new IntegerSet();
			obj1.add(4);
			obj1.add(3);
			
			obj2.add(4);
			obj2.add(3);
			boolean expected1 = false;
			boolean actual1 = obj1.isEmpty();
			assertEquals(expected1, actual1);

			boolean expected2 = false;
			boolean actual2 = obj2.isEmpty();
			assertEquals(expected2, actual2);

			
			IntegerSet obj3 = new IntegerSet();
			IntegerSet obj4 = new IntegerSet();
			boolean expected3 = true;
			boolean expected4 = true;
			boolean actual3 = obj3.isEmpty();
			boolean actual4 = obj4.isEmpty();
			assertEquals(expected3, actual3);
			assertEquals(expected4, actual4);
	}

	@Test
	public void testToString() {
		IntegerSet obj1 = new IntegerSet();
		IntegerSet obj2 = new IntegerSet();
		IntegerSet obj3 = new IntegerSet();
		IntegerSet obj4 = new IntegerSet();
		
		obj1.add(1);
		obj1.add(2);
		obj1.add(3);

		String expected = "[1, 2, 3]";
		String actual = obj1.toString();
		
		assertEquals(expected,actual);
		
		String expected1 = "[]";
		String actual1 = obj2.toString();
		assertEquals(expected1,actual1);

		obj3.add(0);
		obj3.add(1);
		obj3.add(2);
		
		String expected2 = "[0, 1, 2]";
		String actual2 = obj3.toString();
		assertEquals(expected2,actual2);
		
		String expected3 = "[]";
		String actual3 = obj4.toString();
		assertEquals(expected3,actual3);

	}
	
	
	@Test
	public void testClear() {
		IntegerSet obj1 = new IntegerSet();
		obj1.add(1);
		obj1.add(-100);
		obj1.add(0);
		
		obj1.clear();
		
		List<Integer> expected1 = new ArrayList<Integer>();
		List<Integer> actual1 = obj1.getSet();
		assertEquals(expected1, actual1);
		
		
		IntegerSet obj2 = new IntegerSet();
		obj2.clear();
		
		List<Integer> expected2 = new ArrayList<Integer>();
		List<Integer> actual2 = obj2.getSet();
		assertEquals(expected2, actual2);

		
	}
	
	
	@Test
	public void testContains() {
		IntegerSet obj1 = new IntegerSet();
		obj1.add(1);
		obj1.add(-100);
		obj1.add(0);
	
		
		boolean expected1 = true;
		boolean actual1 = obj1.contains(1);
		assertEquals(expected1, actual1);
		
		
		IntegerSet obj2 = new IntegerSet();
		obj2.add(89);
		obj2.add(6);
		
		boolean expected2 = false;
		boolean actual2 = obj2.contains(1);
		assertEquals(expected2, actual2);
		

		
		
		IntegerSet obj3 = new IntegerSet();
	
		
		boolean expected3 = false;
		boolean actual3 = obj3.contains(100);
		assertEquals(expected3, actual3);
		
		
	}
	
	
	
	
	
	
	
}





	


	