package BorrInfospage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class TopSection {
WebDriver driver;
	
	
	@FindBy(how = How.XPATH, using = "//select[@ng-model ='dealData.Loans.Loan.Estimate.DocumentSpecificData.URLA_Detail.URLAFormType']")
	WebElement SelectForm;
	@FindBy(how = How.XPATH, using = "//input[@ng-model ='selected.borrowerSet.PrimaryBorrower.DocumentSpecificData.URLA.InterviewDate']")
	WebElement LoanOriginatorSignature;
	@FindBy(how = How.XPATH, using = "//select[@ng-model ='selected.borrowerSet.PrimaryBorrower.DocumentSpecificData.URLA.PropertyUsageType']")
	WebElement Occupancy;
	@FindBy(how = How.XPATH, using = "//label[text() ='FHA Secondary Residence ']")
	WebElement FHASecondaryResidenceCeCkBox;
	@FindBy(how = How.XPATH, using = "//select[@ng-model ='selected.borrowerSet.JointAssetLiabilityReportingType']")
	WebElement StatementScheduleCompleted;
	@FindBy(how = How.XPATH, using = "//label[text() ='The income/assets of a person other than Borrower will be used...']")
	WebElement Theincomeassetsofaperson;
	@FindBy(how = How.XPATH, using = "//label[contains(text() ,'The income/assets of the Borrower')]")
	WebElement TheincomeassetsofaBorrowers ;
	
	public void topsection(String application ,String date ,String occupancy ,String checkBox ,String statement ,String asset1 ,String asset2) throws InterruptedException {
		Select select = new Select(SelectForm);
		select.selectByValue(application);
		LoanOriginatorSignature.sendKeys(date);
		Select select2 = new Select(Occupancy);
		select2.selectByValue(occupancy);
		Thread.sleep(3000);
		if(checkBox.equalsIgnoreCase("Checked")) {
			FHASecondaryResidenceCeCkBox.click();	
		}
		
		Select select3 = new Select(StatementScheduleCompleted);
		select3.selectByValue(statement);
		Thread.sleep(3000);
		if(asset1.equalsIgnoreCase("Checked")) {
			Theincomeassetsofaperson.click();	
		}
		Thread.sleep(3000);
		if(asset2.equalsIgnoreCase("Checked")) {
			TheincomeassetsofaBorrowers.click();	
		}
		
	}
	
	
	
}
