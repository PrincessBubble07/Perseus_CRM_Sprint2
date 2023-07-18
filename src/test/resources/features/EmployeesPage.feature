Feature: Employees page functionality
  Agile Story: User should be able to access the Employees page

  Background: User is already logged in
    Given User is on the homepage
    Then User click the employees page

  Scenario: Verify the modules in the Employees page
    Given User is on the employees page
    Then User should see  the following modules on the employees page

      | Company Structure   |
      | Find Employee       |
      | Telephone Directory |
      | Staff Changes       |
      | Efficiency Report   |
      | Honored Employees   |
      | Birthdays           |
      | New page            |

  Scenario: Verify the default module after clicking the Employees Module
    Given User is on the Employees page
    When User clicks on the Employees Module
    Then User should see the company structure

