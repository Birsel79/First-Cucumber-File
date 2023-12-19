Feature: Login Feature
  in this test I am testing login

  Scenario: Valid username and valid password test
    Given User is on login page
    When User enters valid user name
    And User enters valid user password
    And User clicks login button
    Then User should successfully login to system

  Scenario: Valid username and invalid password test
    Given User is on login page
    When User enters valid user name
    And User enters invalid user password
    And User clicks login button
    Then User should not login to system

  Scenario: Invalid username and valid user password test
    Given User is on login page
    When User enters invalid user name
    And User enters  user password
    And User clicks login button
    Then User should not login to system

  Scenario: Invalid username and invalid password test
    Given User is on login page
    When User enters invalid user name
    And User enters invalid user password
    And User clicks login button
    Then User should not login to system