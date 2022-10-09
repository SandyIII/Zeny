package LoanEstimate;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoanEstimate_TopSection {

	@FindBy(how = How.XPATH, using = "//input[@ng-model='dealData.Loans.Loan.ApplicationReceivedDate']")
	WebElement Application_Date;
	@FindBy(how = How.XPATH, using = "//input[@ng-model='dealData.Loans.Loan.DocumentSpecificData.IntegratedDisclosure_Detail.LoanPurposeDescription']")
	WebElement Purpose;
	@FindBy(how = How.XPATH, using = "//input[@ng-model='dealData.Loans.Loan.DocumentSpecificData.IntegratedDisclosure_Detail.LoanProductDescription']")
	WebElement Product;
	@FindBy(how = How.XPATH, using = "//select[@ng-model='dealData.Loans.Loan.DocumentSpecificData.IntegratedDisclosure_Detail.RateLockDescription']")
	WebElement Rate_Lock;
	@FindBy(how = How.XPATH, using = "//input[@ng-model='dealData.Loans.Loan.Product.Lock.ExpirationDate']")
	WebElement Rate_Lock_Expiration_Date;
	@FindBy(how = How.XPATH, using = "//select[@ng-model='dealData.Loans.Loan.DocumentSpecificData.GFE.RateLockExpirationTimeZone']")
	WebElement RLED_Dropdown;
	@FindBy(how = How.XPATH, using = "//input[@ng-model='dealData.Loans.Loan.DocumentSpecificData.GFE.SettlementChargesAvailableThroughDate']")
	WebElement Estimate_Available_Through;
	@FindBy(how = How.XPATH, using = "//select[@ng-model='dealData.Loans.Loan.DocumentSpecificData.GFE.SettlementChargesAvailableThroughTimeZone']")
	WebElement EAT_Dropdown;
	@FindBy(how = How.XPATH, using = "//input[@ng-model='dealData.Loans.Loan.DocumentSpecificData.IntentToProceedWithLoanTransactionIndicatedDate']")
	WebElement Intent_to_Proceed;
	@FindBy(how = How.XPATH, using = "//select[@ng-model='dealData.Loans.Loan.DocumentSpecificData.IntentToProceedWithLoanTransactionIndicatedType']")
	WebElement ITP_Dropdown;
	@FindBy(how = How.XPATH, using = "//select[@ng-model='dealData.Loans.Loan.Payment.Rule.PaymentOptionIndicator']")
	WebElement Optional_Payment;
	@FindBy(how = How.XPATH, using = "//label[text()='If Yes, Period']//following::span[1]")
	WebElement If_Yes_Period;
	@FindBy(how = How.XPATH, using = "//label[text()='Prepayment Penalty']")
	WebElement Prepayment_Penalty_CheckBox;
	@FindBy(how = How.XPATH, using = "//select[@ng-model='dealData.Loans.Loan.LoanDetail.Prepayment.PercentBasisType']")
	WebElement If_Yes_Penalty_will_be_Based_on;
	@FindBy(how = How.XPATH, using = "//label[text()='Rate Percentage']//following::span[1]")
	WebElement Rate_Percentage;
	@FindBy(how = How.XPATH, using = "//label[text()='Dollar Amount']//following::span[1]")
	WebElement Dollar_Amount;
	@FindBy(how = How.XPATH, using = "//label[text()='Maximum Prepayment Penalty']//following::span[1]")
	WebElement Maximum_Prepayment_Penalty;
	@FindBy(how = How.XPATH, using = "//label[text()='Period']//following::span[1]")
	WebElement Period_Months;
}
