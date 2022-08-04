Feature: checking and verifying Times functionality

Scenario: Checking Login Functionality 

Given User should open Url in chrome browser
When User Enter Economics of times Url in the Search box 
When User should navigate to Home Page of Economics of times
Then User should click on Signin PushButton 
Then User should click on Signin with email or mobile
And User should enter Emailid or phoneno in EditBox 
And Click on Continue PushButton 
And User should enter Password in EditBox 
And Click on Signin PushButton and navigate to HomePage
