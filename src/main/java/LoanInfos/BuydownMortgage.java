package LoanInfos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BuydownMortgage {
	
	@FindBy(how = How.XPATH, using = "//h4[text() ='Buydown Mortgage']//following::button[1]")
	WebElement Add_Button;
	@FindBy(how = How.XPATH, using = "//*[text() = 'Add Buydown Mortgage']//following::label[text()='Rate']//following::input[1]")
	WebElement Rate;
	@FindBy(how = How.XPATH, using = "//*[text() = 'Add Buydown Mortgage']//following::label[text()='Term (months)']//following::input[1]")
	WebElement Term ;
	@FindBy(how = How.XPATH, using = "//button[text() ='Save & Close']")
	WebElement SaveClose;
	@FindBy(how = How.XPATH, using = "//button[text() ='Save & New']")
	WebElement SaveNew;
	@FindBy(how = How.XPATH, using = "//button[text() ='Cancel']")
	WebElement cancel;



public void BuyDownButton() throws Exception {
	Thread.sleep(3000);
	Add_Button.click();
}
public void BuyDown(String rate ,String term ,String action) throws Exception {
	Thread.sleep(3000);
	Rate.sendKeys(rate);
	Term.sendKeys(term);
	Thread.sleep(3000);
	if(action.equalsIgnoreCase("Save & New")) {
		SaveNew.click();}
		else if(action.equalsIgnoreCase("Save & Close")) {
			SaveClose.click();
		}else if(action.equalsIgnoreCase("Cancel")) {
			cancel.click();
		}
}

}
