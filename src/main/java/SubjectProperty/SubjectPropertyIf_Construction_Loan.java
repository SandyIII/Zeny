package SubjectProperty;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class SubjectPropertyIf_Construction_Loan {
	@FindBy(how = How.XPATH, using = "//h4[text()='If Construction Loan']")
	WebElement IfConstructionLoan;

	@FindBy(how = How.XPATH, using = "//label[text() = 'Original Cost']//following::input[1]")
	WebElement Original_Cost;
	@FindBy(how = How.XPATH, using = "//label[text() = 'Lot Value (a)']//following::input[1]")
	WebElement Lot_Value_a;
	@FindBy(how = How.XPATH, using = "//label[text() = 'Improvements (b)']//following::input[1]")
	WebElement Improvements_b;
	@FindBy(how = How.XPATH, using = "//label[text() = 'Total (a + b)']//following::input[1]")
	WebElement Total_a_b;
	@FindBy(how = How.XPATH, using = "//label[text()= 'Include MI During Construction Period']")
	WebElement Include_MI_During_Construction_Period;
	@FindBy(how = How.XPATH, using = "//label[text()= 'Include Escrow During Construction Period']")
	WebElement Include_Escrow_During_Construction_Period;
	@FindBy(how = How.XPATH, using = "//label[text() = 'Period: Months']//following::input[1]")
	WebElement Period_Months;
	@FindBy(how = How.XPATH, using = "//label[text() = ' OR']//following::input[1]")
	WebElement Period_Day;
	@FindBy(how = How.XPATH, using = "//button[@ng-click = 'openDateDlg(dealData.Loans.Loan.Construction.FromDate, dealData.Loans.Loan.Construction.ToDate)']")
	WebElement Calendar;
	@FindBy(how = How.XPATH, using = "//input[@ng-model= 'dates.d1']")
	WebElement From;
	@FindBy(how = How.XPATH, using = "//input[@ng-model= 'dates.d2']")
	WebElement To;
	@FindBy(how = How.XPATH, using = "//button[@ng-click= 'onOk(dates)']")
	WebElement OK;
	@FindBy(how = How.XPATH, using = "//label[text() = 'Interest Rate']//following::input[1]")
	WebElement Interest_Rate;
	@FindBy(how = How.XPATH, using = "//label[text() = 'Required Reserve']//following::input[1]")
	WebElement Required_Reserve;
	@FindBy(how = How.XPATH, using = "//select[@ng-model = 'dealData.Loans.Loan.Construction.ToPermanentClosingType']")
	WebElement Closing_Type;
	@FindBy(how = How.XPATH, using = "//select[@ng-model = 'dealData.Loans.Loan.DocumentSpecificData.FHA_TransmittalSummary.ConstructionPropertyType']")
	WebElement FHA_Construction_Type;

	public void Construction(String Cost, String Lot_Value, String Improvements, String Include_MI,
			String Include_Escrow,  String calendar ,String from ,String to  , String Months ,String Interest ,String Required ,String Closing ,String FHAConstructionType) throws Exception {

		Thread.sleep(3000);
		if (IfConstructionLoan.isDisplayed()) {
			
			Original_Cost.sendKeys(Cost);
			Lot_Value_a.sendKeys(Lot_Value);
			Thread.sleep(3000);
			Improvements_b.sendKeys(Improvements);
			Thread.sleep(3000);
			if(Include_MI.equalsIgnoreCase("Check")) {
			Include_MI_During_Construction_Period.click();}
			Thread.sleep(3000);
			if(Include_MI.equalsIgnoreCase("Check")) {
			Include_Escrow_During_Construction_Period.click();}
			

			if (calendar.equalsIgnoreCase("Click")) {
				Calendar.click();
				From.sendKeys(from);
				To.sendKeys(to);
				OK.click();
			}else
			{Period_Months.sendKeys(Months);
			//Period_Day.sendKeys(Day);
			}
			Interest_Rate.sendKeys(Interest);
			Required_Reserve.sendKeys(Required);
			
			Thread.sleep(3000);
			Select select = new Select(Closing_Type);
			select.selectByVisibleText(Closing);
			Thread.sleep(3000);
			Select select1 = new Select(FHA_Construction_Type);
			select1.selectByVisibleText(FHAConstructionType);
		}
	}

}
