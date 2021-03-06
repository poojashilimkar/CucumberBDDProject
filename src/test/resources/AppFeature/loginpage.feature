Feature: Login Page feature

Scenario: login page title
Given user is on login page
When user gets the title of the page
Then page title Should be "Login - My Store"

Scenario: forgot password link
Given user is on login page
Then forgot password link should be displayed 

Scenario: Login with correct credentials
Given user is on login page
When user enters username "poojashilimkar14@gmail.com"
And user enters password "Shambhu"
And user clicks on login button
Then user gets the title of the page 
And page title Should be "My account - My Store"

 