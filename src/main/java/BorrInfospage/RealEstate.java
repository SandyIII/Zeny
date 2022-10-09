package BorrInfospage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class RealEstate {

	WebDriver driver;

	public RealEstate(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//h4[text()='Real Estate' ]/following::button[1]")
	WebElement AddButton;
	@FindBy(how = How.XPATH, using = "//label[text()='Subject Property']")
	WebElement SubjectProperty;
	@FindBy(how = How.XPATH, using = "//input[@ng-model = 'item.Address.AddressLineText ']")
	WebElement Address;
	@FindBy(how = How.XPATH, using = "//select[@ng-model = 'item.Address.UnitDesignatorType']")
	WebElement UnitDesignator;
	@FindBy(how = How.XPATH, using = "//input[@ng-model = 'item.Address.UnitIdentifier']")
	WebElement Number;
	@FindBy(how = How.XPATH, using = "//input[@ng-model = 'item.Address.CityName']")
	WebElement City;
	@FindBy(how = How.XPATH, using = "//select[@ng-model = 'item.Address.StateCode']")
	WebElement StateProvince;
	@FindBy(how = How.XPATH, using = "//input[@ng-model = 'item.Address.PostalCode']")
	WebElement PostalCode;
	@FindBy(how = How.XPATH, using = "//input[@ng-model = 'item.Address.PlusFourZipCode']")
	WebElement FourZip;
	@FindBy(how = How.XPATH, using = "//select[@ng-model = 'item.Address.CountryName']")
	WebElement Country;
	@FindBy(how = How.XPATH, using = "//label[text() = 'Number of Units']//following::input[1]")
	WebElement NumberofUnits;
	@FindBy(how = How.XPATH, using = "//select[@ng-model = 'item.OwnedPropertyType']")
	WebElement PropertyType;
	@FindBy(how = How.XPATH, using = "//select[@ng-model = 'item.DispositionStatusType']")
	WebElement Status;
	@FindBy(how = How.XPATH, using = "//select[@ng-model = 'item.PropertyUsageType']")
	WebElement IntendedOccupancy;
	@FindBy(how = How.XPATH, using = "//select[@ng-model = 'item.CurrentUsageType']")
	WebElement CurrentOccupancy;
	@FindBy(how = How.XPATH, using = "//label[text() = 'Market Value']//following::input[1]")
	WebElement MarketValue;
	@FindBy(how = How.XPATH, using = "//label[text() = 'Mortgage Balance']//following::input[1]")
	WebElement MortgageBalance;
	@FindBy(how = How.XPATH, using = "//label[text() = 'Gross Rent']//following::input[1]")
	WebElement GrossRent;
	@FindBy(how = How.XPATH, using = "//label[text() = 'Monthly Payment']//following::input[1]")
	WebElement MonthlyPayment;
	@FindBy(how = How.XPATH, using = "//label[text() = 'Ins/Tax/Misc']//following::input[1]")
	WebElement InsTaxMisc;
	@FindBy(how = How.XPATH, using = "//label[text() = 'Omitted Ins/Tax/Misc']")
	WebElement InsTaxMiscCheckBox;
	@FindBy(how = How.XPATH, using = "//label[text() = 'Occupancy Rate']//following::input[1]")
	WebElement OccupancyRate;
	@FindBy(how = How.XPATH, using = "//label[text() = 'Net Rent']//following::input[1]")
	WebElement NetRent;
	@FindBy(how = How.XPATH, using = "//label[text() = 'Net Rent']//following-sibling::div/button")
	WebElement Calculate;
	@FindBy(how = How.XPATH, using = "//h4[text()='Matched Mortgages' ]/following::button[1]")
	WebElement Select;
	@FindBy(how = How.XPATH, using = "//div[@ng-model='item.Selected']/label")
	WebElement box;
	@FindBy(how = How.XPATH, using = "//h4[text()=\"Match Liability\"]//following::button[text() = 'Save & Close']")
	WebElement boxsave;
	@FindBy(how = How.XPATH, using = "//*[text() = 'Save & Close']")
	WebElement SaveAndClose;
	@FindBy(how = How.XPATH, using = "//*[text()='Save & New']")
	WebElement SaveAndNew;
	@FindBy(how = How.XPATH, using = "//button[text() ='Cancel']")
	WebElement cancel;

	public void AddButton() {
		AddButton.click();
	}

	public void realstateinfos(String checkbox, String address, String unitdesignature, String number, String city,
			String state, String postalcode, String fourzipcode, String country, String units, String property,
			String status, String intendedoccupancy, String currentoccupancy, String marketvalue,
			 String grossrent, String instaxmisc,
			String instaxmiscCheckBox, String Ooccupancyrate, String netrent, String selectbutton, String action)
			throws InterruptedException {
	//	Thread.sleep(3000);
		if (checkbox.equalsIgnoreCase("Checked")&&SubjectProperty.isEnabled() ) {
			SubjectProperty.click();
		}
		Address.sendKeys(address);
		Thread.sleep(3000);
		Select select = new Select(UnitDesignator);
		select.selectByVisibleText(unitdesignature);

		Number.sendKeys(number);
		City.sendKeys(city);
		Thread.sleep(3000);
		Select select1 = new Select(StateProvince);
		select1.selectByVisibleText(state);
		PostalCode.sendKeys(postalcode);

		FourZip.sendKeys(fourzipcode);
		Thread.sleep(3000);
		Select select2 = new Select(Country);
		select2.selectByVisibleText(country);
		Thread.sleep(3000);
		NumberofUnits.sendKeys(units);
		Thread.sleep(3000);
		Select select3 = new Select(PropertyType);
		select3.selectByVisibleText(property);
		Thread.sleep(3000);
		Select select4 = new Select(Status);
		select4.selectByVisibleText(status);
		Thread.sleep(3000);
		Select select5 = new Select(IntendedOccupancy);
		select5.selectByVisibleText(intendedoccupancy);
		Thread.sleep(3000);
		Select select6 = new Select(CurrentOccupancy);
		select6.selectByVisibleText(currentoccupancy);
		MarketValue.sendKeys(marketvalue);
		
		//MortgageBalance.sendKeys(mortgagebalance);
		GrossRent.sendKeys(grossrent);
		//MonthlyPayment.sendKeys(monthlypayment);
		Thread.sleep(3000);
		if(!(intendedoccupancy.equalsIgnoreCase("Primary Residence"))) {
		InsTaxMisc.sendKeys(instaxmisc);}
		Thread.sleep(3000);
		if (!status.equalsIgnoreCase("Retained")&&instaxmiscCheckBox.equalsIgnoreCase("Checked")) {
			InsTaxMiscCheckBox.click();
		}
		//OccupancyRate.clear();
		Thread.sleep(3000);
		if(!Ooccupancyrate.equalsIgnoreCase(null)) {
		OccupancyRate.sendKeys(Ooccupancyrate);}
		Thread.sleep(3000);
		if(intendedoccupancy.equalsIgnoreCase("Investment")||intendedoccupancy.equalsIgnoreCase("Primary Residence")) {
		NetRent.sendKeys(netrent);
		Calculate.click();}
		
		
		Thread.sleep(3000);
		if (selectbutton.equalsIgnoreCase("Select")&& Select.isEnabled()) {
			Select.click();
			Thread.sleep(3000);
			if(box.isDisplayed()) {
			box.click();
			boxsave.click();
			}
			else {boxsave.click();}

			
		}
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
