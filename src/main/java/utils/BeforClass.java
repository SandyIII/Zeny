package utils;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

public class BeforClass extends BrowserFactory {
	 String SheetName ;
	public WebDriver driver;
	@BeforeClass
	public void open() throws InterruptedException {
		
		

		//driver = BrowserFactory.WebDriverManagerTest();
		Thread.sleep(3000);
	}
}
