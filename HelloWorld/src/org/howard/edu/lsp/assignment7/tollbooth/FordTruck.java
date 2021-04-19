package org.howard.edu.lsp.assignment7.tollbooth;

public class FordTruck implements Truck{
	
	private int axle;
	  private double weight;
	  private String make = "Ford";
	 
	  /**
	   * 
	   * @param a represents the number of axles in truck
	   * @param w represents the weight of the truck in kg
	   */
	  public FordTruck(int a, double w){
	    axle = a;
	    weight = w;
	  }
	  /** Returns the number of axle*/
	  public int getAxle(){
	    return axle;
	  }

	  /**Returns the weight of the truck */
	  public double getWeight(){
	    return weight;
	  }

	  public void setWeight(double w){
	    weight = w;
	  }

}
