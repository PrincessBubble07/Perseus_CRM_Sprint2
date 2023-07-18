Feature: Employees page functionality
  Agile Story: User should be able to access the Employees page

  Background: User is already logged in
    Given User is on the homepage
    Then User click the employees page

  Scenario: Employees page modules verification
    Given User is on the employees page
    Then User should see below modules on the employees page

      | Company Structure   |
      | Find Employee       |
      | Telephone Directory |
      | Staff Changes       |
      | Efficiency Report   |
      | Honored Employees   |
      | Birthdays           |
      | New page            |

    Scenario: Verify user view the company structure by default
      Then User clicks employees module
