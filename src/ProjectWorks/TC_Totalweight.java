package ProjectWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Totalweight extends  BaseTest {
	@Test(dataProvider="make")
	public void Working(String[]s) {
		BasePage bh= new BasePage(driver); 
		bh.getTotalweight().sendKeys(s[4]);
		WebElement Totalweight = driver.findElement(By.id("totalweight"));
		Assert.assertEquals(Totalweight.getCssValue("border-color"), "rgb(29, 99, 175)", "Must be a number between 100 and 50000");
		Reporter.log("Entered valid data",true);

}
}
