package upskill.ebay.pageAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import upskill.ebay.pageElements.RahulShettySwitchToAlertLocators;
import upskill.utilities.SetupDrivers;

public class RahulShettySwitchToAlertActions {
	
	RahulShettySwitchToAlertLocators RahulShettySwitchToAlertLocatorsobj;
	
	public RahulShettySwitchToAlertActions () {
		RahulShettySwitchToAlertLocatorsobj = new RahulShettySwitchToAlertLocators();
		PageFactory.initElements(SetupDrivers.driver, RahulShettySwitchToAlertLocatorsobj);
	}
	
	public void loadRahulShettyHomepage() throws Exception {
		SetupDrivers.driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		SetupDrivers.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(3000);
	}
	
	public void clickAlertButton() throws Exception {
		RahulShettySwitchToAlertLocatorsobj.clickAlert.click();
		//SetupDrivers.driver.switchTo().alert().accept(); 				
		Thread.sleep(3000);
	}
	public void clickOnOk() {
		SetupDrivers.driver.switchTo().alert().accept(); 					// this line is used for alert option
		
	}
	public void clickConfirmButton() throws Exception {
		RahulShettySwitchToAlertLocatorsobj.clickConfirm.click();
		//SetupDrivers.driver.switchTo().alert().dismiss(); 				
		Thread.sleep(3000);
	}
	public void clickOnCancel() {
		SetupDrivers.driver.switchTo().alert().dismiss(); 					// this line is used for alert option
	}
}

