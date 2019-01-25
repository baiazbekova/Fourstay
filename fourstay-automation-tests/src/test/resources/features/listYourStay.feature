@listYourStay
Feature: List Your Stay feature
	In order to ensure List Your Stage page works fine, 
	I want to run the cucumber test to verify its working
	
Scenario: Sign Up with Facebook 
Given user navigates to 4stay.com
When user clicks on List Your Stay link
Then user should see link for signing up with Facebook 

Scenario: Sign Up with Google
Given user navigates to 4stay.com
When user clicks on List Your Stay link
Then user should see link for signing up with Google

Scenario: Manual Signing Up 
Given user navgitaes to 4stay.com
When user clicks on List Your Stay link
Then user should be able to fill out the form
And user should be accept Terms and Conditions
Then user should be able to create an account 