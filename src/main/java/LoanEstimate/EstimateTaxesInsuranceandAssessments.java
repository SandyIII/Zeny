package LoanEstimate;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EstimateTaxesInsuranceandAssessments {

	
	
	
	@FindBy(how = How.XPATH, using = "//label[text()='Estimated Taxes, Insurance, and Assessments']//following::input[1]")
	WebElement Estimated_Taxes;
	@FindBy(how = How.XPATH, using = "//div[@ng-model='dealData.Loans.Loan.DocumentSpecificData.IntegratedDisclosure.PropertyCosts.PropertyTaxesIndicator']")
	WebElement Property_Taxes;
	@FindBy(how = How.XPATH, using = "//div[@ng-model='dealData.Loans.Loan.DocumentSpecificData.IntegratedDisclosure.PropertyCosts.HomeOwnersInsuranceIndicator']")
	WebElement Homeowner_Insurance;
	@FindBy(how = How.XPATH, using = "//div[@ng-model='dealData.Loans.Loan.DocumentSpecificData.IntegratedDisclosure.PropertyCosts.OtherIndicator']")
	WebElement Other;
	@FindBy(how = How.XPATH, using = "//input[@ng-model='dealData.Loans.Loan.DocumentSpecificData.IntegratedDisclosure.PropertyCosts.OtherDescription']")
	WebElement Description;
	@FindBy(how = How.XPATH, using = "//select[@ng-model='dealData.Loans.Loan.DocumentSpecificData.IntegratedDisclosure.PropertyCosts.PropertyTaxesEscrowIndicator']")
	WebElement InEscrowFristDropDown;
	@FindBy(how = How.XPATH, using = "//select[@ng-model='dealData.Loans.Loan.DocumentSpecificData.IntegratedDisclosure.PropertyCosts.HomeOwnersInsuranceEscrowIndicator']")
	WebElement InEscrowSecondtDropDown;
	@FindBy(how = How.XPATH, using = "//select[@ng-model='dealData.Loans.Loan.DocumentSpecificData.IntegratedDisclosure.PropertyCosts.OtherInEscrow']")
	WebElement InEscrowThirdDropDown;
	
}
