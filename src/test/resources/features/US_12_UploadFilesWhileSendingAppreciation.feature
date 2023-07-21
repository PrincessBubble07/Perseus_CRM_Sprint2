Feature: As a user, I should be able to upload files and pictures while sending appreciation

  Background: User is sending appreciation
    Given the user is on the login page


  Scenario: Verify users can upload files and pictures while sending appreciation
    Given the user logged in as "hr"
    And the user click on MORE tab
    And the user click on Appreciation
    Then the user should be able to upload files and pictures
    #Examples:
     # | user      |
      #| hr        |
      #| help desk |
      #| marketing |

  Scenario Outline: Verify users can insert the files and images into the text while sending appreciation
    Given the user logged in as "<user>"
    Then the user should be able to insert files and pictures into the text
    Examples:
      | user      |
      | hr        |
      | help desk |
      | marketing |

  Scenario Outline: Verify users can remove files and images at any time before sending
    Given the user logged in as "<user>"
    Then the user should be able to remove files and images at any time before sending
    Examples:
      | user      |
      | hr        |
      | help desk |
      | marketing |