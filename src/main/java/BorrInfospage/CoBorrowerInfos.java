package BorrInfospage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class CoBorrowerInfos {

	@FindBy(how = How.XPATH, using = "//input[@ng-model='selected.borrowerSet.CoBorrower.ContactDetails.Name_First']")
	WebElement FirstName;
	@FindBy(xpath = "//input[@ng-model='selected.borrowerSet.CoBorrower.ContactDetails.Name_Middle']")
	WebElement MiddleName;
	@FindBy(xpath = "//input[@ng-model='selected.borrowerSet.CoBorrower.ContactDetails.Name_Last']")
	WebElement LastName;
	@FindBy(xpath = "//input[@ng-model='selected.borrowerSet.CoBorrower.ContactDetails.Name_Suffix']")
	WebElement Suffix;
	@FindBy(xpath ="//input[@ng-model='selected.borrowerSet.CoBorrower.ContactDetails.Nickname']")
	 WebElement Nickname ;
	@FindBy(xpath = "//input[@ng-model='selected.borrowerSet.CoBorrower.SocialSecurityNumber']")
	WebElement SSNumber;
	@FindBy(xpath = "//input[@ng-model='selected.borrowerSet.CoBorrower.DateOfBirth']")
	WebElement DateOfBirth;
	@FindBy(how = How.XPATH, using = "//input[@ng-model='selected.borrowerSet.CoBorrower.Age']")
	WebElement Age;
	@FindBy(how = How.XPATH, using = "//*[@ng-model='selected.borrowerSet.CoBorrower.MaritalStatusType']")
	WebElement MaritalStatus;
	@FindBy(how = How.XPATH, using = "//h4[text()='Borrower']//following::label[text()='Years of Education'][2]//following::input[1]")
	WebElement YearsOfEducation;
	@FindBy(how = How.XPATH, using = "//h4[text()='Co-Borrower']//following::label[text()='Number of Dependents'][2]//following::input[1]")
	WebElement NumberOfDependents;
	@FindBy(how = How.XPATH, using = "//h4[text()='Co-Borrower']//following::label[text()='Ages'][2]//following::input[1]")
	WebElement Ages;
	@FindBy(how = How.XPATH, using = "//h4[text()='Co-Borrower']//following::label[text()='Email'][2]//following::input[1]")
	WebElement Email;
	@FindBy(how = How.XPATH, using = "//select[@ng-model='selected.borrowerSet.CoBorrower.ContactDetails.ElectronicConsentType']")
	WebElement eDisclosureConsent;
	 @FindBy(how =How.XPATH , using ="//select[@ng-model='selected.borrowerSet.CoBorrower.Declaration.BorrowerFirstTimeHomebuyerIndicator']")
	 WebElement FirsttimeHomebuyer;
	 @FindBy(how =How.XPATH , using ="//select[@ng-model='selected.borrowerSet.CoBorrower.RelationshipTitleType']")
	 WebElement RelationshiponTitle;
	 @FindBy(how =How.XPATH , using ="//div[@ng-model ='selected.borrowerSet.CoBorrower.IsCosignerIndicator']/label")
	 WebElement CoSignerOnly;
	 @FindBy(how =How.XPATH , using ="//div[@ng-model ='selected.borrowerSet.CoBorrower.NonTitleLitigationAffectsPropertyIndicator']/label")
	 WebElement NotObligated;
	 @FindBy(how =How.XPATH , using ="//input[@ng-model='selected.borrowerSet.CoBorrower.PowerOfAttorney']")
	 WebElement PowerofAttorney;
	@FindBy(how = How.XPATH, using = "//select[@ng-model='selected.borrowerSet.CoBorrower.SigningCapacity']")
	WebElement SigningCapacity;
	@FindBy(how = How.XPATH, using = "//select[@ng-model='selected.borrowerSet.CoBorrower.DocumentSpecificData.URLA.TakenMethodType']")
	WebElement ApplicationTaken;
	@FindBy(how = How.XPATH, using = "//h4[text()='Co-Borrower']//following::label[text()='Loan Application Signed'][2]//following::input[1]")
	WebElement LoanApplicationSigned;
	@FindBy(how = How.XPATH, using = "//button[@ng-click='saveDeal()']")
	WebElement Save;

	public void CoBorInfos(String firstname ,String middlename ,String lastname , String suffix ,String nikename ,String SSN , String DOB ,String Status /*,String age*/
			,String yearsofeducation ,String numberofdependencies ,String ages ,String email ,String edisclosure 
			,String firsthomebuyer	,String relation, String powerofattorney,String signingcapacity  ,String Apptaken  ,String Appsigned ) throws InterruptedException {
	  
	 
		FirstName.sendKeys(firstname);
		MiddleName.sendKeys(middlename);
		LastName.sendKeys(lastname);
		Suffix.sendKeys(suffix);
		Nickname.sendKeys(nikename);
		SSNumber.sendKeys(SSN);
		DateOfBirth.sendKeys(DOB);
		Thread.sleep(3000);
		Select select = new Select(MaritalStatus);
		select.selectByValue(Status);
		YearsOfEducation.sendKeys(yearsofeducation);
		NumberOfDependents.sendKeys(numberofdependencies);
		Ages.sendKeys(ages);
		Email.sendKeys(email);
		Select select1 = new Select(eDisclosureConsent);
		select1.selectByValue(edisclosure);
		Select select2 = new Select(FirsttimeHomebuyer);
		select2.selectByValue(firsthomebuyer);
		Select select3 = new Select(RelationshiponTitle);
		select3.selectByValue(relation);
		CoSignerOnly.click();
		NotObligated.click();
		PowerofAttorney.sendKeys(powerofattorney);
		Select select5 = new Select(SigningCapacity);
		select5.selectByValue(signingcapacity);
		Select select6 = new Select(ApplicationTaken);
		select6.selectByValue(Apptaken);
		LoanApplicationSigned.sendKeys(Appsigned);
		}

	public void Save_Infos() {
		Save.click();
	}
}
