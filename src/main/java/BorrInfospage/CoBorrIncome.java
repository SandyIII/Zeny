package BorrInfospage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class CoBorrIncome {

	
	
	WebDriver driver;

	public CoBorrIncome(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//h4[text() ='Income']//following::button[text()='Add'][2]")
	WebElement Addbutton;
	@FindBy(how = How.XPATH, using = "//select[@ng-model = 'item.EmployerId']")
	WebElement Section;
	@FindBy(how = How.XPATH, using = "//select[@ng-model='item.IncomeType']")
	WebElement Source;
	@FindBy(how = How.XPATH, using = "//input[@ng-model = 'item.IncomeTypeOtherDescription']")
	WebElement OtherDescription;
	@FindBy(how = How.XPATH, using = "//div/label[text() = 'Amount']//following-sibling::div/span/span/input[1]")
	WebElement Amount;
	@FindBy(how = How.XPATH, using = "//*[text() = 'Save & Close']")
	WebElement SaveAndClose;
	@FindBy(how = How.XPATH, using = "//*[text()='Save & New']")
	WebElement SaveAndNew;
	@FindBy(how = How.XPATH, using = "//button[text() ='Cancel']")
	WebElement cancel;

	public void ADD_Button() {
		Addbutton.click();
	}

	public void income1(String section ,String source ,String description ,String amount, String action) throws InterruptedException {

		
		Thread.sleep(3000);
		Select select = new Select(Section);
		select.selectByVisibleText(section);
		
		Thread.sleep(3000);
		Select select1 = new Select(Source);
		select1.selectByValue(source);
		Thread.sleep(3000);
		if(source.equalsIgnoreCase("Other")) {
		OtherDescription.sendKeys(description);}
		Amount.sendKeys(amount);
		if(action.equalsIgnoreCase("Save & New")) {
			SaveAndNew.click();}
			else if(action.equalsIgnoreCase("Save & Close")) {
				SaveAndClose.click();
			}else if(action.equalsIgnoreCase("Save & Close")) {
				cancel.click();
			}

	}
	public void income2(String section ,String source ,String description ,String amount , String action) throws InterruptedException {
     
		Thread.sleep(3000);
		Select select = new Select(Section);
		select.selectByVisibleText(section);
		
		Thread.sleep(3000);
		Select select1 = new Select(Source);
		select1.selectByValue(source);
		Thread.sleep(3000);
		if(source.equalsIgnoreCase("Other")) {
			OtherDescription.sendKeys(description);}
		Amount.sendKeys(amount);
		if(action.equalsIgnoreCase("Save & New")) {
		SaveAndNew.click();}
		else if(action.equalsIgnoreCase("Save & Close")) {
			SaveAndClose.click();
		}else if(action.equalsIgnoreCase("Save & Close")) {
			cancel.click();
		}

	}
	public void income3(String section ,String source ,String description ,String amount, String action) throws InterruptedException {
		
		Thread.sleep(3000);
		Select select = new Select(Section);
		select.selectByVisibleText(section);
		
		Thread.sleep(3000);
		Select select1 = new Select(Source);
		select1.selectByValue(source);
		Thread.sleep(3000);
		if(source.equalsIgnoreCase("Other")) {
			OtherDescription.sendKeys(description);}
		Amount.sendKeys(amount);
		if(action.equalsIgnoreCase("Save & New")) {
			SaveAndNew.click();}
			else if(action.equalsIgnoreCase("Save & Close")) {
				SaveAndClose.click();
			}else if(action.equalsIgnoreCase("Save & Close")) {
				cancel.click();
			}

	}
	public void income4(String section ,String source ,String description ,String amount, String action) throws InterruptedException {
		
		Thread.sleep(3000);
		Select select = new Select(Section);
		select.selectByVisibleText(section);
		
		Thread.sleep(3000);
		Select select1 = new Select(Source);
		select1.selectByValue(source);
		Thread.sleep(3000);
		if(source.equalsIgnoreCase("Other")) {
			OtherDescription.sendKeys(description);}
		Amount.sendKeys(amount);
		SaveAndClose.click();

	}
}
