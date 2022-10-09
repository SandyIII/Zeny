package LoanInfos;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class RateAdjustment {

	/*
	 * List<WebElement> e = select.getOptions(); int itemCount = e.size();
	 * 
	 * for (int l = 0; l < itemCount; l++) { System.out.println(e.get(l).getText());
	 * }
	 */
	@FindBy(how = How.XPATH, using = "//*[text() = '1st Change']//following::input[1]")
	WebElement First_Change_Adj_Cap;
	@FindBy(how = How.XPATH, using = "//*[text() = '1st Change']//following::input[3]")
	WebElement First_Change_Months;
	@FindBy(how = How.XPATH, using = "//*[text() = 'Adj Period']//following::input[1]")
	WebElement Adj_Period_Adj_Cap;
	@FindBy(how = How.XPATH, using = "//*[text() = 'Adj Period']//following::input[3]")
	WebElement Adj_Period_Months;
	@FindBy(how = How.XPATH, using = "//*[text() = 'Life Cap']//following::input[1]")
	WebElement Life_Cap;
	@FindBy(how = How.XPATH, using = "//*[text() = 'Margin']//following::input[1]")
	WebElement Margin;
	@FindBy(how = How.XPATH, using = "//*[text() = 'Index']//following::input[1]")
	WebElement Index;
	@FindBy(how = How.XPATH, using = "//*[text() = 'Alt. Index']//following::input[1]")
	WebElement Alt_Index;
	@FindBy(how = How.XPATH, using = "//*[text() = 'Floor']//following::input[1]")
	WebElement Floor;
	@FindBy(how = How.XPATH, using = "//select[@ng-model ='dealData.Loans.Loan.Adjustment.InterestRateAdjustment.IndexType']")
	WebElement Index_Type;
	@FindBy(how = How.XPATH, using = "//input[@ng-model ='dealData.Loans.Loan.Adjustment.InterestRateAdjustment.IndexTypeOtherDescription']")
	WebElement Other_Description;
	@FindBy(how = How.XPATH, using = "//*[text() = 'Rate']//following::input[1]")
	WebElement Rate;
	@FindBy(how = How.XPATH, using = "//select[@ng-model ='dealData.Loans.Loan.Adjustment.InterestRateAdjustment.InterestRateRoundingType']")
	WebElement Rate_Round_To;

	public void Rate(String FirstChange, String FirstChangeMonths, String periode, String periodeMonths,
			String lifecap, String margin, String index, String altindex, String floor, String type, String Other,
			String rate, String RoundTo) throws InterruptedException {
		First_Change_Adj_Cap.sendKeys(FirstChange);
		First_Change_Months.sendKeys(FirstChangeMonths);
		Adj_Period_Adj_Cap.sendKeys(periode);
		Adj_Period_Months.sendKeys(periodeMonths);
		Life_Cap.sendKeys(lifecap);
		Margin.sendKeys(margin);
		Index.sendKeys(index);
		Alt_Index.sendKeys(altindex);
		Floor.sendKeys(floor);
		Thread.sleep(3000);
		Select select = new Select(Index_Type);
		select.selectByVisibleText(type);
		
		  Thread.sleep(3000);
		if(type.equalsIgnoreCase("Other")) {
		Other_Description.sendKeys(Other);}
		
		Rate.sendKeys(rate);

		Thread.sleep(3000);
		Select select1 = new Select(Rate_Round_To);
		select1.selectByVisibleText(RoundTo);

	}

}
