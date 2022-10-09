package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;

public class ExplicitWait  {
	

static	WebDriver driver;

	public static   WebElement waitforelementToBeClickable(WebElement elementToBeLoaded) {
		 
		WebDriverWait   wait	= new WebDriverWait(driver, 10);
		
		WebElement element =  wait.until(ExpectedConditions.elementToBeClickable(elementToBeLoaded));
		return element ;
	}

	public static WebElement waitforelementToBevisible(WebElement elementToBeLoaded) {
		
		WebDriverWait  wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.visibilityOf(elementToBeLoaded));
		return element ;
	}
	public static  WebElement waitforelementToBePresent(WebElement elementToBeLoaded) {
		
		WebDriverWait 	 wait = new WebDriverWait(driver, 10);
		WebElement element	= wait.until(ExpectedConditions.presenceOfElementLocated((By) elementToBeLoaded));
		return element ;
	}
}
