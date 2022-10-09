package SubjectProperty;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NamescurrentlyheldonTitle {
	@FindBy(how = How.XPATH, using = "//h4[text() ='Names currently held on Title']//following ::button[text()='Add'][2]")
	WebElement Add_Button;
	@FindBy(how = How.XPATH, using = "//input[@ng-model='item.Name_First']")
	WebElement First;
	@FindBy(how = How.XPATH, using = "//input[@ng-model='item.Name_Middle']")
	WebElement Middle;
	@FindBy(how = How.XPATH, using = "//input[@ng-model='item.Name_Last']")
	WebElement Last;
	@FindBy(how = How.XPATH, using = "//input[@ng-model='item.Name_Suffix']")
	WebElement Suffix;
	
	@FindBy(how = How.XPATH, using = "//button[text() ='Save & Close']")
	WebElement SaveClose;
	@FindBy(how = How.XPATH, using = "//button[text() ='Save & New']")
	WebElement SaveNew;
	@FindBy(how = How.XPATH, using = "//button[text() ='Cancel']")
	WebElement cancel;
	@FindBy(how = How.XPATH, using = "//h4[text() ='Names currently held on Title']//following ::button[text()='Copy Borrower'][2]")
	WebElement CopyBorrower;

	public void Add_Button() throws InterruptedException {
		Thread.sleep(3000);
		if(Add_Button.isDisplayed()) {
		CopyBorrower.click();
		Thread.sleep(3000);
		Add_Button.click();}
	}
public void name(String first ,String middle ,String last ,String suffix ,String action) throws InterruptedException {
	if(Add_Button.isDisplayed()) {
	First.sendKeys(first);
	Middle.sendKeys(middle);
	Last.sendKeys(last);
	Suffix.sendKeys(suffix);
	
	Thread.sleep(3000);
	if(action.equalsIgnoreCase("Save & New")) {
		SaveNew.click();}
		else if(action.equalsIgnoreCase("Save & Close")) {
			SaveClose.click();	
		}

		else if(action.equalsIgnoreCase("Cancel")) {
			cancel.click();
			
		}}
	
}}
