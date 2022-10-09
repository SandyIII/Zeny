package BorrInfospage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class GiftsOrGrants {  
	
	@FindBy(how = How.XPATH, using = "//h4[text() ='Gifts or Grants Received']")
	WebElement GiftsorGrantsReceived;
	@FindBy(how = How.XPATH, using = "//h4[text() ='Gifts or Grants Received']//following::button[text()='Add'][1]")
	WebElement Addbutton;
	@FindBy(how = How.XPATH, using = "//h4[text()='Add Account']")
	WebElement AddAcount;
	@FindBy(how = How.XPATH, using = "//select[@ng-model ='item.AssetType']")
	WebElement Type;
	@FindBy(how = How.XPATH, using = "//select[@ng-model ='item.IncludedInAssetAccountIndicator']")
	WebElement Deposited;
	@FindBy(how = How.XPATH, using = "//label[text()='Account Number']/following::input[1]")
	WebElement AccountNumber;
	@FindBy(how = How.XPATH, using = "//select[@ng-model ='item.FundsSourceType']")
	WebElement SourceofFunds;
	@FindBy(how = How.XPATH, using = "//input[@ng-model ='item.FundsSourceTypeOtherDescription']")
	WebElement OtherDescription;
	@FindBy(how = How.XPATH, using = "//label[text()='Cash/Market Value']/following::input[1]")
	WebElement CashMarketValue;
	@FindBy(how = How.XPATH, using = "//*[text() = 'Save & Close']")
	WebElement SaveAndClose;
	@FindBy(how = How.XPATH, using = "//*[text()='Save & New']")
	WebElement SaveAndNew;
	@FindBy(how = How.XPATH, using = "//button[text() ='Cancel']")
	WebElement cancel;

	public void AddButton() throws Exception {    
		Thread.sleep(3000);
		if (GiftsorGrantsReceived.isDisplayed()&& Addbutton.isEnabled()) {
			Addbutton.click();}
	}
	public void gifts1(String type, String deposite, String account, String source, String description, String cash,
			String action) throws InterruptedException {
		
		if(GiftsorGrantsReceived.isDisplayed()) {
			Thread.sleep(3000);
			Select select = new Select(Type);
			select.selectByVisibleText(type);
			Thread.sleep(3000);
			Select select1 = new Select(Deposited);
			if(type.equalsIgnoreCase("Grant")||type.equalsIgnoreCase("Cash Gift")) {
			select1.selectByValue(deposite);
			Thread.sleep(3000);
			// Select select2 = new Select(AccountNumber);
			if (deposite.equalsIgnoreCase("Yes")) {
				// select.selectByValue(account);
				AccountNumber.sendKeys(account);
			}}
			Thread.sleep(3000);
			Select select3 = new Select(SourceofFunds);
			select3.selectByVisibleText(source);
			Thread.sleep(3000);
			if (source.equalsIgnoreCase("Other")) {
				OtherDescription.sendKeys(description);
			}
			CashMarketValue.sendKeys(cash);
			if (action.equalsIgnoreCase("Save & New")) {
				SaveAndNew.click();
			} else if (action.equalsIgnoreCase("Save & Close")) {
				SaveAndClose.click();
			} else if (action.equalsIgnoreCase("Cancel")) {
				cancel.click();
			}}
			
		}
	

//	public void gifts2(String type, String deposite, String account, String source, String description, String cash,
//			String action) throws InterruptedException {
//
//		Thread.sleep(3000);
//		Select select = new Select(Type);
//		select.selectByVisibleText(type);
//		Thread.sleep(3000);
//		Select select1 = new Select(Deposited);
//		if(type.equalsIgnoreCase("Grant")||type.equalsIgnoreCase("Cash Gift")) {
//			select1.selectByValue(deposite);
//		Thread.sleep(3000);
//		// Select select2 = new Select(AccountNumber);
//		if (deposite.equalsIgnoreCase("Yes")) {
//			// select.selectByValue(account);
//			AccountNumber.sendKeys(account);
//		}}
//
//		Thread.sleep(3000);
//		Select select3 = new Select(SourceofFunds);
//		select3.selectByVisibleText(source);
//		Thread.sleep(3000);
//		if (source.equalsIgnoreCase("Other")) {
//			OtherDescription.sendKeys(description);
//		}
//		CashMarketValue.sendKeys(cash);
//		if (action.equalsIgnoreCase("Save & New")) {
//			SaveAndNew.click();
//		} else if (action.equalsIgnoreCase("Save & Close")) {
//			SaveAndClose.click();
//		} else if (action.equalsIgnoreCase("Cancel")) {
//			cancel.click();
//		}
//		Thread.sleep(3000);
//		if (action.equalsIgnoreCase("Save & Close")) {
//			SaveAndClose.click();
//		}
//	}
//
//	public void gifts3(String type, String deposite, String account, String source, String description, String cash,
//			String action) throws InterruptedException {
//
//		Thread.sleep(3000);
//		Select select = new Select(Type);
//		select.selectByVisibleText(type);
//		Thread.sleep(3000);
//		Select select1 = new Select(Deposited);
//		if(type.equalsIgnoreCase("Grant")||type.equalsIgnoreCase("Cash Gift")) {
//			select1.selectByValue(deposite);
//		Thread.sleep(3000);
//		// Select select2 = new Select(AccountNumber);
//		if (deposite.equalsIgnoreCase("Yes")) {
//			// select.selectByValue(account);
//			AccountNumber.sendKeys(account);
//		}}
//		Thread.sleep(3000);
//		Select select3 = new Select(SourceofFunds);
//		select3.selectByVisibleText(source);
//		Thread.sleep(3000);
//		if (source.equalsIgnoreCase("Other")) {
//			OtherDescription.sendKeys(description);
//		}
//		CashMarketValue.sendKeys(cash);
//
//		SaveAndClose.click();
//	}

}
