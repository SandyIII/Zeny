package HMDA;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class Applicant_CoApplicant_Ethnicity {

	//Applicant
	@FindBy(how = How.XPATH, using = "//h4[text() ='Ethnicity']//following::button[text()='Add'][1]")
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
	@FindBy(how = How.XPATH, using = "//*[@ng-model ='dealData.Loans.Loan.HMDA_Loan_Detail.Applicant.HMDAEthnicityRefusalIndicator']//label")
	WebElement Applicant_ChechBox;
	@FindBy(how = How.XPATH, using = "//*[@ng-model ='dealData.Loans.Loan.HMDA_Loan_Detail.Applicant.HMDAEthnicityNotApplicableIndicator']/label")
	WebElement Not_Applicable_ChechBox;
	@FindBy(how = How.XPATH, using = "//select[@ng-model ='dealData.Loans.Loan.HMDA_Loan_Detail.Applicant.HMDAEthnicityBasedOnVisualObservationOrSurnameIndicator']")
	WebElement Visual_Observation;
	//Co_Applicant
	@FindBy(how = How.XPATH, using = "//h4[text() ='Ethnicity']//following::button[text()='Add'][2]")
	WebElement Addbutton2;
	@FindBy(how = How.XPATH, using = "//*[@ng-model ='selected.borrowerSet.PrimaryBorrower.GovernmentMonitoring.HMDAEthnicityRefusalIndicator']")
	WebElement CoApplicantCheckBox;
	@FindBy(how = How.XPATH, using = "//*[@ng-model ='dealData.Loans.Loan.HMDA_Loan_Detail.CoApplicant.HMDAEthnicityNotApplicableIndicator']/label")
	WebElement Not_Applicable_ChechBox2;
	@FindBy(how = How.XPATH, using = "//select[@ng-model ='dealData.Loans.Loan.HMDA_Loan_Detail.CoApplicant.HMDAEthnicityBasedOnVisualObservationOrSurnameIndicator']")
	WebElement Visual_Observation2;
	
	public void ApplicantEthnicity(String checkbox ,String checkbox2 ,String visual ,  String ethnicity ,String designation ,String other) throws Exception {
		Thread.sleep(3000);
		if(checkbox.equalsIgnoreCase("Check")) {
		Applicant_ChechBox.click();}
		Thread.sleep(3000);
		if(checkbox2.equalsIgnoreCase("Check")) {
			Not_Applicable_ChechBox.click();}
		
		Select select1 = new Select(Visual_Observation);
		select1.selectByValue(visual);
		if(Applicant_ChechBox.isSelected()) {}else {
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
	public void CoApplicantEthnicity(String checkbox ,String checkbox1 ,String visual ,  String ethnicity ,String designation ,String other) throws Exception {
		Thread.sleep(3000);
		if(checkbox.equalsIgnoreCase("Check")) {
			CoApplicantCheckBox.click();}
		Thread.sleep(3000);
		if(checkbox1.equalsIgnoreCase("Check")) {
			Not_Applicable_ChechBox2.click();}
		
		Select select1 = new Select(Visual_Observation2);
		select1.selectByValue(visual);
		if(CoApplicantCheckBox.isSelected()) {}else {
		Addbutton2.click();
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
