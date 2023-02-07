package ProjectWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Payload extends  BaseTest {
	@Test(dataProvider="make")
	public void Working(String[]s) {
		BasePage bh= new BasePage(driver);
			bh.getPayload().sendKeys(s[2]);
			WebElement payload = driver.findElement(By.id("payload"));
			Assert.assertEquals(payload.getCssValue("border-color"), "rgb(29, 99, 175)","Must be a number between 1 and 1000");	
			Reporter.log("Entered valid data",true);

}
}
