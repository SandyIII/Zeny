package BorrInfospage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class BorrowerRace {
	@FindBy(how = How.XPATH, using = "//h4[text() ='Race (Add all that apply)']//following::button[text()='Add'][1]")
	WebElement Addbutton;
	@FindBy(how = How.XPATH, using = "//select[@ng-model ='item.Type']")
	WebElement Race;
	@FindBy(how = How.XPATH, using = "//select[@ng-model ='item.HMDARaceDesignationType']")
	WebElement Designation;
	@FindBy(how = How.XPATH, using = "//input[@ng-model ='item.HMDARaceDesignationTypeOtherDescription']")
	WebElement Other_Description;
	@FindBy(how = How.XPATH, using = "//*[text() = 'Save & Close']")
	WebElement SaveAndClose;
	@FindBy(how = How.XPATH, using = "//*[text()='Save & New']")
	WebElement SaveAndNew;
	@FindBy(how = How.XPATH, using = "//button[text() ='Cancel']")
	WebElement cancel;
	@FindBy(how = How.XPATH, using = "//div[@ng-model ='selected.borrowerSet.PrimaryBorrower.GovernmentMonitoring.RaceNationalOriginRefusalIndicator']")
	WebElement Borrower_ChechBox;
	@FindBy(how = How.XPATH, using = "//select[@ng-model ='selected.borrowerSet.PrimaryBorrower.GovernmentMonitoring.HMDARaceCollectedBasedOnVisualObservationOrSurnameIndicator']")
	WebElement Visual_Observation;
	
	
	public void Race(String checkbox ,String visual ,  String race ,String designation ,String other) throws Exception {
		Thread.sleep(3000);
		if(checkbox.equalsIgnoreCase("Check")) {
		Borrower_ChechBox.click();}
		Select select1 = new Select(Visual_Observation);
		select1.selectByValue(visual);
		if(Borrower_ChechBox.isSelected()) {
			
		}else {
		Addbutton.click();
		Select select2 = new Select(Race);
		select2.selectByVisibleText(race);
		Select select3 = new Select(Designation);
		//race.equalsIgnoreCase("American Indian or Alaska Native")||race.equalsIgnoreCase("Asian")||race.equalsIgnoreCase("Native Hawaiian or Other Pacific Islander")
		Thread.sleep(3000);
		if(Designation.isEnabled()) {
			select3.selectByValue(designation);
			
		}
		Thread.sleep(3000);
		if(Other_Description.isEnabled()) {
			Other_Description.sendKeys(other);
		}
		SaveAndClose.click();
	}}
	
}
