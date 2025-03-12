@tag
Feature: Checkimng FB Loginpage
  I want to use this template for my feature file

  @tag1
  Scenario: verify login with valid credentials
    Given i want to open a browser
    And enter the url "https://practicetestautomation.com/practice-test-login/"
    Then i am able to see the login page
    When i have to enter username "student"
    And i have to enter the password "Password123"
    And i have to click the login button
    Then i am able to see welcomepage
    And i will close the browser
