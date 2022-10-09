package LoanInfos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RentalIncomeonSubjectProperty {
	@FindBy(how = How.XPATH, using = "//label[text() = 'Gross Rent']//following::input[1]")
	WebElement Gross_Rent;
	@FindBy(how = How.XPATH, using = "//label[text() = 'Occupancy Rate']//following::input[1]")
	WebElement Occupancy_Rate;
	@FindBy(how = How.XPATH, using = "//label[text() = 'Net Rent']//following::input[1]")
	WebElement Net_Rent;
	@FindBy(how = How.XPATH, using = "//button[@ng-click = 'calcSubjectPropNetRent();']")
	WebElement Calculation;


public void RentalIncome(String Gross ,String Rate  ,String calculate ,String Net) throws Exception {
	Gross_Rent.sendKeys(Gross);
	Occupancy_Rate.sendKeys(Rate);
	Thread.sleep(3000);
	if(calculate.equalsIgnoreCase("Click")) {
		Calculation.click();
	}else {Net_Rent.sendKeys(Net);}
	
}


}
