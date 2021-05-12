Feature: login
  Scenario: login with valid email and passwod
    Given I am at orangeHRM
    And I input valid ID and password
    Then I click longin button

    Scenario: login with thirdParty application
      Given I am at orangeHRM
      And I click facebook logo from the footer of the page
      And I click linkedIn logo from the footer of the page
      And I click YouTube logo from the footer of the page
      And I click twitter logo from the footer of the page



