package com.fourstay.step_definitions;

import java.util.concurrent.TimeUnit;

import org.apache.http.util.Asserts;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.bookit.utilities.Driver;
import com.fourstay.pages.MainPage;
import com.fourstay.utilities.ConfigurationReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MainPageStepDefinitions {

	@When("user is on the page")
	public void user_is_on_the_page() {
		String url = ConfigurationReader.getProperty("url");
		Driver.getDriver().get(url);
	}

	
	@Then("user should see the correct title of the page")
	public void user_should_see_the_correct_title_of_the_page() {
		
		String actualTitle = Driver.getDriver().getTitle();
		String expectedTitle = "Room rental, roommate finder, off-campus housing, homestay | 4stay"; 
		Assert.assertEquals(actualTitle, expectedTitle);
		
	    
	}

	@Then("user should see the logo of the company on the left side")
	public void user_should_see_the_logo_of_the_company_on_the_left_side() {

		MainPage mainPage = new MainPage(); 
		Assert.assertTrue(mainPage.logo.isDisplayed()); 
	}

	@Then("user should see the phone number and phone number should be clickable")
	public void user_should_see_the_phone_number_and_phone_number_should_be_clickable() {
		MainPage mainPage = new MainPage(); 
		WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10); 
		wait.until(ExpectedConditions.elementToBeClickable(mainPage.phoneNumber));
		mainPage.phoneNumber.click();
		
	}



}
