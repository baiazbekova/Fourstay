@mainPage 
Feature: Main Page feature
	In order to ensure Main Page works fine, 
	I want to run the cucumber test to verify its working
	
Scenario: Title of the Main Page 
Given user navigates to 4stay.com
When user is on the page
Then user should see the correct title of the page


Scenario: Logo of the Company is Present
Given user navigates to 4stay.com
When user is on the page
Then user should see the logo of the company on the left side 


Scenario: Phone number of the Company is Clickable
Given user navigates to 4stay.com
When user is on the main page
Then user should see the phone number and phone number should be clickable 
