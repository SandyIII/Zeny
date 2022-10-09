package HMDA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class Applican_CoApplicant_Race {
	//Applicant
	@FindBy(how = How.XPATH, using = "//h4[text() ='Race (Add all that apply)']//following::button[text()='Add'][1]")
	WebElement Addbutton1;
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
	@FindBy(how = How.XPATH, using = "//div[@ng-model ='dealData.Loans.Loan.HMDA_Loan_Detail.Applicant.HMDARaceRefusalIndicator']//label")
	WebElement Applicant_ChechBox;
	@FindBy(how = How.XPATH, using = "//div[@ng-model ='dealData.Loans.Loan.HMDA_Loan_Detail.Applicant.HMDARaceNotApplicableIndicator']//label")
	WebElement NotApplicable_ChechBox1;
	@FindBy(how = How.XPATH, using = "//select[@ng-model ='dealData.Loans.Loan.HMDA_Loan_Detail.Applicant.HMDARaceBasedOnVisualObservationOrSurnameIndicator']")
	WebElement Visual_Observation;
	
	//Co_Applicant
	@FindBy(how = How.XPATH, using = "//h4[text() ='Race (Add all that apply)']//following::button[text()='Add'][2]")
	WebElement Addbutton2;
	@FindBy(how = How.XPATH, using = "//*[@ng-model ='dealData.Loans.Loan.HMDA_Loan_Detail.CoApplicant.HMDARaceRefusalIndicator']//label")
	WebElement CoApplicant_ChechBox;
	@FindBy(how = How.XPATH, using = "//div[@ng-model ='dealData.Loans.Loan.HMDA_Loan_Detail.CoApplicant.HMDARaceNotApplicableIndicator']//label")
	WebElement NotApplicable_ChechBox2;
	@FindBy(how = How.XPATH, using = "//select[@ng-model ='dealData.Loans.Loan.HMDA_Loan_Detail.CoApplicant.HMDARaceBasedOnVisualObservationOrSurnameIndicator']")
	WebElement Co_Applicant_Visual_Observation;
	
	public void Applicant_Race(String checkbox1 , String checkbox2 ,String visual ,  String race ,String designation ,String other) throws Exception {
		Thread.sleep(3000);
		if(checkbox1.equalsIgnoreCase("Check")) {
			Applicant_ChechBox.click();}
		Thread.sleep(3000);
		if(checkbox2.equalsIgnoreCase("Check")) {
			NotApplicable_ChechBox1.click();}
		Select select1 = new Select(Visual_Observation);
		select1.selectByValue(visual);
		if(Applicant_ChechBox.isSelected()) {
			
		}else {
		Addbutton1.click();
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
	
	
	
	public void CoApplicant_Race(String checkbox1 , String checkbox2 ,String visual ,  String race ,String designation ,String other) throws Exception {
		Thread.sleep(3000);
		if(checkbox1.equalsIgnoreCase("Check")) {
			CoApplicant_ChechBox.click();}
		Thread.sleep(3000);
		if(checkbox2.equalsIgnoreCase("Check")) {
			NotApplicable_ChechBox2.click();}
		Select select1 = new Select(Co_Applicant_Visual_Observation);
		select1.selectByValue(visual);
		if(CoApplicant_ChechBox.isSelected()) {
			
		}else {
		Addbutton2.click();
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
