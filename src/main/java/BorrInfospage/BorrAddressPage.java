package BorrInfospage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class BorrAddressPage {

	

	
		
		 @FindBy(how =How.XPATH ,using ="//h4[text() ='Address']//following::button[text()='Add'][1]")
		 WebElement AddButton ;
		 @FindBy(how =How.XPATH ,using ="//select[@ng-model ='item.AddressType']")
		 WebElement AddressType ;
		 @FindBy(how =How.XPATH ,using ="//select[@ng-model ='item.ResidencyBasisType']")
		 WebElement Occupancy ;
		 @FindBy(how =How.XPATH ,using ="//label[text() ='Monthly Rent']//following::span/input[1]")
		 WebElement MonthlyRent ;
		 @FindBy(how =How.XPATH ,using ="//label[text() ='Length of Residency']//following::span/input[1]")
		 WebElement LengthofResidencyYear ;
		 @FindBy(how =How.XPATH ,using ="//label[text() =' Years']//following::span/input[1]")
		 WebElement LengthofResidencyMonths ;
		 @FindBy(how =How.XPATH ,using ="//input[@ng-model ='item.Address.AddressLineText ']")
		 WebElement Address ;
		 @FindBy(how =How.XPATH ,using ="//select[@ng-model ='item.Address.UnitDesignatorType']")
		 WebElement UnitDesignator ;
		 @FindBy(how =How.XPATH ,using ="//input[@ng-model ='item.Address.UnitIdentifier']")
		 WebElement UnitDesignatorNumber ;
		 @FindBy(how =How.XPATH ,using ="//input[@ng-model ='item.Address.CityName']")
		 WebElement City ;
		 @FindBy(how =How.XPATH ,using ="//select[@ng-model ='item.Address.StateCode']")
		 WebElement StateCode ;
		 @FindBy(how =How.XPATH ,using ="//input[@ng-model ='item.Address.PostalCode']")
		 WebElement PostalCode ;
		 @FindBy(how =How.XPATH ,using ="//input[@ng-model ='item.Address.PlusFourZipCode']")
		 WebElement FourZipCode ;
		 @FindBy(how =How.XPATH ,using ="//input[@ng-model ='item.Address.CountyName']")
		 WebElement County ;
		 @FindBy(how =How.XPATH ,using ="//select[@ng-model ='item.Address.CountryName']")
		 WebElement Country ;
		 @FindBy(how =How.XPATH ,using ="//input[@ng-model ='item.Address.CountryCode']")
		 WebElement CountryCode ;
		 @FindBy(how =How.XPATH ,using ="//button[text() ='Save & Close']")
		 WebElement SaveClose ;
		 @FindBy(how =How.XPATH ,using ="//button[text() ='Save & New']")
		 WebElement SaveNew ;
		 @FindBy(how =How.XPATH ,using ="//button[text() ='Cancel']")
		 WebElement cancel ;
		 
		 public void Add_Button() {
			 AddButton.click();}
		 public void borr_adrees(String addresstype, String occupancy ,String monthlyrent ,String Year ,String Months ,String address, 
				String unit ,String number ,String city ,String state ,String postalcode , String fourZip ,String county ,String country,String action) throws InterruptedException {
			 
			 Select select = new Select (AddressType);
			 select.selectByValue(addresstype);
			 Select select1 = new Select (Occupancy);
			 select1.selectByValue(occupancy);
			 Thread.sleep(3000);
			 if(occupancy.equalsIgnoreCase("Rent")) {
				 MonthlyRent.sendKeys(monthlyrent);
			 }
			 LengthofResidencyYear.sendKeys(Year);
			 LengthofResidencyMonths.sendKeys(Months);
			 Address.sendKeys(address);
			 Select select2 = new Select (UnitDesignator);
			 select2.selectByValue(unit);
			// System.out.println(select2.getOptions());
			 UnitDesignatorNumber.sendKeys(number);
			 City.sendKeys(city);
			 Thread.sleep(3000);
			 Select select3 = new Select (StateCode);
			 select3.selectByVisibleText(state);
			 PostalCode.sendKeys(postalcode);
			 FourZipCode.sendKeys(fourZip);
			 County.sendKeys(county);
			 Select select4 = new Select (Country);
			 select4.selectByValue(country);
			 if (action.equalsIgnoreCase("Save & New")) {
					SaveNew.click();
				} else if (action.equalsIgnoreCase("Save & Close")) {
					SaveClose.click();
				} else if (action.equalsIgnoreCase("Cancel")) {
					cancel.click();
				}
		 }
}
