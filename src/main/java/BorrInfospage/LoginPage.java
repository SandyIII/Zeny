package BorrInfospage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.ExplicitWait;


/**
 * 
 */

/**
 * @author hassane_djoudi
 *
 */
public class LoginPage {

	 // Element Library 
	 @FindBy(how =How.NAME , using ="login")
	 WebElement UserName;
	 @FindBy(how =How.NAME , using ="pass" )
	 WebElement Password;
	 @FindBy( how =How.XPATH , using ="//button[text()='Sign In']")
	 WebElement SignInButton;

	 // Methods to interact with the elements
	 public void login(String userName, String password) {
		
	 UserName.sendKeys(userName);
	 Password.sendKeys(password);
	// ExplicitWait .waitforelementToBeClickable(SignInButton);
	
	 SignInButton.click();
	 }
}
