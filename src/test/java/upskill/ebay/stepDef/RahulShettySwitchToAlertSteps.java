package upskill.ebay.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.RahulShettySwitchToAlertActions;

public class RahulShettySwitchToAlertSteps {

	RahulShettySwitchToAlertActions RahulShettySwitchToAlertActionsobj = new RahulShettySwitchToAlertActions ();

	@Given("^Open Shetty Homepage$")
	public void open_Shetty_Homepage() throws Throwable {
		RahulShettySwitchToAlertActionsobj.loadRahulShettyHomepage();
	}

	/*@When("^Chick on Alert and Click on Ok$")
	public void chick_on_Alert_and_Click_on_Ok() throws Throwable {
		RahulShettySwitchToAlertActionsobj.clickAlertButton();
	}

	@Then("^Click on confirm and Click on Cancel$")
	public void click_on_confirm_and_Click_on_Cancel() throws Throwable {
		RahulShettySwitchToAlertActionsobj.clickConfirmButton();
	}*/
	@When("^Chick on Alert$")
	public void chick_on_Alert() throws Throwable {
		RahulShettySwitchToAlertActionsobj.clickAlertButton();
	}

	@Then("^Click on Ok$")
	public void click_on_Ok() throws Throwable {
		RahulShettySwitchToAlertActionsobj.clickOnOk();
	}

	@When("^Click on confirm$")
	public void click_on_confirm() throws Throwable {
		RahulShettySwitchToAlertActionsobj.clickConfirmButton();
	}

	@Then("^Click on Cancel$")
	public void click_on_Cancel() throws Throwable {
		RahulShettySwitchToAlertActionsobj.clickOnCancel();
	}

}
