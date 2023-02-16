@general

Feature: Amazon search feature

  User-Story : User can search anything inside the search box.

 Background:

   Given user is on the search page

  @smoke @regression
  Scenario: Amazon search box functionality

    When user write in the search box anything

    Then user is on the target page what written in the search box
    @regression
    Scenario:

      When something

      Then finish again

