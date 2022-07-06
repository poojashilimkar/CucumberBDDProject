Feature: Account page feature

Background:  user has already logged in to application 
Given user has already logged in to application 
|username|password|
|poojashilimkar14@gmail.com|Shambhu|


Scenario: account page title
Given user is on account page 
When user gets the title of the page 
Then page title Should be "My account - My Store"

Scenario: cart button functionalty
Given user is on account page
When user click on cart button
Then  user gets the title of the page



Scenario: Account Menu count
Given user is on account page
Then user gets account section
|ORDER HISTORY AND DETAILS|
|MY CREDIT SLIPS|
|MY ADDRESSES|
|MY PERSONAL INFORMATION|
|MY WISHLISTS|
And acounts section count should be 5