package LoanEstimate;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignatureConfirmationAndHigherPricedMortgageLoan {

	
	
	
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Print Confirm Receipt')]")
	WebElement PrintConfirmReceipt;
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Print Additional Signature Page')]")
	WebElement PrintAdditionalSignaturePage;
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'APOR Date')]//following::input[1]")
	WebElement APORDate;
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'APOR Date')]//following::input[2]")
	WebElement APOR;
	
	
	
	
	
	
	
}
