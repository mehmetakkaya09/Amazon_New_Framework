@wip


Feature: Login functionality

  Scenario Outline: User can login with valid credentials

    Given User is on login page
    When User should be able to write username "<usernames>"
    And User should be able to write password "<passwords>"
    And User should be able click login button
    Then User should be able to see dashboard

    Examples:

      | usernames         | passwords |
      | student46@library | gisuXwC4  |
      | student47@library | PmYoZguV  |
      | student48@library | HHEuFxRS  |
      | student49@library | 61G2pWwL  |
      | student50@library | HTx4f0IS  |