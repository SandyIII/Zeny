package BorrInfospage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class Liabilities {

	WebDriver driver;

	public Liabilities(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//h4[text() ='Liabilities']//following::button[text()='Add'][1]")
	WebElement AddButton;
	@FindBy(how = How.XPATH, using = "//input[@ng-model = 'item.Holder.FullName']")
	WebElement CompanyName;
	@FindBy(how = How.XPATH, using = "//input[@ng-model= 'item.Holder.Address.AddressLineText ']")
	WebElement Address;
	@FindBy(how = How.XPATH, using = "//select[@ng-model= 'item.Holder.Address.UnitDesignatorType']")
	WebElement UnitDesignator;
	@FindBy(how = How.XPATH, using = "//input[@ng-model= 'item.Holder.Address.UnitIdentifier']")
	WebElement Number;
	@FindBy(how = How.XPATH, using = "//input[@ng-model= 'item.Holder.Address.CityName']")
	WebElement City;
	@FindBy(how = How.XPATH, using = "//select[@ng-model= 'item.Holder.Address.StateCode']")
	WebElement StateProvince;
	@FindBy(how = How.XPATH, using = "//input[@ng-model= 'item.Holder.Address.PostalCode']")
	WebElement ZipCode;
	@FindBy(how = How.XPATH, using = "//input[@ng-model= 'item.Holder.Address.PlusFourZipCode']")
	WebElement FourZipCode;
	@FindBy(how = How.XPATH, using = "//select[@ng-model= 'item.CreditLiabilityAccountType']")
	WebElement Credit_Account_Type;
	@FindBy(how = How.XPATH, using = "//select[@ng-model= 'item.LiabilityType']")
	WebElement Liability_Type;
	@FindBy(how = How.XPATH, using = "//input[@ng-model= 'item.LiabilityTypeOtherDescription']")
	WebElement OtherDescription;
	@FindBy(how = How.XPATH, using = "//input[@ng-model= 'item.AccountIdentifier']")
	WebElement AccountNumber;
	@FindBy(how = How.XPATH, using = "//label[text() ='(FHA) Original Debt Amount']//following::span[2]/input[1]")
	WebElement FHAOriginalDebtAmount;
	@FindBy(how = How.XPATH, using = "//input[@ng-model= 'item.AutomobileMakeDescription']")
	WebElement AutomobileMake;
	@FindBy(how = How.XPATH, using = "//label[text() ='Make']//following::span[2]/input[1]")
	WebElement AutomobileYear;
	@FindBy(how = How.XPATH, using = "//label[text() ='Balance']//following::span[2]/input[1]")
	WebElement BalanceCurrent;
	@FindBy(how = How.XPATH, using = "//label[text() ='Balance']//following::input[3]")
	WebElement BalanceRemaining;
	@FindBy(how = How.XPATH, using = "//label[text() ='Monthly Payment']//following::input[1]")
	WebElement Monthly_PaymentCurrent;
	@FindBy(how = How.XPATH, using = "//label[text() ='Monthly Payment']//following::input[3]")
	WebElement Monthly_PaymentRemaining;
	@FindBy(how = How.XPATH, using = "//label[text() ='Payments Remaining']//following::input[1]")
	WebElement Payments_RemainingCurrent;
	@FindBy(how = How.XPATH, using = "//label[text() ='Payments Remaining']//following::input[3]")
	WebElement Payments_Remaining_Remaining;
	@FindBy(how = How.XPATH, using = "//label[text() ='Paid Off']//following::input[1]")
	WebElement PaidOff;
	@FindBy(how = How.XPATH, using = "//label[text() ='Paid off at closing']")
	WebElement Paidoffatclosing;
	@FindBy(how = How.XPATH, using = "//label[text() ='Paid off before closing']")
	WebElement Paidoffbeforeclosing;
	@FindBy(how = How.XPATH, using = "//label[text() ='Resubordinated']")
	WebElement Resubordinated;
	@FindBy(how = How.XPATH, using = "//label[text() ='Omitted']")
	WebElement Omitted;
	@FindBy(how = How.XPATH, using = "//select[@ng-model= 'item.MortgageType']")
	WebElement MortgageType;
	@FindBy(how = How.XPATH, using = "//label[text() ='Credit Limit']//following::input[1]")
	WebElement CreditLimit;
	@FindBy(how = How.XPATH, using = "//label[contains(text() ,'Payment Inclu')]")
	WebElement PaymentIncludesInsTax;
	@FindBy(how = How.XPATH, using = "//label[contains(text() ,'Property Assessed ')]")
	WebElement PropertyAssessedCleanEnergy;
	@FindBy(how = How.XPATH, using = "//button[text() ='Save & Close']")
	WebElement SaveClose;
	@FindBy(how = How.XPATH, using = "//button[text() ='Save & New']")
	WebElement SaveNew;
	@FindBy(how = How.XPATH, using = "//button[text() ='Cancel']")
	WebElement cancel;
	
	
	public void ADD_Button() {
		AddButton.click();
	}

	public void liability(String companyName, String address, String unit, String number, String city, String state,
			String zipcode, String fourzip, String credittype, String liability_type, String description,
			String accountnumber, String fHAOriginaldebtamount, String automobilemake, String automobileyear,
			String balencecurrent, /*String balenceremaining,*/ String monthlypaymentcurrent,
			/*String monthlypaymentremaining,*/ String paymentrecurrent, /*String paymentreremaining,*/ String paidoff,
			String check1, String check2, String check3, String check4, String morgagetype, String creditlimit,
			String check5, String check6, String action) throws InterruptedException {
		
		
		Thread.sleep(3000);
	
		CompanyName.sendKeys(companyName);
		Address.sendKeys(address);
		Select select = new Select(UnitDesignator);
		select.selectByVisibleText(unit);
		Number.sendKeys(number);
		City.sendKeys(city);
		Thread.sleep(3000);
		Select select1 = new Select(StateProvince);
		select1.selectByVisibleText(state);
		ZipCode.sendKeys(zipcode);
		FourZipCode.sendKeys(fourzip);
		Thread.sleep(3000);
		Select select2 = new Select(Credit_Account_Type);
		select2.selectByValue(credittype);
		Thread.sleep(3000);
		Select select3 = new Select(Liability_Type);
		select3.selectByVisibleText(liability_type);
		Thread.sleep(3000);
		if (liability_type.equalsIgnoreCase("Other")) {
			OtherDescription.sendKeys(description);
		}
		AccountNumber.sendKeys(accountnumber);
		if(fHAOriginaldebtamount.equalsIgnoreCase(null)) {
		FHAOriginalDebtAmount.sendKeys(fHAOriginaldebtamount);}
		Thread.sleep(3000);
		if (liability_type.equalsIgnoreCase("Automotive Lien")) {
			AutomobileMake.sendKeys(automobilemake);
			AutomobileYear.sendKeys(automobileyear);
		}
		BalanceCurrent.sendKeys(balencecurrent);
		//BalanceRemaining.sendKeys(balenceremaining);
		Monthly_PaymentCurrent.sendKeys(monthlypaymentcurrent);
//		if(check1.equalsIgnoreCase("Checked")) {
//		Monthly_PaymentRemaining.sendKeys(monthlypaymentremaining);}
		
		Payments_RemainingCurrent.sendKeys(paymentrecurrent);
		//Payments_Remaining_Remaining.sendKeys(paymentreremaining);
		if (check1.equalsIgnoreCase("Checked")) {
			Paidoffatclosing.click();
			Thread.sleep(3000);
			
		}
		
		
		Thread.sleep(3000);
		if (check1.equalsIgnoreCase("Checked")) {
			
			PaidOff.sendKeys(paidoff);
			//Paidoffatclosing.click();
		}
		Thread.sleep(3000);
		
		if (check2.equalsIgnoreCase("Checked")) {
			Paidoffbeforeclosing.click();
		}
		if (check3.equalsIgnoreCase("Checked")) {
			Resubordinated.click();
		}
		if (check4.equalsIgnoreCase("Checked")) {
			Omitted.click();
		}

		Thread.sleep(3000);

		Select select4 = new Select(MortgageType);
		if (credittype.equalsIgnoreCase("Mortgage") || liability_type.equalsIgnoreCase("First Position Mortgage Lien")
				|| liability_type.equalsIgnoreCase("HELOC") || liability_type.equalsIgnoreCase("Mortgage Loan")
				|| liability_type.equalsIgnoreCase("Second Position Mortgage Lien")
				|| liability_type.equalsIgnoreCase("Third Position Mortgage Lien")) {
			select4.selectByValue(morgagetype);
			CreditLimit.sendKeys(creditlimit);
			if (check5.equalsIgnoreCase("Checked")) {
				PaymentIncludesInsTax.click();
			}
			if (check6.equalsIgnoreCase("Checked")) {
				PropertyAssessedCleanEnergy.click();
			}
		}

		Thread.sleep(3000);
		if (action.equalsIgnoreCase("Save & New")) {
			SaveNew.click();
		} else if (action.equalsIgnoreCase("Save & Close")) {
			SaveClose.click();
		} else if (action.equalsIgnoreCase("Cancel")) {
			cancel.click();
		}

	}

}
