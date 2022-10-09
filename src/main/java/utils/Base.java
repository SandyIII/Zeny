package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class Base  {
	
	public  WebDriver driver;
	public WebDriver Base(WebDriver driver) {
		return  driver ;
	}
	
	public ExcelReader reader = new ExcelReader("./Data/data.xlsx");
	
	
	@BeforeClass
	public  void open() throws InterruptedException {
		
		

		driver = BrowserFactory.WebDriverManagerTest();
		Thread.sleep(3000);
	}

	
}
