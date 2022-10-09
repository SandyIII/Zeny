package LoanEstimate;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoanTerms {

	
	//Loan Amount
	
	@FindBy(how = How.XPATH, using = "//td[text()='Loan Amount']//following::span[1]")
	WebElement Loan_Amount;
	@FindBy(how = How.XPATH, using = "//td[text()='Loan Amount']//following::td[2]")
	WebElement 	Can_this_amount_increase_after_closing;
	@FindBy(how = How.XPATH, using = "//td[text()='Loan Amount']//following::td[3]")
	WebElement Description;
	
	//Interest Rate
	@FindBy(how = How.XPATH, using = "//td[text()='Interest Rate']//following::td[1]")
	WebElement Interest_Rate	;
	@FindBy(how = How.XPATH, using = "//td[text()='Interest Rate']//following::td[2]")
	WebElement 	Can_this_amount_increase_after_closing1;
	@FindBy(how = How.XPATH, using = "//td[text()='Interest Rate']//following::td[3]")
	WebElement Description1;
	
	//Monthly Principal & Interest
	@FindBy(how = How.XPATH, using = "//span[text()='Monthly Principal & Interest']//following::td[1]")
	WebElement Monthly_Principal_Interest	;
	@FindBy(how = How.XPATH, using = "//span[text()='Monthly Principal & Interest']//following::td[2]")
	WebElement 	Can_this_amount_increase_after_closing2;
	@FindBy(how = How.XPATH, using = "//span[text()='Monthly Principal & Interest']//following::td[3]")
	WebElement Description2;
	
	////////////Prepayment Penalty
	@FindBy(how = How.XPATH, using = "//td[text()='Prepayment Penalty']//following::td[1]")
	WebElement Prepayment_Penalty	;
	@FindBy(how = How.XPATH, using = "//td[text()='Prepayment Penalty']//following::td[2]")
	WebElement 	Description3;
	
	//Balloon Payment
	@FindBy(how = How.XPATH, using = "//td[text()='Balloon Payment']//following::td[1]")
	WebElement Balloon_Payment	;
	@FindBy(how = How.XPATH, using = "//td[text()='Balloon Payment']//following::td[2]")
	WebElement Description4;
}
