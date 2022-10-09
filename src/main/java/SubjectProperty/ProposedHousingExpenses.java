package SubjectProperty;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class ProposedHousingExpenses {

	@FindBy(how = How.XPATH, using = "//h4[text() ='Proposed Housing Expenses']//following::button[text()='Add'][1]")
	WebElement Add_Button;
	@FindBy(how = How.XPATH, using = "//select[@ng-model ='item.ExpenseType']")
	WebElement Housing_Expense_Type;
	@FindBy(how = How.XPATH, using = "//input[@ng-model ='item.ExpenseTypeOtherDescription']")
	WebElement Other_Description;
	@FindBy(how = How.XPATH, using = "//select[@ng-model ='item.PercentBasisType']")
	WebElement Based_On;
	@FindBy(how = How.XPATH, using = "//label[text() ='Fee Percentage']//following::input[1] ")
	WebElement Fee_Percentage;
	@FindBy(how = How.XPATH, using = "//label[text() ='Monthly Dollar Amount']//following::input[1]")
	WebElement Monthly_Dollar_Amount;
	@FindBy(how = How.XPATH, using = "//label[text() ='Monthly Amount']//following::input[1]")
	WebElement Monthly_Amount;
	@FindBy(how = How.XPATH, using = "//button[text() ='Save & Close']")
	WebElement SaveClose;
	@FindBy(how = How.XPATH, using = "//button[text() ='Save & New']")
	WebElement SaveNew;
	@FindBy(how = How.XPATH, using = "//button[text() ='Cancel']")
	WebElement cancel;

	public void ADD_Button() {
		Add_Button.click();
	}

	public void Expenses(String HousingExpenseType, String Other, String BasedOn, String FeePercentage,
			String MonthlyDollarAmount ,String MonthlyAmount ,String action) throws InterruptedException {
		Thread.sleep(3000);

		
		Select select = new Select(Housing_Expense_Type);
//		Thread.sleep(3000);
//		List<WebElement> e = select.getOptions();
//		int itemCount = e.size();
//		  
//		  for (int l = 0; l < itemCount; l++) {
//			  System.out.println(e.get(l).getText());
//		 }
		select.selectByVisibleText(HousingExpenseType);

		Thread.sleep(3000);
		if (HousingExpenseType.equalsIgnoreCase("Other")) {
			Other_Description.sendKeys(Other);
		}

		Thread.sleep(3000);
		Select select1 = new Select(Based_On);
		select1.selectByVisibleText(BasedOn);
		Fee_Percentage.sendKeys(FeePercentage);
		Monthly_Dollar_Amount.sendKeys(MonthlyDollarAmount);
		if (Monthly_Amount.isEnabled()) {
			Monthly_Amount.sendKeys(MonthlyAmount);
		
		}
		if(action.equalsIgnoreCase("Save & New")) {
			SaveNew.click();}
			else if(action.equalsIgnoreCase("Save & Close")) {
				SaveClose.click();
			}else if(action.equalsIgnoreCase("Save & Close")) {
				cancel.click();
			}
	}

}
