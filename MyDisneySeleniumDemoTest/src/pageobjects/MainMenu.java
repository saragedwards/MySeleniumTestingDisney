package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.DriverInstantiation;

public class MainMenu extends DriverInstantiation {
	
	//Method to hover over the Parks & Tickets Main Menu Option
	public static void clickParksTickets () {
		
		//Wait until Parks & Tickets menu is visible - seems to load last on the page
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement parksTickets = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("&lid=WDW_Header_ParksTickets_CategoryLink")));
		
		//Use Actions class to hover over Parks & Tickets
		Actions action = new Actions(driver);
		action.moveToElement(parksTickets).build().perform();
		
		
	}

}
