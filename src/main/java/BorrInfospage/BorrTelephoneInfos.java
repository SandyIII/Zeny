package BorrInfospage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class BorrTelephoneInfos {

	
	@FindBy(how =How.XPATH ,using ="//h4[text() ='Telephone']//following::button[text()='Add'][1]")
	 WebElement AddButton ;
	 @FindBy(how =How.XPATH ,using ="//select[@ng-model ='item.RoleType']")
	 WebElement TelephoneType ;
	 @FindBy(how =How.XPATH ,using ="//input[@ng-model ='item.RoleTypeOtherDescription']")
	 WebElement OtherDescription ;
	 @FindBy(how =How.XPATH ,using ="//input[@ng-model ='item.TelephoneValue']")
	 WebElement TelephoneNumber ;
	 @FindBy(how =How.XPATH ,using ="//label[text() ='Extension']//following::span/input[1]")
	 WebElement TelephoneExtension ;
	 @FindBy(how =How.XPATH ,using ="//label[text() ='Preferred Contact']")
	 WebElement PreferredContactCheckBox ;
	 @FindBy(how =How.XPATH ,using ="//button[text() ='Save & Close']")
	 WebElement SaveClose ;
	 @FindBy(how =How.XPATH ,using ="//button[text() ='Save & New']")
	 WebElement SaveNew ;
	 @FindBy(how =How.XPATH ,using ="//button[text() ='Cancel']")
	 WebElement cancel ;
	 
	 public void BorrADD_Button() {
		 AddButton.click();
	 }
	 public void borrtelepnoneinfos(String telephonetype ,String otherdescription,String number ,String extention,String action) throws InterruptedException {
		
		 Select select = new Select(TelephoneType);
		 select.selectByValue(telephonetype);
		 Thread.sleep(3000);
		if(telephonetype .equalsIgnoreCase("Other"))
		  {
			 OtherDescription.sendKeys(otherdescription);
			 
		 }
		 TelephoneNumber.sendKeys(number);
		 TelephoneExtension.sendKeys(extention);
		 PreferredContactCheckBox.click();
		 if (action.equalsIgnoreCase("Save & New")) {
				SaveNew.click();
			} else if (action.equalsIgnoreCase("Save & Close")) {
				SaveClose.click();
			} else if (action.equalsIgnoreCase("Cancel")) {
				cancel.click();
			}
//			Thread.sleep(3000);
//			if (action.equalsIgnoreCase("Save & Close")) {
//				SaveClose.click();
//			}
		 //SaveClose.click();
		 
		 
	 }
}
