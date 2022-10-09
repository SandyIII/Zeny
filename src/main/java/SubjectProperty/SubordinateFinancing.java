package SubjectProperty;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class SubordinateFinancing {
	@FindBy(how = How.XPATH, using = "//h4[text() ='Subordinate Financing']//following::button[text()='Add'][1]")
	WebElement Add_Button;
	@FindBy(how = How.XPATH, using = "//select[@ng-model ='item.TermsOfLoan.LienPriorityType']")
	WebElement Loan_Position;
	@FindBy(how = How.XPATH, using = "//input[@ng-model ='item.FullName']")
	WebElement Creditor_Name;
	@FindBy(how = How.XPATH, using = "//input[@ng-model ='item.Government.FHA.FinancingSourceEIN']")
	WebElement Source_EIN;
	@FindBy(how = How.XPATH, using = "//select[@ng-model ='item.Government.FHA.FinancingSourceType']")
	WebElement Source_Type;
	@FindBy(how = How.XPATH, using = "//input[@ng-model ='item.Government.FHA.FinancingSourceTypeOtherDescription']")
	WebElement Other_Description;
	@FindBy(how = How.XPATH, using = "//select[@ng-model ='item.FirstLoanMortgageeType']")
	WebElement First_Loan_Mortgagee;

	@FindBy(how = How.XPATH, using = "//label[text() ='Original Loan Amount']//following::input[1] ")
	WebElement Original_Loan_Amount;
	@FindBy(how = How.XPATH, using = "//label[text() ='Loan Amount']//following::input[1] ")
	WebElement Loan_Amount;
	@FindBy(how = How.XPATH, using = "//label[text() ='Note Rate']//following::input[1] ")
	WebElement Note_Rate;
	@FindBy(how = How.XPATH, using = "//label[text() ='Qual Rate']//following::input[1] ")
	WebElement Qual_Rate;
	@FindBy(how = How.XPATH, using = "//label[text() ='Amortization Term']//following::input[1] ")
	WebElement Amortization_Term;
	@FindBy(how = How.XPATH, using = "//label[text() ='Loan Term']//following::input[1] ")
	WebElement Loan_Term;
	@FindBy(how = How.XPATH, using = "//label[text() ='Interest Only']//following::input[1] ")
	WebElement Interest_Only;
	@FindBy(how = How.XPATH, using = "//label[text() ='Monthly Payment']//following::input[1] ")
	WebElement Monthly_Payment;
	@FindBy(how = How.XPATH, using = "//label[text() ='Credit Limit']//following::input[1] ")
	WebElement Credit_Limit;
	@FindBy(how = How.XPATH, using = "//label[text() ='Qualify Ratios at the Interest Only Payment']")
	WebElement Qualify_Ratios_CheckBox;
	@FindBy(how = How.XPATH, using = "//button[text() ='Save & Close']")
	WebElement SaveClose;
	@FindBy(how = How.XPATH, using = "//button[text() ='Save & New']")
	WebElement SaveNew;
	@FindBy(how = How.XPATH, using = "//button[text() ='Cancel']")
	WebElement cancel;

	public void ADD_Button() {

		Add_Button.click();
	}

	public void Subordinate_Financing(String loanposition, String Creditorname, String SourceEIN, String SourceType,
			String Other, String FirstLoanMortgagee, String OriginalLoanAmount, String LoanAmount, String NoteRate,
			String QualRate, String AmortizationTerm, String LoanTerm, String InterestOnly, String MonthlyPayment,
			String CreditLimit, String Quality, String action) throws InterruptedException {

		Thread.sleep(3000);
		Select select1 = new Select(Loan_Position);
		select1.selectByVisibleText(loanposition);
		Creditor_Name.sendKeys(Creditorname);
		Source_EIN.sendKeys(SourceEIN);
		Thread.sleep(3000);
		Select select2 = new Select(Source_Type);
		select2.selectByVisibleText(SourceType);
		Thread.sleep(3000);
		if (SourceType.equalsIgnoreCase("Other")) {
			Other_Description.sendKeys(Other);
		}
		Thread.sleep(3000);
		Select select3 = new Select(First_Loan_Mortgagee);
		Thread.sleep(3000);
		if (loanposition.equalsIgnoreCase("First")) {
			select3.selectByVisibleText(FirstLoanMortgagee);
			Original_Loan_Amount.sendKeys(OriginalLoanAmount);
		}
		
		Loan_Amount.sendKeys(LoanAmount);
		Note_Rate.sendKeys(NoteRate);
		Qual_Rate.sendKeys(QualRate);
		Amortization_Term.sendKeys(AmortizationTerm);
		Loan_Term.sendKeys(LoanTerm);
		Interest_Only.sendKeys(InterestOnly);
		Monthly_Payment.sendKeys(MonthlyPayment);
		Credit_Limit.sendKeys(CreditLimit);
		if (Quality.equalsIgnoreCase("Check")) {
			Qualify_Ratios_CheckBox.click();
		}
		Thread.sleep(3000);
		if (action.equalsIgnoreCase("Save & New")) {
			SaveNew.click();
		} else if (action.equalsIgnoreCase("Save & Close")) {
			SaveClose.click();

		} else if (action.equalsIgnoreCase("Cancel")) {
			cancel.click();

		}
	}

}
