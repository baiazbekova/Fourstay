package com.fourstay.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



import com.fourstay.utilities.Driver;

public class SignUpPage { 
	
	public SignUpPage () {
		
		PageFactory.initElements(Driver.getDriver(), this); 
	}
	
	@FindBy(className = ".btn.facebook-btn") 
	public WebElement facebook; 
	
	@FindBy(linkText = "More options")
	public WebElement moreOptions;
	
	@FindBy(linkText = "Sign Up")
	public WebElement signUpButton;
	


	public void goToSignUp() {
		Actions action = new Actions(Driver.getDriver()); 
		signUpButton.click();
	} 
	
	
	
	
	
	
	

}
