package test;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import listeners.ExtentListeners;
import BorrInfospage.Additional_Information;
import BorrInfospage.Assets;
import BorrInfospage.BorrAddressPage;
import BorrInfospage.BorrEmployment;
import BorrInfospage.BorrIncome;
import BorrInfospage.BorrMilitaryStatus;
import BorrInfospage.BorrTelephoneInfos;
import BorrInfospage.BorrowerDeclarations;
import BorrInfospage.BorrowerEthnicity;
import BorrInfospage.BorrowerGender;
import BorrInfospage.BorrowerIdentifyingDocumentation;
import BorrInfospage.BorrowerInfos;
import BorrInfospage.BorrowerRace;
import BorrInfospage.CoBorrAddressPage;
import BorrInfospage.CoBorrEmployment;
import BorrInfospage.CoBorrIncome;
import BorrInfospage.CoBorrTelephoneInfos;
import BorrInfospage.CoBorrowerDeclarations;
import BorrInfospage.CoBorrowerEthnicity;
import BorrInfospage.CoBorrowerGender;
import BorrInfospage.CoBorrowerIdentifyingDocumentation;
import BorrInfospage.CoBorrowerInfos;
import BorrInfospage.CoBorrowerMilitaryService;
import BorrInfospage.CoBorrowerRace;
import BorrInfospage.GiftsOrGrants;
import BorrInfospage.Liabilities;
import BorrInfospage.LoginPage;
import BorrInfospage.NewLoan;
import BorrInfospage.OtherExpenses;
import BorrInfospage.PrimaryHousing;
import BorrInfospage.RealEstate;
import BorrInfospage.Title;
import BorrInfospage.TopSection;
import BorrInfospage.UnmarriedAddendum;
import utils.Base;
import utils.BeforClass;
import utils.BrowserFactory;
import utils.Constant;
import utils.ExcelReader;
@Listeners(ExtentListeners.class)
public class Borrower  {
	WebDriver driver ;
	
	@BeforeClass
	public void open() throws InterruptedException {
		
	
		driver = BrowserFactory.WebDriverManagerTest();
		Thread.sleep(3000);
	}


	@Test(priority = 1, groups = { "Borrower" })
	public void Zenly() throws InterruptedException {

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		
		loginPage.login(Constant.username, Constant.password);

	}

	@Test(priority = 2, groups = { "Borrower" })
	public void newloan() throws Exception {
		/*int a = 0;
		for(int i =0 ; i<=100 ; i++) {
	    	driver.findElement(By.xpath("//*[@id='root']/div/div/div/div[3]/div/table/tbody/tr[1]/td[6]/a/i")).click();
	    	driver.findElement(By.xpath("//*[text() = 'OK']")).click();
	    	Thread.sleep(3000);
	    	System.out.println(a++);
	    }*/
		NewLoan newloan = PageFactory.initElements(driver, NewLoan.class);
		newloan.AddNewLoan();
		Thread.sleep(5000);
		newloan.application();

	}

	@Test(priority = 3, dataProviderClass = utils.HashTable.class, dataProvider = "getdata", groups = { "Borrower" })
	public void tope_sectioninfos(Hashtable<String, String> data) throws InterruptedException {
		TopSection topinfos = PageFactory.initElements(driver, TopSection.class);
		topinfos.topsection(data.get("Select Form"), data.get("Loan Originator Signature"), data.get("Occupancy"),
				data.get("FHA Secondary Residence"), data.get("Statement/Schedule Completed"),
				data.get("person CheckBox"), data.get(" Borrower's CheckBox"));

		Thread.sleep(3000);

	}

	@Test(priority = 4, dataProviderClass = utils.HashTable.class, dataProvider = "getdata", groups = { "Borrower" })
	public void BorrowerInf(Hashtable<String, String> data) throws InterruptedException {
		BorrowerInfos Borinfos = PageFactory.initElements(driver, BorrowerInfos.class);
		Borinfos.BorInfos(data.get("First"), data.get("Middle"), data.get("Last"), data.get("Suffix"),
				data.get("Nickname"), data.get("SSN/Tax ID"), data.get("Date of Birth"),
				/* data.get("Age"), */data.get("maritalstatus"), data.get("Years of Education"),
				data.get("Number of Dependents"), data.get("Ages"), data.get("Email"), data.get("eDisclosure Consent"),
				data.get("firsttimehomebuyer"), data.get("Relationship on Title"), data.get("Power of Attorney"),
				data.get("Signing Capacity"), data.get("Application Taken"), data.get("Loan Application Signed"));

		Thread.sleep(3000);

	}

//	@Test(priority = 5, dataProviderClass = utils.HashTable.class, dataProvider = "getdata")
//	public void CoBorrower(Hashtable<String, String> data) throws InterruptedException {
//		CoBorrowerInfos coBorinfos = PageFactory.initElements(driver, CoBorrowerInfos.class);
//		coBorinfos.CoBorInfos(data.get("First"), data.get("Middle"), data.get("Last"), data.get("Suffix"),
//				data.get("Nickname"), data.get("SSN/Tax ID"), data.get("Date of Birth"),
//				/* data.get("Age"), */data.get("maritalstatus"), data.get("Years of Education"),
//				data.get("Number of Dependents"), data.get("Ages"), data.get("Email"), data.get("eDisclosure Consent"),
//				data.get("firsttimehomebuyer"), data.get("Relationship on Title"), data.get("Power of Attorney"),
//				data.get("Signing Capacity"), data.get("Application Taken"), data.get("Loan Application Signed"));
//
//		Thread.sleep(3000);
//
//	}
//
//	@Test(priority = 6, dataProviderClass = utils.HashTable.class, dataProvider = "getdata", groups = { "Borrower" })
//	public void Borr_Addendum(Hashtable<String, String> data) throws InterruptedException {
//		UnmarriedAddendum Add = PageFactory.initElements(driver, UnmarriedAddendum.class);
//		Add.Borr_umnarried_addendum(data.get("Shared Property Rights"), data.get("Domestic_Relationship"),
//				data.get("Other Description"), data.get("State"));
//		Add.CoBorr_umnarried_addendum(data.get("CoBorr_Shared Property Rights"),
//				data.get("CoBorr_Domestic_Relationship"), data.get("CoBorr_Other Description"),
//				data.get("CoBorr_State"));
//	}
//
//	@Test(priority = 7, groups = { "Borrower" })
//	public void BorTeleAddButton() {
//		BorrTelephoneInfos AddButton = PageFactory.initElements(driver, BorrTelephoneInfos.class);
//		AddButton.BorrADD_Button();
//	}
//
//	@Test(priority = 8, dataProviderClass = utils.HashTable.class, dataProvider = "getdata", groups = { "Borrower" })
//	public void Borrower_Telephone(Hashtable<String, String> data) throws InterruptedException {
//		BorrTelephoneInfos borrtele = PageFactory.initElements(driver, BorrTelephoneInfos.class);
//		borrtele.borrtelepnoneinfos(data.get("borrtelephonetype"), data.get("OtherDescription"), data.get("borrnumber"),
//				data.get("borrextention"), data.get("Action"));
//	}
//
//	@Test(priority = 9)
//	public void CoTeleAddButton() {
//		CoBorrTelephoneInfos AddButton = PageFactory.initElements(driver, CoBorrTelephoneInfos.class);
//		AddButton.CoBorrADD_Button();
//	}
//
//	@Test(priority = 10, dataProviderClass = utils.HashTable.class, dataProvider = "getdata")
//	public void CoBorrower_Telephone(Hashtable<String, String> data) throws InterruptedException {
//		CoBorrTelephoneInfos coborrtele = PageFactory.initElements(driver, CoBorrTelephoneInfos.class);
//		coborrtele.coborrtelepnone(data.get("coborrtelephonetype"), data.get("CoBorrOtherDescription"),
//				data.get("coborrnumber"), data.get("coborrextention"), data.get("Action"));
//	}
//
//	@Test(priority = 11, groups = { "Borrower" })
//	public void BoAddressAddButton() {
//		BorrAddressPage AddButton = PageFactory.initElements(driver, BorrAddressPage.class);
//		AddButton.Add_Button();
//	}
//
//	@Test(priority = 12, dataProviderClass = utils.HashTable.class, dataProvider = "getdata", groups = { "Borrower" })
//	public void borrower_Address(Hashtable<String, String> data) throws InterruptedException {
//		BorrAddressPage borraddress = PageFactory.initElements(driver, BorrAddressPage.class);
//		borraddress.borr_adrees(data.get("Type"), data.get("Occupancy"), data.get("Monthly Rent"),
//				data.get("Length of Residency Year"), data.get("Length of Residency Months"), data.get("Address"),
//				data.get("Unit Designator"), data.get("Number"), data.get("City"), data.get("State/Province"),
//				data.get("Postal Code"), data.get("Four Zip"), data.get("County"), data.get("Country"),
//				data.get("Action"));
//
//	}
//
//	@Test(priority = 13)
//	public void CoAddressAddButton() {
//		CoBorrAddressPage AddButton = PageFactory.initElements(driver, CoBorrAddressPage.class);
//		AddButton.Add_Button();
//	}
//
//	@Test(priority = 14, dataProviderClass = utils.HashTable.class, dataProvider = "getdata")
//	public void Coborrower_Address(Hashtable<String, String> data) throws InterruptedException {
//		CoBorrAddressPage coborraddress = PageFactory.initElements(driver, CoBorrAddressPage.class);
//		coborraddress.Coborr_addrees(data.get("Type"), data.get("Occupancy"), data.get("Monthly Rent"),
//				data.get("Length of Residency Year"), data.get("Length of Residency Months"), data.get("Address"),
//				data.get("Unit Designator"), data.get("Number"), data.get("City"), data.get("State/Province"),
//				data.get("Postal Code"), data.get("Four Zip"), data.get("County"), data.get("Country"),
//				data.get("Action"));
//
//	}
//
//	@Test(priority = 15, groups = { "Borrower" })
//	public void BorrEmployementAddButton() {
//		BorrEmployment AddButton = PageFactory.initElements(driver, BorrEmployment.class);
//		AddButton.ADD_Button();
//	}
//
//	@Test(priority = 16, dataProviderClass = utils.HashTable.class, dataProvider = "getdata", groups = { "Borrower" })
//	public void Borr_Employment(Hashtable<String, String> data) throws InterruptedException {
//		BorrEmployment borrEmpl = PageFactory.initElements(driver, BorrEmployment.class);
//		borrEmpl.employement(data.get("Employer"), data.get("Address"), data.get("Unit Designator"), data.get("Number"),
//				data.get("City"), data.get("State/Province"), data.get("Postal Code"), data.get("FourZip"),
//				data.get("Country"), data.get("Telephone Number"), data.get("Extension"), data.get("CheckBox"),
//				data.get("Employment Status"), data.get("Employment Classification"), data.get("Position"),
//				data.get("Start Date"), data.get("End Date"), data.get("Length of EmploymentYear"),
//				data.get("Length of EmploymentMonths"), data.get("Years in OccupationYears"),
//				data.get("Years in OccupationMonths"), data.get("Foreign Income"), data.get("Seasonal Income"),
//				data.get("Business Owner/ Self-employed"), data.get("Ownership Interest"), data.get("Monthly Income"),
//				data.get("Action"));
//
//	}
//
//	@Test(priority = 17)
//	public void CoBorrEmployementAddButton() {
//		CoBorrEmployment AddButton = PageFactory.initElements(driver, CoBorrEmployment.class);
//		AddButton.ADD_Button();
//	}
//
//	@Test(priority = 18, dataProviderClass = utils.HashTable.class, dataProvider = "getdata")
//	public void CoBorr_Employment(Hashtable<String, String> data) throws InterruptedException {
//		CoBorrEmployment CoborrEmpl = PageFactory.initElements(driver, CoBorrEmployment.class);
//		CoborrEmpl.employement(data.get("Employer"), data.get("Address"), data.get("Unit Designator"),
//				data.get("Number"), data.get("City"), data.get("State/Province"), data.get("Postal Code"),
//				data.get("FourZip"), data.get("Country"), data.get("Telephone Number"), data.get("Extension"),
//				data.get("CheckBox"), data.get("Employment Status"), data.get("Employment Classification"),
//				data.get("Position"), data.get("Start Date"), data.get("End Date"),
//				data.get("Length of EmploymentYear"), data.get("Length of EmploymentMonths"),
//				data.get("Years in OccupationYears"), data.get("Years in OccupationMonths"), data.get("Foreign Income"),
//				data.get("Seasonal Income"), data.get("Business Owner/ Self-employed"), data.get("Ownership Interest"),
//				data.get("Monthly Income"), data.get("Action"));
//
//	}
//
//	@Test(priority = 19, groups = { "Borrower" })
//	public void BorrIncomeAddButton() {
//		BorrIncome AddButton = PageFactory.initElements(driver, BorrIncome.class);
//		AddButton.ADD_Button();
//	}
//
//	@Test(priority = 20, dataProviderClass = utils.HashTable.class, dataProvider = "getdata", groups = { "Borrower" })
//	public void Borr_Addincome(Hashtable<String, String> data) throws InterruptedException {
//		BorrIncome selecIncome = PageFactory.initElements(driver, BorrIncome.class);
//		selecIncome.income1(data.get("Section"), data.get("Source"), data.get("Other Description"), data.get("Amount"),
//				data.get("Action"));
//
//	}
//
//	@Test(priority = 21)
//	public void CoBorrIncomeAddButton() {
//		CoBorrIncome AddButton = PageFactory.initElements(driver, CoBorrIncome.class);
//		AddButton.ADD_Button();
//	}
//
//	@Test(priority = 22, dataProviderClass = utils.HashTable.class, dataProvider = "getdata")
//	public void CoBorr_Addincome(Hashtable<String, String> data) throws InterruptedException {
//		CoBorrIncome selecIncome = PageFactory.initElements(driver, CoBorrIncome.class);
//		selecIncome.income1(data.get("Section"), data.get("Source"), data.get("Other Description"), data.get("Amount"),
//				data.get("Action"));
//
//	}
//
//	@Test(priority = 23, dataProviderClass = utils.HashTable.class, dataProvider = "getdata", groups = { "Borrower" })
//	public void add_assets(Hashtable<String, String> data) throws InterruptedException {
//		Assets AddAsset = PageFactory.initElements(driver, Assets.class);
//
//		AddAsset.add_assets(data.get("Name"), data.get("Address"), data.get("Unit Designator"), data.get("Number"),
//				data.get("City"), data.get("State/Province"), data.get("Postal Code"), data.get("FourZip"));
//	}
//
//	@Test(priority = 24, groups = { "Borrower" })
//	public void AccountAddButton() {
//		Assets AddAsset = PageFactory.initElements(driver, Assets.class);
//		AddAsset.AddButton();
//	}
//
//	@Test(priority = 25, dataProviderClass = utils.HashTable.class, dataProvider = "getdata", groups = { "Borrower" })
//	public void Account(Hashtable<String, String> data) throws InterruptedException {
//		Assets AddAsset = PageFactory.initElements(driver, Assets.class);
//
//		AddAsset.account(data.get("Type"), data.get("Other Description"), data.get("Owner"), data.get("Account Number"),
//				data.get("Cash/Market Value"), data.get("Life Insurance Face Value"), data.get("Shares"),
//				data.get("Vehicle Make"), data.get("Vehicle Year"), data.get("Liquid Assets"), data.get("Action"));
//	}
//
//	@Test(priority = 26, groups = { "Borrower" })
//	public void GiftAddButton() throws Exception {
//		GiftsOrGrants received = PageFactory.initElements(driver, GiftsOrGrants.class);
//		received.AddButton();
//
//	}
//
//	@Test(priority = 27, dataProviderClass = utils.HashTable.class, dataProvider = "getdata", groups = { "Borrower" })
//	public void Gifts_or_Grants_Received(Hashtable<String, String> data) throws InterruptedException {
//		GiftsOrGrants received = PageFactory.initElements(driver, GiftsOrGrants.class);
//		received.gifts1(data.get("Type1"), data.get("Deposited1"), data.get("Account Number1"),
//				data.get("Source of Funds1"), data.get("Other Description1"), data.get("Cash/Market Value1"),
//				data.get("Action1"));
//
//	}
//
//	@Test(priority = 28, groups = { "Borrower" })
//	public void LiabilityAddButton() throws InterruptedException {
//		Liabilities ADD = PageFactory.initElements(driver, Liabilities.class);
//		ADD.ADD_Button();
//
//	}
//
//	@Test(priority = 29, dataProviderClass = utils.HashTable.class, dataProvider = "getdata", groups = { "Borrower" })
//	public void Liabilities(Hashtable<String, String> data) throws InterruptedException {
//
//		Liabilities infos = PageFactory.initElements(driver, Liabilities.class);
//		infos.liability(data.get("Company Name"), data.get("Address"), data.get("Unit Designator"), data.get("Number"),
//				data.get("City"), data.get("State/Province"), data.get("Postal Code"), data.get("FourZipCode"),
//				data.get("Credit Account Type"), data.get("Liability Type"), data.get("Other Description"),
//				data.get("Account Number"), data.get("(FHA) Original Debt Amount"), data.get("(FHA) AutomobileMake"),
//				data.get("(FHA) AutomobileYear"), data.get("BalanceCurrent"), data.get("Monthly PaymentCurrent"),
//				data.get("Payments RemainingCurrent"), data.get("Paid Off"), data.get("Paid off at closing"),
//				data.get("Paid off before closing"), data.get("Resubordinated"), data.get("Omitted"),
//				data.get("Mortgage Type"), data.get("Credit Limit"), data.get("Payment Includes Ins/Tax"),
//				data.get("Property Assessed Clean Energy"), data.get("Action"));
//		Thread.sleep(3000);
//
//	}
//
//	@Test(priority = 30, groups = { "Borrower" })
//	public void AddButton() throws InterruptedException {
//		OtherExpenses expence = PageFactory.initElements(driver, OtherExpenses.class);
//		expence.AddButton();
//
//	}
//
//	@Test(priority = 31, dataProviderClass = utils.HashTable.class, dataProvider = "getdata", alwaysRun = true, groups = {
//			"Borrower", "CoBorrower" })
//	public void AlimonyExpences(Hashtable<String, String> data) throws InterruptedException {
//		OtherExpenses expence = PageFactory.initElements(driver, OtherExpenses.class);
//		expence.add_expense(data.get("Type"), data.get("Other Description"), data.get("Owed To"),
//				data.get("Description"), data.get("Payments Remaining"), data.get("Monthly Payment"),
//				data.get("Action"));
//
//	}
//
//	@Test(priority = 32, groups = { "Borrower" })
//	public void realstateAddButton() throws InterruptedException {
//		RealEstate real = PageFactory.initElements(driver, RealEstate.class);
//		real.AddButton();
//
//	}
//
//	@Test(priority = 33, dataProviderClass = utils.HashTable.class, dataProvider = "getdata", groups = { "Borrower" })
//	public void realEstate(Hashtable<String, String> data) throws InterruptedException {
//
//		RealEstate real = PageFactory.initElements(driver, RealEstate.class);
//		real.realstateinfos(data.get("Subject Property"), data.get("Address"), data.get("Unit Designator"),
//				data.get("Number"), data.get("City"), data.get("State/Province"), data.get("Postal Code"),
//				data.get("FourZip"), data.get("Country"), data.get("Number of Units"), data.get("Property Type"),
//				data.get("Status"), data.get("Intended Occupancy"), data.get("Current Occupancy"),
//				data.get("Market Value"), data.get("Gross Rent"), data.get("Ins/Tax/Misc"),
//				data.get("Omitted Ins/Tax/Misc"), data.get("Occupancy Rate"), data.get("Net Rent"), data.get("Select"),
//				data.get("Action"));
//
//	}
//
//	@Test(priority = 34, groups = { "Borrower" })
//	public void Primary_HousingAddButton() throws InterruptedException {
//		PrimaryHousing ADD = PageFactory.initElements(driver, PrimaryHousing.class);
//		ADD.AddButton();
//
//	}
//
//	@Test(priority = 35, dataProviderClass = utils.HashTable.class, dataProvider = "getdata", groups = { "Borrower" })
//	public void Primary_Housing(Hashtable<String, String> data) throws InterruptedException {
//
//		PrimaryHousing ADD = PageFactory.initElements(driver, PrimaryHousing.class);
//		ADD.Add_Primary_Housing(data.get("Type"), data.get("Other Description"), data.get("Amount"),
//				data.get("Action"));
//	}
//
//	@Test(priority = 36, dataProviderClass = utils.HashTable.class, dataProvider = "getdata", groups = { "Borrower" })
//	public void AddTitle(Hashtable<String, String> data) throws InterruptedException {
//
//		Title title = PageFactory.initElements(driver, Title.class);
//		title.AddTitle(data.get("Title will be held as"), data.get("Other Description"));
//	}
//
//	@Test(priority = 37, dataProviderClass = utils.HashTable.class, dataProvider = "getdata", groups = { "Borrower" })
//	public void Borrower_Declarations(Hashtable<String, String> data) throws InterruptedException {
//
//		BorrowerDeclarations declare = PageFactory.initElements(driver, BorrowerDeclarations.class);
//		declare.borrower_declarations1(data.get("Question1"), data.get("NewAppQuestion1"), data.get("Question2"),
//				data.get("Question3"), data.get("Question4"), data.get("Question5"), data.get("NewAppQuestion2"),
//				data.get("NewAppExplication2"));
//
//		declare.borrower_declarations2(data.get("Question6"), data.get("Explication6"), data.get("Amount"),
//				data.get("NewAppQuestion3"), data.get("NewAppExplication3"), data.get("NewAppQuestion4"),
//				data.get("NewAppExplication4"), data.get("NewAppQuestion5"), data.get("NewAppExplication5"),
//				data.get("NewAppQuestion6"), data.get("NewAppExplication6"), data.get("Question7"),
//				data.get("Explication7"), data.get("Question8"), data.get("Explication8"), data.get("Question9"),
//				data.get("Explication9"), data.get("Question10"), data.get("Explication10"), data.get("Question11"),
//				data.get("Explication11"), data.get("NewAppQuestion8"), data.get("NewAppExplication8"),
//				data.get("NewAppQuestion9"), data.get("NewAppExplication9"), data.get("Question12"),
//				data.get("Explication12"), data.get("Question13"), data.get("Explication13"), data.get("Question14"),
//				data.get("Explication14"), data.get("Bankruptcy"));
//
//	}
//
//	@Test(priority = 38, dataProviderClass = utils.HashTable.class, dataProvider = "getdata")
//	public void CoBorrower_Declarations(Hashtable<String, String> data) throws InterruptedException {
//
//		CoBorrowerDeclarations declare = PageFactory.initElements(driver, CoBorrowerDeclarations.class);
//		declare.Co_borrower_declarations1(data.get("Question1"), data.get("NewAppQuestion1"), data.get("Question2"),
//				data.get("Question3"), data.get("Question4"), data.get("Question5"), data.get("NewAppQuestion2"),
//				data.get("NewAppExplication2"));
//		declare.Co_borrower_declarations2(data.get("Question6"), data.get("Explication6"), data.get("Amount"),
//				data.get("NewAppQuestion3"), data.get("NewAppExplication3"), data.get("NewAppQuestion4"),
//				data.get("NewAppExplication4"), data.get("NewAppQuestion5"), data.get("NewAppExplication5"),
//				data.get("NewAppQuestion6"), data.get("NewAppExplication6"), data.get("Question7"),
//				data.get("Explication7"), data.get("Question8"), data.get("Explication8"), data.get("Question9"),
//				data.get("Explication9"), data.get("Question10"), data.get("Explication10"), data.get("Question11"),
//				data.get("Explication11"), data.get("NewAppQuestion8"), data.get("NewAppExplication8"),
//				data.get("NewAppQuestion9"), data.get("NewAppExplication9"), data.get("Question12"),
//				data.get("Explication12"), data.get("Question13"), data.get("Explication13"), data.get("Question14"),
//				data.get("Explication14"), data.get("Bankruptcy"));
//
//	}
//
//	@Test(priority = 39, dataProviderClass = utils.HashTable.class, dataProvider = "getdata", groups = { "Borrower" })
//	public void Borrower_military_Status(Hashtable<String, String> data) throws InterruptedException {
//
//		BorrMilitaryStatus status = PageFactory.initElements(driver, BorrMilitaryStatus.class);
//		status.MilitaryServiceStatus(data.get("Question1"), data.get("select"), data.get("Currently serving_checkBox"),
//				data.get("Currently retired CheckBox"), data.get("Only period of service CheckBox"),
//				data.get("Surviving spouse CheckBox"), data.get("Date"));
//
//	}
//
//	@Test(priority = 40, dataProviderClass = utils.HashTable.class, dataProvider = "getdata")
//	public void CoBorrower_military_Status(Hashtable<String, String> data) throws InterruptedException {
//
//		CoBorrowerMilitaryService status = PageFactory.initElements(driver, CoBorrowerMilitaryService.class);
//		status.MilitaryServiceStatus(data.get("Question1"), data.get("select"), data.get("Currently serving_checkBox"),
//				data.get("Currently retired CheckBox"), data.get("Only period of service CheckBox"),
//				data.get("Surviving spouse CheckBox"), data.get("Date"));
//
//	}
//
//	@Test(priority = 41, dataProviderClass = utils.HashTable.class, dataProvider = "getdata", groups = { "Borrower" })
//	public void Borrower_Ethnicity(Hashtable<String, String> data) throws Exception {
//
//		BorrowerEthnicity ethnicity = PageFactory.initElements(driver, BorrowerEthnicity.class);
//		ethnicity.Ethnicity(data.get("Borrower does not wish to furnish this information"),
//				data.get("Visual Observation"), data.get("Ethnicity"), data.get("Designation"),
//				data.get("Other Description"));
//
//	}
//
//	@Test(priority = 42, dataProviderClass = utils.HashTable.class, dataProvider = "getdata")
//	public void CoBorrower_Ethnicity(Hashtable<String, String> data) throws Exception {
//
//		CoBorrowerEthnicity ethnicity = PageFactory.initElements(driver, CoBorrowerEthnicity.class);
//		ethnicity.Ethnicity(data.get("Borrower does not wish to furnish this information"),
//				data.get("Visual Observation"), data.get("Ethnicity"), data.get("Designation"),
//				data.get("Other Description"));
//
//	}
//
//	@Test(priority = 43, dataProviderClass = utils.HashTable.class, dataProvider = "getdata", groups = { "Borrower" })
//	public void Borrower_Gender(Hashtable<String, String> data) throws Exception {
//
//		BorrowerGender gender = PageFactory.initElements(driver, BorrowerGender.class);
//		gender.Borr_Sex(data.get("Borrower does not wish to furnish this information"), data.get("Sex"),
//				data.get("Visual Observation"));
//
//	}
//
//	@Test(priority = 44, dataProviderClass = utils.HashTable.class, dataProvider = "getdata")
//	public void CoBorrower_Gender(Hashtable<String, String> data) throws Exception {
//
//		CoBorrowerGender gender = PageFactory.initElements(driver, CoBorrowerGender.class);
//		gender.Borr_Sex(data.get("Borrower does not wish to furnish this information"), data.get("Sex"),
//				data.get("Visual Observation"));
//
//	}
//
//	@Test(priority = 45, dataProviderClass = utils.HashTable.class, dataProvider = "getdata", groups = { "Borrower" })
//	public void Borrower_Race(Hashtable<String, String> data) throws Exception {
//
//		BorrowerRace RACE = PageFactory.initElements(driver, BorrowerRace.class);
//		RACE.Race(data.get("Borrower does not wish to furnish this information"), data.get("Visual Observation"),
//				data.get("Race"), data.get("Designation"), data.get("Other Description"));
//
//	}
//
//	@Test(priority = 46, dataProviderClass = utils.HashTable.class, dataProvider = "getdata")
//	public void cOBorrower_Race(Hashtable<String, String> data) throws Exception {
//
//		CoBorrowerRace RACE = PageFactory.initElements(driver, CoBorrowerRace.class);
//		RACE.Race(data.get("Borrower does not wish to furnish this information"), data.get("Visual Observation"),
//				data.get("Race"), data.get("Designation"), data.get("Other Description"));
//
//	}
//
//	@Test(priority = 47, groups = { "Borrower" })
//	public void BorrowerIdentifyingDocumentationAddButton() throws InterruptedException {
//		BorrowerIdentifyingDocumentation Add = PageFactory.initElements(driver, BorrowerIdentifyingDocumentation.class);
//		Add.ADD_Button();
//
//	}
//
//	@Test(priority = 48, dataProviderClass = utils.HashTable.class, dataProvider = "getdata", groups = { "Borrower" })
//	public void BorrowerIdentifying_Documentation(Hashtable<String, String> data) throws Exception {
//
//		BorrowerIdentifyingDocumentation document = PageFactory.initElements(driver,
//				BorrowerIdentifyingDocumentation.class);
//		document.Add_Identifying_Documentation(data.get("Type"), data.get("Other Description1"), data.get("Agency"),
//				data.get("Document Number"), data.get("Issued"), data.get("Expires"), data.get("Governing Entity"),
//				data.get("Other Description2"), data.get("State/Province"), data.get("Country"),
//				data.get("Discrepancy and Resolution"), data.get("Action"));
//
//	}
//
//	@Test(priority = 49)
//	public void CoBorrowerIdentifyingDocumentationAddButton() throws InterruptedException {
//		CoBorrowerIdentifyingDocumentation Add = PageFactory.initElements(driver,
//				CoBorrowerIdentifyingDocumentation.class);
//		Add.ADD_Button();
//
//	}
//
//	@Test(priority = 50, dataProviderClass = utils.HashTable.class, dataProvider = "getdata")
//	public void CoBorrowerIdentifying_Documentation(Hashtable<String, String> data ) throws Exception {
//
//		CoBorrowerIdentifyingDocumentation document = PageFactory.initElements(driver,
//				CoBorrowerIdentifyingDocumentation.class);
//		document.Add_Identifying_Documentation(data.get("Type"), data.get("Other Description1"), data.get("Agency"),
//				data.get("Document Number"), data.get("Issued"), data.get("Expires"), data.get("Governing Entity"),
//				data.get("Other Description2"), data.get("State/Province"), data.get("Country"),
//				data.get("Discrepancy and Resolution"), data.get("Action"));
//
//	}
//
//	@Test(priority = 51, dataProviderClass = utils.HashTable.class, dataProvider = "getdata", groups = { "Borrower" })
//	public void AdditionalInformation(Hashtable<String, String> data) throws Exception {
//		Additional_Information Infos = PageFactory.initElements(driver, Additional_Information.class);
//		Infos.AdditionalInfos(data.get("Borrower"), data.get("CoBorrower"));
//
//	}

	@Test(priority = 52, groups = { "Borrower" })
	public void SAVE() {
		BorrowerInfos Borinfos = PageFactory.initElements(driver, BorrowerInfos.class);
		Borinfos.Save_Infos();
	}
}
