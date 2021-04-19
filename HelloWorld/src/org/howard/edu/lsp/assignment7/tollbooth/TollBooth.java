package org.howard.edu.lsp.assignment7.tollbooth;
import java.util.*;


public interface TollBooth{
 
	/**
	 * 
	 * @param t is an object of type Truck
	 */
	  public double calculateToll(Truck t);
	  public List<Object> displayData();
	  /** Display the current total and reset the cash and number of trucks */
	  public List<Object> reset();
	}
