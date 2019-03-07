@pettinder

Feature: Scenarios add pet

  Scenario Outline: Add new pet

    Given I am into LogIn page, loging with google, home page showed
    When I click on Add Button
    And I click on Allow Button

    And I type the name "<name>"
    And I click on Spinner Gender
    And I clck on Male
    And I click on Spinner Type
    And I click on Cat
    And I type the date "<date>"
    And I type the describe "<describe>"
    And I click on Choose Buttom
    And I click on Img
    And I click on Create Button

    Then HomePage should be showed Again

    Examples:
      | name    | date       | describe  |
      | kamila  | 12/09/2016 | A good guy|