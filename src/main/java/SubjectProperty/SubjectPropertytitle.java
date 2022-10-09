package SubjectProperty;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class SubjectPropertytitle {
	@FindBy(how = How.XPATH, using = "//select[@ng-model='dealData.Collateral.SubjectProperty.PropertyDetail.TitleRelationshipVestingType']")
	WebElement Title_will_be_held_as;
	@FindBy(how = How.XPATH, using = "//input[@ng-model='dealData.Collateral.SubjectProperty.PropertyDetail.RelationshipVestingTypeOtherDescription']")
	WebElement Other_Description;
	@FindBy(how = How.XPATH, using = "//select[@ng-model='dealData.Collateral.SubjectProperty.PropertyDetail.EstateType']")
	WebElement Estate_will_be_held_in;
	@FindBy(how = How.XPATH, using = "//label[text() ='Exp. Date']//following::input[1]")
	WebElement Exp_Date;
	@FindBy(how = How.XPATH, using = "//select[@ng-model='dealData.Collateral.SubjectProperty.Trust.ClassificationType']")
	WebElement Trust_Information;
	@FindBy(how = How.XPATH, using = "//select[@ng-model=' dealData.Collateral.SubjectProperty.PropertyDetail.NativeAmericanLandsType']")
	WebElement Indian_Country_Land_Tenure;

//	@FindBy(how = How.XPATH, using = "//select[@ng-model='dealData.Collateral.Title.OwnershipType']")
//	WebElement VA_Type_of_Ownership;

	public void title(String Titlewillbeheldas, String Other, String Estatewillbeheldin, String date,
			String TrustInformation, String IndianCountryLandTenure, String VATypeofOwnership)
			throws InterruptedException {
		Thread.sleep(3000);
		Select select = new Select(Title_will_be_held_as);
		select.selectByVisibleText(Titlewillbeheldas);
		Thread.sleep(3000);
		if (Titlewillbeheldas.equalsIgnoreCase("Other")) {
			Other_Description.sendKeys(Other);
		}

		Thread.sleep(3000);
		Select select1 = new Select(Estate_will_be_held_in);
		select1.selectByVisibleText(Estatewillbeheldin);

		Exp_Date.sendKeys(date);

		Thread.sleep(3000);
		Select select2 = new Select(Trust_Information);
		select2.selectByVisibleText(TrustInformation);

		Thread.sleep(3000);
		Select select3 = new Select(Indian_Country_Land_Tenure);
		select3.selectByVisibleText(IndianCountryLandTenure);

//		Thread.sleep(3000);
//		Select select4 = new Select(VA_Type_of_Ownership);
//		select4.selectByVisibleText(VATypeofOwnership);

	}

}
