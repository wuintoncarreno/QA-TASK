@Regression @HelloWorld

Feature: test open browser

  Scenario Outline: Enter to some url direction

    Given I access to the browser
    When I go to the "https://www.google.com.pe"
    Then I close the driver

    Examples:
      | browser | url                        |
      | chrome  | https://www.google.com.pe  |


