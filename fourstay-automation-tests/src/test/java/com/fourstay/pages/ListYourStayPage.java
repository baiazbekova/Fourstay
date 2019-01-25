package com.fourstay.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fourstay.utilities.Driver;

public class ListYourStayPage {
	
	public ListYourStayPage() {
		PageFactory.initElements(Driver.getDriver(), this); 
		
	}
	
	@FindBy(linkText = "LIST YOUR STAY")
	public WebElement listYourStayLink; 
	
	@FindBy(xpath= "//span[@class = 'fa fa-facebook fa-2x']")
	public WebElement FbLink; 
	
	@FindBy(xpath = "//span[@class = 'fa fa-google fa-2x']")
	public WebElement GoogleLink; 

	@FindBy(id = "first_name")
	public WebElement firstName; 
	
	@FindBy(id = "last_name")
	public WebElement lastName; 
	
	@FindBy(id = "email")
	public WebElement email;
	
	@FindBy(id = "password")
	public WebElement password; 
	
	@FindBy(id = "phone")
	public WebElement phone; 
	
	@FindBy(xpath = "//label[@class = 'checkbox i-minus-checks']//i ")
	public WebElement checkBox; 
	
	@FindBy(xpath = "//input[@value = 'Create account']")
	public WebElement createAccount; 
	
	
}
