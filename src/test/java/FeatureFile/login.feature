Feature: login

  @loginPlaceHolder
  Scenario: verify place holder for userName and Password
    Given I am at orangeHRM
    And I verify there is placeHolder for userName and Password

  @login
  Scenario: login with valid email and passwod
    Given I am at orangeHRM
    And I input valid ID and password
    Then I click longin button

    @login3rdApps
    Scenario: login with thirdParty application
      Given I am at orangeHRM
      And I click facebook logo from the footer of the page
      And I click linkedIn logo from the footer of the page
      And I click YouTube logo from the footer of the page
      And I click twitter logo from the footer of the page






