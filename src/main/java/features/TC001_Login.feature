Feature: Login Action
Scenario: Verify Login For valid inputs display message as Successful
Given User is on Home page
When user clicks on Signin link check title
When user enters username and password click on Submit button
Then check User name and display Login Successful as a message
Then Close Rediff
