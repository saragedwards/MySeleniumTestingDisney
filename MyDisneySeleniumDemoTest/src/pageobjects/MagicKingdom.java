package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.DriverInstantiation;

public class MagicKingdom extends DriverInstantiation {
	
	//Click the Select Tickets button
	public static void clickSelectTickets () {
	
		driver.findElementByXPath("//a[@href='/tickets/']/span/span").click();
		
	}

}
