package com.fourstay.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bookit.utilities.Driver;

public class MainPage {
	
	public MainPage() {
		
		PageFactory.initElements(Driver.getDriver(), this);
	} 
	
	
	@FindBy (id = "header")
	public WebElement main; 
	
	@FindBy (xpath= "//*[@class=\"navbar navbar-expand-md navbar-light\"]/a/img")
	public WebElement logo; 
	
	@FindBy(className = ".call-us.hidden-sm-down")
	public WebElement phoneNumber; 
	

	
	

}
