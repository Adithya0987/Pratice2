
pkpackage Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseScripts {
	WebDriver driver;
	@BeforeClass
	public void enterwebsite() {  // Step 1 To open the browser
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 driver = new ChromeDriver();
		 Reporter.log("Browser Launched",true);
		driver.get("http://sampleapp.tricentis.com/101/app.php");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Reporter.log("Application Opened",true);
		driver.manage().window().maximize();
		Reporter.log("Browser Maximized",true);	

}
	
		
		
	}


