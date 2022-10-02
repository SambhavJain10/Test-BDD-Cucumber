Feature: Login Feature
  	In order to perform successful login
  	As a user
  	I have to enter correct usrername and password.

  Scenario Outline: Login to the Facebook Website with a user
    Given user navigates to facebook site
    When user validates login page title
    Then user enters the "<username>" username
    And user enters the "<password>" password
    And user clicks on sign-in button

    Examples: 
      | username | password |
      | valid    | valid    |
      | valid    | invalid  |
      | invalid  | valid    |
      | invalid  | invalid  |
