package com.fourstay.step_definitions;

import org.junit.Assert;

import com.bookit.utilities.Driver;
import com.fourstay.pages.ListYourStayPage;
import com.fourstay.utilities.ConfigurationReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ListYourStayStepDefinitions {
	
	@Given("user navgitaes to {int}stay.com")
	public void user_navgitaes_to_stay_com(Integer int1) {
		String url = ConfigurationReader.getProperty("url");
		Driver.getDriver().get(url); 
	}
	

	@When("user clicks on List Your Stay link")
	public void user_clicks_on_List_Your_Stay_link() {
		
		ListYourStayPage listYourStay = new ListYourStayPage(); 
		listYourStay.listYourStayLink.click(); 
		
	}
	
	@Then("user should see link for signing up with Facebook")
	public void user_should_see_link_for_signing_up_with_Facebook() {
	   
		ListYourStayPage listYourStay = new ListYourStayPage(); 
		Assert.assertTrue(listYourStay.FbLink.isDisplayed());
	
	}
	
	@Then("user should see link for signing up with Google")
	public void user_should_see_link_for_signing_up_with_Google() {
		
		ListYourStayPage listYourStay = new ListYourStayPage(); 
		Assert.assertTrue(listYourStay.GoogleLink.isDisplayed());
		
	}
	
	
	@Then("user should be able to fill out the form")
	public void user_should_be_able_to_fill_out_the_form() {
		
		ListYourStayPage listYourStay = new ListYourStayPage(); 
		
		String firstName = ConfigurationReader.getProperty("first_name"); 
		String lastName = ConfigurationReader.getProperty("last_name"); 
		String email = ConfigurationReader.getProperty("email"); 
		String password = ConfigurationReader.getProperty("password"); 
		String phone = ConfigurationReader.getProperty("phone"); 
		
		
		listYourStay.firstName.sendKeys(firstName);
		listYourStay.lastName.sendKeys(lastName);
		listYourStay.email.sendKeys(email);
		listYourStay.password.sendKeys(password);
		listYourStay.phone.sendKeys(phone);
		
	    
	}
	
	@Then("user should be accept Terms and Conditions")
	public void user_should_be_accept_Terms_and_Conditions() {
		
		ListYourStayPage listYourStay = new ListYourStayPage(); 
		
		//checks if the checkbox is present on the page
		listYourStay.checkBox.isDisplayed();
		
		//checks if the checkbox is enabled on the page
		listYourStay.checkBox.isEnabled();
		
		//checks if the checkbox is selected on the page
		listYourStay.checkBox.isSelected();
		
		//clicks on the checkbox 
		listYourStay.checkBox.click();
			
				
	}
	
	@Then("user should be able to create an account")
	public void user_should_be_able_to_create_an_account() {
		ListYourStayPage listYourStay = new ListYourStayPage(); 
		
		//creates an account
		listYourStay.createAccount.click();
		
	}
	
	}
