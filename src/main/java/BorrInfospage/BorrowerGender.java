package BorrInfospage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class BorrowerGender {
	
	@FindBy(how = How.XPATH, using = "//*[@ng-model ='selected.borrowerSet.PrimaryBorrower.GovernmentMonitoring.HMDAGenderRefusalIndicator']")
	WebElement Borrower_ChechBox;
	@FindBy(how = How.XPATH, using = "//select[@ng-model ='selected.borrowerSet.PrimaryBorrower.GovernmentMonitoring.GenderType']")
	WebElement Sex;
	@FindBy(how = How.XPATH, using = "//select[@ng-model ='selected.borrowerSet.PrimaryBorrower.GovernmentMonitoring.HMDAGenderCollectedBasedOnVisualObservationOrNameIndicator']")
	WebElement Visual_Observation;
	
	
	
	public void Borr_Sex(String checkbox , String sex ,String visual) throws Exception {
		Thread.sleep(3000);
		if(checkbox.equalsIgnoreCase("Check")) {
		Borrower_ChechBox.click();}
		Select select1 = new Select(Sex);
		select1.selectByValue(sex);
		Select select2 = new Select(Visual_Observation);
		select2.selectByValue(visual);
	}
}
