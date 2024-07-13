Feature: Salesforce login

  Scenario: Login page
    Given user navigates to salesforce login page
    When user enters username "Kaleeshwari" and Password "123"
    And the user clicks the login button
    Then user validate the error message

