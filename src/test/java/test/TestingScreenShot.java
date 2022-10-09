package test;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BorrInfospage.LoginPage;
import BorrInfospage.NewLoan;

import org.testng.annotations.Parameters;
import io.github.bonigarcia.wdm.WebDriverManager;
import listeners.ExtentListeners;
import utils.Base;
import utils.BrowserFactory;
import utils.Constant;
import utils.ExplicitWait;
import utils.ScreenShot;

@Listeners(ExtentListeners.class)
public class TestingScreenShot      {
	
	
	 WebDriver driver ;
	@BeforeMethod
	public void open() throws InterruptedException  {
		driver = BrowserFactory.WebDriverManagerTest();
		
		
		Thread.sleep(3000);
		
		
		
	}
	@Test
	public void run() throws Exception {
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.login(Constant.username, Constant.password);
		Assert.assertEquals(false, true);
		
	}
	@AfterMethod
	public void close() throws Exception {
		driver.close();
		
	}
}
