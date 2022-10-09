package LoanInfos;

import java.io.File;
import java.io.IOException;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.aventstack.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import listeners.ExtentManager;
import listeners.ExtentReporterNG;
import utils.BrowserFactory;


public class Ratios_Results  {
//	WebDriver driver ;
	@FindBy(how = How.XPATH, using = "//h4[text() ='Note Details']")
	WebElement ratios;
	@FindBy(how = How.XPATH, using = "//label[text() = 'Base LTV']//following::input[1]")
	WebElement Base_LTV;
	@FindBy(how = How.XPATH, using = "//label[text() = 'Base CLTV']//following::input[1]")
	WebElement Base_CLTV;
	@FindBy(how = How.XPATH, using = "//label[text() = 'Base HCLTV']//following::input[1]")
	WebElement Base_HCLTV;
	@FindBy(how = How.XPATH, using = "//label[text() = 'Housing Expense']//following::input[1]")
	WebElement Housing_Expense;
	@FindBy(how = How.XPATH, using = "//label[text() = 'Debt-to-Income']//following::input[1]")
	WebElement Debt_to_Income;
	@FindBy(how = How.XPATH, using = "//label[text() = 'Total LTV']//following::input[1]")
	WebElement Total_LTV;
	@FindBy(how = How.XPATH, using = "//label[text() = 'Total CLTV']//following::input[1]")
	WebElement Total_CLTV;
	@FindBy(how = How.XPATH, using = "//label[text() = 'Total HCLTV']//following::input[1]")
	WebElement Total_HCLTV;
	@FindBy(how = How.XPATH, using = "//label[text() = 'Debt-To-Housing Gap']//following::input[1]")
	WebElement Debt_To_Housing_Gap;

	public String Base_LTV() {
		
		
		return Base_LTV.getAttribute("title");
	}

	public String Base_CLTV() {

		return Base_CLTV.getAttribute("title");
	}

	public String Base_HCLTV() {

		return Base_HCLTV.getAttribute("title");
	}

	public String Housing_Expense() {

		return Housing_Expense.getAttribute("title");
	}

	public String Debt_to_Income() {

		return Debt_to_Income.getAttribute("title");
	}

	public String Total_LTV() {

		return Total_LTV.getAttribute("title");
	}

	public String Total_CLTV() {

		return Total_CLTV.getAttribute("title");
	}

	public String Total_HCLTV() {

		return Total_HCLTV.getAttribute("title");
	}

	public String Debt_To_Housing_Gap() {

		return Debt_To_Housing_Gap.getAttribute("title");
	}
	
//	public void ScrollAndTakeScreenShot() throws Exception {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView();", ratios);
//		//js.executeScript("window.scrollBy(0,50)", "");
//Thread.sleep(3000);
//	}


	
}
