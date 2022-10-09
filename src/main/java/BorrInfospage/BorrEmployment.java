package BorrInfospage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class BorrEmployment {

	@FindBy(how = How.XPATH, using = "//h4[text() ='Employment']//following::button[text()='Add'][1]")
	WebElement Add_Button;
	@FindBy(how = How.XPATH, using = "//input[@ng-model ='item.LegalEntityName']")
	WebElement Employer;
	@FindBy(how = How.XPATH, using = "//input[@ng-model ='item.Address.AddressLineText ']")
	WebElement Address;
	@FindBy(how = How.XPATH, using = "//select[@ng-model ='item.Address.UnitDesignatorType'] ")
	WebElement UnitDesignator;
	@FindBy(how = How.XPATH, using = "//input[@ng-model ='item.Address.UnitIdentifier']  ")
	WebElement Number;
	@FindBy(how = How.XPATH, using = "//input[@ng-model ='item.Address.CityName']  ")
	WebElement City;
	@FindBy(how = How.XPATH, using = "//select[@ng-model ='item.Address.StateCode']   ")
	WebElement StateProvince;
	@FindBy(how = How.XPATH, using = "//input[@ng-model ='item.Address.PostalCode'] ")
	WebElement PostalCode;
	@FindBy(how = How.XPATH, using = "//input[@ng-model ='item.Address.PlusFourZipCode']    ")
	WebElement FourZip;
	@FindBy(how = How.XPATH, using = "//select[@ng-model ='item.Address.CountryName'] ")
	WebElement Country;
	@FindBy(how = How.XPATH, using = "//input[@ng-model ='item.LegalEntityTelephone'] ")
	WebElement TelephoneNumber;
	@FindBy(how = How.XPATH, using = "//input[@ng-model ='item.LegalEntityTelephone'] /following::input[1] ")
	WebElement Extension;
	@FindBy(how = How.XPATH, using = "//label[contains(text() ,'Employed by a family member')] ")
	WebElement CheckBox;
	@FindBy(how = How.XPATH, using = "//select[@ng-model ='item.EmploymentStatusType']")
	WebElement EmploymentStatus;
	@FindBy(how = How.XPATH, using = "//select[@ng-model ='item.EmploymentClassificationType']")
	WebElement EmploymentClassification;
	@FindBy(how = How.XPATH, using = "//input[@ng-model ='item.EmploymentPositionDescription'] ")
	WebElement Position;
	@FindBy(how = How.XPATH, using = "//input[@ng-model ='item.StartDate']")
	WebElement StartDate;
	@FindBy(how = How.XPATH, using = "//input[@ng-model ='item.EndDate']")
	WebElement EndDate;
	@FindBy(how = How.XPATH, using = "//label[text() ='Length of Employment']//following::span/input[1] ")
	WebElement Years;
	@FindBy(how = How.XPATH, using = "//label[text() ='years']//following::span/input[1]")
	WebElement Months;
	@FindBy(how = How.XPATH, using = "//label[text() ='Years in Occupation']//following::input[1]")
	WebElement OccupationYears;
	@FindBy(how = How.XPATH, using = "//label[text() ='Years in Occupation']//following::input[3]")
	WebElement OccupationMonths;
	@FindBy(how = How.XPATH, using = "//label[text() ='Foreign Income']")
	WebElement ForeignIncome;
	@FindBy(how = How.XPATH, using = "//label[text() ='Seasonal Income']")
	WebElement SeasonalIncome;
	@FindBy(how = How.XPATH, using = "//label[text() ='Business Owner/ Self-employed']")
	WebElement Business;
	@FindBy(how = How.XPATH, using = "//select[@ng-model ='item.OwnershipInterestPercent']")
	WebElement OwnershipInterest;
	@FindBy(how = How.XPATH, using = "//label[text() ='Monthly Income']//following::input[1]")
	WebElement MonthlyIncome;
	@FindBy(how = How.XPATH, using = "//button[text() ='Save & Close']")
	WebElement SaveClose;
	@FindBy(how = How.XPATH, using = "//button[text() ='Save & New']")
	WebElement SaveNew;
	@FindBy(how = How.XPATH, using = "//button[text() ='Cancel']")
	WebElement cancel;

	
	public void ADD_Button() {
		Add_Button.click();
	}
	public void employement(String employer, String address, String unitDesignator, String number, String city,
			String stateProvince, String postalcode, String fourzip, String country, 
			String telephonenumber, String extension, String checkBox, String employmentStatus,String employmentclassification, String position,
			String startDate,String enddate , String years, String months, String occupationYears, String occupationMonths,
			String foreignIncome, String seasonalIncome, String business, String ownershipInterest,
			String monthlyIncome ,String action) throws InterruptedException {
		
		Employer.sendKeys(employer);
		Address.sendKeys(address);
		Select select = new Select(UnitDesignator);
		select.selectByValue(unitDesignator);
		Number.sendKeys(number);
		City.sendKeys(city);
		Select select1 =new Select(StateProvince);
		select1.selectByVisibleText(stateProvince);
		PostalCode.sendKeys(postalcode);
		FourZip.sendKeys(fourzip);
		Select select2 =new Select(Country);
		select2.selectByValue(country);
		TelephoneNumber.sendKeys(telephonenumber);
		Thread.sleep(3000);
		Extension.sendKeys(extension);
		Thread.sleep(3000);
		if(checkBox.equalsIgnoreCase("Checked")) {
			CheckBox.click();
		}
		Select select3 = new Select(EmploymentStatus);
		select3.selectByValue(employmentStatus);
		if(employmentStatus.equalsIgnoreCase("Current")) {
		Select select4 = new Select(EmploymentClassification);
		select4.selectByVisibleText(employmentclassification);
		Position.sendKeys(position);
		StartDate.sendKeys(startDate);
		Years.sendKeys(years);
		Months.sendKeys(months);
		OccupationYears.sendKeys(occupationYears);
		OccupationMonths.sendKeys(occupationMonths);
		Thread.sleep(3000);
		if(foreignIncome.equalsIgnoreCase("Checked")) {
			ForeignIncome.click();
		}
		if(seasonalIncome.equalsIgnoreCase("Checked")) {
			SeasonalIncome.click();
		}
		Thread.sleep(3000);
		if(business.equalsIgnoreCase("Checked")) {
			Business.click();
		}
		Thread.sleep(3000);
		if(business.equalsIgnoreCase("Checked")) {
		Select select5 = new Select(OwnershipInterest);
		select5.selectByValue(ownershipInterest);
		MonthlyIncome.sendKeys(monthlyIncome);}}
		
		else if(employmentStatus.equalsIgnoreCase("Previous")) {
			Position.sendKeys(position);
			StartDate.sendKeys(startDate);
			EndDate.sendKeys(enddate);
			Thread.sleep(3000);
			if(foreignIncome.equalsIgnoreCase("Checked")) {
				ForeignIncome.click();
			}
			Thread.sleep(3000);
			if(seasonalIncome.equalsIgnoreCase("Checked")) {
				SeasonalIncome.click();
			}
			Thread.sleep(3000);
			if(business.equalsIgnoreCase("Checked")) {
				Business.click();
			}
			MonthlyIncome.sendKeys(monthlyIncome);
		}
		if(action.equalsIgnoreCase("Save & New")) {
			SaveNew.click();}
			else if(action.equalsIgnoreCase("Save & Close")) {
				SaveClose.click();
			}else if(action.equalsIgnoreCase("Save & Close")) {
				cancel.click();
			}
	}

}
