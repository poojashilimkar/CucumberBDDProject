Feature: Home page Feature

Background:  user has already logged in to application 
Given user has already logged in to application 
|username|password|
|poojashilimkar14@gmail.com|Shambhu|


Scenario: verify user Profile 
Given user is on account page
When user click on home button
Then user gets the title of the page 
And page title Should be "My Store"
And user name should dispalayed on the page as "Pooja"




