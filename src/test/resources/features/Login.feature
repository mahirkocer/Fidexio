Feature: Login Functionality

  User Story : As a user, I should be able to log in so that I can land on homepage.

  Scenario Outline: Users can log in with valid credentials as Pos Manager

    Given user goes to login page
    When user enters valid "<username>" into username input box
    And user enters valid password into "posmanager" password input box
    And user clicks Log in button
    Then user land on the home page

    Examples:
      | username               |
      | posmanager15@info.com  |
      | posmanager80@info.com  |
      | posmanager22@info.com  |
      | posmanager100@info.com |
      | posmanager11info.com   |
      | posmanager65@info.com  |
      | posmanager33@info.com  |