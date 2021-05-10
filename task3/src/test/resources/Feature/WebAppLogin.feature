@login
Feature: Login Functionality

  Background: 
    Given Browser is Open
    When User Navigates to Login Page
    When User Enters user name

  Scenario: Successful Login
    When User Enters password
    And User Clicks Login
    Then Validate Login Message

  Scenario: Unsuccessful Login
    When User Enters wrong password
    And User Clicks Login
    Then Validate Invalid Message
