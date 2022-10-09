package BorrInfospage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class CoBorrowerEthnicity {
	@FindBy(how = How.XPATH, using = "//h4[text() ='Ethnicity']//following::button[text()='Add'][2]")
	WebElement Addbutton;
	@FindBy(how = How.XPATH, using = "//select[@ng-model ='item.Type']")
	WebElement Ethnicity;
	@FindBy(how = How.XPATH, using = "//select[@ng-model ='item.HMDAEthnicityOriginType']")
	WebElement Designation;
	@FindBy(how = How.XPATH, using = "//input[@ng-model ='item.HMDAEthnicityOriginTypeOtherDescription']")
	WebElement Other_Description;
	@FindBy(how = How.XPATH, using = "//*[text() = 'Save & Close']")
	WebElement SaveAndClose;
	@FindBy(how = How.XPATH, using = "//*[text()='Save & New']")
	WebElement SaveAndNew;
	@FindBy(how = How.XPATH, using = "//button[text() ='Cancel']")
	WebElement cancel;
	@FindBy(how = How.XPATH, using = "//*[@ng-model ='selected.borrowerSet.CoBorrower.GovernmentMonitoring.HMDAEthnicityRefusalIndicator']")
	WebElement Borrower_ChechBox;
	@FindBy(how = How.XPATH, using = "//select[@ng-model ='selected.borrowerSet.CoBorrower.GovernmentMonitoring.HMDAEthnicityCollectedBasedOnVisualObservationOrSurnameIndicator']")
	WebElement Visual_Observation;
	
	
	public void Ethnicity(String checkbox ,String visual ,  String ethnicity ,String designation ,String other) throws Exception {
		
		Thread.sleep(3000);
		if(checkbox.equalsIgnoreCase("Check")) {
		Borrower_ChechBox.click();;}
		Select select1 = new Select(Visual_Observation);
		select1.selectByValue(visual);
		if(Borrower_ChechBox.isSelected()) {}else {
		Addbutton.click();
		Select select2 = new Select(Ethnicity);
		select2.selectByVisibleText(ethnicity);
		Select select3 = new Select(Designation);
		if(ethnicity.equalsIgnoreCase("Hispanic or Latino")) {
			select3.selectByValue(designation);
			Other_Description.sendKeys(other);
		}
		SaveAndClose.click();
	}}
}
