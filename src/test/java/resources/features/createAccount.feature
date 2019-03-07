@pettinder

Feature: Scenarios Create account

  Scenario Outline: Create Account successfully

    Given I am into Log-In page
    When I click on I dont have an account
    And I type the user name "<username>"
    And I type the user email "<useremail>"
    And I type the user pass "<userpass>"
    And I retype the user pass "<userpass2>"
    And I click on Create Account
    Then HomePage should be showed for first time

    Examples:
      | username    | useremail      | userpass  |userpass2|
      | kriss       | klcg12515@gmail.com |  122333      | 122333   |