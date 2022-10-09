package LoanEstimate;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AdjustablePayment {

	//Interest Only Payments
	@FindBy(how = How.XPATH, using = "//td[text()='Interest Only Payments ?']//following::td[1]")
	WebElement Interest_Only_Payments ;
	@FindBy(how = How.XPATH, using = "//td[text()='Interest Only Payments ?']//following::td[2]")
	WebElement Interest_Only_Payments_Description;
	//Optional Payments
	@FindBy(how = How.XPATH, using = "//td[text()='Optional Payments ?']//following::td[1]")
	WebElement Optional_Payments;
	@FindBy(how = How.XPATH, using = "//td[text()='Optional Payments ?']//following::td[2]")
	WebElement Optional_Payments_Description;
	//Step Payment
	@FindBy(how = How.XPATH, using = "//td[text()='Step Payments ?']//following::td[1]")
	WebElement Step_Payment_Payments;
	@FindBy(how = How.XPATH, using = "//td[text()='Step Payments ?']//following::td[2]")
	WebElement Step_Payment_Description;
	//Seasonal Payments
	@FindBy(how = How.XPATH, using = "//td[text()='Seasonal Payments ?']//following::td[1]")
	WebElement Seasonal_Payment_Payments;
	@FindBy(how = How.XPATH, using = "//td[text()='Seasonal Payments ?']//following::td[2]")
	WebElement Seasonal_Payment_Description;
	//First Change/Amount
	@FindBy(how = How.XPATH, using = "//td[text()='First Change/Amount']//following::td[2]")
	WebElement First_Change_Amount;
	//Subsequent Changes
	@FindBy(how = How.XPATH, using = "//td[text()='First Change/Amount']//following::td[2]")
	WebElement Subsequent_Changes;
	//Maximum Payment
	@FindBy(how = How.XPATH, using = "//td[text()='Maximum Payment']//following::td[2]")
	WebElement Maximum_Payment;
	
}
