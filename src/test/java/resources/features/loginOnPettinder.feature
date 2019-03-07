@pettinder

Feature: Scenarios of Login

  Scenario Outline: Sign In into PetMatch

    Given I am into LogIn page
    When I type email "<email>"
    And I type password "<password>"
    And I click sign in Button
    Then HomePage should be showed

    Examples:
      | email | password |
      | maver@hotmail.com  | Admin123 |




