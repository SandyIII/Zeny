package BorrInfospage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class PrimaryHousing {

	@FindBy(how = How.XPATH, using = "//h4[text()='Primary Housing' ]/following::button[1]")
	WebElement Add_Button;
	@FindBy(how = How.XPATH, using = "//select[@ng-model = 'item.Type']")
	WebElement Type;
	@FindBy(how = How.XPATH, using = "//input[@ng-model = 'item.TypeOtherDescription']")
	WebElement Other_Description;
	@FindBy(how = How.XPATH, using = "//label[text() = 'Amount']//following::input[1]")
	WebElement Amount;
	@FindBy(how = How.XPATH, using = "//*[text() = 'Save & Close']")
	WebElement SaveAndClose;
	@FindBy(how = How.XPATH, using = "//*[text()='Save & New']")
	WebElement SaveAndNew;
	@FindBy(how = How.XPATH, using = "//*[text() ='Cancel']")
	WebElement cancel;

	public void AddButton( ) {
		Add_Button.click();
	}
	
	public void Add_Primary_Housing(String type , String other ,String amount ,String action) throws InterruptedException {
		Thread.sleep(3000);
		Select select = new Select(Type);
		select.selectByVisibleText(type);
		Thread.sleep(3000);
		if(type.equalsIgnoreCase("Other")) {
			Other_Description.sendKeys(other);
		}
		Amount.sendKeys(amount);
		Thread.sleep(3000);
		if (action.equalsIgnoreCase("Save & New")) {
			SaveAndNew.click();
		} else if (action.equalsIgnoreCase("Save & Close")) {
			SaveAndClose.click();
		} else if (action.equalsIgnoreCase("Cancel")) {
			cancel.click();
		}
	}
}
