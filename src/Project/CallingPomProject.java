package Project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CallingPomProject extends BaseScripts {
	@DataProvider
	public String[][] make() throws EncryptedDocumentException, IOException{
		FileInputStream fis = new FileInputStream(new File("./TestData/TricData.xlsx"));
		Workbook Workbook = WorkbookFactory.create(fis);
		Sheet Actul = Workbook.getSheet("Sheet1");
		int row = Actul.getPhysicalNumberOfRows()-1;
		int coul = Actul.getRow(0).getPhysicalNumberOfCells();
		String arr[][]=new String[row][coul];
		for(int i=1,h=0;i<=row;i++,h++) {
			  for(int j=0;j<coul;j++) {
				  arr[h][j]=Actul.getRow(i).getCell(j).toString();
			}
		}
		
		return arr;
		
	}
	@Test(dataProvider="make")
	public void working(String[]sequ) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		
		PomSripts ps=new PomSripts(driver);
		ps.getCam().click();
		
		Thread.sleep(3000);
		
		ps.getMak().sendKeys(sequ[0]);  
		
		ps.getEngineperformance().sendKeys(sequ[1]);
		driver.quit();
		
	}

}
