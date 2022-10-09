package LoanEstimate;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Costs_at_Closing {

	
	@FindBy(how = How.XPATH, using = "//label[text()='Estimated Closing Costs']//following::input[1]")
	WebElement Estimated_Closing_Costs_includes;

	@FindBy(how = How.XPATH, using = "//label[text()='Estimated Closing Costs']//following::input[3]")
	WebElement in_Loan_Costs;

	@FindBy(how = How.XPATH, using = "//label[text()='Estimated Closing Costs']//following::input[5]")
	WebElement in_Other_Costs;

	@FindBy(how = How.XPATH, using = "//label[text()='Estimated Closing Costs']//following::input[7]")
	WebElement in_Lender_Credits;

	
	@FindBy(how = How.XPATH, using = "//label[text()='Estimated Cash to Close']//following::input[1]")
	WebElement Estimated_Cash_to_Close;

}
