#Author: Muhammad Shamsuzzaman
Feature: Testing php travels sign up page
  I want to use this template for my feature file

  Scenario: Testing sign up with valid information
    Given user is on the sign up page
    When user enters firstName
    And user enters lastName
    And user enters phone Number
    And user enters Email
    And user enters Password
    And user enters Confirmpassword
    Then user should be able to read and validate the text of Sign Up button
    And user should be able to read and validate the title of the page
    And user should be able to read and validate the URL of the page
    And user should close The browser
