package LoanInfos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ExtraPayment {

	
	@FindBy(how = How.XPATH, using = "//label[text() ='Extra payment of']//following::input[1]")
	WebElement Extra_payment_of;
	@FindBy(how = How.XPATH, using = "//*[text() = 'Extra payment of']//following::label[text()='every']//following::input[1]")
	WebElement every_payment;

public void Extra(String Extra ,String every ) {
	Extra_payment_of.sendKeys(Extra);
	every_payment.sendKeys(every);
	
	
}







}
