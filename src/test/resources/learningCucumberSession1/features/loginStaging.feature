Feature: Login Feature Staging
  	In order to perform successful login
  	As a user
  	I have to enter correct usrername and password.

  Background: 
    Given user navigates to facebook site
    When user validates login page title

  Scenario: Login to the Facebook Website with a valid user on staging
    Given user navigates to facebook site
    When user validates login page title
    Then user enters the "valid" username
    And user enters the "valid" password
    And user clicks on sign-in button

  Scenario: Login to the Facebook Website with a invalid user on staging
    Given user navigates to facebook site
    When user validates login page title
    Then user enters the "invalid" username
    And user enters the "invalid" password
    And user clicks on sign-in button
