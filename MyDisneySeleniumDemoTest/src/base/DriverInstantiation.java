package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class DriverInstantiation {

	public static ChromeDriver driver = new ChromeDriver();
	
	@BeforeMethod
	public void setUp() {
		
		String driverPath;
		
		driverPath = "chromedriver";
		
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		driver.manage().window().maximize();
		
		driver.navigate().to("http://www.disneyworld.disney.go.com");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	}
	
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
		
	}
	
}
