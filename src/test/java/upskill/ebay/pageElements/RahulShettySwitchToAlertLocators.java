package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RahulShettySwitchToAlertLocators {
	
	//Click Alert
	@FindBy(xpath="//input[@value='Alert']")
	public WebElement clickAlert;

	//Click Confirm
	@FindBy(xpath="//input[@value='Confirm']")
	public WebElement clickConfirm;
}
