@Regression @HelloWorld

Feature: test to sum two numbers

  Scenario Outline: Enter to the calculator and sum two numbers

    Given I Open the calculator
    When I click the first number "<firstNumber>"
    And I click the sum button
    And I click the second number "<seconNumber>"
    And I click the equal button
    Then show the expected the result as "<sum>"

    Examples:
      | firstNumber | seconNumber | sum |
      | 3           | 4           | 7   |


