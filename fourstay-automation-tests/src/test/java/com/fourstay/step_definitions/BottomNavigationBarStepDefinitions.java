package com.fourstay.step_definitions;

import org.openqa.selenium.JavascriptExecutor;

import com.bookit.utilities.Driver;
import com.fourstay.pages.BottomNavBarPage;
import com.fourstay.utilities.ConfigurationReader;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.*;

public class BottomNavigationBarStepDefinitions {

@When("user goes to the bottom page")
public void user_goes_to_the_bottom_page() {
   
	JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

   //navigate to the page
	String url = ConfigurationReader.getProperty("url");
	Driver.getDriver().get(url); 

    //This will scroll the web page till end.		
    js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	
	
}

@Then("user sees logo of the company")
public void user_sees_logo_of_the_company() {
    
	BottomNavBarPage bottomNavigation = new  BottomNavBarPage(); 
	
	Assert.assertTrue(bottomNavigation.logoOfBottom.isDisplayed());
	
	
}

@Then("user should be able to click on it and it should navigate to homepage")
public void user_should_be_able_to_click_on_it_and_it_should_navigate_to_homepage() {
   
	BottomNavBarPage bottomNavigation = new  BottomNavBarPage(); 

	Assert.assertTrue(bottomNavigation.logoOfBottom.isEnabled()); 
	
}


@When("user should be navigated to a new page")
public void user_should_be_navigated_to_a_new_page() {
	BottomNavBarPage bottomNavigation = new  BottomNavBarPage(); 
	
	// Store the current window handle
	String winHandleBefore = Driver.getDriver().getWindowHandle();

	// Perform the click operation that opens new window
	bottomNavigation.aboutUs.click();
	
	// Switch to new window opened
	for(String winHandle : Driver.getDriver().getWindowHandles()){
	    Driver.getDriver().switchTo().window(winHandle); 
	    }


	Driver.getDriver().close();

	Driver.getDriver().switchTo().window(winHandleBefore);

	
	
}

@When("user clicks on the Jobs")
public void user_clicks_on_the_Jobs() {
	String winHandleBefore = Driver.getDriver().getWindowHandle();

	BottomNavBarPage bottomNavigation = new  BottomNavBarPage(); 
	bottomNavigation.jobs.click();	
}




@Then("new window should open to navigate user to Jobs")
public void new_window_should_open_to_navigate_user_to_Jobs() {
	String winHandleBefore = Driver.getDriver().getWindowHandle();

	BottomNavBarPage bottomNavigation = new  BottomNavBarPage(); 
	bottomNavigation.jobs.click();
	
	// Switch to new window opened
	for(String winHandle : Driver.getDriver().getWindowHandles()){
	    Driver.getDriver().switchTo().window(winHandle); 
	    }


	Driver.getDriver().close();
}

	

}
