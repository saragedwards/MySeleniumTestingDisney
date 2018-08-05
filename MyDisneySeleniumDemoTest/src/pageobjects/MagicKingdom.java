package pageobjects;

import base.DriverInstantiation;

public class MagicKingdom extends DriverInstantiation {
	
	//Click the Select Tickets button
	public static void clickSelectTickets () {
	
		driver.findElementByXPath("//a[@href='/tickets/']/span/span").click();
		
	}

}
