Feature: Invalid Login Feature
  in this test I am testing login


Scenario: Valid username and invalid password test
Given User is on login page
When User enters valid user name
And User enters invalid user password
And User clicks login button
Then User should not login to system