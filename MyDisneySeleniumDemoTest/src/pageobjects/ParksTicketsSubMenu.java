package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.DriverInstantiation;

public class ParksTicketsSubMenu extends DriverInstantiation {
	
	//Method to click the Magic Kingdom link under Parks and Tickets
	public static void clickMagicKingdom() {
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement magicKingdom = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("&lid=WDW_Header_ParksTickets_MagicKingdom")));
		magicKingdom.click();

		
	}

}
