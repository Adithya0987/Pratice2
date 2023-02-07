package Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomSripts {

	public PomSripts(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@id='nav_camper']")
	private WebElement cam;
	
	public WebElement getCam() {
		return cam;
	}

	@FindBy(id = "make")
	private WebElement mak;

	public WebElement getMak() {
		return mak;
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

	@FindBy(id = "engineperformance")
	private WebElement engineperformance;
	@FindBy(id = "dateofmanufacture")
	private WebElement dateofmanufacture;
	@FindBy(id = "numberofseats")
	private WebElement numberofseats;

}
