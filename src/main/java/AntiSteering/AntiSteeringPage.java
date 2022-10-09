package AntiSteering;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class AntiSteeringPage {
	@FindBy(how = How.CSS, using = ".checkbox-label")
	WebElement Checkbox;
	@FindBy(how = How.CSS, using = ".checkbox-label")
	WebElement TypeofTransactionDropdown;
	
	public void Checkbox() throws Exception {
		
		Checkbox.click();
	}
	
public void TypeOfTransaction(String Fixed ) throws Exception {
	
	Select select = new Select(TypeofTransactionDropdown);
	select.selectByVisibleText(Fixed);
}
}
