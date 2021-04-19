package org.howard.edu.lsp.assignment7.tollbooth;
import java.util.*;

public class AlleghenyTollBooth implements TollBooth{
	
	/**
	* AlleghenyBooth class uses the ToolBooth interface.
	* curTotal can be in fraction, so double is used.
	* numTrucks is always an integer so int is used.
	*/
	  private double curTotal;
	  private int numTrucks;
	  

	  public double calculateToll(Truck truck){
	    /**
	    * Method to calculate toll for given truck. t must be of a class that 
	    * implements the interface Truck so that this method can work properly
	    *@param t 
	        object of type Truck 
	      @return 
	        returns the calculated total of toll
	    */

	    double toll = truck.getAxle() * 5 + truck.getWeight()/50;
	    curTotal += toll;
	    numTrucks++;
	    return toll;
	  }
	  
	  /** For displaying the date */
	  public List<Object> displayData(){
	    //Totals since last collection - Receipts: $205 Trucks: 2
	    System.out.println("Totals since last collection - Receipts: $"+curTotal+
	      " Trucks: "+numTrucks +"\n");
	   return new ArrayList<Object>(Arrays.asList(curTotal, numTrucks)); 
	  }
	 

	  /** Show the information before resetting the booth's count */  
	  public List<Object> reset(){
	    System.out.println("*** Collecting receipts ***");
	    displayData();
	    curTotal = 0;
	    numTrucks = 0;
	   return new ArrayList<Object>(Arrays.asList(curTotal, numTrucks)); 
	  }
	
	

}
