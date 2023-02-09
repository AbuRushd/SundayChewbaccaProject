package upskill.ebay.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.ShettyHomepageAction;

public class ShettyHomepageSteps {
	
	ShettyHomepageAction ShettyHomepageActionObj = new ShettyHomepageAction();
	
	//@Given("^Open Shetty Homepage$")                         // we got this homepage step before, so we do not need it here
	//public void open_Shetty_Homepage() throws Throwable {	   // we got this homepage step before, so we do not need it here
	//	ShettyHomepageActionObj.loadShettyHomepage();		   // we got this homepage step before, so we do not need it here
	//}														   // we got this homepage step before, so we do not need it here

	@When("^Click on iFrame Home$")
	public void click_on_iFrame_Home() throws Throwable {
		ShettyHomepageActionObj.clickHome();
	}

	@Then("^It should reload iframe homepage$")
	public void it_should_reload_iframe_homepage() throws Throwable {
		ShettyHomepageActionObj.verifyShettyHome();
	}


}
