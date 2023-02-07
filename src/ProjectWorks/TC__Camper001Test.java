package ProjectWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC__Camper001Test extends BaseTest{
	@Test(dataProvider="make")
	public void working(String[]s) throws InterruptedException {
		BasePage bh= new BasePage(driver);
		bh.getCam().click();
		bh.getMake().sendKeys("BMW");
		WebElement colourmake = driver.findElement(By.id("make"));
		Assert.assertEquals(colourmake.getCssValue("border-color"), "rgb(29, 99, 175)","Select an option");
		//Reporter.log(colourmake.getText(),true);
		Reporter.log("Entered valid data",true);
		bh.getEngineperformance().sendKeys("1000");
		WebElement colourEngine = driver.findElement(By.id("engineperformance"));
		Assert.assertEquals(colourEngine.getCssValue("border-color"), "rgb(29, 99, 175)","Must be a number between 1 and 2000");
		//Reporter.log(colourEngine.getText(),true);
		Reporter.log("Entered valid data",true);
		/*bh.getFuel().sendKeys(s[2]);
		Assert.assertEquals(colourEngine.getCssValue("border-color"), "rgb(29, 99, 175)","Select an option");
		Reporter.log("Entered valid data",true);*/
		bh.getPayload().sendKeys("500");
		WebElement payload = driver.findElement(By.id("payload"));
		Assert.assertEquals(payload.getCssValue("border-color"), "rgb(29, 99, 175)","Must be a number between 1 and 1000");	
		Reporter.log("Entered valid data",true);
		bh.getListprice().sendKeys("2000");
		WebElement listprice = driver.findElement(By.id("listprice"));
		Assert.assertEquals(listprice.getCssValue("border-color"), "rgb(29, 99, 175)", "Must be a number between 500 and 100000");
		Reporter.log("Entered valid data",true);
		bh.getTotalweight().sendKeys("500");
		WebElement Totalweight = driver.findElement(By.id("totalweight"));
		Assert.assertEquals(Totalweight.getCssValue("border-color"), "rgb(29, 99, 175)", "Must be a number between 100 and 50000");
		Reporter.log("Entered valid data",true);
		driver.quit();

}
}
