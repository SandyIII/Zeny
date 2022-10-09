package BorrInfospage;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class Assets {
	/*
	 * List<WebElement> e = select.getOptions(); int itemCount = e.size();
	 * 
	 * for (int l = 0; l < itemCount; l++) { System.out.println(e.get(l).getText());
	 * }
	 */

	@FindBy(how = How.XPATH, using = "//h4[text() ='Assets - Bank Accounts and Other Accounts']//following::button[text()='Add'][1]")
	WebElement Addbutton;
	@FindBy(how = How.XPATH, using = "//input[@ng-model = 'item.HolderFullName']")
	WebElement Name;
	@FindBy(how = How.XPATH, using = "//input[@ng-model='item.HolderAddress.AddressLineText']")
	WebElement Address;
	@FindBy(how = How.XPATH, using = "//select[@ng-model ='item.HolderAddress.UnitDesignatorType']")
	WebElement UnitDesignator;
	@FindBy(how = How.XPATH, using = "//input[@ng-model ='item.HolderAddress.UnitIdentifier']")
	WebElement Number;
	@FindBy(how = How.XPATH, using = "//input[@ng-model ='item.HolderAddress.CityName']  ")
	WebElement City;
	@FindBy(how = How.XPATH, using = "//select[@ng-model ='item.HolderAddress.StateCode']")
	WebElement StateProvince;
	@FindBy(how = How.XPATH, using = "//input[@ng-model ='item.HolderAddress.PostalCode']")
	WebElement PostalCode;
	@FindBy(how = How.XPATH, using = "//input[@ng-model ='item.HolderAddress.PlusFourZipCode']")
	WebElement FourZip;
	@FindBy(how = How.XPATH, using = "//*[text() = 'Save & Close']")
	WebElement SaveAndClose;
	@FindBy(how = How.XPATH, using = "//*[text()='Save & New']")
	WebElement SaveAndNew;
	@FindBy(how = How.XPATH, using = "//button[text() ='Cancel']")
	WebElement cancel;
	@FindBy(how = How.XPATH, using = "//h4[text() ='Accounts']//following::button[text()='Add'][1]")
	WebElement AccountsAddbutton;
	@FindBy(how = How.XPATH, using = "//select[@ng-model ='item.AssetType']")
	WebElement Type;
	@FindBy(how = How.XPATH, using = "//input[@ng-model ='item.AssetTypeOtherDescription']")
	WebElement OtherDescription;
	@FindBy(how = How.XPATH, using = "//select[@ng-model ='item.Owner']")
	WebElement Owner;
	@FindBy(how = How.XPATH, using = "//select[@ng-model ='item.Owner']/option[2]")
	WebElement Option1;
	@FindBy(how = How.XPATH, using = "//select[@ng-model ='item.Owner']/option[3]")
	WebElement Option2;
	@FindBy(how = How.XPATH, using = "//select[@ng-model ='item.Owner']/option[4]")
	WebElement Option3;
	@FindBy(how = How.XPATH, using = "//input[@ng-model ='item.AssetAccountIdentifier']")
	WebElement AccountNumber;
	@FindBy(how = How.XPATH, using = "//label[text() = 'Cash/Market Value']//following-sibling::div/span/span/input[1]")
	WebElement CashMarketValue;
	@FindBy(how = How.XPATH, using = "//label[text() = 'Life Insurance Face Value']//following-sibling::div/span/span/input[1]")
	WebElement LifeInsuranceFaceValue;
	@FindBy(how = How.XPATH, using = "//label[text() = 'Shares']//following-sibling::div/span/span/input[1]")
	WebElement Shares;
	@FindBy(how = How.XPATH, using = "//label[text() = 'Vehicle Make']//following-sibling::div/input[1]")
	WebElement VehicleMake;
	@FindBy(how = How.XPATH, using = "//label[text() = 'Vehicle Year']//following-sibling::div/span/span/input[1]")
	WebElement VehicleYear;
	@FindBy(how = How.XPATH, using = "//label[text() = 'Liquid Assets']")
	WebElement LiquidAssetsCheckBox;
	@FindBy(how = How.XPATH, using = "//h4[text() = 'Add Account']//following::div/button[2]")
	WebElement AddSaveAndClose;
	@FindBy(how = How.XPATH, using = "//h4[text() = 'Add Account']//following::div/button[1]")
	WebElement AddSaveAndNew;
	@FindBy(how = How.XPATH, using = "//h4[text() = 'Add Account']//following::div/button[3]")
	WebElement Addcancel;

	public void add_assets(String name, String address, String designature, String number, String city, String state,
			String postalcode, String four) throws InterruptedException {
		Addbutton.click();
		Name.sendKeys(name);
		Address.sendKeys(address);
		Thread.sleep(3000);
		Select select = new Select(UnitDesignator);
		select.selectByValue(designature);
		Number.sendKeys(number);
		City.sendKeys(city);
		Thread.sleep(3000);
		Select select1 = new Select(StateProvince);
		select1.selectByVisibleText(state);
		PostalCode.sendKeys(postalcode);
		FourZip.sendKeys(four);

	}

	public void AddButton() {
		AccountsAddbutton.click();
	}

	public void account(String type, String description, String owner, String number, String marketvalue,
			String facevalue, String shares, String vehiculemake, String vehiculeyear, String CheckBox, String action)
			throws InterruptedException {

		Select select = new Select(Type);
		select.selectByValue(type);
		Thread.sleep(3000);
		if (type.equalsIgnoreCase("Other Assets") || type.equalsIgnoreCase("Other Credits")) {
			OtherDescription.sendKeys(description);
		}
		Owner.click();
//		Thread.sleep(3000);
//		Select select1 = new Select(Owner);
//	
//	
//		List<WebElement> e = select1.getOptions(); int itemCount = e.size();
//		
//		  for (int l = 0; l < itemCount; l++) { System.out.println(e.get(l).getText());}
//		
//		  select1.selectByIndex(2);
		  
		  Thread.sleep(3000);
		if (owner.equalsIgnoreCase("Borrower")) {
			Option1.click();
			//select1.selectByIndex(1);
			
		} else if (owner.equalsIgnoreCase("CoBorrower")) {
			//select1.selectByIndex(2);
			Option2.click();
		} else if (owner.equalsIgnoreCase("Borrower&CoBorrower")) {
			//select1.selectByIndex(3);
			Option3.click();
		}

		AccountNumber.sendKeys(number);
		CashMarketValue.sendKeys(marketvalue);
		Thread.sleep(3000);
		if (type.equalsIgnoreCase("Cash Value of Life Insurance")) {
			LifeInsuranceFaceValue.sendKeys(facevalue);
		}
		Thread.sleep(10000);
		if (type.equalsIgnoreCase("Bond") || type.equalsIgnoreCase("Stock") || type.equalsIgnoreCase("Stock Options")) {
			Shares.sendKeys(shares);
		}
		Thread.sleep(3000);
		if (type.equalsIgnoreCase("Automobile") || type.equalsIgnoreCase("Boat")) {
			VehicleMake.sendKeys(vehiculemake);
			VehicleYear.sendKeys(vehiculeyear);
		}
		Thread.sleep(3000);
		if (LiquidAssetsCheckBox.isSelected()) {

		}

		else if (!(LiquidAssetsCheckBox.isSelected()) && CheckBox.equalsIgnoreCase("Checked"))
			LiquidAssetsCheckBox.click();
		Thread.sleep(3000);
		if (action.equalsIgnoreCase("Save & New")) {
			AddSaveAndNew.click();
		} else if (action.equalsIgnoreCase("Save & Close")) {
			AddSaveAndClose.click();
		} else if (action.equalsIgnoreCase("Cancel")) {
			Addcancel.click();
		}
		Thread.sleep(3000);
		if (action.equalsIgnoreCase("Save & Close")) {
			SaveAndClose.click();
		}
	}
	}

