@logout
Feature: User should be able to log out

  Background: User is already in the log in page
    Given the user is on the login page


    Scenario: Verify logout functionality
      Given the user logged in as "hr"
    When user clicks on profile name button
    Then user sees and clicks on the logout button



    Scenario: Verify users see 5 options under the profile name.
      Given the user logged in as "hr"
        When user clicks on profile name button
        Then user sees five below options
   |MyProfileEditProfileSettingsThemesConfigurenotificationsLogout|