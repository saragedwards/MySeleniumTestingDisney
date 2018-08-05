package pageobjects;

import base.DriverInstantiation;

public class Cart extends DriverInstantiation{
	
	public static String numAdultTix;
	public static String numChildTix;
	
	//Get the number of adult tickets displaying in the cart
	public static String getNumAdultTix() {
		
		numAdultTix = driver.findElementByXPath("//input[contains(@id,'ADULT')]").getAttribute("value");
				
		return numAdultTix;
		
	}

	//Get the number of childtickets displaying in the cart
		public static String getNumChildTix() {
			
			numChildTix = driver.findElementByXPath("//input[contains(@id,'CHILD')]").getAttribute("value");
					
			return numChildTix;
			
		}
	
	
}
