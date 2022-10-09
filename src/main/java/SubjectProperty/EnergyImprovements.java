package SubjectProperty;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EnergyImprovements {
	
	@FindBy(how = How.XPATH, using = "//button[text() ='Select']")
	WebElement Select;
	@FindBy(how = How.XPATH, using = "//label[text() ='Mortgage Loan will finance energy-related improvements']")
	WebElement CheckBox1;
	@FindBy(how = How.XPATH, using = "//label[text() ='Mortgage Loan will finance energy-related improvements']//following::input[1]")
	WebElement Amount;
	@FindBy(how = How.XPATH, using = "//label[text() ='Property is currently subject to a lien that could take priority over the first mortgage lien']")
	WebElement CheckBox2;
	@FindBy(how = How.XPATH, using = "//button[text() ='Save & Close']")
	WebElement SaveClose;
	@FindBy(how = How.XPATH, using = "//button[text() ='Cancel']")
	WebElement cancel;


	
	
	public void Energy(String select ,String Check1 ,String amount ,String Check2) throws Exception {
		
		Thread.sleep(3000);
		if(select.equalsIgnoreCase("Select")) {
			Select.click();
		}
		Thread.sleep(3000);
		if(Check1.equalsIgnoreCase("Checked")) {
			CheckBox1.click();
		}
		Thread.sleep(3000);
		if(Amount.isEnabled()) {
			Amount.sendKeys(amount);
		}
		Thread.sleep(3000);
		if(Check2.equalsIgnoreCase("Checked")) {
			CheckBox2.click();
		}
		SaveClose.click();
	}
	
	
}
