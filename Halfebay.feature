Feature: Chicking and verifying Halfbay Shoping Cart facility

Scenario: Checking Register Functionality

Given user should open any Browser
When user Should enter Halfbay url in the search Box
When user Should navigate to homepage of Halfbay
When user should click  on Register PushButton
Then user Should Enter FirstName ands LastName in the EditBox
And User Should Enter Email and Password in the EditBox
And Click on Register PushButton
And User Navigate to Halfbay Homepage

Scenario: Checking Login Functionality

Given User Should Open Url in any browser
When user Should navigate to HomePage of Halfbay
Then User Should Click in Signin in PushButton
And User Shopuld enter Email in EditBox
And Click on continue pushButton
And User Should enter Password in EditBox
And Click on Sighin PushButton and navigate to Homepage
And User Should on Sighout PushButton
And User Should navigate to HalfBay Application