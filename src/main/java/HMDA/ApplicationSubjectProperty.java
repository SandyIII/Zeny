package HMDA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class ApplicationSubjectProperty {

	// Subject Property elements
	@FindBy(how = How.XPATH, using = "//input[@ng-model='dealData.Collateral.SubjectProperty.Address.AddressLineText ']")
	WebElement Address;
	@FindBy(xpath = "//select[@ng-model='dealData.Collateral.SubjectProperty.Address.UnitDesignatorType']")
	WebElement Unit_Designator;
	@FindBy(xpath = "//input[@ng-model='dealData.Collateral.SubjectProperty.Address.UnitIdentifier']")
	WebElement Number;
	@FindBy(xpath = "//input[@ng-model='dealData.Collateral.SubjectProperty.Address.CityName']")
	WebElement City;
	@FindBy(xpath = "//select[@ng-model='dealData.Collateral.SubjectProperty.Address.StateCode']")
	WebElement State_Province;
	@FindBy(xpath = "//input[@ng-model='dealData.Collateral.SubjectProperty.Address.PostalCode']")
	WebElement Postal_Code;
	@FindBy(xpath = "//input[@ng-model='dealData.Collateral.SubjectProperty.Address.PlusFourZipCode']")
	WebElement FourZipe_Code;
	@FindBy(xpath = "//input[@ng-model='dealData.Collateral.SubjectProperty.Address.CountyName']")
	WebElement County;
	@FindBy(how = How.XPATH, using = "//select[@ng-model='dealData.Collateral.SubjectProperty.Address.CountryName']")
	WebElement Country;
	@FindBy(how = How.XPATH, using = "//label[text()='Number of Units']//following::input[1]")
	WebElement Number_of_Units;
	@FindBy(how = How.XPATH, using = "//input[@ng-model='dealData.Collateral.SubjectProperty.Address.StateCodeNum']")
	WebElement State_Code;
	@FindBy(how = How.XPATH, using = "//input[@ng-model='dealData.Collateral.SubjectProperty.Address.CountyCode']")
	WebElement County_Code;
	@FindBy(how = How.XPATH, using = "//input[@ng-model='dealData.Collateral.SubjectProperty.Address.CountyCode']//following::label[1]")
	WebElement County_Code_CheckBox;
	@FindBy(how = How.XPATH, using = "//input[@ng-model='dealData.Collateral.SubjectProperty.LocationIdentifier.StrCensusTractBaseIdentifier']")
	WebElement Census_Tract;
	@FindBy(how = How.XPATH, using = "//input[@ng-model='dealData.Collateral.SubjectProperty.LocationIdentifier.StrCensusTractBaseIdentifier']//following::label[1]")
	WebElement Census_Tract_CheckBox;
	@FindBy(how = How.XPATH, using = "//*[text() = ' County Population Less Than 30,000']")
	WebElement County_Population_Less_Than_30000;
	@FindBy(how = How.XPATH, using = "//select[@ng-model='dealData.Loans.Loan.HMDA_Loan_Detail.ConstructionMethodType']")
	WebElement Construction_Method;
	@FindBy(how = How.XPATH, using = "//select[@ng-model='dealData.Loans.Loan.HMDA_Loan_Detail.AffordableUnitsCount']")
	WebElement Multifamily_Affordable_Units;
	@FindBy(how = How.XPATH, using = "//select[@ng-model='dealData.Loans.Loan.HMDA_Loan_Detail.HMDAManufactruredHomeLegalClassificationType']")
	WebElement Secured_Property_Type;
	@FindBy(how = How.XPATH, using = "//select[@ng-model='dealData.Loans.Loan.HMDA_Loan_Detail.PropertyEstateType']")
	WebElement Land_Property_Interest;

	public void topsectionInfoLeftSide(String address, String unit, String number, String city, String state,
			String postal, String fourzip, String county, String country, String numberunit, String statecode,
			String countycode, String censustract, String CountyCheckBox, String construction_method,
			String multifamily_affordable_units ,String secured_property_Type , String land_property_Interest) throws Exception {
		Thread.sleep(3000);
		Address.sendKeys(address);
		Thread.sleep(3000);
		Select select = new Select(Unit_Designator);
		select.selectByValue(unit);
		Number.sendKeys(number);
		City.sendKeys(city);

		Thread.sleep(3000);
		Select select1 = new Select(State_Province);
		select1.selectByVisibleText(state);

		Postal_Code.sendKeys(postal);
		FourZipe_Code.sendKeys(fourzip);
		Thread.sleep(3000);
		if (postal.isBlank()) {
			County.sendKeys(county);
		}
		Thread.sleep(3000);
		Select select2 = new Select(Country);
		select2.selectByValue(country);

		Number_of_Units.sendKeys(numberunit);
		State_Code.sendKeys(statecode);
		County_Code.sendKeys(countycode);
		if (countycode.equalsIgnoreCase("Not Applicable")) {
			County_Code_CheckBox.click();
		}
		Census_Tract.sendKeys(censustract);
		if (censustract.equalsIgnoreCase("Not Applicable")) {
			Census_Tract_CheckBox.click();
		}
		if (CountyCheckBox.equalsIgnoreCase("Checked")) {
			County_Population_Less_Than_30000.click();
		}
		Thread.sleep(3000);
		Select select3 = new Select(Construction_Method);
		select3.selectByVisibleText(construction_method);
		Thread.sleep(3000);
		Select select4 = new Select(Multifamily_Affordable_Units);
		select4.selectByVisibleText(multifamily_affordable_units);
		Thread.sleep(3000);
		Select select5 = new Select(Secured_Property_Type);
		select5.selectByVisibleText(secured_property_Type);
		Thread.sleep(3000);
		Select select6 = new Select(Land_Property_Interest);
		select6.selectByVisibleText(land_property_Interest);
	}
}
