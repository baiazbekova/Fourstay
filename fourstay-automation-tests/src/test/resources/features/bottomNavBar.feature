@bottomNavBar
Feature: Bottom Navigation Bar feature
	In order to ensure Bottom Navigation Bar works fine, 
	I want to run the cucumber test to verify its working
	
Scenario: Logo of the company 
Given user navigates to 4stay.com
When user goes to the bottom page 
Then user sees logo of the company 
And user should be able to click on it and it should navigate to homepage

Scenario: About Us 	
Given user navigates to 4stay.com	
When user user clicks on the About Us link
And user should be navigated to a new page 

Scenario: Jobs
Given user navigates to 4stay.com
When user clicks on the Jobs
Then new window should open to navigate user to Jobs



