package org.howard.edu.lsp.exam.question41.junit;


import static org.junit.jupiter.api.Assertions.*;

import org.howard.edu.lsp.exam.question41.removezeros.RemoveZeros;
import org.junit.jupiter.api.Test;
import java.util.*;

public class RemoveZeoresTest {
	@Test
	public void testRemoveZeros() {
	ArrayList<Integer> a1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,0,3,4,4,5,0,4,4,5,0));
	ArrayList<Integer> expected1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,3,4,4,5,4,4,5));
	ArrayList<Integer> actual1 = RemoveZeros.removeZeroes(a1);
	assertEquals(expected1,actual1);
	
	
	ArrayList<Integer> a2 = new ArrayList<Integer>(Arrays.asList(0,0,0,0,0,1,2,3,4,5));
	ArrayList<Integer> expected2 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
	ArrayList<Integer> actual2 = RemoveZeros.removeZeroes(a2);
	assertEquals(expected2,actual2);
	}
	
}

