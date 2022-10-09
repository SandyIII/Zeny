package BorrInfospage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class BorrowerDeclarations {

	// What is your citizenship/residency status?
	@FindBy(how = How.XPATH, using = "//select[@ng-model = 'selected.borrowerSet.PrimaryBorrower.Declaration.CitizenshipResidencyType']")
	WebElement citizenship_residency_status;

	// Do you live in a community property state?
	@FindBy(how = How.XPATH, using = "//select[@ng-model = 'selected.borrowerSet.PrimaryBorrower.Declaration.CommunityPropertyStateResidentIndicator']")
	WebElement property_state;

	// Do you intend to occupy the property as your primary residence?
	@FindBy(how = How.XPATH, using = "//select[@ng-model = 'selected.borrowerSet.PrimaryBorrower.Declaration.IntentToOccupyType']")
	WebElement primary_residence;

	// Have you had an ownership interest in a property in the last three years?
	@FindBy(how = How.XPATH, using = "//select[@ng-model = 'selected.borrowerSet.PrimaryBorrower.Declaration.HomeownerPastThreeYearsType']")
	WebElement ownership_interest;

	// What type of property did you own (PR/SR/SH/IP)?
	@FindBy(how = How.XPATH, using = "//select[@ng-model = 'selected.borrowerSet.PrimaryBorrower.Declaration.PriorPropertyUsageType']")
	WebElement type_of_property;

	// How did you hold title to home (S/SP/O)?
	@FindBy(how = How.XPATH, using = "//select[@ng-model = 'selected.borrowerSet.PrimaryBorrower.Declaration.PriorPropertyTitleType ']")
	WebElement title_to_home;

	// Purchase Transaction: Do you have a family relationship or business
	// affiliation with the seller of the property?
	@FindBy(how = How.XPATH, using = "//select[@ng-model = 'selected.borrowerSet.PrimaryBorrower.Declaration.SpecialBorrowerSellerRelationship.Indicator']")
	WebElement Purchase_Transaction;
	@FindBy(how = How.XPATH, using = "//*[@ng-model = 'selected.borrowerSet.PrimaryBorrower.Declaration.SpecialBorrowerSellerRelationship.Explanation']")
	WebElement Purchase_Transaction_Explanation;

	// Is any part of the down payment borrowed?
	@FindBy(how = How.XPATH, using = "//select[@ng-model = 'selected.borrowerSet.PrimaryBorrower.Declaration.BorrowedDownPayment.Indicator']")
	WebElement down_payment_borrowed;
	@FindBy(how = How.XPATH, using = "//*[@ng-model = 'selected.borrowerSet.PrimaryBorrower.Declaration.BorrowedDownPayment.Explanation']")
	WebElement down_payment_borrowed_Explanation;
	@FindBy(how = How.XPATH, using = "//label[text()='Is any part of the down payment borrowed?']//following::input[1]")
	WebElement down_payment_borrowed_Amount;

	// Have you applied, or will you be applying, for a mortgage loan on another
	// property on or before closing this transaction that is not disclosed on this
	// loan application?
	@FindBy(how = How.XPATH, using = "//select[@ng-model = 'selected.borrowerSet.PrimaryBorrower.Declaration.UndisclosedMortgageApplication.Indicator']")
	WebElement any_Mortgage;
	@FindBy(how = How.XPATH, using = "//*[@ng-model = 'selected.borrowerSet.PrimaryBorrower.Declaration.UndisclosedMortgageApplication.Explanation']")
	WebElement any_Mortgage_Explanation;

	// Have you applied, or will you be applying, for any new credit on or before
	// closing this loan that is not disclosed on this loan application?
	@FindBy(how = How.XPATH, using = "//select[@ng-model = 'selected.borrowerSet.PrimaryBorrower.Declaration.UndisclosedCreditApplication.Indicator']")
	WebElement any_new_credit;
	@FindBy(how = How.XPATH, using = "//*[@ng-model = 'selected.borrowerSet.PrimaryBorrower.Declaration.UndisclosedCreditApplication.Explanation']")
	WebElement any_new_credit_Explanation;

	// Will this property be subject to a lien that could take priority over the
	// first mortgage lien?
	@FindBy(how = How.XPATH, using = "//select[@ng-model = 'selected.borrowerSet.PrimaryBorrower.Declaration.PropertyProposedCleanEnergyLien.Indicator']")
	WebElement first_mortgage_lien;
	@FindBy(how = How.XPATH, using = "//*[@ng-model = 'selected.borrowerSet.PrimaryBorrower.Declaration.PropertyProposedCleanEnergyLien.Explanation']")
	WebElement first_mortgage_lien_Explanation;

	// Are you a co-signer or guarantor on any debt or loan that is not disclosed on
	// this application?
	@FindBy(how = How.XPATH, using = "//select[@ng-model = 'selected.borrowerSet.PrimaryBorrower.Declaration.UndisclosedComakerOfNote.Indicator']")
	WebElement co_signer_or_guarantor;
	@FindBy(how = How.XPATH, using = "//*[@ng-model = 'selected.borrowerSet.PrimaryBorrower.Declaration.UndisclosedComakerOfNote.Explanation']")
	WebElement co_signer_or_guarantor_Explanation;

	// Are you obligated to pay alimony, child support or separate maintenance?
	@FindBy(how = How.XPATH, using = "//select[@ng-model = 'selected.borrowerSet.PrimaryBorrower.Declaration.AlimonyChildSupportObligation.Indicator']")
	WebElement child_support_or_separate_maintenance;
	@FindBy(how = How.XPATH, using = "//*[@ng-model = 'selected.borrowerSet.PrimaryBorrower.Declaration.AlimonyChildSupportObligation.Explanation']")
	WebElement child_support_or_separate_maintenance_Explanation;

	// Are you a co-maker or endorser on a note?
	@FindBy(how = How.XPATH, using = "//select[@ng-model = 'selected.borrowerSet.PrimaryBorrower.Declaration.CoMakerEndorserOfNote.Indicator']")
	WebElement co_maker_or_endorser;
	@FindBy(how = How.XPATH, using = "//*[@ng-model = 'selected.borrowerSet.PrimaryBorrower.Declaration.CoMakerEndorserOfNote.Explanation']")
	WebElement co_maker_or_endorser_Explanation;

	// Are there any outstanding judgments against you?
	@FindBy(how = How.XPATH, using = "//select[@ng-model = 'selected.borrowerSet.PrimaryBorrower.Declaration.OutstandingJudgments.Indicator']")
	WebElement outstanding_judgments_against_you;
	@FindBy(how = How.XPATH, using = "//*[@ng-model = 'selected.borrowerSet.PrimaryBorrower.Declaration.OutstandingJudgments.Explanation']")
	WebElement outstanding_judgments_against_you_Explanation;

	// Are you presently delinquent or in default on any Federal debt or any other
	// loan, mortgage, financial obligation, bond, or loan guarantee?
	@FindBy(how = How.XPATH, using = "//select[@ng-model = 'selected.borrowerSet.PrimaryBorrower.Declaration.PresentlyDelinquent.Indicator']")
	WebElement Are_you_presently_delinquent;
	@FindBy(how = How.XPATH, using = "//*[@ng-model = 'selected.borrowerSet.PrimaryBorrower.Declaration.PresentlyDelinquent.Explanation']")
	WebElement Are_you_presently_delinquent_Explanation;

	// Are you a party to a lawsuit?
	@FindBy(how = How.XPATH, using = "//select[@ng-model = 'selected.borrowerSet.PrimaryBorrower.Declaration.PartyToLawsuit.Indicator']")
	WebElement party_to_a_lawsuit;
	@FindBy(how = How.XPATH, using = "//*[@ng-model = 'selected.borrowerSet.PrimaryBorrower.Declaration.PartyToLawsuit.Explanation']")
	WebElement party_to_a_lawsuit_Explanation;

	// Have you conveyed title to any property in lieu of foreclosure in the last
	// seven years?
	@FindBy(how = How.XPATH, using = "//select[@ng-model = 'selected.borrowerSet.PrimaryBorrower.Declaration.PriorPropertyDeedInLieuConveyed.Indicator']")
	WebElement conveyed_title_obligated;
	@FindBy(how = How.XPATH, using = "//*[@ng-model = 'selected.borrowerSet.PrimaryBorrower.Declaration.PriorPropertyDeedInLieuConveyed.Explanation']")
	WebElement conveyed_title_obligated_Explanation;

	// Have you completed a pre-foreclosure sale or short sale within the last seven
	// years?
	@FindBy(how = How.XPATH, using = "//select[@ng-model = 'selected.borrowerSet.PrimaryBorrower.Declaration.PriorPropertyShortSaleCompleted.Indicator']")
	WebElement Have_you_ompleted_a_pre_foreclosure;
	@FindBy(how = How.XPATH, using = "//*[@ng-model = 'selected.borrowerSet.PrimaryBorrower.Declaration.PriorPropertyShortSaleCompleted.Explanation']")
	WebElement Have_you_ompleted_a_pre_foreclosure_Explanation;

	// Have you been obligated on any loan which resulted in foreclosure, transfer
	// of title in lieu of foreclosure, or judgment?
	@FindBy(how = How.XPATH, using = "//select[@ng-model = 'selected.borrowerSet.PrimaryBorrower.Declaration.LoanForeclosureOrJudgment.Indicator']")
	WebElement Have_you_been_obligated;
	@FindBy(how = How.XPATH, using = "//*[@ng-model = 'selected.borrowerSet.PrimaryBorrower.Declaration.LoanForeclosureOrJudgment.Explanation']")
	WebElement Have_you_been_obligated_Explanation;

	// Have you had property foreclosed upon within the last seven years?
	@FindBy(how = How.XPATH, using = "//select[@ng-model = 'selected.borrowerSet.PrimaryBorrower.Declaration.PropertyForeclosedPastSevenYears.Indicator']")
	WebElement property_foreclosed;
	@FindBy(how = How.XPATH, using = "//*[@ng-model = 'selected.borrowerSet.PrimaryBorrower.Declaration.PropertyForeclosedPastSevenYears.Explanation']")
	WebElement property_foreclosed_Explanation;

	// Have you declared bankruptcy within the last seven years?
	@FindBy(how = How.XPATH, using = "//select[@ng-model = 'selected.borrowerSet.PrimaryBorrower.Declaration.Bankruptcy.Indicator']")
	WebElement declared_bankruptcy;
	@FindBy(how = How.XPATH, using = "//*[@ng-model = 'selected.borrowerSet.PrimaryBorrower.Declaration.Bankruptcy.Explanation']")
	WebElement declared_bankruptcy_Explanation;
	@FindBy(how = How.XPATH, using = "//*[@ng-model = 'selected.borrowerSet.PrimaryBorrower.Bankruptcy.Bankruptcy_Details']")
	WebElement declared_bankruptcy_Select;
	@FindBy(how = How.XPATH, using = "//label[text()= 'Chapter 7']")
	WebElement Chapter_7;
	@FindBy(how = How.XPATH, using = "//label[text()= 'Chapter 11']")
	WebElement Chapter_11;
	@FindBy(how = How.XPATH, using = "//label[text()= 'Chapter 12']")
	WebElement Chapter_12;
	@FindBy(how = How.XPATH, using = "//label[text()= 'Chapter 13']")
	WebElement Chapter_13;
	@FindBy(how = How.XPATH, using = "//*[text() = 'Save & Close']")
	WebElement SaveAndClose;
	public void borrower_declarations1(String status, String propertystate , String resident, String interest, String type, String title ,String purchase ,String purchase_explication)
			throws InterruptedException {
		Thread.sleep(3000);
		Select select = new Select(citizenship_residency_status);
		select.selectByValue(status);
		Thread.sleep(3000);
		//Do you live in a community property state?
		if(property_state.isDisplayed()) {
			Select select5 = new Select(property_state);
			select5.selectByValue(propertystate);
		}
		
	
		Select select1 = new Select(primary_residence);
		select1.selectByValue(resident);

		Select select2 = new Select(ownership_interest);
		select2.selectByValue(interest);

		Select select3 = new Select(type_of_property);
		Select select4 = new Select(title_to_home);
		if (interest.equalsIgnoreCase("Yes")) {
			select3.selectByValue(type);
			select4.selectByValue(title);
		}
		Thread.sleep(3000);
		//Purchase Transaction: Do you have a family relationship or business affiliation with the seller of the property?
		if(Purchase_Transaction.isDisplayed()) {
			Select select6 = new Select(Purchase_Transaction);
			select6.selectByValue(purchase);
			Thread.sleep(3000);
			if (purchase.equalsIgnoreCase("Yes")) {
			Purchase_Transaction_Explanation.sendKeys(purchase_explication);
			
		}}
		
		
	}

	public void borrower_declarations2(String down_yes_No, String borrowed_Explanation, String amount ,String mortgage ,String mortgageexplication,String credit ,
			String credit_explication,String first_mortgage ,String first_mortgage_explication,String co_signer ,String co_signer_explication,
			String child_support_Yes_No, String Childsupport_Explanation, String endorser_Yes_No,
			String co_maker_Explanation, String outstanding_judgments_Yes_No, String outstanding_Explanation,
			String Are_you_presently_delinquent_Yes_No, String delinquent_Explanation, String party_to_a_lawsuit_Yes_No,
			String lawsuit_Explanation,String conveyed_title,String conveyed_title_explication ,String pre_foreclosure ,String pre_foreclosure_explication, String Have_you_been_obligated_Yes_No, String obligated_Explanation,
			String property_foreclosed_Yes_No, String foreclosed_Explanation, String declared_bankruptcy_Yes_No,
			String bankruptcy_Explanation ,String chapter) throws InterruptedException {

		Thread.sleep(3000);
		Select select = new Select(down_payment_borrowed);
		select.selectByValue(down_yes_No);
		Thread.sleep(3000);
		if (down_yes_No.equalsIgnoreCase("Yes")) {
			down_payment_borrowed_Explanation.sendKeys(borrowed_Explanation);
			down_payment_borrowed_Amount.sendKeys(amount);
		}
		Thread.sleep(3000);
		// Have you applied, or will you be applying, for a mortgage loan on another property on or before closing this transaction that is not disclosed on this loan application?
		if(any_Mortgage.isDisplayed()) {
			Select select7 = new Select(any_Mortgage);
			select7.selectByValue(mortgage);
			if(mortgage.equalsIgnoreCase("Yes")) {
			any_Mortgage_Explanation.sendKeys(mortgageexplication);}
		}
		
		Thread.sleep(3000);
		// Have you applied, or will you be applying, for any new credit on or before closing this loan that is not disclosed on this loan application?
		if(any_new_credit.isDisplayed()) {
			Select select8 = new Select(any_new_credit);
			select8.selectByValue(credit);
			if(credit.equalsIgnoreCase("Yes")) {
			any_new_credit_Explanation.sendKeys(credit_explication);}
		}
		Thread.sleep(3000);
		//Will this property be subject to a lien that could take priority over the first mortgage lien?
		if(first_mortgage_lien.isDisplayed()) {
			Select select9 = new Select(first_mortgage_lien);
			select9.selectByValue(first_mortgage);
			if(first_mortgage.equalsIgnoreCase("Yes")) {
				first_mortgage_lien_Explanation.sendKeys(first_mortgage_explication);
				}
		}
		Thread.sleep(3000);
		//Are you a co-signer or guarantor on any debt or loan that is not disclosed on this application?
		if(co_signer_or_guarantor.isDisplayed()) {
			Select select9 = new Select(co_signer_or_guarantor);
			select9.selectByValue(co_signer);
			if(co_signer.equalsIgnoreCase("Yes")) {
				co_signer_or_guarantor_Explanation.sendKeys(co_signer_explication);
				}
		}
		
		Thread.sleep(3000);
		if(child_support_or_separate_maintenance.isDisplayed()) {
		Select select1 = new Select(child_support_or_separate_maintenance);
		select1.selectByValue(child_support_Yes_No);
		Thread.sleep(3000);
		if (child_support_Yes_No.equalsIgnoreCase("Yes")) {
			child_support_or_separate_maintenance_Explanation.sendKeys(Childsupport_Explanation);

		}}
		Thread.sleep(3000);
		if(co_maker_or_endorser.isDisplayed()) {
		Select select2 = new Select(co_maker_or_endorser);
		select2.selectByValue(endorser_Yes_No);
		Thread.sleep(3000);
		if (endorser_Yes_No.equalsIgnoreCase("Yes")) {
			co_maker_or_endorser_Explanation.sendKeys(co_maker_Explanation);

		}}
		Thread.sleep(3000);
		Select select3 = new Select(outstanding_judgments_against_you);
		select3.selectByValue(outstanding_judgments_Yes_No);
		Thread.sleep(3000);
		if (outstanding_judgments_Yes_No.equalsIgnoreCase("Yes")) {
			outstanding_judgments_against_you_Explanation.sendKeys(outstanding_Explanation);

		}
		Thread.sleep(3000);
		Select select4 = new Select(Are_you_presently_delinquent);
		select4.selectByValue(Are_you_presently_delinquent_Yes_No);
		Thread.sleep(3000);
		if (Are_you_presently_delinquent_Yes_No.equalsIgnoreCase("Yes")) {
			Are_you_presently_delinquent_Explanation.sendKeys(delinquent_Explanation);

		}
		Select select5 = new Select(party_to_a_lawsuit);
		select5.selectByValue(party_to_a_lawsuit_Yes_No);
		Thread.sleep(3000);
		if (party_to_a_lawsuit_Yes_No.equalsIgnoreCase("Yes")) {
			party_to_a_lawsuit_Explanation.sendKeys(lawsuit_Explanation);

		}
		Thread.sleep(3000);
		//Have you conveyed title to any property in lieu of foreclosure in the last seven years?
		if(conveyed_title_obligated.isDisplayed()) {
			Select select11 = new Select(conveyed_title_obligated);
			select11.selectByValue(conveyed_title);
			if(conveyed_title.equalsIgnoreCase("Yes")) {
				conveyed_title_obligated_Explanation.sendKeys(conveyed_title_explication);
				}
		}
		Thread.sleep(3000);
		//Have you completed a pre-foreclosure sale or short sale within the last seven years?
		if(Have_you_ompleted_a_pre_foreclosure.isDisplayed()) {
			Select select11 = new Select(Have_you_ompleted_a_pre_foreclosure);
			select11.selectByValue(pre_foreclosure);
			if(pre_foreclosure.equalsIgnoreCase("Yes")) {
				Have_you_ompleted_a_pre_foreclosure_Explanation.sendKeys(pre_foreclosure_explication);
				}
		}
		if(Have_you_been_obligated.isDisplayed()) {
		Select select6 = new Select(Have_you_been_obligated);
		select6.selectByValue(Have_you_been_obligated_Yes_No);
		Thread.sleep(3000);
		if (Have_you_been_obligated_Yes_No.equalsIgnoreCase("Yes")) {
			Have_you_been_obligated_Explanation.sendKeys(obligated_Explanation);

		}}
		Select select7 = new Select(property_foreclosed);
		select7.selectByValue(property_foreclosed_Yes_No);
		Thread.sleep(3000);
		if (property_foreclosed_Yes_No.equalsIgnoreCase("Yes")) {
			property_foreclosed_Explanation.sendKeys(foreclosed_Explanation);

		}
		Select select8 = new Select(declared_bankruptcy);
		select8.selectByValue(declared_bankruptcy_Yes_No);
		Thread.sleep(3000);
		if (declared_bankruptcy_Yes_No.equalsIgnoreCase("Yes")) {
			declared_bankruptcy_Explanation.sendKeys(bankruptcy_Explanation);

		}
		Thread.sleep(3000);
		if(declared_bankruptcy_Select.isDisplayed()&& declared_bankruptcy_Yes_No.equalsIgnoreCase("Yes")) {
			declared_bankruptcy_Select.click();
			Thread.sleep(3000);
			System.out.println("llllllllllllllllllllllllllllllllllllllllllllll"+chapter);
			if(chapter.equalsIgnoreCase("Chapter 7")) {
				Chapter_7.click();
				SaveAndClose.click();
			}else if(chapter.equalsIgnoreCase("Chapter 11")) {
				Chapter_11.click();
				SaveAndClose.click();
			}else if(chapter.equalsIgnoreCase("Chapter 12")) {
				Chapter_12.click();
				SaveAndClose.click();
			}else if(chapter.equalsIgnoreCase("Chapter 13")) {
				Chapter_13.click();
				SaveAndClose.click();
			}else {SaveAndClose.click();}
		}
	}}


