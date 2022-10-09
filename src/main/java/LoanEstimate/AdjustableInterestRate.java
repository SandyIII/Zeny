package LoanEstimate;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AdjustableInterestRate {

	
	//Index + Margin
		@FindBy(how = How.XPATH, using = "//td[text()='Index + Margin']//following::td[1]")
		WebElement Index_Margin ;
		
		//Initial Interest Rate
		@FindBy(how = How.XPATH, using = "//td[text()='Initial Interest Rate']//following::td[1]")
		WebElement Initial_Interest_Rate;
		
		//Min/Max Interest Rate
		@FindBy(how = How.XPATH, using = "//td[text()='Min/Max Interest Rate']//following::td[1]")
		WebElement MinMax_Interest_Rate;
		
		//First Change
		@FindBy(how = How.XPATH, using = "//td[text()='Change Frequency']//following::td[2]")
		WebElement First_Change1;
		
		// Change Frequency/Subsequent Changes
		@FindBy(how = How.XPATH, using = "//td[text()='Change Frequency']//following::td[4]")
		WebElement Subsequent_Changes1;
		//First Change
		@FindBy(how = How.XPATH, using = "//td[text()='Limits on Interest Rate Changes']//following::td[2]")
		WebElement First_Change2;
		//Limits on Interest Rate Changes/Subsequent Changes
		@FindBy(how = How.XPATH, using = "//td[text()='Limits on Interest Rate Changes']//following::td[4]")
		WebElement Subsequent_Changes2;
	
}
