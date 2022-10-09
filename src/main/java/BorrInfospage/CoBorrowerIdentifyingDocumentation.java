package BorrInfospage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class CoBorrowerIdentifyingDocumentation {
	@FindBy(how = How.XPATH, using = "//h4[text() ='Identifying Documentation']//following::button[text()='Add'][2]")
	WebElement Addbutton;
	@FindBy(how = How.XPATH, using = "//select[@ng-model ='item.Type']")
	WebElement Type;
	@FindBy(how = How.XPATH, using = "//input[@ng-model ='item.TypeOtherDescription']")
	WebElement Other_Description1;
	@FindBy(how = How.XPATH, using = "//input[@ng-model ='item.Issuer.Name']")
	WebElement Agency;
	@FindBy(how = How.XPATH, using = "//input[@ng-model ='item.Identifier']")
	WebElement Document_Number;
	@FindBy(how = How.XPATH, using = "//input[@ng-model ='item.IssueDate']")
	WebElement Issued;
	@FindBy(how = How.XPATH, using = "//input[@ng-model ='item.ExpirationDate']")
	WebElement Expires;
	@FindBy(how = How.XPATH, using = "//select[@ng-model ='item.Issuer.Type']")
	WebElement Governing_Entity;
	@FindBy(how = How.XPATH, using = "//input[@ng-model ='item.Issuer.TypeOtherDescription']")
	WebElement Other_Description2;
	@FindBy(how = How.XPATH, using = "//select[@ng-model ='item.Issuer.StateCode']")
	WebElement StateProvince;
	@FindBy(how = How.XPATH, using = "//*[@ng-model ='item.Issuer.StateCode']")
	WebElement State;
	@FindBy(how = How.XPATH, using = "//select[@ng-model ='item.Issuer.CountryName']")
	WebElement Country;
	@FindBy(how = How.XPATH, using = "//*[@ng-model ='item.DiscrepancyAndResolution']")
	WebElement Discrepancy_and_Resolution;
	@FindBy(how = How.XPATH, using = "//*[text() = 'Save & Close']")
	WebElement SaveAndClose;
	@FindBy(how = How.XPATH, using = "//*[text()='Save & New']")
	WebElement SaveAndNew;
	@FindBy(how = How.XPATH, using = "//button[text() ='Cancel']")
	WebElement cancel;

	public void ADD_Button() {
		Addbutton.click();
	}

	public void Add_Identifying_Documentation(String type, String Other1, String agency, String document, String issued,
			String expires, String Entity , String Other2 ,String stateprovince ,String country ,String discrepancy_and_resolution ,String action) throws Exception {

		Thread.sleep(3000);
		Select select = new Select(Type);
		select.selectByVisibleText(type);
		Thread.sleep(3000);
		if (type.equalsIgnoreCase("Other")) {
			Other_Description1.sendKeys(Other1);
		}
		Agency.sendKeys(agency);
		Document_Number.sendKeys(document);
		Issued.sendKeys(issued);
		Expires.sendKeys(expires);
		Thread.sleep(3000);
		Select select1 = new Select(Governing_Entity);
		select1.selectByVisibleText(Entity);
		Thread.sleep(3000);
		if (Entity.equalsIgnoreCase("Other")) {
			Other_Description2.sendKeys(Other2);
		}
		Thread.sleep(3000);
		Select select3 = new Select(StateProvince);
		if(country.equalsIgnoreCase("United States")) {
		
		select3.selectByVisibleText(stateprovince);}
		
		Thread.sleep(3000);
		Select select4 = new Select(Country);
		select4.selectByVisibleText(country);
		
		Discrepancy_and_Resolution.sendKeys(discrepancy_and_resolution);
		
		if(action.equalsIgnoreCase("Save & New")) {
			SaveAndNew.click();}
			else if(action.equalsIgnoreCase("Save & Close")) {
				SaveAndClose.click();
			}else if(action.equalsIgnoreCase("Save & Close")) {
				cancel.click();
			}
	}
}
