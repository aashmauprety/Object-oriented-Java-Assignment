package org.howard.edu.lsp.assignment2.test;
import java.util.ArrayList;
import java.util.Arrays;

import org.howard.edu.lsp.assignment2.combination.CombinationSum;

/**
 * Test class is the driver class that test the implementation code using multiple test cases.
 * Test cases are hard coded. And this test cases are used to validate the recursive call.
 * @author DSCS2LAB
 *
 */
public class Test {
    static CombinationSum cs = new CombinationSum();
    
    public static void printer(Integer[] i, int t) {
    	System.out.println("\n\n\nInput Array: " + Arrays.toString(i));
    	System.out.println("Target Sum: " + t);
    }
	public static void main(String[] args) {
		
		Integer[] input1 = {3,9,8,4,5,7,10};
		int target1 = 17;
		printer(input1, target1);
		
        cs.placeholder = new ArrayList<Integer>(Arrays.asList(input1));
        cs.calculate_combinations(new ArrayList<Integer>(Arrays.asList(input1)),target1);
     
        
        Integer[] input2 = {1,2,3,4,5,6};
     
        cs.placeholder = new ArrayList<Integer>(Arrays.asList(input2));
        int target2 = 5;
        printer(input2, target2);
        cs.calculate_combinations(new ArrayList<Integer>(Arrays.asList(input2)),target2);
        
        Integer[] input3 = {3,6,0,4,9};
        cs.placeholder = new ArrayList<Integer>(Arrays.asList(input3));
        int target3 = 9;
        printer(input3, target3);
        cs.calculate_combinations(new ArrayList<Integer>(Arrays.asList(input3)),target3);

        Integer[] input4 = {6,4,2,1,5};
        cs.placeholder = new ArrayList<Integer>(Arrays.asList(input4));
        int target4 = 10;
        printer(input4, target4);
        cs.calculate_combinations(new ArrayList<Integer>(Arrays.asList(input4)),target4);

        Integer[] input5 = {};
        cs.placeholder = new ArrayList<Integer>(Arrays.asList(input5));
        int target5 = 5;
        printer(input5, target5);
        cs.calculate_combinations(new ArrayList<Integer>(Arrays.asList(input5)),target5);

        Integer[] input6 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
        cs.placeholder = new ArrayList<Integer>(Arrays.asList(input6));
        int target6 = 21;
        printer(input6, target6);
        cs.calculate_combinations(new ArrayList<Integer>(Arrays.asList(input6)),target6);

        Integer[] input7 = {4,2,1,5};
        cs.placeholder = new ArrayList<Integer>(Arrays.asList(input7));
        int target7 = 5;
        printer(input7, target7);
        cs.calculate_combinations(new ArrayList<Integer>(Arrays.asList(input7)),target7);

        Integer[] input8 = {1};
        cs.placeholder = new ArrayList<Integer>(Arrays.asList(input8));
        int target8 = 1;
        printer(input8, target8);
        cs.calculate_combinations(new ArrayList<Integer>(Arrays.asList(input8)),target8);

      
        
	}

}
