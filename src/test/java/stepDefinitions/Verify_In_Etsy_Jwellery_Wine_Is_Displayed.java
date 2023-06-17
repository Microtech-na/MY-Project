package stepDefinitions;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Etsy_Landing_Page;
import pages.Widding_Jwelley_Set_Page;


public class Verify_In_Etsy_Jwellery_Wine_Is_Displayed extends Base{
	
	Etsy_Landing_Page landingPage = new Etsy_Landing_Page(driver);
	Widding_Jwelley_Set_Page DisplayjwellerySet = new Widding_Jwelley_Set_Page(driver);
	
	@Given("I am in etsy home page")
	public void i_am_in_etsy_home_page() {

	if(driver != null) {
			landingPage.navigateURL();
			
		} else {
			// Handle case when the driver is not initialized
			System.out.println("Driver is not initialized");
		}

		
		
	}

	@When("I hover on Wedding & Party")
	public void i_hover_on_Wedding_Party() throws InterruptedException {
		Thread.sleep(2000);
		landingPage.hover_Wedding_And_Party();
	}

	@Then("I hover on Wedding jewellery")
	public void i_hover_on_Wedding_jewellery() throws InterruptedException {
		Thread.sleep(3000);
		landingPage.hover_Wedding_Jwellery();
	}

	@Then("I click on jewllery set")
	public void i_click_on_jewllery_set() throws InterruptedException {
		Thread.sleep(2000);
		landingPage.click_Jwellery_Set();
	}

	@Then("I will see {string}")
	public void i_will_see(String string) throws InterruptedException {
		Thread.sleep(2000);
		DisplayjwellerySet.Wine_Is_Displayed();
		System.out.println("Wine is Displayed "+DisplayjwellerySet.Wine_Is_Displayed());
	}


}
