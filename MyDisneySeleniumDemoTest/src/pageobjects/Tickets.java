package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.DriverInstantiation;

public class Tickets extends DriverInstantiation {
	
	//Create wait object
	static WebDriverWait wait = new WebDriverWait(driver, 15);
	
	//Select number of days
	public static void selectNumDays(int numDays) {
		
		driver.findElementByXPath("//div[text() = '" + numDays + "']").click();
		
	}

	//Select number of Adult tickets
	public static void selectNumAdultTickets(int numTickets) {

		for (int x=0; x<numTickets;x++) {
		WebElement addAdults = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@aria-label='Add Adults count to mix']")));
		addAdults.click();
		}
	}
	
	//Select number of Child tickets
	public static void selectNumChildTickets(int numTickets) {
		
		for (int x = 0; x<numTickets;x++) {
			
			driver.findElementByXPath("//button[@aria-label='Add Child count to mix']").click();
		}
			
	}
	
	//Select ticket type
	public static void selectTicketType(String ticketType) {
		
		WebElement onePark = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-ticket-id='myw_']")));
		
		if (ticketType.equalsIgnoreCase("one park"))
			onePark.click();
		else if (ticketType.equalsIgnoreCase("park hopper"))
			driver.findElementByXPath("//button[@data-ticket-id='myw_park-hopper']").click();
		else if (ticketType.equalsIgnoreCase("park hopper plus"))
			driver.findElementByXPath("//button[@data-ticket-id='myw_park-hopper_park-hopper-plus']").click();
		
	}
	
	//Add ticket selections to cart
	public static void addTicketsToCart() {
		
		WebElement addToCart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("addToCart")));
		addToCart.click();
	}
}
