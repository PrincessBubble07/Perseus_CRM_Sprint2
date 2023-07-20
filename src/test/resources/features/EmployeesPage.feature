Feature: As a user, I want to access the Employee page


  Background: User is already on the log in page
    Given the user is on the login page

  Scenario Outline: Verify users can access the Employee page
    Given the user logged in as "<user>"
    When the user click on Employees
    Then the user should be able to see Company Structure on the Employee page
    Then the user should be able to see Find Employee on the Employee page
    Then the user should be able to see Telephone Directory on the Employee page
    Then the user should be able to see Staff Changes on the Employee page
    Then the user should be able to see Efficiency on the Employee page
    Then the user should be able to see Honored Employees on the Employee page
    Then the user should be able to see Birthdays on the Employee page
    Then the user should be able to see New page on the Employee page

    Examples:
      | user |
      | hr |
      | help desk |
      | marketing |


  Scenario: Verify the default module after clicking the Employees Module
    Given User is on the Employees page
    When User clicks on the Employees Module
    Then User should see the company structure

