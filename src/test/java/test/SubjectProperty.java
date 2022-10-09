package test;

import java.util.Hashtable;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BorrInfospage.BorrowerInfos;
import SubjectProperty.EnergyImprovements;
import SubjectProperty.IfRefinanceLoan;
import SubjectProperty.NamescurrentlyheldonTitle;
import SubjectProperty.NamesonTitle;
import SubjectProperty.ProposedHousingExpenses;
import SubjectProperty.SubjectPropertyIf_Construction_Loan;
import SubjectProperty.SubjectPropertytitle;
import SubjectProperty.SubordinateFinancing;
import SubjectProperty.TopSectionInfos;
import listeners.ExtentListeners;

@Listeners(ExtentListeners.class)
public class SubjectProperty extends Borrower {

	@Test(priority = 67, dataProviderClass = utils.HashTable.class, dataProvider = "getdata", groups = { "Borrower" })
	public void Subject_Property_Address(Hashtable<String, String> data) throws Exception {
		TopSectionInfos Infos = PageFactory.initElements(driver, TopSectionInfos.class);
		Infos.SubjectPropertyAddress(data.get("Address"), data.get("Unit Designator"), data.get("Number"),
				data.get("City"), data.get("State/Province"), data.get("Postal Code"), data.get("FOURZIP"),
				data.get("County"), data.get("State Code"), data.get("County Code"), data.get("MSA/MD Code"),
				data.get("Census Tract"), data.get("Country"));

	}

	@Test(priority = 68, dataProviderClass = utils.HashTable.class, dataProvider = "getdata")
	public void Property_Information(Hashtable<String, String> data) throws Exception {
		TopSectionInfos Infos = PageFactory.initElements(driver, TopSectionInfos.class);
		Infos.PropertyInformation(data.get("Number of Units"), data.get("Year Built"), data.get("Year Acquired"),
				data.get("Lot Acquired Date"),data.get("Mixed-Use Property"), data.get("Property in Project"), data.get("Community Property State"),
				data.get("PUD"), data.get("Attachment Type"), data.get("Structure Type"),
				data.get("Construction Method"), data.get("Other Description1"), data.get("Manufactured Home Width"),
				data.get("Design Type"), data.get("Other Description2")/*,data.get("Legal Description")*/);
	}
	@Test(priority = 69, groups = { "Borrower" })
	public void ProposedHousingExpensesAddButton() throws Exception {
		ProposedHousingExpenses ADD = PageFactory.initElements(driver, ProposedHousingExpenses.class);
		ADD.ADD_Button();
	}

	@Test(priority = 70, dataProviderClass = utils.HashTable.class, dataProvider = "getdata", groups = { "Borrower" })
	public void Proposed_Housing_Expenses(Hashtable<String, String> data) throws Exception {
		ProposedHousingExpenses expenses = PageFactory.initElements(driver, ProposedHousingExpenses.class);
		expenses.Expenses(data.get("Housing Expense Type"), data.get("Other Description"), data.get("Based On"),
				data.get("Fee Percentage"), data.get("Monthly Dollar Amount"), data.get("Monthly Amount"),
				data.get("Action"));
	}
	
	@Test(priority = 71, groups = { "Borrower" })
	public void Subordinate_FinancingAddButton() throws Exception {
		SubordinateFinancing ADD = PageFactory.initElements(driver, SubordinateFinancing.class);
		ADD.ADD_Button();
	}

	@Test(priority = 72, dataProviderClass = utils.HashTable.class, dataProvider = "getdata", groups = { "Borrower" })
	public void Subordinate_Financing(Hashtable<String, String> data) throws Exception {
		SubordinateFinancing Subordinate = PageFactory.initElements(driver, SubordinateFinancing.class);
		Subordinate.Subordinate_Financing(data.get("Loan Position"), data.get("Creditor Name"), data.get("Source/EIN"),
				data.get("Source Type"), data.get("Other Description"), data.get("First Loan Mortgagee"),
				data.get("Original Loan Amount"), data.get("Loan Amount"), data.get("Note Rate"), data.get("Qual Rate"),
				data.get("Amortization Term"), data.get("Loan Term"), data.get("Interest Only"),
				data.get("Monthly Payment"), data.get("Credit Limit"), data.get("Qualify Ratios CheckBox"),
				data.get("Action"));
	}
	@Test(priority = 73, dataProviderClass = utils.HashTable.class, dataProvider = "getdata", groups = { "Borrower" })
	public void Title(Hashtable<String, String> data) throws Exception {
		SubjectPropertytitle infos = PageFactory.initElements(driver, SubjectPropertytitle.class);
		infos.title(data.get("Title will be held as"), data.get("Other Description"),
				data.get("Estate will be held in"), data.get("Exp. Date"), data.get("Trust Information"),
				data.get("Indian Country Land Tenure"), data.get("(VA) Type of Ownership"));
	}

	@Test(priority = 74)
	public void NameONTitleAddButton() throws Exception {
		NamesonTitle name = PageFactory.initElements(driver, NamesonTitle.class);
		name.Add_Button();
	}

	@Test(priority = 75, dataProviderClass = utils.HashTable.class, dataProvider = "getdata", groups = { "Borrower" })
	public void Names_on_Title(Hashtable<String, String> data) throws Exception {
		NamesonTitle names = PageFactory.initElements(driver, NamesonTitle.class);
		names.name(data.get("First"), data.get("Middle"), data.get("Last"), data.get("Suffix"), data.get("Action"));
	}

//	@Test(priority = 73, dataProviderClass = utils.HashTable.class, dataProvider = "getdata", groups = { "Borrower" })
//	public void ConstructionLoan(Hashtable<String, String> data) throws Exception {
//		SubjectPropertyIf_Construction_Loan construction = PageFactory.initElements(driver,
//				SubjectPropertyIf_Construction_Loan.class);
//		construction.Construction(data.get("Original Cost"), data.get("Lot Value (a)"), data.get("Improvements (b)"),
//				data.get("Include MI During Construction Period"),
//				data.get("Include Escrow During Construction Period"), data.get("Calendar"), data.get("From"),
//				data.get("To"), data.get("Period: Months"), data.get("Interest Rate"), data.get("Required Reserve"),
//				data.get("Closing Type"), data.get("(FHA) Construction Type"));
//
//	}

	@Test(priority = 76, dataProviderClass = utils.HashTable.class, dataProvider = "getdata", groups = { "Borrower" })
	public void If_Refinance_Loan(Hashtable<String, String> data) throws Exception {
		IfRefinanceLoan refinance = PageFactory.initElements(driver, IfRefinanceLoan.class);
		refinance.refinance(data.get("Original Cost"), data.get("Prepay Penalty Amount"), data.get("Cash-Out Type"),
				data.get("Refinance Purpose Type"), data.get("Other Description1"), data.get("Describe Improvements"),
				data.get("Made/To Be Made"), data.get("Improvement Cost"), data.get("Refinance Program"),
				data.get("Other Description2"));

	}

	@Test(priority = 77, groups = { "Borrower" })
	public void CurrentNameONTitleAddButton() throws Exception {
		NamescurrentlyheldonTitle ADD = PageFactory.initElements(driver, NamescurrentlyheldonTitle.class);
		ADD.Add_Button();
	}

	@Test(priority = 78, dataProviderClass = utils.HashTable.class, dataProvider = "getdata", groups = { "Borrower" })
	public void Names_Currently_held_on_Title(Hashtable<String, String> data) throws Exception {
		NamescurrentlyheldonTitle names = PageFactory.initElements(driver, NamescurrentlyheldonTitle.class);
		names.name(data.get("First"), data.get("Middle"), data.get("Last"), data.get("Suffix"), data.get("Action"));
	}




	@Test(priority = 79, dataProviderClass = utils.HashTable.class, dataProvider = "getdata", groups = { "Borrower" })
	public void Energy_Improvements(Hashtable<String, String> data) throws Exception {
		EnergyImprovements energy = PageFactory.initElements(driver, EnergyImprovements.class);
		energy.Energy(data.get("Select"), data.get("Mortgage Loan will finance energy-related improvements"),
				data.get("Amount"), data.get(
						"Property is currently subject to a lien that could take priority over the first mortgage lien"));
	}
	@Test(priority = 80, groups = { "Borrower" })
	public void SubjectPropertySAVE() throws Exception {
		BorrowerInfos Borinfos = PageFactory.initElements(driver, BorrowerInfos.class);
		Borinfos.Save_Infos();
	}
}
