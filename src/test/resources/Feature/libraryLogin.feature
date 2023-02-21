@wip
  Feature: Login functionality

    Scenario: User can login with valid credentials

      Given User is on login page
      When User should be able to write username "student28@library"
      And User should be able to write password "Dmr6hS9g"
      Then User should be able click login button