package org.howard.edu.lsp.assignment4.implementation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Implementation Class for Set using ArrayList as data structure.
 * @author DSCS2LAB
 *
 */
public class IntegerSet {
	private List<Integer> set;
	
	public IntegerSet() {
		this.set = new ArrayList<Integer>();
	}
	
	
	/**
	 * * Getter method to obtain value of set since it is a private attribute
	 */
	 	
	public List<Integer> getSet(){
		return set;
	}
	
	/**
	 * Function to clear the internal representation of Set
	 * This means to remove all the elements of set.
	 * We do this by creating a new instance of ArrayList
	 */
	public void clear() {
		set = new ArrayList<Integer>();
		}
	
	/**
	 * Function to return length of given set. We use ArrayList.size() method to find the length.
	 * @return returns the number of elements in the given set. Return type is obviously integer. 
	 */
	public int length() {
		return set.size();
	}
	
	/**
	 * Function to compare equality of two set.
	 * @param b : Another set is given as parameter to this function which is to be compared with given set.
	 * @return Boolean return i.e. True is two set are equal otherwise False.
	 */
	public boolean equals(IntegerSet b) {
		//List<Integer> b = new ArrayList<Integer>();
		Collections.sort(set);
		List<Integer> setb = b.getSet();
		Collections.sort(setb);
		boolean isEqual = set.equals(setb);
		return isEqual;
		}
	
	/**
	 * Function to check if certain value is in the given set or not.
	 * @param value: check if the passed value in the given set
	 * @return True if value is found. Otherwise return false.
	 */
	public boolean contains(int value) {
		return set.contains(value);
	}
	
	/**
	 * Function to return largest element in the given set.
	 * Throws exception if set is empty
	 * @return largest element in set
	 * @throws IntegerSetException when set is empty
	 */
	public int largest() throws IntegerSetException {
			if (set.size()==0){
				throw new IntegerSetException("Calling .largest() on EMPTY SET");
			}
			else {return Collections.max(set);}
		    
	}
	

	/**
	 * Function to return smallest element in set
	 * @return smallest element in set
	 * @throws IntegerSetException when set is empty
	 */
	public int smallest() throws IntegerSetException {
			if (set.size()==0){
				throw new IntegerSetException("Calling .smallest() on EMPTY SET");
			}
			return Collections.min(set);
	}
	
	

	/**
	 * Function that adds an item to the set or does nothing it already there
	 * @param item is the data to be added in given set
	 */
		
	 public void add(int item) {
		if (!set.contains(item)) {
			set.add(item);
		}
	 }

	 
	 /**
	  * Function that removes an item from the set if item is there.
	  * Otherwise can not remove if item is not in the set.
	  * @param item
	  */
	 public void remove(int item) {
		 for(int i =0; i<set.size(); i++) {
			 if(set.get(i)== item) {
				 set.remove(i);
			 }
		 }
		 
	 }
	 
	 
	 /**
	  * Function to find Union of two set;
	  * @param intSetb is second set
	  */
	 
	 public void union(IntegerSet intSetb) {
		 //Sets.union(set, intSetb);
		 List<Integer> sb = intSetb.getSet();
		 IntegerSet temp = new IntegerSet();
		 
		 //add element from original object to set temp object set
		 for (int i = 0 ; i< this.set.size(); i++) {
			 temp.add(set.get(i));
			 }
		 
		 //add element from the second IntegerSet object to the temp object set
		 for (int i = 0; i< sb.size(); i++) {
			 temp.add(sb.get(i));
		 }
		 
		 System.out.println("Result of Union of "+ set.toString() + " and " + intSetb.toString()+ " " + "is :" +  temp.toString());
		 }
		 
	 
	 /**
	  * Function to find intersection of two sets
	  * @param intSetb is second set
	  */
	 public void intersect(IntegerSet intSetb) {
		 IntegerSet temp = new IntegerSet();
		 List<Integer> sb = intSetb.getSet();
		 //populate common int elements into a temp object set
		 for (int i = 0; i< set.size() ; i++) {
			 if( sb.contains( set.get(i) ) ){
				 temp.add( set.get(i) );
			 }
		 }
		 System.out.println("Result of Intersection of "+ set.toString() + " and " + intSetb.toString()+ " " + "is: " +  temp.toString());
	 } 

	 /**
	  * Function to find difference of two set.
	  * @param intSetb
	  */
	 public void diff(IntegerSet intSetb) {
		 IntegerSet temp = new IntegerSet();
		 List<Integer> sb = intSetb.getSet();
		//populate elements present ONLY in first set into the temp object set 
		 for (int i = 0; i< set.size() ; i++) {
			 if( !sb.contains( set.get(i) ) ){
				 temp.add( set.get(i) );
			 }
		 }
		 System.out.println("Result of difference operation of "+ set.toString() + " and " + intSetb.toString()+ " " + "is: " +  temp.toString());
	 }
	 
		/**
		 * Function to check is set is empty or not.
		 * @return : Returns true if the set is empty, false otherwise
		 */
	
	 public boolean isEmpty() {
		 return set.size()==0;
	 } 

	
	
	/**
	 * Method to override the default toString method of the IntegerSet so that we can use it with println()  
	 */
	@Override
	public String toString() {
		return set.toString();
	}
}

	
