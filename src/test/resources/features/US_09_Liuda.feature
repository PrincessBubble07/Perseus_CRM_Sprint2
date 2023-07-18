@us_09
Feature: Users should be able to see all the options on the Activity Stream page

Background: User is already in the log in page
Given the user is on the login page


@us_09_hr
Scenario: Menu Options for hr
Given the user logged in as "hr"
Then the user should be able to see Activity Stream link
Then the user should be able to click Activity Stream link
Then user should be able to see following modules
| MESSAGETASKEVENTPOLLMORE  |
    #|MESSAGE               |
    #|TASK                  |
    #|EVENT                 |
    #|POLL                  |
    #|MORE                  |
  When user click on the MORE tab on Activity Stream page
  Then the users view the following options under the MORE tab
    |File\nAppreciation\nAnnouncement\nWorkflow|
  # |File        |
  # |Appreciation|
  # |Announcement|
  # |Workflow    |

  @us_09_helpdesk
  Scenario: Menu Options for helpdesk
    Given the user logged in as "help desk"
    Then the user should be able to see Activity Stream link
    Then the user should be able to click Activity Stream link
    Then user should be able to see following modules
      | MESSAGETASKEVENTPOLLMORE  |
    #|MESSAGE                    |
    #|TASK                       |
    #|EVENT                      |
    #|POLL                       |
    #|MORE                       |
    When user click on the MORE tab on Activity Stream page
    Then the users view the following options under the MORE tab
      |File\nAppreciation\nAnnouncement\nWorkflow|
  # |File        |
  # |Appreciation|
  # |Announcement|
  # |Workflow    |

  Scenario: Menu Options for marketing
    Given the user logged in as "marketing"
    Then the user should be able to see Activity Stream link
    Then the user should be able to click Activity Stream link
    Then user should be able to see following modules
      | MESSAGETASKEVENTPOLLMORE  |
    #|MESSAGE                    |
    #|TASK                       |
    #|EVENT                      |
    #|POLL                       |
    #|MORE                       |
    When user click on the MORE tab on Activity Stream page
    Then the users view the following options under the MORE tab
      |File\nAppreciation\nAnnouncement\nWorkflow|
  # |File        |
  # |Appreciation|
  # |Announcement|
  # |Workflow    |
