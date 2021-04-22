package org.howard.edu.lsp.exam.question41.removezeros;
import java.util.*;

public class RemoveZeros{
	
	/***
	 * 
	 * @param list is the input arraylist from which all zeroes should be removed.
	 * @return list after removing all zeroes from the original arraylist
	 */
	public static ArrayList<Integer> removeZeroes(ArrayList<Integer> list) {
	//	int i = 0;
	//	while (i<list.size()) {
	//		if (list.get(i)== 0) {
	//			list.remo
	//			i-=1;
	//		}
	//		i++;
	//	}
		ArrayList<Integer> toRemove = new ArrayList<Integer>(Arrays.asList(0));
		list.removeAll(toRemove);
		return list;
	}

}
