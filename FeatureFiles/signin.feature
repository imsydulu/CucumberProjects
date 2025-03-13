Feature: Checking Loginpage

  Scenario Outline: checking the login func with invalid inputs
    Given i want open the browser and enter the url "https://practice.expandtesting.com/login"
    Then i should see the login page
    When i have to enter the username as "<username>"
    And I shoud enter the password as "<password>"
    And I shoud click the login button
    Then I verify login success
    When I close the browser

    Examples: 
      | username | password   |
      | name1    | anbcbhagda |
      | name2    | agdhsgjdah |
