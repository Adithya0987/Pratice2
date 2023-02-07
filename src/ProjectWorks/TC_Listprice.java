package ProjectWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Listprice extends  BaseTest {
	@Test(dataProvider="make")
	public void Working(String[]s) {
		BasePage bh= new BasePage(driver);
		bh.getListprice().sendKeys(s[3]);
		WebElement listprice = driver.findElement(By.id("listprice"));
		Assert.assertEquals(listprice.getCssValue("border-color"), "rgb(29, 99, 175)", "Must be a number between 500 and 100000");
		Reporter.log("Entered valid data",true);
}
}
