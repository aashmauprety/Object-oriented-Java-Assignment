package org.howard.edu.lsp.assignment7.junit;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.howard.edu.lsp.assignment7.tollbooth.*;

public class TollBoothJUnit {
	
	
	@Test
	public void testCalculateToll() {
		
		TollBooth booth = new AlleghenyTollBooth();
	    Truck ford = new FordTruck(5, 12000);     // 5 axles and 12000 kilograms
	    double expected1 = 265.0;
	    double actual1 = booth.calculateToll(ford);
	    assertEquals(expected1,actual1, 0.0f);
	    
	    
	    Truck nissan = new NissanTruck(2, 5000);     // 2 axles and 5000kg
	    double expected2 = 110.0;
	    double actual2 = booth.calculateToll(nissan);
	    assertEquals(expected2,actual2, 0.0f);
		
	    Truck ford2 = new FordTruck(6, 14000); // 6 axle and 14000kg
	    double expected3 = 310.0;
	    double actual3 = booth.calculateToll(ford2);
	    assertEquals(expected3,actual3, 0.0f);
		
		
	}
	
	@Test
	public void testDisplayData() {
		TollBooth booth = new AlleghenyTollBooth();
	    Truck ford = new FordTruck(5, 12000);     // 5 axles and 12000 kilograms
	    booth.calculateToll(ford);
	    
	    List<Object> expected1 = new ArrayList<Object>(Arrays.asList(265.0,1)); 
	    List<Object> actual1 = booth.displayData();
	    assertEquals(expected1, actual1);
		
	    
	    
	    
	    Truck nissan = new NissanTruck(2, 5000);     // 2 axles and 5000kg
	    booth.calculateToll(ford);
	    
	    List<Object> expected2 = new ArrayList<Object>(Arrays.asList(530.0,2)); 
	    List<Object> actual2 = booth.displayData();
	    assertEquals(expected2, actual2);
		
		
	}

	
	@Test
	public void testReset() {	
		TollBooth booth = new AlleghenyTollBooth();
	    Truck ford1 = new FordTruck(5, 12000);     // 5 axles and 12000 kilograms
	    Truck nissan1 = new NissanTruck(2, 5000);
	    booth.calculateToll(ford1);
	    booth.calculateToll(nissan1);
	    
	    List<Object> expected1 = new ArrayList<Object>(Arrays.asList(0.0,0)); 
	    List<Object> actual1 = booth.reset();
	    assertEquals(expected1, actual1);
	    
		
	    
	    
	    Truck ford2 = new FordTruck(7, 2000);     // 7 axles and 2000 kilograms
	    Truck nissan2 = new NissanTruck(4, 9000);
	    booth.calculateToll(ford2);
	    booth.calculateToll(nissan2);
	    
	    List<Object> expected2 = new ArrayList<Object>(Arrays.asList(0.0,0)); 
	    List<Object> actual2 = booth.reset();
	    assertEquals(expected2, actual2);
	    
	    
	}
	
	
	

}
