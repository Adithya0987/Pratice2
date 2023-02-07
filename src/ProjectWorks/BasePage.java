package ProjectWorks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="(//a[@id='nav_camper'])[1]")
	private WebElement cam;
	
	public WebElement getCam() {
		return cam;
	}
	public WebElement getMake() {
		return make;
	}
	public WebElement getEngineperformance() {
		return engineperformance;
	}
	public WebElement getDateofmanufacture() {
		return dateofmanufacture;
	}
	public WebElement getNumberofseats() {
		return numberofseats;
	}
	
	@FindBy(id="make")
	private WebElement make;
	@FindBy(id = "engineperformance")
	private WebElement engineperformance;
	@FindBy(id = "dateofmanufacture")
	private WebElement dateofmanufacture;
	@FindBy(id = "numberofseats")
	private WebElement numberofseats;
	@FindBy(id="fuel")
	private WebElement fuel;
	@FindBy(id="payload")
	private WebElement payload;
	@FindBy(id="totalweight")
	private WebElement totalweight;
	@FindBy(id="listprice")
	private WebElement listprice;
	@FindBy(id="licenseplatenumber")
	private WebElement licenseplatenumber;

	public WebElement getTotalweight() {
		return totalweight;
	}
	public WebElement getListprice() {
		return listprice;
	}
	public WebElement getLicenseplatenumber() {
		return licenseplatenumber;
	}
	public WebElement getFuel() {
		return fuel;
	}
	public WebElement getPayload() {
		return payload;
	}
	
}

