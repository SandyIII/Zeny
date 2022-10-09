package LoanEstimate;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Comparison {

	//Total paid in principal, interest, mortgage insurance, and loan costs
	@FindBy(how = How.XPATH, using = "//label[text()='In 5 Years']//following::input[1]")
	WebElement Total_paid_in_principal ;
	//Principal you will have paid off
	@FindBy(how = How.XPATH, using = "//label[text()='Total paid in principal, interest, mortgage insurance, and loan costs']//following::input[1]")
	WebElement Principal;
	//Annual Percentage Rate (APR)
	@FindBy(how = How.XPATH, using = "//label[text()='Annual Percentage Rate (APR)']//following::input[1]")
	WebElement Optional_Payments;
	//Total Interest Percent (TIP)
	@FindBy(how = How.XPATH, using = "//label[text()='Total Interest Percent (TIP)']//following::input[1]")
	WebElement Total_Interest;
}
