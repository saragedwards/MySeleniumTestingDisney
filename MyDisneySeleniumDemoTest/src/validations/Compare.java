package validations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Compare {
	
	//Method to validate whether or not an element exists on the page
	public static boolean elementExists(WebDriver driver, String locatorType, String locator) {
		
		try {
			if (locatorType.equalsIgnoreCase("xpath"))
				{
					driver.findElement(By.xpath(locator));
				}
				else if (locatorType.equalsIgnoreCase("id")) 
				{
					driver.findElement(By.id(locator));
				}
				else if (locatorType.equalsIgnoreCase("name"))
				{
					driver.findElement(By.name(locator));
				}
			return true;
		}
		catch (Exception e)
		{
			return false;
		}
		
	}
	
	//Method to validate whether or not some text exists on an element
	public static boolean textExistsOnElement(WebDriver driver, String locatorType, String locator, String text) {
		
		boolean result = false;
		String actualText = "";
		
		try {
			if (locatorType.equalsIgnoreCase("xpath"))
				{
					actualText = driver.findElement(By.xpath(locator)).getText();
				}
				else if (locatorType.equalsIgnoreCase("id")) 
				{
					actualText = driver.findElement(By.id(locator)).getText();
				}
				else if (locatorType.equalsIgnoreCase("name"))
				{
					actualText = driver.findElement(By.name(locator)).getText();
				}
			
			if (actualText.equalsIgnoreCase(text))
			return result;
		}
		catch (Exception e)
		{
		
		}
		return result;
	}
	
	//Method to validate whether or not text exists on page anywhere
	public static boolean textExists(WebDriver driver, String text) {
		
		if (driver.getPageSource().contains(text)) {
			return true;
		}
		else
			return false;
	}
	
	//Method used to compare the  current page title to the expected page title
	public static boolean comparePageTitle(WebDriver driver, String expTitle) {
		  
		if (driver.getTitle().equalsIgnoreCase(expTitle))
			return true;
		
		else
			return false;
		
	}

	//Method used to compare the current URL to the expected URL
	public static boolean compareURL(WebDriver driver, String url) {
		
		if (driver.getCurrentUrl().equalsIgnoreCase(url))
			return true;
		else
			return false;
	
	}
}
