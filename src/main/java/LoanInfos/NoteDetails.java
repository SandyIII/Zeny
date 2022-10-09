package LoanInfos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NoteDetails {

	@FindBy(how = How.XPATH, using = "//*[text() = 'Estimated Appraised Value']//following::input[1]")
	WebElement Estimated_Appraised_Value;
	@FindBy(how = How.XPATH, using = "//label[text() = 'Initial Requested Loan Amount']//following::input[1]")
	WebElement Initial_Requested_Loan_Amount;
	@FindBy(how = How.XPATH, using = "//label[text() = 'Note Rate']//following::input[1]")
	WebElement Note_Rate;
	@FindBy(how = How.XPATH, using = "//label[text() = 'Qual Rate']//following::input[1]")
	WebElement Qual_Rate;
	@FindBy(how = How.XPATH, using = "//label[text() = 'Amortization Term']//following::input[1]")
	WebElement Amortization_Term;
	@FindBy(how = How.XPATH, using = "//label[text() = 'Loan Term']//following::input[1]")
	WebElement Loan_Term;
	@FindBy(how = How.XPATH, using = "//label[text() = 'Appraised Value']//following::input[1]")
	WebElement Appraised_Value;
	@FindBy(how = How.XPATH, using = "//label[text() = 'Sales Price']//following::input[1]")
	WebElement Sales_Price;
	@FindBy(how = How.XPATH, using = "//label[text() = 'Base Loan Amount']//following::input[1]")
	WebElement Base_Loan_Amount;
	@FindBy(how = How.XPATH, using = "//*[@ng-model = 'dealData']/button")
	WebElement CAL;
	@FindBy(how = How.XPATH, using = "//label[text() = 'Down Payment']//following::input[1]")
	WebElement Down_Payment;
	@FindBy(how = How.XPATH, using = "//button[text() = 'Calculate']")
	WebElement Button;
	@FindBy(how = How.XPATH, using = "//label[text() = 'Down Payment Amount']//following::input[1]")
	WebElement Down_Payment_Amount;
	@FindBy(how = How.XPATH, using = "//label[text() = 'Total Loan Amount w/MIP.FF']//following::input[1]")
	WebElement Total_Loan_Amount;
	@FindBy(how = How.XPATH, using = "//label[text() = 'Monthly Payment ']//following::input[1]")
	WebElement MonthlyPayment;

	public void Details(String Estimated, String Initial, String Rate, String Qual, String Amortization, String Loan,
			String Apraisal, String Sale ,String Base   ,String calculate ,String Down ,String DownAmount) throws InterruptedException {
		Estimated_Appraised_Value.sendKeys(Estimated);
		Initial_Requested_Loan_Amount.sendKeys(Initial);
		Note_Rate.sendKeys(Rate);
		Qual_Rate.sendKeys(Qual);
		Amortization_Term.sendKeys(Amortization);
		Loan_Term.sendKeys(Loan);
		Thread.sleep(3000);
		Appraised_Value.sendKeys(Apraisal);
		Sales_Price.sendKeys(Sale);
		Base_Loan_Amount.sendKeys(Base);
		
		
		Thread.sleep(3000);
		if(calculate.equalsIgnoreCase("Click")) {
			CAL.click();
			Down_Payment.sendKeys(Down);
			Button.click();
		}else {Down_Payment_Amount.sendKeys(DownAmount);}
	}

}
