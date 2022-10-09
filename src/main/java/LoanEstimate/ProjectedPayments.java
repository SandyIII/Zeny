package LoanEstimate;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProjectedPayments {

	
	
	//Year Range
	@FindBy(how = How.XPATH, using = "//td[text()='Year Range']//following::td[1]")
	WebElement Year_Range_Projection1 ;
	@FindBy(how = How.XPATH, using = "//td[text()='Year Range']//following::td[2]")
	WebElement Year_Range_Projection2 ;
	@FindBy(how = How.XPATH, using = "//td[text()='Year Range']//following::td[3]")
	WebElement Year_Range_Projection3 ;
	@FindBy(how = How.XPATH, using = "//td[text()='Year Range']//following::td[4]")
	WebElement Year_Range_Projection4 ;
	
	//Principal & Interest/MIN
	@FindBy(how = How.XPATH, using = "//td[text()='Principal & Interest']//following::td[2]")
	WebElement Principal_Interest_MIN_Projection1 ;
	@FindBy(how = How.XPATH, using = "//td[text()='Principal & Interest']//following::td[3]")
	WebElement Principal_Interest_MIN_Projection2 ;
	@FindBy(how = How.XPATH, using = "//td[text()='Principal & Interest']//following::td[4]")
	WebElement Principal_Interest_MIN_Projection3 ;
	@FindBy(how = How.XPATH, using = "//td[text()='Principal & Interest']//following::td[5]")
	WebElement Principal_Interest_MIN_Projection4 ;
	//Principal & Interest/MAX
	@FindBy(how = How.XPATH, using = "//td[text()='Principal & Interest']//following::td[8]")
	WebElement Principal_Interest_MAX_Projection1 ;
	@FindBy(how = How.XPATH, using = "//td[text()='Principal & Interest']//following::td[9]")
	WebElement Principal_Interest_MAX_Projection2 ;
	@FindBy(how = How.XPATH, using = "//td[text()='Principal & Interest']//following::td[10]")
	WebElement Principal_Interest_MAX_Projection3 ;
	@FindBy(how = How.XPATH, using = "//td[text()='Principal & Interest']//following::td[11]")
	WebElement Principal_Interest_MAX_Projection4 ;
	//Mortgage_Insurance
	@FindBy(how = How.XPATH, using = "//td[text()='MI']//following::td[1]")
	WebElement Mortgage_Insurance_Projection1 ;
	@FindBy(how = How.XPATH, using = "//td[text()='MI']//following::td[2]")
	WebElement Mortgage_Insurance_Projection2 ;
	@FindBy(how = How.XPATH, using = "//td[text()='MI']//following::td[3]")
	WebElement Mortgage_Insurance_Projection3 ;
	@FindBy(how = How.XPATH, using = "//td[text()='MI']//following::td[4]")
	WebElement Mortgage_Insurance_Projection4 ;
	//Escrow
	@FindBy(how = How.XPATH, using = "//td[text()='Escrow']//following::td[1]")
	WebElement Escrow_Projection1 ;
	@FindBy(how = How.XPATH, using = "//td[text()='Escrow']//following::td[2]")
	WebElement Escrow_Projection2 ;
	@FindBy(how = How.XPATH, using = "//td[text()='Escrow']//following::td[3]")
	WebElement Escrow_Projection3 ;
	@FindBy(how = How.XPATH, using = "//td[text()='Escrow']//following::td[4]")
	WebElement Escrow_Projection4 ;
	//Total_MIN
	@FindBy(how = How.XPATH, using = "//td[text()='Total']//following::td[2]")
	WebElement Total_MIN_Projection1 ;
	@FindBy(how = How.XPATH, using = "//td[text()='Total']//following::td[3]")
	WebElement Total_MIN_Projection2 ;
	@FindBy(how = How.XPATH, using = "//td[text()='Total']//following::td[4]")
	WebElement Total_MIN_Projection3 ;
	@FindBy(how = How.XPATH, using = "//td[text()='Total']//following::td[5]")
	WebElement Total_MIN_Projection4 ;
	//Total_MAX
	@FindBy(how = How.XPATH, using = "//td[text()='Total']//following::td[8]")
	WebElement Total_MAX_Projection1 ;
	@FindBy(how = How.XPATH, using = "//td[text()='Total']//following::td[9]")
	WebElement Total_MAX_Projection2 ;
	@FindBy(how = How.XPATH, using = "//td[text()='Total']//following::td[10]")
	WebElement Total_MAX_Projection3 ;
	@FindBy(how = How.XPATH, using = "//td[text()='Total']//following::td[11]")
	WebElement Total_MAX_Projection4 ;
	
	
}
