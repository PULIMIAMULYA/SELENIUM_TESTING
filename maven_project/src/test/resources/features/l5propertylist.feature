Feature: Working on webapplication

  Scenario: newtours webapp
    Given user is in newtours
    When user needs to enter username and password
    Then user clicks on the submit button
    And user navigates to the homepage
