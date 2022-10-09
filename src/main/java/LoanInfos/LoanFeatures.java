package LoanInfos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class LoanFeatures {
	@FindBy(how = How.XPATH, using = "//h4[text() ='Loan Features']//following::button[1]")
	WebElement Add_Button;
	@FindBy(how = How.XPATH, using = "//select[@ng-model='item.LoanFeatureType']")
	WebElement LoanFeaturesDropDown;
	@FindBy(how = How.XPATH, using = "//input[@ng-model='item.LoanFeatureTypeOtherDescription']")
	WebElement Other_Description;
	@FindBy(how = How.XPATH, using = "//button[text() ='Save & Close']")
	WebElement SaveClose;
	@FindBy(how = How.XPATH, using = "//button[text() ='Save & New']")
	WebElement SaveNew;
	@FindBy(how = How.XPATH, using = "//button[text() ='Cancel']")
	WebElement cancel;
	
	@FindBy(how = How.XPATH, using = "//*[@ng-model='dealData.Loans.Loan.Payment.AmortizedSchedule']")
	WebElement Payment;
	@FindBy(how = How.XPATH, using = "//button[text() ='Close']")
	WebElement Close;
	@FindBy(how = How.XPATH, using = "//div[@class ='modal-header']//following::button[@ng-click ='onCancel()']")
	WebElement Concel;
	public void BuyDownButton() throws Exception {
		Thread.sleep(3000);
		Add_Button.click();
	}
	
	public void Loan(String loanfeatures ,String Other ,String action ) throws Exception {
		Thread.sleep(3000);
		if(LoanFeaturesDropDown.isEnabled()) {
		Select select = new Select(LoanFeaturesDropDown);
		select.selectByVisibleText(loanfeatures);
		}
		
		Thread.sleep(3000);
		if(loanfeatures.equalsIgnoreCase("Other")) {
			Other_Description.sendKeys(Other);
			
		}
		if(action.equalsIgnoreCase("Save & New")) {
			SaveNew.click();}
			else if(action.equalsIgnoreCase("Save & Close")) {
				SaveClose.click();	
			}
		    
			
			if(action.equalsIgnoreCase("Cancel")) {
				cancel.click();
			}
		
	}
	public void Close () throws InterruptedException {
		Thread.sleep(3000);
		Payment.click();
		//Close.click();
		Thread.sleep(3000);
		if(Close.isDisplayed()) {
			Concel.click();
		}
		Thread.sleep(3000);
	}
}
