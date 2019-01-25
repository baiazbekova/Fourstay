package com.fourstay.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fourstay.utilities.Driver;

public class BottomNavBarPage {
	
	public BottomNavBarPage() {
		PageFactory.initElements(Driver.getDriver(),this);
		
	}
	
	@FindBy(xpath = "//*[@class='col-md-3 f-logo']//img ")
	public WebElement logoOfBottom; 
	
	
	@FindBy (linkText = "Jobs")
	public WebElement jobs;
	
	@FindBy(css = ".col-md-3.text-right>ul>li>a")
	public WebElement aboutUs; 

}
