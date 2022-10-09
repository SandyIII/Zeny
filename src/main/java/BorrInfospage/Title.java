package BorrInfospage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class Title {

	
	@FindBy(how = How.XPATH, using = "//div[@class ='form-horizontal col-xs-5-476  border_top_g']/h4[1]")
	WebElement Title1;
	@FindBy(how = How.XPATH, using = "//input[@ng-model = 'selected.borrowerSet.PrimaryBorrower.TitleHeldInName']")
	WebElement Name_on_Title1;
	@FindBy(how = How.XPATH, using = "//select[@ng-model = 'selected.borrowerSet.PrimaryBorrower.TitleRelationshipVestingType']")
	WebElement Title_will_be_held_as;
	@FindBy(how = How.XPATH, using = "//input[@ng-model = 'selected.borrowerSet.PrimaryBorrower.RelationshipVestingTypeOtherDescription']")
	WebElement Other_Description;
	@FindBy(how = How.XPATH, using = "//div[@class ='form-horizontal col-xs-5-476  col-xs-offset-0-475 border_top_g']/h4[1]")
	WebElement Title2;
	@FindBy(how = How.XPATH, using = "//input[@ng-model = 'selected.borrowerSet.CoBorrower.TitleHeldInName']")
	WebElement Name_on_Title2;
	
	
	public void AddTitle(String title ,String other) throws InterruptedException {
		Thread.sleep(3000);
		if(Title1.isDisplayed()) {
			Name_on_Title1.click();
			Thread.sleep(3000);
			Select select = new Select(Title_will_be_held_as);
			select.selectByVisibleText(title);
			Thread.sleep(3000);
			if(title.equalsIgnoreCase("Other")) {
				Other_Description.sendKeys(other);
			
			}
			if(Title2.isDisplayed()) {
				Name_on_Title2.click();
			}
		}
		
	}
}
