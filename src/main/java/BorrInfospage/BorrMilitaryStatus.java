package BorrInfospage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class BorrMilitaryStatus {

	@FindBy(how = How.XPATH, using = "//select[@ng-model ='selected.borrowerSet.PrimaryBorrower.Government.VA.Military_Service.SelfDeclaredMIlitaryServiceIndicator'] ")
	WebElement YES_NO;
	@FindBy(how = How.XPATH, using = "//*[@ng-model ='selected.borrowerSet.PrimaryBorrower.Government.VA.Military_Service']")
	WebElement Select;
	@FindBy(how = How.XPATH, using = "//label[contains(text() ,'Currently serving on active duty with service end date')]")
	WebElement Currently_serving_ChechBox;
	@FindBy(how = How.XPATH, using = "//label[contains(text() ,'Currently retired, discharged, or separated from service')]")
	WebElement Currently_retired_ChechBox;
	@FindBy(how = How.XPATH, using = "//label[contains(text() ,'Only period of service was as a non-activated')]")
	WebElement Only_period_of_service_ChechBox;
	@FindBy(how = How.XPATH, using = "//label[contains(text() ,'Surviving spouse')]")
	WebElement Surviving_spouse_ChechBox;
	@FindBy(how = How.XPATH, using = "//*[@ng-model ='item.MilitaryServiceExpectedCompletionDate']")
	WebElement Date;
	@FindBy(how = How.XPATH, using = "//button[text() ='Save & Close']")
	WebElement SaveClose;
	@FindBy(how = How.XPATH, using = "//button[text() ='Cancel']")
	WebElement cancel;

	public void MilitaryServiceStatus(String yes_no, String select, String check1, String check2, String check3,
			String check4, String date) throws InterruptedException {
      

		Select select1 = new Select(YES_NO);
       
       if(yes_no.equalsIgnoreCase("Yes")) {
    	   select1.selectByValue("Yes");}
       else if(yes_no.equalsIgnoreCase("No")) {
    	   select1.selectByValue("No");}
       
		Thread.sleep(3000);
       if(select.equalsIgnoreCase("Select")) {
		Select.click();}
		if(check1.equalsIgnoreCase("Check")) {
		Currently_serving_ChechBox.click();}
		 if(check2.equalsIgnoreCase("Check")) {
		Currently_retired_ChechBox.click();}
		 if(check3.equalsIgnoreCase("Check")) {
		Only_period_of_service_ChechBox.click();}
		 if(check4.equalsIgnoreCase("Check")) {
		Surviving_spouse_ChechBox.click();}
		 Date.sendKeys(date);
		SaveClose.click();

	}
}