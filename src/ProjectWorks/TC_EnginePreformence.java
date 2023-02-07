package ProjectWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_EnginePreformence extends  BaseTest {
	@Test(dataProvider="make")
	public void Working(String[]s) {
		BasePage bh= new BasePage(driver); 
		bh.getEngineperformance().sendKeys(s[1]);
		WebElement colourEngine = driver.findElement(By.id("engineperformance"));
		Assert.assertEquals(colourEngine.getCssValue("border-color"), "rgb(29, 99, 175)","Must be a number between 1 and 2000");
		Reporter.log("Entered valid data",true);
}
}
