@Regression @HelloWorld

Feature: test open browser

  Scenario Outline: Enter to some url direction

    Given I Open the browser on "http://localhost:3000/"
    When I click on Sign Up Button
    And I enter the "name", "email" and "password"
    And I click on Submit button
    Then A message confirmation should be displayed

    Examples:
      | name | email            | password |
      | pepe | pepe@gmail.com   | a123!A   |


