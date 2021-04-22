package org.howard.edu.lsp.exam.question41.removezeros;
import java.util.*;

//public static void removeZeroes(ArrayList intList)
//
//{		
//	for(int i = 0; i < intList.size(); i++)
//	{	
//		if(intList.get(i) == 0)
//		{
//			intList.remove(i);
//			i--;
//		}
//	}
//}
//

public class RemoveZeros{
	
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
