package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BrowserFactory  {
	//public static WebDriver driver ;

	
	
	public static   WebDriver WebDriverManagerTest() {
		/*System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"./Driver/chromedriver.exe");
		WebDriver	driver = new ChromeDriver();
		driver.get(Constant.Url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();*/
		WebDriver driver = null ;
		
		if(Constant.webdriver.equalsIgnoreCase("MicrosoftEdge")) {
			WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
			driver.get(Constant.Url);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			}
		
		 else if(Constant.webdriver.equalsIgnoreCase("Chrome")) {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get(Constant.Url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		}
		
		  if(Constant.webdriver.equalsIgnoreCase("Firefox")) {
		WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();
		driver.get(Constant.Url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		}
	
		

		return driver;
	}
	
}
