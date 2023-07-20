@us_09
Feature: Users should be able to see all the options on the Activity Stream page

Background: User is already in the log in page
Given the user is on the login page



Scenario Outline: Menu Options for users
Given the user logged in as "<user>"
Then user sees Activity Stream link
Then user click Activity Stream link
Then user sees following modules
    |MESSAGE               |
    |TASK                  |
    |EVENT                 |
    |POLL                  |

  When user click on the MORE tab on Activity Stream page
  Then user views the following options under the MORE tab
   |File        |
   |Appreciation|
   |Announcement|
   |Workflow    |

  Examples:
    | user      |
    | hr        |
    | help desk |
    | marketing |


