#Author: Muhammad Shamsuzzaman
Feature: Testing the newtours page

  Scenario: Mercury Registration with valid information
    Given user is on the registration page
    When user enters firstname
    And user enters lastname
    And user enters phone number
    And user enters email
    And user enters address
    And user enters city
    And user enters the state
    And user enters postalcode
    And user enters username
    And user enters password
    And user enters confirmpassword
    Then user should be able to verify the submit button is displayed and enabled
    And user should be able to read the title of the page
    And user should be able to read the URL of the page
    And user should close the browser
