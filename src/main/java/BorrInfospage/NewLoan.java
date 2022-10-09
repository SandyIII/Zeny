/**
 * 
 */
package BorrInfospage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;




/**
 * @author Owner
 *
 */    
public class NewLoan {//*[contains(text(),'Loan ')]
	WebDriver driver;
	@FindBy(xpath = "//*[text()='New Loan']")
	WebElement NewLoan;
	@FindBy(xpath = "//label[contains(text(),\"Loan \")]")
	WebElement LoanID;
	@FindBy(xpath ="//*[text()='Application']")
	 WebElement Application ;
	@FindBy(xpath ="//*[@id=\"root\"]/div[2]/div/div[3]/div/label")
	 WebElement loanId ;
	
	public void AddNewLoan()  {
		
		NewLoan.click();
//		Assert.assertTrue(loanId.isDisplayed());
//	    Log.info("the loan does not created");
		
	}
		
		
		
	
	public void application() {
		 Application.click();
		 
	 }
}
