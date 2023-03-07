Feature: Login Functionality

  User Story : As a user, I should be able to log in so that I can land on homepage.

  Scenario Outline: Users can log in with valid credentials as Pos Manager

    Given user opens a browser and goes to login page
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
      | posmanager65@info.com  |



  Scenario Outline: Users can log in with valid credentials as Sales Manager

    Given user opens a browser and goes to login page
    When user enters valid "<username>" into username input box

    And user enters valid password into "salesmanager" password input box
    And user clicks Log in button
    Then user land on the home page

    Examples:
      | username                 |
      | salesmanager15@info.com  |
      | salesmanager80@info.com  |
      | salesmanager22@info.com  |
      | salesmanager100@info.com |
      | salesmanager65@info.com  |

  @wip
  Scenario Outline: "Wrong login/password" should be displayed for invalid credentials

    Given user opens a browser and goes to login page
    When user enters invalid "<username>" or invalid "<password>"
    And user clicks Log in button
    Then Wrong login password message should be displayed

    Examples:
      | username                 | password      |
      | salesmanager15@gmail.com | 12345retygfht |
      | student80@info.com       | posmanager    |
      | teacher22@info.com       | salesmanager  |
      | posmanager100@info.com   | manager100    |
      | devmanager65@info.com    | devmanager    |