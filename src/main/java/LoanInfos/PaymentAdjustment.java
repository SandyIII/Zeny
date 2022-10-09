package LoanInfos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class PaymentAdjustment {
	@FindBy(how = How.XPATH, using = "//*[text() = 'Interest-Only']//following::input[1]")
	WebElement Interest_Only;
	@FindBy(how = How.XPATH, using = "//*[text() = 'Calculate Qual Ratios at the Interest-Only Payment']")
	WebElement Calculate_Qual_Ratios_CheckBox;
	@FindBy(how = How.XPATH, using = "//*[text() = 'Bi-Weekly Payment Schedule']")
	WebElement Bi_Weekly_Payment_Schedule_CheckBox;
	@FindBy(how = How.XPATH, using = "//select[@ng-model ='dealData.Loans.Loan.Adjustment.PrincipalAndInterestPaymentAdjustment.LifeTimeRule.FirstPrincipalAndInterestPaymentChangeRateDescription']")
	WebElement Initial_Payment_Rate_DropDown;
	@FindBy(how = How.XPATH, using = "//*[text() = 'Initial Payment Rate']//following::input[1]")
	WebElement Initial_Payment_Rate_percent;
	@FindBy(how = How.XPATH, using = "//*[text() = 'Initial Payment Rate Period']//following::input[1]")
	WebElement Initial_Payment_Rate_Period;
	@FindBy(how = How.XPATH, using = "//*[text() = 'Payment Adjustment']//following::label[text()='Adj Cap']//following::input[1]")
	WebElement Adj_Cap;
	@FindBy(how = How.XPATH, using = "//*[text() = 'Payment Adjustment']//following::label[text()='Adj Period']//following::input[1]")
	WebElement Adj_Period;
	@FindBy(how = How.XPATH, using = "//*[text() = 'Recast Pd/Stop']//following::input[1]")
	WebElement Recast_Pd_Stop;
	@FindBy(how = How.XPATH, using = "//*[text() = 'Recast Pd/Stop']//following::input[3]")
	WebElement Recast_Pd_Stop_Months;
	@FindBy(how = How.XPATH, using = "//*[text() = 'Max Balance']//following::input[1]")
	WebElement Max_Balance;
	@FindBy(how = How.XPATH, using = "//label[contains(text(),' Calculate Qual Ratios at the Max Adjusted Loan ')]")
	WebElement Calculate_Qual_RatiosCheckBox;
	@FindBy(how = How.XPATH, using = "//*[text() = 'Payment']//following::input[1]")
	WebElement Payment;

	@FindBy(how = How.XPATH, using = "//select[@ng-model ='dealData.Loans.Loan.Adjustment.PrincipalAndInterestPaymentAdjustment.LifeTimeRule.PaymentRateRoundingType']")
	WebElement Payment_Rounding;
	@FindBy(how = How.XPATH, using = "//*[text() = 'Years']//following::input[1]")
	WebElement Years;
	@FindBy(how = How.XPATH, using = "//*[text() = 'at Rate']//following::input[1]")
	WebElement at_Rate;
	@FindBy(how = How.XPATH, using = "//*[text() = 'Simple Interest']")
	WebElement Simple_Interest_CheckBox;

	@FindBy(how = How.XPATH, using = "//*[text() = 'Down Payment Assistance Program']")
	WebElement Down_Payment_Assistance_Program;
	@FindBy(how = How.XPATH, using = "//*[text() = 'Principal Forgiven']//following::input[1]")
	WebElement Principal_Forgiven;
	@FindBy(how = How.XPATH, using = "//*[text() = 'every']//following::input[1]")
	WebElement every_Months;

	public void Payments(String Interest, String calculate, String Bi_Weekly_Payment, String Rate_DropDown,
			String percent, String Initial, String AdjCap, String AdjPeriod, String RecastPdStop,
			String RecastPdStopMonths, String MaxBalance, String CalculateQualRatiosCheckBox, String payment,
			String PaymentRounding, String year, String atrate, String SimpleInterestCheckBox,
			String DownPaymentAssistanceProgram, String PrincipalForgiven, String everyMonths) throws Exception {
		Interest_Only.sendKeys(Interest);
		Thread.sleep(3000);
		if (calculate.equalsIgnoreCase("Check")) {
			Calculate_Qual_Ratios_CheckBox.click();
		}
		Thread.sleep(3000);
		if (Bi_Weekly_Payment.equalsIgnoreCase("Check")) {
			Bi_Weekly_Payment_Schedule_CheckBox.click();
		}

		Thread.sleep(3000);
		Select select = new Select(Initial_Payment_Rate_DropDown);
		select.selectByVisibleText(Rate_DropDown);
		Initial_Payment_Rate_percent.sendKeys(percent);

		Initial_Payment_Rate_Period.sendKeys(Initial);
		Adj_Cap.sendKeys(AdjCap);
		Adj_Period.sendKeys(AdjPeriod);
		Recast_Pd_Stop.sendKeys(RecastPdStop);
		Recast_Pd_Stop_Months.sendKeys(RecastPdStopMonths);
		Max_Balance.sendKeys(MaxBalance);

		Thread.sleep(3000);
		if (CalculateQualRatiosCheckBox.equalsIgnoreCase("Check")) {
			Calculate_Qual_RatiosCheckBox.click();
		}
		Payment.sendKeys(payment);

		Thread.sleep(3000);
		Select select2 = new Select(Payment_Rounding);
		select2.selectByVisibleText(PaymentRounding);
		Years.sendKeys(year);
		at_Rate.sendKeys(atrate);

		Thread.sleep(3000);
		if (SimpleInterestCheckBox.equalsIgnoreCase("Check")) {
			Simple_Interest_CheckBox.click();
		}

		Thread.sleep(3000);
		if (DownPaymentAssistanceProgram.equalsIgnoreCase("Check")) {
			Down_Payment_Assistance_Program.click();
		}
		Principal_Forgiven.sendKeys(PrincipalForgiven);
		every_Months.sendKeys(everyMonths);
	}

}
