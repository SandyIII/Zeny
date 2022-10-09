package SubjectProperty;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class TopSectionInfos {

	@FindBy(how = How.XPATH, using = "//*[text()='Subject Property']")
	WebElement SubjectProperty;
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
	@FindBy(how = How.XPATH, using = "//label[text()='Year Built']//following::input[1]")
	WebElement Year_Built;
	@FindBy(how = How.XPATH, using = "//label[text()='Year Acquired	']//following::input[1]")
	WebElement Year_Acquired;
	@FindBy(how = How.XPATH, using = "//input[@ng-model='dealData.Collateral.SubjectProperty.PropertyDetail.PropertyAcquiredDate']")
	WebElement Lot_Acquired_Date;
	@FindBy(how = How.XPATH, using = "//label[text()='Existing Lien']//following::input[1]")
	WebElement Existing_Lien;
	@FindBy(how = How.XPATH, using = "//input[@ng-model='dealData.Collateral.SubjectProperty.Address.StateCodeNum']")
	WebElement State_Code;
	@FindBy(how = How.XPATH, using = "//input[@ng-model='dealData.Collateral.SubjectProperty.Address.CountyCode']")
	WebElement County_Code;
	@FindBy(how = How.XPATH, using = "//input[@ng-model='dealData.Collateral.SubjectProperty.LocationIdentifier.MSAIdentifier']")
	WebElement MSA_MD_Code;
	@FindBy(how = How.XPATH, using = "//input[@ng-model='dealData.Collateral.SubjectProperty.LocationIdentifier.StrCensusTractBaseIdentifier']")
	WebElement Census_Tract;
	@FindBy(how = How.XPATH, using = "//*[@ng-model='dealData.Collateral.SubjectProperty.LegalDescription']")
	WebElement Legal_Description;

	@FindBy(how = How.XPATH, using = "//select[@ng-model='dealData.Collateral.SubjectProperty.PropertyDetail.AttachmentType']")
	WebElement Attachment_Type;
	@FindBy(how = How.XPATH, using = "//select[@ng-model='dealData.Collateral.SubjectProperty.PropertyDetail.ProjectLegalStructureType']")
	WebElement Structure_Type;
	@FindBy(how = How.XPATH, using = "//select[@ng-model='dealData.Collateral.SubjectProperty.PropertyDetail.ConstructionMethodType']")
	WebElement Construction_Method;

	@FindBy(how = How.XPATH, using = "//input[@ng-model='dealData.Collateral.SubjectProperty.PropertyDetail.ConstructionMethodTypeOtherDescription']")
	WebElement Other_Description1;
	@FindBy(how = How.XPATH, using = "//select[@ng-model='dealData.Collateral.SubjectProperty.ManufacturedHomeDetail.HomeWidthType']")
	WebElement Manufactured_Home_Width;
	@FindBy(how = How.XPATH, using = "//select[@ng-model='dealData.Collateral.SubjectProperty.ProjectDetail.ProjectDesignType']")
	WebElement Design_Type;
	@FindBy(how = How.XPATH, using = "//input[@ng-model='dealData.Collateral.SubjectProperty.ProjectDetail.ProjectDesignTypeOtherDescription']")
	WebElement Other_Description2;
	@FindBy(how = How.XPATH, using = "//label[text()='Stories Count']//following::input[1]")
	WebElement Stories_Count;

	@FindBy(how = How.XPATH, using = "//select[@ng-model='dealData.Collateral.SubjectProperty.PropertyDetail.MixedUsageIndicator']")
	WebElement Mixed_Use_Property;
	@FindBy(how = How.XPATH, using = "//select[@ng-model='dealData.Collateral.SubjectProperty.PropertyInProjectIndicator']")
	WebElement Property_in_Project;
	@FindBy(how = How.XPATH, using = "//select[@ng-model='dealData.Collateral.SubjectProperty.PropertyDetail.CommunityPropertyStateIndicator']")
	WebElement Community_Property_State;

	@FindBy(how = How.XPATH, using = "//label[text()='Planned Unit Development (PUD)']")
	WebElement PUD;
//	@FindBy(how = How.XPATH, using = "//label[text()='(F) HUD-REO Property']")
//	WebElement HUD_REO_Property;
//	@FindBy(how = How.XPATH, using = "//label[text()='Rural']")
//	WebElement Rural;
//	@FindBy(how = How.XPATH, using = "//label[text()='Warrantable']")
//	WebElement Warrantable;
//	@FindBy(how = How.XPATH, using = "//select[@ng-model='dealData.Collateral.SubjectProperty.NeighborhoodPropertyLocationType']")
//	WebElement Property_Location;

	public void SubjectPropertyAddress(String address, String unit, String number, String city, String state,
			String postal, String fourzip, String county, String statecode, String countycode, String msa_md_Code,
			String censustract, String country) throws Exception {

		Thread.sleep(3000);
		SubjectProperty.click();
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
		State_Code.sendKeys(statecode);
		County_Code.sendKeys(countycode);
		MSA_MD_Code.sendKeys(msa_md_Code);
		Census_Tract.sendKeys(censustract);
		Thread.sleep(3000);
		Select select2 = new Select(Country);
		select2.selectByValue(country);

		
		
		
		// Legal_Description.sendKeys(description);

	}
	
	public void PropertyInformation(String numberunit, String year, String Acquired, String Date,
			String MixedUseproperty,String Propertyinproject,String CommunitypropertyState,String pud, String attachmenttype, String structuretype, String constructionmethod,
			String Other1, String Manufacturedhomewidth, String Designtype, String Other2/*, String description*/) throws Exception {
		
		Number_of_Units.sendKeys(numberunit);
		Year_Built.sendKeys(year);
		 Year_Acquired.sendKeys(Acquired);
		 Lot_Acquired_Date.sendKeys(Date);
		 Thread.sleep(3000);
			Select select6 = new Select(Mixed_Use_Property);
			select6.selectByValue(MixedUseproperty);

			Thread.sleep(3000);
			Select select7 = new Select(Property_in_Project);
			select7.selectByValue(Propertyinproject);
			Thread.sleep(3000);
			Select select8 = new Select(Community_Property_State);
			select8.selectByValue(CommunitypropertyState);

			if (pud.equalsIgnoreCase("Check")) {
				PUD.click();
			}
		Thread.sleep(3000);
		Select select1 = new Select(Attachment_Type);
		select1.selectByValue(attachmenttype);

		Thread.sleep(3000);
		Select select2 = new Select(Structure_Type);
		select2.selectByValue(structuretype);

		Thread.sleep(3000);
		Select select3 = new Select(Construction_Method);
		select3.selectByValue(constructionmethod);
		Thread.sleep(3000);
		if (constructionmethod.equalsIgnoreCase("Other")) {
			Other_Description1.sendKeys(Other1);
		}

		Thread.sleep(3000);
		Select select4 = new Select(Manufactured_Home_Width);
		select4.selectByValue(Manufacturedhomewidth);
		Thread.sleep(3000);
		Select select5 = new Select(Design_Type);
		select5.selectByValue(Designtype);
		Thread.sleep(3000);
		if (Designtype.equalsIgnoreCase("Other")) {
			Other_Description2.sendKeys(Other2);
		}
//		Stories_Count.sendKeys(Storiescount);
//
//		
//		if (HUDREOProperty.equalsIgnoreCase("Check")) {
//			HUD_REO_Property.click();
//		}
//		if (rural.equalsIgnoreCase("Check")) {
//			Rural.click();
//		}
//		if (warrantable.equalsIgnoreCase("Check")) {
//			Warrantable.click();
//		}
//
//		Thread.sleep(3000);
//		Select select9 = new Select(Property_Location);
//		select9.selectByValue(Propertylocation);
	}
}
