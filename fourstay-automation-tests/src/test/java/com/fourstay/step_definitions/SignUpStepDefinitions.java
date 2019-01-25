package com.fourstay.step_definitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import com.bookit.pages.MapPage;
import com.fourstay.pages.SignUpPage;
import com.fourstay.utilities.ConfigurationReader;
import com.fourstay.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignUpStepDefinitions {
	
	@Given("user navigates to {int}stay.com")
	public void user_navigates_to_stay_com(Integer int1) {
	    //open browser and go to url
		String url = ConfigurationReader.getProperty("url");
		Driver.getDriver().get(url);
		
	}

	@When("user clicks on sign up button")
	public void user_clicks_on_sign_up_button() {
	   SignUpPage signUpPage = new SignUpPage(); 
	   signUpPage.goToSignUp(); 
	  
	}

	@Then("user should see More Options link")
	public void user_should_see_More_Options_link() {
		Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	SignUpPage signUpPage = new SignUpPage(); 
    	Assert.assertTrue(signUpPage.moreOptions.isDisplayed());
		
	   
	}
	
	
	

}
