package BorrInfospage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class UnmarriedAddendum extends BorrowerInfos{

	
 
	
	String marital;
	
	 public UnmarriedAddendum(WebDriver driver ) {
		super(driver);
	
		
	}

	@FindBy(how =How.XPATH ,using ="//select[@ng-model ='selected.borrowerSet.PrimaryBorrower.DomesticRelationshipIndicator']")
	 WebElement SharedPropertyRights ;
	 @FindBy(how =How.XPATH ,using ="//select[@ng-model ='selected.borrowerSet.PrimaryBorrower.DomesticRelationshipType']")
	 WebElement DomesticRelationship ;
	 @FindBy(how =How.XPATH ,using ="//input[@ng-model ='selected.borrowerSet.PrimaryBorrower.DomesticRelationshipTypeOtherDescription']")
	 WebElement OtherDescription ;
	 @FindBy(how =How.XPATH ,using ="//select[@ng-model ='selected.borrowerSet.PrimaryBorrower.DomesticRelationshipStateCode']")
	 WebElement State ;
	 @FindBy(how =How.XPATH , using ="//div[@class = 'col-xs-5-476 form-horizontal']/following::h4[2]")
	 WebElement Unmarried;
	 
	 @FindBy(how =How.XPATH ,using ="//select[@ng-model ='selected.borrowerSet.CoBorrower.DomesticRelationshipIndicator']")
	 WebElement CoBorrSharedPropertyRights ;
	 @FindBy(how =How.XPATH ,using ="//select[@ng-model ='selected.borrowerSet.CoBorrower.DomesticRelationshipType']")
	 WebElement CoBorrDomesticRelationship ;
	 @FindBy(how =How.XPATH ,using ="//input[@ng-model ='selected.borrowerSet.CoBorrower.DomesticRelationshipTypeOtherDescription']")
	 WebElement CoBorrOtherDescription ;
	 @FindBy(how =How.XPATH ,using ="//select[@ng-model ='selected.borrowerSet.CoBorrower.DomesticRelationshipStateCode']")
	 WebElement CoBorrState ;
	 @FindBy(how =How.XPATH , using ="//div[@class = 'col-xs-5-476 form-horizontal']/following::h4[3]")
	 WebElement CoBorrUnmarried;
	 
	 public void Borr_umnarried_addendum(String Shared ,String Domestic  ,String Description ,String state ) throws InterruptedException {
		 
		 if(Unmarried.isDisplayed()) {
		 Select select = new Select(SharedPropertyRights);
		 select.selectByValue(Shared);
		 Thread.sleep(5000);
//		 System.out.println(" the shared is  "+Shared);
		 
		 if(Shared.equalsIgnoreCase("Yes")) {
	     Select select1 = new Select(DomesticRelationship);
		 select1.selectByValue(Domestic);}
		 Thread.sleep(3000);
		 if(Domestic.equalsIgnoreCase("Other")) {
			 OtherDescription.sendKeys(Description);
		 }
		 Select select2 = new Select(State);
		 select2.selectByVisibleText(state);
	 }}
public void CoBorr_umnarried_addendum(String Shared ,String Domestic  ,String Description ,String state ) throws InterruptedException {
		 
		 if(CoBorrUnmarried.isDisplayed()) {
		 Select select = new Select(CoBorrSharedPropertyRights);
		 select.selectByValue(Shared);
		 Thread.sleep(5000);
		 System.out.println(" the shared is  "+Shared);
		 
		 if(Shared.equalsIgnoreCase("Yes")) {
	     Select select1 = new Select(CoBorrDomesticRelationship);
		 select1.selectByValue(Domestic);}
		 Thread.sleep(3000);
		 if(Domestic.equalsIgnoreCase("Other")) {
			 CoBorrOtherDescription.sendKeys(Description);
		 }
		 Select select2 = new Select(CoBorrState);
		 select2.selectByVisibleText(state);
	 }}
}
