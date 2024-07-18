Feature: Login StudentUniverse Application

  Scenario: Launch StudentUniverse Application
    Given browser is open
    When  enter url
    Then  user is navigate to StudentUniverse Application

  Scenario: Check login is successful with valid credentials
    Given user is in StudentUniverse home page
    When  user enters username and password
    And user clicks on login
    Then  user is logged in to StudentUniverse Application
