///**
// * 
// */
//package test;
//
//import java.util.Hashtable;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.How;
//import org.openqa.selenium.support.PageFactory;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Listeners;
//import org.testng.annotations.Test;
//
//import BorrInfospage.Additional_Information;
//import BorrInfospage.Assets;
//import BorrInfospage.BorrAddressPage;
//import BorrInfospage.BorrEmployment;
//import BorrInfospage.BorrIncome;
//import BorrInfospage.BorrMilitaryStatus;
//import BorrInfospage.BorrTelephoneInfos;
//import BorrInfospage.BorrowerInfos;
//import BorrInfospage.BorrowerRace;
//import BorrInfospage.CoBorrAddressPage;
//import BorrInfospage.CoBorrEmployment;
//import BorrInfospage.CoBorrIncome;
//import BorrInfospage.CoBorrTelephoneInfos;
//import BorrInfospage.CoBorrowerDeclarations;
//import BorrInfospage.CoBorrowerEthnicity;
//import BorrInfospage.CoBorrowerGender;
//import BorrInfospage.CoBorrowerIdentifyingDocumentation;
//import BorrInfospage.CoBorrowerInfos;
//import BorrInfospage.CoBorrowerMilitaryService;
//import BorrInfospage.CoBorrowerRace;
//import BorrInfospage.BorrowerDeclarations;
//import BorrInfospage.BorrowerEthnicity;
//import BorrInfospage.BorrowerGender;
//import BorrInfospage.BorrowerIdentifyingDocumentation;
//import BorrInfospage.GiftsOrGrants;
//import BorrInfospage.Liabilities;
//import BorrInfospage.LoginPage;
//import BorrInfospage.NewLoan;
//import BorrInfospage.OtherExpenses;
//import BorrInfospage.PrimaryHousing;
//import BorrInfospage.RealEstate;
//import BorrInfospage.Title;
//import BorrInfospage.TopSection;
//import BorrInfospage.UnmarriedAddendum;
//import LoanInfos.BuydownMortgage;
//import LoanInfos.ExtraPayment;
//import LoanInfos.If_Construction_Loan;
//import LoanInfos.LoanFeatures;
//import LoanInfos.LoanInformation;
//import LoanInfos.LoanPage;
//import LoanInfos.NoteDetails;
//import LoanInfos.PMI_MIP_VA_USDA;
//import LoanInfos.PaymentAdjustment;
//import LoanInfos.RateAdjustment;
//import LoanInfos.Ratios_Results;
//import LoanInfos.RentalIncomeonSubjectProperty;
//import SubjectProperty.EnergyImprovements;
//import SubjectProperty.IfRefinanceLoan;
//import SubjectProperty.NamescurrentlyheldonTitle;
//import SubjectProperty.NamesonTitle;
//import SubjectProperty.ProposedHousingExpenses;
//import SubjectProperty.SubjectPropertyIf_Construction_Loan;
//import SubjectProperty.SubjectPropertytitle;
//import SubjectProperty.SubordinateFinancing;
//import SubjectProperty.TopSectionInfos;
//import listeners.ExtentListeners;
//import utils.Base;
//import utils.BrowserFactory;
//import utils.ScreenShot;
//
///*
// * List<WebElement> e = select.getOptions(); int itemCount = e.size();
// * 
// * for (int l = 0; l < itemCount; l++) { System.out.println(e.get(l).getText());
// * }
// */
//
///**
// * @author Owner public static void main(String[] args) {
// * 
// * <dependency>
//            <groupId>org.uncommons</groupId>
//            <artifactId>reportng</artifactId>
//            <version>1.1.4</version>
//        </dependency>
// * 
// * 
// *         WebElement drpdwn =
// *         driver.findElement(By.xpath("//select[@name=’selType’]")); // capture
// *         screenshot with getScreenshotAs() of the dropdown File f =
// *         drpdwn.getScreenshotAs(OutputType.FILE); FileUtils.copyFile(f, new
// *         File(“screenshots.png”));
// * 
// *         }
// */
//@Listeners(ExtentListeners.class)
//public class LoginTest extends Base {
//	Hashtable<String, String> data ;
//	 WebDriver driver;
//
//	 
//	@BeforeClass(groups = { "Borrower" })
//	public void open() throws InterruptedException {
//		driver = BrowserFactory.WebDriverManagerTest();
//		Thread.sleep(3000);
//	}
//
//	@Test(priority = 1, groups = { "Borrower" })
//	public  void Zenly() throws InterruptedException {
//
//		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
//		loginPage.login(config.getProperty("username"), config.getProperty("password"));
//
//	}
//
//	@Test(priority = 2, groups = { "Borrower" })
//	public void newloan() throws Exception {
////		int a = 0;
////		for(int i =0 ; i<=50 ; i++) {
////	    	driver.findElement(By.xpath("//*[@id='root']/div/div/div/div[3]/div/table/tbody/tr[1]/td[6]/a/i")).click();
////	    	driver.findElement(By.xpath("//*[text() = 'OK']")).click();
////	    	Thread.sleep(3000);
////	    	System.out.println(a++);
////	    }
//		NewLoan newloan = PageFactory.initElements(driver, NewLoan.class);
//		newloan.AddNewLoan();
//		Thread.sleep(5000);
//		newloan.application();
//
//	}
//
//	@Test(priority = 3, dataProviderClass = utils.HashTable.class, dataProvider = "getdata", groups = { "Borrower" })
//	public void tope_sectioninfos(Hashtable<String, String> data) throws InterruptedException {
//		TopSection topinfos = PageFactory.initElements(driver, TopSection.class);
//		topinfos.topsection(data.get("Select Form"), data.get("Loan Originator Signature"), data.get("Occupancy"),
//				data.get("FHA Secondary Residence"), data.get("Statement/Schedule Completed"),
//				data.get("person CheckBox"), data.get(" Borrower's CheckBox"));
//
//		Thread.sleep(3000);
//
//	}
//
//	@Test(priority = 4, dataProviderClass = utils.HashTable.class, dataProvider = "getdata", groups = { "Borrower" })
//	public void Borrower(Hashtable<String, String> data) throws InterruptedException {
//		BorrowerInfos Borinfos = PageFactory.initElements(driver, BorrowerInfos.class);
//		Borinfos.BorInfos(data.get("First"), data.get("Middle"), data.get("Last"), data.get("Suffix"),
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
//	public void GiftAddButton() throws InterruptedException {
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
//	public void CoBorrowerIdentifying_Documentation(Hashtable<String, String> data) throws Exception {
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
//
//	@Test(priority = 52, groups = { "Borrower" })
//	public void SAVE() {
//		BorrowerInfos Borinfos = PageFactory.initElements(driver, BorrowerInfos.class);
//		Borinfos.Save_Infos();
//	}
//
//	@Test(priority = 53)
//	public void Loanpage() throws InterruptedException {
//		LoanPage loan = PageFactory.initElements(driver, LoanPage.class);
//		loan.LoanPAge();
//		
//	}
//	
//	@Test(priority = 54, dataProviderClass = utils.HashTable.class, dataProvider = "getdata", groups = { "Borrower" })
//	public void LoanTopSection(Hashtable<String, String> data) throws InterruptedException {
//		LoanPage Top = PageFactory.initElements(driver, LoanPage.class);
//
//		Top.TopSection(data.get("Application Date"), data.get("Legal Entity ID"), data.get("Lender Case Number"),
//				data.get("Loan Program Scenario"), data.get("Select"), data.get("Agency Case Number"));
//
////		BorrowerInfos Borinfos = PageFactory.initElements(driver, BorrowerInfos.class);
////		Borinfos.Save_Infos();
////		ScreeShot capture = PageFactory.initElements(driver, ScreeShot.class);
//		// ScreeShot.screenShot(driver,
//		// "C:/Users/hassane_djoudi/eclipse-workspace/zenly/ScreenShot/" +"hassane" +
//		// ".png");
//	}
//
//	@Test(priority = 55, dataProviderClass = utils.HashTable.class, dataProvider = "getdata", groups = { "Borrower" })
//	public void Loan_Information(Hashtable<String, String> data) throws Exception {
//		LoanInformation loaninfos = PageFactory.initElements(driver, LoanInformation.class);
//
//		loaninfos.Laon_Information(data.get("Loan Type"), data.get("Other Description1"), data.get("Loan Purpose"),
//				data.get("Loan Program Scenario"), data.get("Other Description2"), data.get("Construction Type"),
//				data.get("Cash-Out Type"), data.get("Occupancy"), data.get("FHA Secondary Residence"),
//				data.get("Lien Position"), data.get("Simultaneous Financing"), data.get("Amortization Type"),
//				data.get("Other Description3"), data.get("Conversion of Contract for Deed or Land"),
//				data.get("Renovation"), data.get("Prepayment Penalty"), data.get("HELOC"));
//
////		BorrowerInfos Borinfos = PageFactory.initElements(driver, BorrowerInfos.class);
////		Borinfos.Save_Infos();
////		ScreeShot capture = PageFactory.initElements(driver, ScreeShot.class);
//		// ScreeShot.screenShot(driver,
//		// "C:/Users/hassane_djoudi/eclipse-workspace/zenly/ScreenShot/" +"hassane" +
//		// ".png");
//	}
//
//	@Test(priority = 56, dataProviderClass = utils.HashTable.class, dataProvider = "getdata", groups = { "Borrower" })
//	public void Note_Details(Hashtable<String, String> data) throws Exception {
//		NoteDetails Note = PageFactory.initElements(driver, NoteDetails.class);
//		Note.Details(data.get("Estimated Appraised Value"), data.get("Initial Requested Loan Amount"),
//				data.get("Note Rate"), data.get("Qual Rate"), data.get("Amortization Term"), data.get("Loan Term"),
//				data.get("Appraised_Value"), data.get("Sales Price"), data.get("Base Loan Amount"),
//				data.get("CALCULATE"), data.get("DOWN_PAYMENT"), data.get("Down Payment Amount"));
//
//	}
//
//	@Test(priority = 57, dataProviderClass = utils.HashTable.class, dataProvider = "getdata", groups = { "Borrower" })
//	public void Rental_Income_on_Subject_Property(Hashtable<String, String> data) throws Exception {
//		RentalIncomeonSubjectProperty Income = PageFactory.initElements(driver, RentalIncomeonSubjectProperty.class);
//		Income.RentalIncome(data.get("Gross Rent"), data.get("Occupancy Rate"), data.get("Calculate"),
//				data.get("Net Rent"));
//
//	}
//
//	@Test(priority = 58, dataProviderClass = utils.HashTable.class, dataProvider = "getdata", groups = { "Borrower" })
//	public void IfConstructionLoan(Hashtable<String, String> data) throws Exception {
//		If_Construction_Loan construction = PageFactory.initElements(driver, If_Construction_Loan.class);
//		construction.Construction(data.get("Original Cost"), data.get("Lot Value (a)"), data.get("Improvements (b)"),
//				data.get("Include MI During Construction Period"),
//				data.get("Include Escrow During Construction Period"), data.get("Calendar"), data.get("From"),
//				data.get("To"), data.get("Period: Months"), data.get("Interest Rate"), data.get("Required Reserve"),
//				data.get("Closing Type"));
//
//	}
//
//	@Test(priority = 59, dataProviderClass = utils.HashTable.class, dataProvider = "getdata", groups = { "Borrower" })
//	public void PMIMIPVAUSDA(Hashtable<String, String> data) throws Exception {
//		PMI_MIP_VA_USDA PMI = PageFactory.initElements(driver, PMI_MIP_VA_USDA.class);
//		PMI.PMIUSDA(data.get("PMI/MIP/VA/USDA"), data.get("Additional Amount Paid in Cash"),
//				data.get("Rate Percentage PMI/MIP/VA/USDA"), data.get("Rate Percentage PMI Renewal 1"),
//				data.get("Rate Percentage PMI Renewal 2"), data.get("Monthly Dollar Amount PMI/MIP/VA/USDA"),
//				data.get("Monthly Dollar Amount PMI Renewal 1"), data.get("Monthly Dollar Amount PMI Renewal 2"),
//				data.get("Monthls PMI/MIP/VA/USDA"), data.get("Monthls  PMI Renewal 1"),
//				data.get("Monthls  PMI Renewal 2"), data.get("Calculation Based on"), data.get("Cancel at"),
//				data.get("Calculate based on remaining balance"), data.get("Midpoint Payment cancellation"));
//
//	}
//
//	@Test(priority = 60, dataProviderClass = utils.HashTable.class, dataProvider = "getdata", groups = { "Borrower" })
//	public void Rate_Adjustment(Hashtable<String, String> data) throws Exception {
//		RateAdjustment Rate = PageFactory.initElements(driver, RateAdjustment.class);
//		Rate.Rate(data.get("1st Change Adj Cap"), data.get("1st Change Months"), data.get("Adj Period Adj Cap"),
//				data.get("Adj Period Months"), data.get("Life Cap"), data.get("Margin"), data.get("Index"),
//				data.get("Alt. Index"), data.get("Floor"), data.get("Index Type"), data.get("Other Description"),
//				data.get("Rate"), data.get("Rate Round To"));
//
//	}
//
//	@Test(priority = 60, dataProviderClass = utils.HashTable.class, dataProvider = "getdata", groups = { "Borrower" })
//	public void Payment_Adjustment(Hashtable<String, String> data) throws Exception {
//		PaymentAdjustment Payment = PageFactory.initElements(driver, PaymentAdjustment.class);
//		Payment.Payments(data.get("Interest-Only"), data.get("Calculate Qual Ratios at the Interest-Only Payment"),
//				data.get("Bi-Weekly Payment Schedule"), data.get("Initial Payment Rate"), data.get("Percent"),
//				data.get("Initial Payment Rate Period"), data.get("Adj Cap"), data.get("Adj Period"),
//				data.get("Recast Pd/Stop"), data.get("Months"), data.get("Max Balance"),
//				data.get("Calculate Qual Ratios at the Max Adjusted Loan Balance"), data.get("Payment"),
//				data.get("Payment Rounding"), data.get("Years"), data.get("at Rate"), data.get("Simple Interest"),
//				data.get("Down Payment Assistance Program"), data.get("Principal Forgiven"), data.get("every months"));
//
//	}
//
//	@Test(priority = 61, groups = { "Borrower" })
//	public void BuydownAddButton() throws Exception {
//		BuydownMortgage BuyDown = PageFactory.initElements(driver, BuydownMortgage.class);
//		BuyDown.BuyDownButton();
//	}
//
//	@Test(priority = 62, dataProviderClass = utils.HashTable.class, dataProvider = "getdata", groups = { "Borrower" })
//	public void Buydown_Mortgage(Hashtable<String, String> data) throws Exception {
//		BuydownMortgage BuyDown = PageFactory.initElements(driver, BuydownMortgage.class);
//		BuyDown.BuyDown(data.get("Rate"), data.get("Term (months)"), data.get("Action"));
//	}
//
//	@Test(priority = 63, dataProviderClass = utils.HashTable2.class, dataProvider = "getdata", groups = { "Borrower" })
//	public void Extra_Payment(Hashtable<String, String> data) throws Exception {
//		ExtraPayment Extra = PageFactory.initElements(driver, ExtraPayment.class);
//		Extra.Extra(data.get("Extra payment of"), data.get("every payment"));
//
//	}
//
//	@Test(priority = 64, groups = { "Borrower" })
//	public void LoanAddButton() throws Exception {
//		LoanFeatures loan = PageFactory.initElements(driver, LoanFeatures.class);
//		loan.BuyDownButton();
//	}
//
//	@Test(priority = 65, dataProviderClass = utils.HashTable.class, dataProvider = "getdata", groups = { "Borrower" })
//	public void Loan_Features(Hashtable<String, String> data) throws Exception {
//		LoanFeatures loan = PageFactory.initElements(driver, LoanFeatures.class);
//		loan.Loan(data.get("Loan Features"), data.get("Other Description"), data.get("Action"));
//
//	}
//
//	@Test(priority = 66, groups = { "Borrower" })
//	public void LoanSAVE() throws Exception {
//		LoanFeatures loan = PageFactory.initElements(driver, LoanFeatures.class);
//		loan.Close();
//		BorrowerInfos Borinfos = PageFactory.initElements(driver, BorrowerInfos.class);
//		Borinfos.Save_Infos();
//	}
//
//	@Test(priority = 67, dataProviderClass = utils.HashTable.class, dataProvider = "getdata", groups = { "Borrower" })
//	public void top_section_Info_LeftSide(Hashtable<String, String> data) throws Exception {
//		TopSectionInfos Infos = PageFactory.initElements(driver, TopSectionInfos.class);
//		Infos.topsectionInfoLeftSide(data.get("Address"), data.get("Unit Designator"), data.get("Number"),
//				data.get("City"), data.get("State/Province"), data.get("Postal Code"), data.get("FOURZIP"),
//				data.get("County"), data.get("Country"), data.get("Number of Units"), data.get("Year Built"),
//				data.get("Year Acquired"), data.get("Lot Acquired Date"), data.get("Existing Lien"),
//				data.get("State Code"), data.get("County Code"), data.get("MSA/MD Code"), data.get("Census Tract"),
//				data.get("Legal Description"));
//
//	}
//
//	@Test(priority = 68, dataProviderClass = utils.HashTable.class, dataProvider = "getdata", groups = { "Borrower" })
//	public void top_section_Info_RightSide(Hashtable<String, String> data) throws Exception {
//		TopSectionInfos Infos = PageFactory.initElements(driver, TopSectionInfos.class);
//		Infos.topsectionInfoRightSide(data.get("Attachment Type"), data.get("Structure Type"),
//				data.get("Construction Method"), data.get("Other Description1"), data.get("Manufactured Home Width"),
//				data.get("Design Type"), data.get("Other Description2"), data.get("Stories Count"),
//				data.get("Mixed-Use Property"), data.get("Property in Project"), data.get("Community Property State"),
//				data.get("PUD"), data.get("(F) HUD-REO Property"), data.get("Rural"), data.get("Warrantable"),
//				data.get("Property Location"));
//	}
//
//	@Test(priority = 69, dataProviderClass = utils.HashTable.class, dataProvider = "getdata", groups = { "Borrower" })
//	public void Energy_Improvements(Hashtable<String, String> data) throws Exception {
//		EnergyImprovements energy = PageFactory.initElements(driver, EnergyImprovements.class);
//		energy.Energy(data.get("Select"), data.get("Mortgage Loan will finance energy-related improvements"),
//				data.get("Amount"), data.get(
//						"Property is currently subject to a lien that could take priority over the first mortgage lien"));
//	}
//
//	@Test(priority = 70, dataProviderClass = utils.HashTable.class, dataProvider = "getdata", groups = { "Borrower" })
//	public void Title(Hashtable<String, String> data) throws Exception {
//		SubjectPropertytitle infos = PageFactory.initElements(driver, SubjectPropertytitle.class);
//		infos.title(data.get("Title will be held as"), data.get("Other Description"),
//				data.get("Estate will be held in"), data.get("Exp. Date"), data.get("Trust Information"),
//				data.get("Indian Country Land Tenure"), data.get("(VA) Type of Ownership"));
//	}
//
//	@Test(priority = 71, groups = { "Borrower" })
//	public void NameONTitleAddButton() throws Exception {
//		NamesonTitle name = PageFactory.initElements(driver, NamesonTitle.class);
//		name.Add_Button();
//	}
//
//	@Test(priority = 72, dataProviderClass = utils.HashTable.class, dataProvider = "getdata", groups = { "Borrower" })
//	public void Names_on_Title(Hashtable<String, String> data) throws Exception {
//		NamesonTitle names = PageFactory.initElements(driver, NamesonTitle.class);
//		names.name(data.get("First"), data.get("Middle"), data.get("Last"), data.get("Suffix"), data.get("Action"));
//	}
//
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
//
//	@Test(priority = 74, dataProviderClass = utils.HashTable.class, dataProvider = "getdata", groups = { "Borrower" })
//	public void If_Refinance_Loan(Hashtable<String, String> data) throws Exception {
//		IfRefinanceLoan refinance = PageFactory.initElements(driver, IfRefinanceLoan.class);
//		refinance.refinance(data.get("Original Cost"), data.get("Prepay Penalty Amount"), data.get("Cash-Out Type"),
//				data.get("Refinance Purpose Type"), data.get("Other Description1"), data.get("Describe Improvements"),
//				data.get("Made/To Be Made"), data.get("Improvement Cost"), data.get("Refinance Program"),
//				data.get("Other Description2"));
//
//	}
//
//	@Test(priority = 75, groups = { "Borrower" })
//	public void CurrentNameONTitleAddButton() throws Exception {
//		NamescurrentlyheldonTitle ADD = PageFactory.initElements(driver, NamescurrentlyheldonTitle.class);
//		ADD.Add_Button();
//	}
//
//	@Test(priority = 76, dataProviderClass = utils.HashTable.class, dataProvider = "getdata", groups = { "Borrower" })
//	public void Names_Currently_held_on_Title(Hashtable<String, String> data) throws Exception {
//		NamescurrentlyheldonTitle names = PageFactory.initElements(driver, NamescurrentlyheldonTitle.class);
//		names.name(data.get("First"), data.get("Middle"), data.get("Last"), data.get("Suffix"), data.get("Action"));
//	}
//
//	@Test(priority = 77, groups = { "Borrower" })
//	public void ProposedHousingExpensesAddButton() throws Exception {
//		ProposedHousingExpenses ADD = PageFactory.initElements(driver, ProposedHousingExpenses.class);
//		ADD.ADD_Button();
//	}
//
//	@Test(priority = 78, dataProviderClass = utils.HashTable.class, dataProvider = "getdata", groups = { "Borrower" })
//	public void Proposed_Housing_Expenses(Hashtable<String, String> data) throws Exception {
//		ProposedHousingExpenses expenses = PageFactory.initElements(driver, ProposedHousingExpenses.class);
//		expenses.Expenses(data.get("Housing Expense Type"), data.get("Other Description"), data.get("Based On"),
//				data.get("Fee Percentage"), data.get("Monthly Dollar Amount"), data.get("Monthly Amount"),
//				data.get("Action"));
//	}
//
//	@Test(priority = 79, groups = { "Borrower" })
//	public void Subordinate_FinancingAddButton() throws Exception {
//		SubordinateFinancing ADD = PageFactory.initElements(driver, SubordinateFinancing.class);
//		ADD.ADD_Button();
//	}
//
//	@Test(priority = 80, dataProviderClass = utils.HashTable.class, dataProvider = "getdata", groups = { "Borrower" })
//	public void Subordinate_Financing(Hashtable<String, String> data) throws Exception {
//		SubordinateFinancing Subordinate = PageFactory.initElements(driver, SubordinateFinancing.class);
//		Subordinate.Subordinate_Financing(data.get("Loan Position"), data.get("Creditor Name"), data.get("Source/EIN"),
//				data.get("Source Type"), data.get("Other Description"), data.get("First Loan Mortgagee"),
//				data.get("Original Loan Amount"), data.get("Loan Amount"), data.get("Note Rate"), data.get("Qual Rate"),
//				data.get("Amortization Term"), data.get("Loan Term"), data.get("Interest Only"),
//				data.get("Monthly Payment"), data.get("Credit Limit"), data.get("Qualify Ratios CheckBox"),
//				data.get("Action"));
//	}
//
//	
//
//	@Test(priority = 81, groups = { "Borrower" })
//	public void SubjectPropertySAVE() throws Exception {
//		BorrowerInfos Borinfos = PageFactory.initElements(driver, BorrowerInfos.class);
//		Borinfos.Save_Infos();
//	}
//	@Test(priority = 82, dataProviderClass = utils.HashTable.class, dataProvider = "getdata", groups = { "Borrower" })
//	public void Ratios(Hashtable<String, String> data) throws Exception {
//		Ratios_Results ratios = PageFactory.initElements(driver, Ratios_Results.class);
//		ratios.RatiosResults(data.get("Base LTV"), data.get("Base CLTV"), data.get("Base HCLTV"), data.get("Housing Expense"),
//				data.get("Debt-to-Income"), data.get("Total LTV"), data.get("Total CLTV"), data.get("Total HCLTV"), data.get("Debt-To-Housing Gap"));
//	}
//	@AfterClass
//	public void teardown() {
//		// driver.close();
//	}
//
//}
