package HMDA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class Applicant_CoApplicant_Gender {
	//Applicant
	@FindBy(how = How.XPATH, using = "//*[@ng-model ='dealData.Loans.Loan.HMDA_Loan_Detail.Applicant.HMDAGenderRefusalIndicator']/label")
	WebElement Applicant_ChechBox;
	@FindBy(how = How.XPATH, using = "//*[@ng-model ='dealData.Loans.Loan.HMDA_Loan_Detail.Applicant.HMDAGenderNotApplicableIndicator']/label")
	WebElement Not_Applicable_ChechBox;
	@FindBy(how = How.XPATH, using = "//select[@ng-model ='dealData.Loans.Loan.HMDA_Loan_Detail.Applicant.HMDAGenderType']")
	WebElement Applicant_Sex;
	@FindBy(how = How.XPATH, using = "//select[@ng-model ='dealData.Loans.Loan.HMDA_Loan_Detail.Applicant.HMDAGenderBasedOnVisualObservationOrSurnameIndicator']")
	WebElement Applicant_Visual_Observation;
	
	
	//Co_Applicant
	@FindBy(how = How.XPATH, using = "//*[@ng-model ='dealData.Loans.Loan.HMDA_Loan_Detail.CoApplicant.HMDAGenderRefusalIndicator']/label")
	WebElement Co_Applicant_ChechBox;
	@FindBy(how = How.XPATH, using = "//*[@ng-model ='dealData.Loans.Loan.HMDA_Loan_Detail.CoApplicant.HMDAGenderNotApplicableIndicator']/label")
	WebElement Not_Applicable_ChechBox2;
	@FindBy(how = How.XPATH, using = "//select[@ng-model ='dealData.Loans.Loan.HMDA_Loan_Detail.CoApplicant.HMDAGenderType']")
	WebElement CoApplicant_Sex;
	@FindBy(how = How.XPATH, using = "//select[@ng-model ='dealData.Loans.Loan.HMDA_Loan_Detail.CoApplicant.HMDAGenderBasedOnVisualObservationOrSurnameIndicator']")
	WebElement Co_Applicant_Visual_Observation;
	public void Applicant_Sex(String checkbox1 ,String checkbox2 , String sex ,String visual) throws Exception {
		Thread.sleep(3000);
		if(checkbox1.equalsIgnoreCase("Check")) {
		Applicant_ChechBox.click();}
		Thread.sleep(3000);
		if(checkbox2.equalsIgnoreCase("Check")) {
		Applicant_ChechBox.click();}
		Select select1 = new Select(Applicant_Sex);
		select1.selectByValue(sex);
		Select select2 = new Select(Applicant_Visual_Observation);
		select2.selectByValue(visual);
	}
	
	
	
	
	public void Co_Applicant_Sex(String checkbox1 , String checkbox2 ,String sex ,String visual) throws Exception {
		Thread.sleep(3000);
		if(checkbox1.equalsIgnoreCase("Check")) {
		Co_Applicant_ChechBox.click();}
		Thread.sleep(3000);
		if(checkbox2.equalsIgnoreCase("Check")) {
			Not_Applicable_ChechBox2.click();}
		Select select1 = new Select(CoApplicant_Sex);
		select1.selectByValue(sex);
		Select select2 = new Select(Co_Applicant_Visual_Observation);
		select2.selectByValue(visual);
	}
}
