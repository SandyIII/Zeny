package LoanInfos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class PMI_MIP_VA_USDA {
	@FindBy(how = How.XPATH, using = "//label[text() = 'PMI/MIP/VA/USDA']//following::input[1]")
	WebElement PMI_MIP_VA_USDA;
	@FindBy(how = How.XPATH, using = "//label[text() = 'Additional Amount Paid in Cash']//following::input[1]")
	WebElement AdditionalAmountPaidinCash;

	@FindBy(how = How.XPATH, using = "//label[text() = 'Rate Percentage']//following::input[1]")
	WebElement RatePercentage_PMIMIPVAUSDA;
	@FindBy(how = How.XPATH, using = "//label[text() = 'Rate Percentage']//following::input[3]")
	WebElement RatePercentage_PMIRenewal1;
	@FindBy(how = How.XPATH, using = "//label[text() = 'Rate Percentage']//following::input[5]")
	WebElement RatePercentage_PMIRenewal2;

	@FindBy(how = How.XPATH, using = "//label[text() = 'Monthly Dollar Amount']//following::input[1]")
	WebElement MonthlyDollarAmount_PMIMIPVAUSDA;
	@FindBy(how = How.XPATH, using = "//label[text() = 'Monthly Dollar Amount']//following::input[3]")
	WebElement MonthlyDollarAmount_PMIRenewal1;
	@FindBy(how = How.XPATH, using = "//label[text() = 'Monthly Dollar Amount']//following::input[5]")
	WebElement MonthlyDollarAmount_PMIRenewal2;

	@FindBy(how = How.XPATH, using = "//label[text() = 'Monthly Amount']//following::input[7]")
	WebElement Months_PMIMIPVAUSDA;
	@FindBy(how = How.XPATH, using = "//label[text() = 'Monthly Amount']//following::input[9]")
	WebElement Months_PMIRenewal1;
	@FindBy(how = How.XPATH, using = "//label[text() = 'Monthly Amount']//following::input[11]")
	WebElement Months_PMIRenewal2;

	@FindBy(how = How.XPATH, using = "//select[@ng-model= 'dealData.Loans.Loan.MI_Data.LTVCutoffType']")
	WebElement CalculationBasedon;
	@FindBy(how = How.XPATH, using = "//label[text() = 'Cancel at']//following::input[1]")
	WebElement Cancelat;
	@FindBy(how = How.XPATH, using = "//label[text() = 'Calculate based on remaining balance']")
	WebElement Calculatebasedonremainingbalance;
	@FindBy(how = How.XPATH, using = "//label[text() = 'Midpoint Payment cancellation']")
	WebElement MidpointPaymentcancellation;

	public void PMIUSDA(String PMI, String Additional, String RatePercentage1, String RatePercentage2,
			String RatePercentage3, String MonthlyDollarAmount1, String MonthlyDollarAmount2,
			String MonthlyDollarAmount3, String Months1, String Months2, String Months3, String Calculation,String concel ,
			String chechbox1, String chechbox2) throws Exception {
		PMI_MIP_VA_USDA.sendKeys(PMI);
		AdditionalAmountPaidinCash.sendKeys(Additional);

		RatePercentage_PMIMIPVAUSDA.sendKeys(RatePercentage1);
		RatePercentage_PMIRenewal1.sendKeys(RatePercentage2);
		RatePercentage_PMIRenewal2.sendKeys(RatePercentage3);

		MonthlyDollarAmount_PMIMIPVAUSDA.sendKeys(MonthlyDollarAmount1);
		MonthlyDollarAmount_PMIRenewal1.sendKeys(MonthlyDollarAmount2);
		MonthlyDollarAmount_PMIRenewal2.sendKeys(MonthlyDollarAmount3);
		Thread.sleep(3000);
		Months_PMIMIPVAUSDA.sendKeys(Months1);
		Months_PMIRenewal1.sendKeys(Months2);
		Months_PMIRenewal2.sendKeys(Months3);

		Thread.sleep(3000);
		Select select = new Select(CalculationBasedon);
		select.selectByVisibleText(Calculation);
		Thread.sleep(3000);
		
		Cancelat.sendKeys(concel);
		if (chechbox1.equalsIgnoreCase("Checked")) {
			Calculatebasedonremainingbalance.click();
		}
		Thread.sleep(3000);
		if (chechbox2.equalsIgnoreCase("Checked")) {
			MidpointPaymentcancellation.click();
		}
	}

}
