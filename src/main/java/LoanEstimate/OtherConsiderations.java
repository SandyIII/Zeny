package LoanEstimate;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OtherConsiderations {
	
	
	
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'will allow, under certain conditions,')]")
	WebElement will_allow_1;
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'will not allow assumption ')]")
	WebElement will_allow_2;
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'If a payment is more than')]//following::input[1]")
	WebElement If_a_payment_is_more_than;
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'days late, you will be charged')]//following::input[1]")
	WebElement days_late_you_will_be_charged;
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'days late, you will be charged')]//following::input[3]")
	WebElement Percentage;
	@FindBy(how = How.XPATH, using = "//select[@ng-model = 'dealData.Loans.Loan.LateChargeRule.Type']")
	WebElement DropDown;
	@FindBy(how = How.XPATH, using = "//input[@ng-model = 'dealData.Loans.Loan.LateChargeRule.TypeOtherDescription']")
	WebElement Other_Description;
	@FindBy(how = How.XPATH, using = "//select[@ng-model = 'dealData.Loans.Loan.Servicing.Type']")
	WebElement Servicing;

}
