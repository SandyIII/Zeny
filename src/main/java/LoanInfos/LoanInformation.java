package LoanInfos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class LoanInformation {

	@FindBy(how = How.XPATH, using = "//select[@ng-model = 'dealData.Loans.Loan.TermsOfLoan.MortgageType']")
	WebElement Loan_Type;
	@FindBy(how = How.XPATH, using = "//input[@ng-model = 'dealData.Loans.Loan.TermsOfLoan.MortgageTypeOtherDescription']")
	WebElement Other_Description1;
	@FindBy(how = How.XPATH, using = "//select[@ng-model = 'dealData.Loans.Loan.TermsOfLoan.PrimaryLoanPurposeType']")
	WebElement Loan_Purpose;
	@FindBy(how = How.XPATH, using = "//input[@ng-model = 'dealData.Loans.Loan.TermsOfLoan.PrimaryLoanPurposeTypeOtherDescription']")
	WebElement Other_Description2;
	@FindBy(how = How.XPATH, using = "//select[@ng-model = 'dealData.Loans.Loan.TermsOfLoan.ConstructionType']")
	WebElement Construction_Type;
	@FindBy(how = How.XPATH, using = "//select[@ng-model = 'dealData.Loans.Loan.Refinance.CashOutDeterminationType']")
	WebElement Cash_Out_Type;
	@FindBy(how = How.XPATH, using = "//select[@ng-model = 'dealData.Collateral.SubjectProperty.PropertyDetail.PropertyUsageType']")
	WebElement Occupancy;
	@FindBy(how = How.XPATH, using = "//*[@ng-model = 'dealData.Collateral.SubjectProperty.PropertyDetail.FHASecondaryResidenceIndicator']")
	WebElement FHA_Secondary_Residence;
	@FindBy(how = How.XPATH, using = "//select[@ng-model = 'dealData.Loans.Loan.TermsOfLoan.LienPriorityType']")
	WebElement Lien_Position;
	@FindBy(how = How.XPATH, using = "//*[@ng-model = 'dealData.Loans.Loan.TermsOfLoan.SimultaneousFinancingIndicator']")
	WebElement Simultaneous_Financing;
	@FindBy(how = How.XPATH, using = "//select[@ng-model = 'dealData.Loans.Loan.Amortization.Rule.AmortizationType']")
	WebElement Amortization_Type;
	@FindBy(how = How.XPATH, using = "//input[@ng-model = 'dealData.Loans.Loan.Amortization.Rule.AmortizationTypeOtherDescription']")
	WebElement Other_Description3;
	@FindBy(how = How.XPATH, using = "//*[@ng-model = 'dealData.Loans.Loan.LoanDetail.ConversionOfContractForDeedIndicator']")
	WebElement Conversion_of_Contract_for_Deed_or_Land;
	@FindBy(how = How.XPATH, using = "//*[text() = 'Renovation']")
	WebElement Renovation;
	@FindBy(how = How.XPATH, using = "//*[@ng-model = 'dealData.Loans.Loan.TermsOfLoan.PrepaymentPenaltyIndicator']")
	WebElement Prepayment_Penalty;
	@FindBy(how = How.XPATH, using = "//*[text() = 'HELOC']")
	WebElement HELOC;

	public void Laon_Information(String Loan, String Other1, String purpose, String Other2, String type,
			String construction, String cash, String occupency, String FHACheckBox, String position, String financing,
			String amortization, String Other3, String conversionCheckBox, String renovationCkeckBox, String penalty,
			String heloc) throws Exception {
		Thread.sleep(3000);
		Select select = new Select(Loan_Type);
		select.selectByVisibleText(Loan);
		Thread.sleep(3000);
		if (Loan.equalsIgnoreCase("Other")) {
			Other_Description1.sendKeys(Other1);
		}

		Thread.sleep(3000);
		Select select1 = new Select(Loan_Purpose);
		select1.selectByVisibleText(purpose);
		Thread.sleep(3000);
		if (purpose.equalsIgnoreCase("Other")) {
			Other_Description2.sendKeys(Other2);
		}

		Thread.sleep(3000);
		Select select4 = new Select(Construction_Type);
		select4.selectByVisibleText(construction);

		Thread.sleep(3000);
		if (purpose.equalsIgnoreCase("Refinance")) {
			Select select5 = new Select(Cash_Out_Type);
			select5.selectByVisibleText(cash);
		}

		Thread.sleep(3000);
		Select select6 = new Select(Occupancy);
		select6.selectByVisibleText(occupency);

		Thread.sleep(3000);
		if (FHACheckBox.equalsIgnoreCase("Checked")) {
			FHA_Secondary_Residence.click();
		}

		Thread.sleep(3000);
		Select select7 = new Select(Lien_Position);
		select7.selectByVisibleText(position);

		Thread.sleep(3000);
		if (Simultaneous_Financing.isEnabled() || financing.equalsIgnoreCase("Checked")) {
			Simultaneous_Financing.click();
		}

		Thread.sleep(3000);
		Select select8 = new Select(Amortization_Type);
		select8.selectByVisibleText(amortization);
		Thread.sleep(3000);
		if (amortization.equalsIgnoreCase("ARM") || amortization.equalsIgnoreCase("Other")) {

			Other_Description3.sendKeys(Other3);
		}

		Thread.sleep(3000);
		if (conversionCheckBox.equalsIgnoreCase("Checked")) {
			Conversion_of_Contract_for_Deed_or_Land.click();
		}

		Thread.sleep(3000);
		if (renovationCkeckBox.equalsIgnoreCase("Checked")) {
			Renovation.click();
		}

		Thread.sleep(3000);
		if (penalty.equalsIgnoreCase("Checked")) {
			Prepayment_Penalty.click();
		}
		Thread.sleep(3000);
		if (heloc.equalsIgnoreCase("Checked")) {
			HELOC.click();
		}
	}
}
