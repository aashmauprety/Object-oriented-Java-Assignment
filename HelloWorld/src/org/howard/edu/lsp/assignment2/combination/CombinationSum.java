package org.howard.edu.lsp.assignment2.combination;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * CombinationSum is the implementation class to find the desired combination of indices of 
 * input resulting to an targeted sum.
 * @author Aashma
 *
 */
public class CombinationSum {
	/**
	 * The method sum_up_recursive finds the solution by recursive approach.
	 * Assumption:
	 * - ArrayList<Integer> input contains unique integers only
	 * @param input is the given array of input value.
	 * @param target_sum is the desired target value.
	 * @param temp is an array created to hold sub portion of initial input array.
	 */
	public ArrayList<Integer> placeholder;
	
    public void sum_up_recursive(ArrayList<Integer> input, int target_sum, ArrayList<Integer> temp) {
    	int s = 0;
       for (int x: temp) s += x;
       if (s == target_sum) {
    	   
       		ArrayList<Integer> indices = new ArrayList<Integer>();
       		ArrayList<Integer> elements = new ArrayList<Integer>();
       		for (int x : temp) {
       			indices.add(placeholder.indexOf(x));
       			elements.add(x);
       			
       		}
       		//?System.out.println(placeholder);
       	    //System.out.println(temp);
       		System.out.println("Combination of index : "+Arrays.toString(indices.toArray())+" == "+target_sum + " for elements "
       	    + Arrays.toString(elements.toArray()));
       		//System.out.println("input{"+Arrays.toString(temp.toArray())+"="+target_sum+"\n");
       		
       }
            
       if (s >= target_sum)
            return;
       for(int i=0;i<input.size();i++) {
             ArrayList<Integer> remaining = new ArrayList<Integer>();
             int n = input.get(i);
             for (int j=i+1; j<input.size();j++) remaining.add(input.get(j));
             ArrayList<Integer> temp_rec = new ArrayList<Integer>(temp);
             temp_rec.add(n);
             sum_up_recursive(remaining,target_sum,temp_rec);
       }
    }
    /**
     * This method calculate_combinations calls the method sum_up_recursive
     * and recursively finds the desired combination using the parameters passed.
     * @param numbers is the input array value.
     * @param target is the desired sum value.
     */
    public void calculate_combinations(ArrayList<Integer> numbers, int target) {
        sum_up_recursive(numbers,target,new ArrayList<Integer>());
    }
}