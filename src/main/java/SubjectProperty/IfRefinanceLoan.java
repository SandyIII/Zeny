package SubjectProperty;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class IfRefinanceLoan {

	@FindBy(how = How.XPATH, using = "//h4[text()='If Refinance Loan']")
	WebElement If_Refinance_Loan;

	@FindBy(how = How.XPATH, using = "//label[text() = 'Original Cost	']//following::input[1]")
	WebElement Original_Cost;
	@FindBy(how = How.XPATH, using = "//label[text() = 'Prepay Penalty Amount']//following::input[1]")
	WebElement Prepay_Penalty_Amount;
	@FindBy(how = How.XPATH, using = "//select[@ng-model= 'dealData.Loans.Loan.Refinance.CashOutDeterminationType']")
	WebElement Cash_Out_Type;
	@FindBy(how = How.XPATH, using = "//select[@ng-model= 'dealData.Loans.Loan.Refinance.PrimaryPurposeType']")
	WebElement Refinance_Purpose_Type;
	@FindBy(how = How.XPATH, using = "//input[@ng-model= 'dealData.Loans.Loan.Refinance.PrimaryPurposeTypeOtherDescription']")
	WebElement Other_Description;
	@FindBy(how = How.XPATH, using = "//input[@ng-model= 'dealData.Loans.Loan.DocumentSpecificData.URLA_Detail.RefinanceProposedImprovementsDescription']")
	WebElement Describe_Improvements;
	@FindBy(how = How.XPATH, using = "//select[@ng-model= 'dealData.Loans.Loan.DocumentSpecificData.URLA_Detail.RefinanceImprovementsType']")
	WebElement Made_To_Be_Made;
	@FindBy(how = How.XPATH, using = "//label[text() = 'Improvement Cost']//following::input[1]")
	WebElement Improvement_Cost;
	@FindBy(how = How.XPATH, using = "//select[@ng-model= 'dealData.Loans.Loan.Government.RefinanceType']")
	WebElement Refinance_Program;
	@FindBy(how = How.XPATH, using = "//input[@ng-model= 'dealData.Loans.Loan.Government.RefinanceTypeOtherDescription']")
	WebElement Other_Description1;

	public void refinance(String OriginalCost, String PrepayPenaltyAmount, String CashOutType,
			String RefinancePurposeType, String Other1, String DescribeImprovements, String MadeToBeMade,
			String ImprovementCost, String RefinanceProgram ,String Other2) throws InterruptedException {
		Thread.sleep(3000);
		if (If_Refinance_Loan.isDisplayed()) {
			Original_Cost.sendKeys(OriginalCost);
			Prepay_Penalty_Amount.sendKeys(PrepayPenaltyAmount);
			
			Thread.sleep(3000);
			Select select3 = new Select(Cash_Out_Type);
			select3.selectByVisibleText(CashOutType);
			
			
			Thread.sleep(3000);
			Select select = new Select(Refinance_Purpose_Type);
			select.selectByVisibleText(RefinancePurposeType);
			Thread.sleep(3000);
			if (RefinancePurposeType.equalsIgnoreCase("Other")) {
				Other_Description.sendKeys(Other1);
			}
			Describe_Improvements.sendKeys(DescribeImprovements);

			Thread.sleep(3000);
			Select select1 = new Select(Made_To_Be_Made);
			select1.selectByVisibleText(MadeToBeMade);
			Improvement_Cost.sendKeys(ImprovementCost);
			Thread.sleep(3000);
			Select select2 = new Select(Refinance_Program);
			select2.selectByVisibleText(RefinanceProgram);
			Thread.sleep(3000);
			if (RefinanceProgram.equalsIgnoreCase("Other")) {
				Other_Description1.sendKeys(Other2);
			}
		}
	}

}
