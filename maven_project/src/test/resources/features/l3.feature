Feature: working on newtours page

  Scenario Outline: webapplication
    Given user is on newtours page
    When user specifies  <uname> and <password>
    Then user click on the submit button
    And user back to home page

    Examples: 
      | uname      | password   |
      | mercury    | mercury123 |
      | mercury123 | mercury123 |
