package HMDA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class Application {
	@FindBy(how = How.XPATH, using = "//*[text() = 'HMDA']")
	WebElement HMDA;
	@FindBy(how = How.XPATH, using = "//li[1]//a[text() = 'Application']")
	WebElement Application;
	@FindBy(how = How.XPATH, using = "//select[@ng-model='dealData.Loans.Loan.HMDA_Loan_Detail.PreapprovalType']")
	WebElement Preapprovals;
	@FindBy(how = How.XPATH, using = "//input[@ng-model='dealData.Loans.Loan.ThirdPartyLoanIdentifiers.GlobalLegalEntityIdentifier']")
	WebElement Legal_Entity_ID;
	@FindBy(how = How.XPATH, using = "//input[@ng-model='dealData.Loans.Loan.ThirdPartyLoanIdentifiers.LenderCase']")
	WebElement Lender_Case_Number;
	@FindBy(how = How.XPATH, using = "//input[@ng-model='dealData.Loans.Loan.ThirdPartyLoanIdentifiers.ULICheckSUM']")
	WebElement Check_Number;
	@FindBy(how = How.XPATH, using = "//*[text() = 'Universal Loan ID']//following::label[1]")
	WebElement Universal_Loan_ID;
	@FindBy(how = How.XPATH, using = "//input[@ng-model='dealData.Loans.Loan.ThirdPartyLoanIdentifiers.NonUniversalLoanIdentifier']")
	WebElement Non_Universal_Loan_ID;
	@FindBy(how = How.XPATH, using = "//input[@ng-model='dealData.Loans.Loan.HMDA_Loan_Detail.LoanOriginatorNMLSIdentifier']")
	WebElement Loan_Originator_NMLS;
	@FindBy(how = How.XPATH, using = "//*[text() = 'Exclude Loan From HMDA Report']")
	WebElement Exclude_Loan_From_HMDA_Report;
	
	
	
	public void application(String preapprovals, String legal_entity_ID, String lender_case_Number, String check_Number,
			String universal_loan_ID, String non_universal_Loan_ID, String loan_originator_NMLS, String Checkbox)
			throws InterruptedException {
		HMDA.click();
		Thread.sleep(3000);
		Application.click();
		Thread.sleep(3000);
		Select select = new Select(Preapprovals);
		select.selectByValue(preapprovals);
		Legal_Entity_ID.sendKeys(legal_entity_ID);
		Lender_Case_Number.sendKeys(lender_case_Number);
		Check_Number.sendKeys(check_Number);
		Universal_Loan_ID.sendKeys(universal_loan_ID);
		Non_Universal_Loan_ID.sendKeys(non_universal_Loan_ID);
		Loan_Originator_NMLS.sendKeys(loan_originator_NMLS);
		Thread.sleep(3000);
		if(Checkbox.equalsIgnoreCase("Checked")) {
			Exclude_Loan_From_HMDA_Report.click();
		}
		

	}
	public void subjectproperty() {
		
		
		
	}

}
