#Author: Muhammad Shamsuzzaman
Feature: Testing Yahoo Account Sign Up Page

  Scenario: Testing yahoo sign up with valid information
    Given user is on the yahoo sign up page
    When I enter first name
    And I enter last name
    And I enter email
    And I enter password
    And I enter phone number
    And I select birth month
    And I enter birth day
    And I enter birth year
    And I enter gender
    Then I read terms and conditions
    And I read privacy policy
    And I verify Continue button is displayed
    And I verify Sing in button is displayed
    And I close the browser
