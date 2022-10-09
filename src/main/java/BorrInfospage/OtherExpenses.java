package BorrInfospage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class OtherExpenses {

	WebDriver driver;

	public OtherExpenses(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(how = How.XPATH, using = "//h4[text() ='Alimony, Child Support, and Other Expenses']")
	WebElement AlimonyChildSupportandOtherExpenses;
	@FindBy(how = How.XPATH, using = "//h4[text() ='Alimony, Child Support, and Other Expenses']//following::button[1]")
	WebElement Addbutton;
	@FindBy(how = How.XPATH, using = "//select[@ng-model = 'item.ExpenseType']")
	WebElement Type;
	@FindBy(how = How.XPATH, using = "//input[@ng-model='item.ExpenseTypeOtherDescription']")
	WebElement OtherDescription;
	@FindBy(how = How.XPATH, using = "//input[@ng-model ='item.AlimonyOwedToName']")
	WebElement OwedTo;
	@FindBy(how = How.XPATH, using = "//input[@ng-model ='item.ExpenseDescription']")
	WebElement Description;
	@FindBy(how = How.XPATH, using = "//label[text() = 'Payments Remaining']//following::input[1]")
	WebElement PaymentsRemaining;
	@FindBy(how = How.XPATH, using = "//label[text() = 'Monthly Payment']//following::input[1]")
	WebElement MonthlyPayment;
	@FindBy(how = How.XPATH, using = "//*[text() = 'Save & Close']")
	WebElement SaveAndClose;
	@FindBy(how = How.XPATH, using = "//*[text()='Save & New']")
	WebElement SaveAndNew;
	@FindBy(how = How.XPATH, using = "//*[text() ='Cancel']")
	WebElement cancel;
	public void AddButton() {
		if (AlimonyChildSupportandOtherExpenses.isDisplayed()) {
			Addbutton.click();}
	}
	public void add_expense(String type, String Otherdescription, String owedto, String description,
			String remainingpayment, String monthlypayment, String action) throws InterruptedException {
		Thread.sleep(5000);
		
		
		Thread.sleep(3000);
		Select select = new Select(Type);
		select.selectByVisibleText(type);
		Thread.sleep(3000);
		if(type.equalsIgnoreCase("Other")) {
		OtherDescription.sendKeys(Otherdescription);}
		Thread.sleep(3000);
		if(type.equalsIgnoreCase("Alimony")||type.equalsIgnoreCase("Child Support")) {
		OwedTo.sendKeys(owedto);}
		Thread.sleep(3000);
		if(type.equalsIgnoreCase("Job Related Expenses")) {
		Description.sendKeys(description);}
		PaymentsRemaining.sendKeys(remainingpayment);
		MonthlyPayment.sendKeys(monthlypayment);
		Thread.sleep(3000);
		if (action.equalsIgnoreCase("Save & New")) {
			SaveAndNew.click();
		} else if (action.equalsIgnoreCase("Save & Close")) {
			SaveAndClose.click();
		} else if (action.equalsIgnoreCase("Cancel")) {
			cancel.click();
		}
		
		}
		
	

}
