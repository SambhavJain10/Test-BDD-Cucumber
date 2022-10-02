Feature: Login Feature Production with Scenario Outline
  	In order to perform successful login
  	As a user
  	I have to enter correct usrername and password.

  Scenario Outline: Login to the Facebook Website with a user on Production
    Given user navigates to facebook site
    When user validates login page title
    Then user enters the "valid" username
    And user enters the "valid" password
    And user validates catpcha image
    And user clicks on sign-in button

    Examples: 
      | username | password |
      | valid    | valid    |
      | valid    | invalid  |
      | invalid  | valid    |
      | invalid  | invalid  |
