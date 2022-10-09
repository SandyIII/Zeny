package test;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Base64;
import java.util.Hashtable;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import BorrInfospage.BorrowerInfos;
import BorrInfospage.LoginPage;
import LoanInfos.BuydownMortgage;
import LoanInfos.ExtraPayment;
import LoanInfos.If_Construction_Loan;
import LoanInfos.LoanFeatures;
import LoanInfos.LoanInformation;
import LoanInfos.LoanPage;
import LoanInfos.NoteDetails;
import LoanInfos.PMI_MIP_VA_USDA;
import LoanInfos.PaymentAdjustment;
import LoanInfos.RateAdjustment;
import LoanInfos.Ratios_Results;
import LoanInfos.RentalIncomeonSubjectProperty;
import listeners.ExtentListeners;
import utils.BrowserFactory;
import utils.Constant;

@Listeners(ExtentListeners.class)
public class Loan extends Borrower {
	

	
	@Test(priority = 53)
	public void Loanpage() throws InterruptedException {
		LoanPage loan = PageFactory.initElements(driver, LoanPage.class);
		loan.LoanPAge();
		
	}
	
	@Test(priority = 54, dataProviderClass = utils.HashTable.class, dataProvider = "getdata", groups = { "Borrower" })
	public void LoanTopSection(Hashtable<String, String> data) throws InterruptedException {
		LoanPage Top = PageFactory.initElements(driver, LoanPage.class);

		Top.TopSection(data.get("Application Date"), data.get("Legal Entity ID"), data.get("Lender Case Number"),
				data.get("Loan Program Scenario"), data.get("Select"), data.get("Agency Case Number"));

//		BorrowerInfos Borinfos = PageFactory.initElements(driver, BorrowerInfos.class);
//		Borinfos.Save_Infos();
//		ScreeShot capture = PageFactory.initElements(driver, ScreeShot.class);
		// ScreeShot.screenShot(driver,
		// "C:/Users/hassane_djoudi/eclipse-workspace/zenly/ScreenShot/" +"hassane" +
		// ".png");
	}

	@Test(priority = 55, dataProviderClass = utils.HashTable.class, dataProvider = "getdata", groups = { "Borrower" })
	public void Loan_Information(Hashtable<String, String> data) throws Exception {
		LoanInformation loaninfos = PageFactory.initElements(driver, LoanInformation.class);

		loaninfos.Laon_Information(data.get("Loan Type"), data.get("Other Description1"), data.get("Loan Purpose"),
				data.get("Loan Program Scenario"), data.get("Other Description2"), data.get("Construction Type"),
				data.get("Cash-Out Type"), data.get("Occupancy"), data.get("FHA Secondary Residence"),
				data.get("Lien Position"), data.get("Simultaneous Financing"), data.get("Amortization Type"),
				data.get("Other Description3"), data.get("Conversion of Contract for Deed or Land"),
				data.get("Renovation"), data.get("Prepayment Penalty"), data.get("HELOC"));

//		BorrowerInfos Borinfos = PageFactory.initElements(driver, BorrowerInfos.class);
//		Borinfos.Save_Infos();
//		ScreeShot capture = PageFactory.initElements(driver, ScreeShot.class);
		// ScreeShot.screenShot(driver,
		// "C:/Users/hassane_djoudi/eclipse-workspace/zenly/ScreenShot/" +"hassane" +
		// ".png");
	}

	@Test(priority = 56, dataProviderClass = utils.HashTable.class, dataProvider = "getdata", groups = { "Borrower" })
	public void Note_Details(Hashtable<String, String> data) throws Exception {
		NoteDetails Note = PageFactory.initElements(driver, NoteDetails.class);
		Note.Details(data.get("Estimated Appraised Value"), data.get("Initial Requested Loan Amount"),
				data.get("Note Rate"), data.get("Qual Rate"), data.get("Amortization Term"), data.get("Loan Term"),
				data.get("Appraised_Value"), data.get("Sales Price"), data.get("Base Loan Amount"),
				data.get("CALCULATE"), data.get("DOWN_PAYMENT"), data.get("Down Payment Amount"));

	}

	@Test(priority = 57, dataProviderClass = utils.HashTable.class, dataProvider = "getdata", groups = { "Borrower" })
	public void Rental_Income_on_Subject_Property(Hashtable<String, String> data) throws Exception {
		RentalIncomeonSubjectProperty Income = PageFactory.initElements(driver, RentalIncomeonSubjectProperty.class);
		Income.RentalIncome(data.get("Gross Rent"), data.get("Occupancy Rate"), data.get("Calculate"),
				data.get("Net Rent"));

	}

	@Test(priority = 58, dataProviderClass = utils.HashTable.class, dataProvider = "getdata", groups = { "Borrower" })
	public void IfConstructionLoan(Hashtable<String, String> data) throws Exception {
		If_Construction_Loan construction = PageFactory.initElements(driver, If_Construction_Loan.class);
		construction.Construction(data.get("Original Cost"), data.get("Lot Value (a)"), data.get("Improvements (b)"),
				data.get("Include MI During Construction Period"),
				data.get("Include Escrow During Construction Period"), data.get("Calendar"), data.get("From"),
				data.get("To"), data.get("Period: Months"), data.get("Interest Rate"), data.get("Required Reserve"),
				data.get("Closing Type"));

	}

	@Test(priority = 59, dataProviderClass = utils.HashTable.class, dataProvider = "getdata", groups = { "Borrower" })
	public void PMIMIPVAUSDA(Hashtable<String, String> data) throws Exception {
		PMI_MIP_VA_USDA PMI = PageFactory.initElements(driver, PMI_MIP_VA_USDA.class);
		PMI.PMIUSDA(data.get("PMI/MIP/VA/USDA"), data.get("Additional Amount Paid in Cash"),
				data.get("Rate Percentage PMI/MIP/VA/USDA"), data.get("Rate Percentage PMI Renewal 1"),
				data.get("Rate Percentage PMI Renewal 2"), data.get("Monthly Dollar Amount PMI/MIP/VA/USDA"),
				data.get("Monthly Dollar Amount PMI Renewal 1"), data.get("Monthly Dollar Amount PMI Renewal 2"),
				data.get("Monthls PMI/MIP/VA/USDA"), data.get("Monthls  PMI Renewal 1"),
				data.get("Monthls  PMI Renewal 2"), data.get("Calculation Based on"), data.get("Cancel at"),
				data.get("Calculate based on remaining balance"), data.get("Midpoint Payment cancellation"));

	}

	@Test(priority = 60, dataProviderClass = utils.HashTable.class, dataProvider = "getdata", groups = { "Borrower" })
	public void Rate_Adjustment(Hashtable<String, String> data) throws Exception {
		RateAdjustment Rate = PageFactory.initElements(driver, RateAdjustment.class);
		Rate.Rate(data.get("1st Change Adj Cap"), data.get("1st Change Months"), data.get("Adj Period Adj Cap"),
				data.get("Adj Period Months"), data.get("Life Cap"), data.get("Margin"), data.get("Index"),
				data.get("Alt. Index"), data.get("Floor"), data.get("Index Type"), data.get("Other Description"),
				data.get("Rate"), data.get("Rate Round To"));

	}

	@Test(priority = 61, dataProviderClass = utils.HashTable.class, dataProvider = "getdata", groups = { "Borrower" })
	public void Payment_Adjustment(Hashtable<String, String> data) throws Exception {
		PaymentAdjustment Payment = PageFactory.initElements(driver, PaymentAdjustment.class);
		Payment.Payments(data.get("Interest-Only"), data.get("Calculate Qual Ratios at the Interest-Only Payment"),
				data.get("Bi-Weekly Payment Schedule"), data.get("Initial Payment Rate"), data.get("Percent"),
				data.get("Initial Payment Rate Period"), data.get("Adj Cap"), data.get("Adj Period"),
				data.get("Recast Pd/Stop"), data.get("Months"), data.get("Max Balance"),
				data.get("Calculate Qual Ratios at the Max Adjusted Loan Balance"), data.get("Payment"),
				data.get("Payment Rounding"), data.get("Years"), data.get("at Rate"), data.get("Simple Interest"),
				data.get("Down Payment Assistance Program"), data.get("Principal Forgiven"), data.get("every months"));

	}

	@Test(priority = 62, groups = { "Borrower" })
	public void BuydownAddButton() throws Exception {
		BuydownMortgage BuyDown = PageFactory.initElements(driver, BuydownMortgage.class);
		BuyDown.BuyDownButton();
	}

	@Test(priority = 63, dataProviderClass = utils.HashTable.class, dataProvider = "getdata", groups = { "Borrower" })
	public void Buydown_Mortgage(Hashtable<String, String> data) throws Exception {
		BuydownMortgage BuyDown = PageFactory.initElements(driver, BuydownMortgage.class);
		BuyDown.BuyDown(data.get("Rate"), data.get("Term (months)"), data.get("Action"));
	}

	@Test(priority = 64, dataProviderClass = utils.HashTable.class, dataProvider = "getdata", groups = { "Borrower" })
	public void Extra_Payment(Hashtable<String, String> data) throws Exception {
		ExtraPayment Extra = PageFactory.initElements(driver, ExtraPayment.class);
		Extra.Extra(data.get("Extra payment of"), data.get("every payment"));

	}

	@Test(priority = 65, groups = { "Borrower" })
	public void LoanAddButton() throws Exception {
		LoanFeatures loan = PageFactory.initElements(driver, LoanFeatures.class);
		loan.BuyDownButton();
	}

	@Test(priority = 66, dataProviderClass = utils.HashTable.class, dataProvider = "getdata", groups = { "Borrower" })
	public void Loan_Features(Hashtable<String, String> data) throws Exception {
		LoanFeatures loan = PageFactory.initElements(driver, LoanFeatures.class);
		loan.Loan(data.get("Loan Features"), data.get("Other Description"), data.get("Action"));

	}
	@Test(priority = 67, groups = { "Borrower" })
	public void LoanSAVE() throws Exception {
		LoanFeatures loan = PageFactory.initElements(driver, LoanFeatures.class);
		loan.Close();
		BorrowerInfos Borinfos = PageFactory.initElements(driver, BorrowerInfos.class);
		Borinfos.Save_Infos();
		
		
	}
	

	}

