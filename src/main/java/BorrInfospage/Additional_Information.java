package BorrInfospage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Additional_Information {

	
	
	@FindBy(how = How.XPATH, using = "//*[@ng-model ='selected.borrowerSet.PrimaryBorrower.DocumentSpecificData.URLA_Detail.AdditionalInformationContinuation']")
	WebElement Borrower;
	@FindBy(how = How.XPATH, using = "//*[@ng-model ='selected.borrowerSet.CoBorrower.DocumentSpecificData.URLA_Detail.AdditionalInformationContinuation']")
	WebElement CoBorrower;

public void AdditionalInfos(String borrower , String coborrower) {
	Borrower.sendKeys(borrower);
	CoBorrower.sendKeys(coborrower);
}


}
