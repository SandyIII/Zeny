package LoanInfos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class LoanPage {


	@FindBy(how = How.XPATH, using = "//*[text() = 'Loan']")
	WebElement Loan;
	@FindBy(how = How.XPATH, using = "//input[@ng-model = 'dealData.Loans.Loan.ApplicationReceivedDate']")
	WebElement Application_Date;
	@FindBy(how = How.XPATH, using = "//input[@ng-model = 'dealData.Loans.Loan.ThirdPartyLoanIdentifiers.GlobalLegalEntityIdentifier']")
	WebElement Legal_Entity_ID;
	@FindBy(how = How.XPATH, using = "//input[@ng-model = 'dealData.Loans.Loan.ThirdPartyLoanIdentifiers.LenderCase']")
	WebElement Lender_Case_Number;
	@FindBy(how = How.XPATH, using = "//input[@ng-model = 'dealData.Loans.Loan.ThirdPartyLoanIdentifiers.ULICheckSUM']")
	WebElement Check_Number;
	@FindBy(how = How.XPATH, using = "//div/label[text() = 'Universal Loan ID']//following-sibling::div/label")
	WebElement Universal_Loan_ID;
	@FindBy(how = How.XPATH, using = "//input[@ng-model = 'dealData.Loans.Loan.ProgramName']")
	WebElement Loan_Program_Scenario;
	@FindBy(how = How.XPATH, using = "//*[text() = 'Select']")
	WebElement Select;
	@FindBy(how = How.XPATH, using = "//input[@class= 'k-formatted-value form-control ng-pristine ng-untouched ng-valid ng-not-empty k-input']")
	WebElement Total_Borrowers;
	@FindBy(how = How.XPATH, using = "//input[@ng-model = 'dealData.Loans.Loan.ThirdPartyLoanIdentifiers.AgencyCase']")
	WebElement Agency_Case_Number;
	
public void LoanPAge() {
	Loan.click();
}
	public void TopSection(String date ,String Entity ,String Lender  ,String Scenario ,String select ,String Agency) throws InterruptedException {
		
		Application_Date.sendKeys(date);
		Legal_Entity_ID.sendKeys(Entity);
		Lender_Case_Number.sendKeys(Lender);
		//Check_Number.sendKeys(Number);
		//Universal_Loan_ID.sendKeys(Universal);
		if(Loan_Program_Scenario.isEnabled()) {
		Loan_Program_Scenario.sendKeys(Scenario);
		Thread.sleep(3000);
		if(select.equalsIgnoreCase("Selected")) {
		Select.click();}}
		Agency_Case_Number.sendKeys(Agency);
		
	}

}
