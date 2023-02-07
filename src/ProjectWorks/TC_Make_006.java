package ProjectWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Make_006 extends BaseTest {
	@Test(dataProvider="make")
	public void Working(String[]s) {
		BasePage bh= new BasePage(driver);
		bh.getMake().sendKeys(s[0]);
		WebElement colourmake = driver.findElement(By.id("make"));
		Assert.assertEquals(colourmake.getCssValue("border-color"), "rgb(29, 99, 175)","Select an option");
		//Reporter.log(colourmake.getText(),true);
		Reporter.log("Entered valid data",true);
		
		
	}
	

}
