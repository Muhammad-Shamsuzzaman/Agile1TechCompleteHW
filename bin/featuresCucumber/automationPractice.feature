#Author: Muhammad Shamsuzzaman
Feature: Testing Automation Practice Page

  Scenario: Create an account with valid information
    Given User is on the home page
    When I enter the email address
    And I click on create account
    And I click on Mr. Radio Button
    And I enter my first name
    And I enter my last name
    And I enter new password
    And I select date
    And I select month
    And I select year
    And I click on Sign Up for newsletter
    And I click on receive special offers
    And I enter my company name
    And I enter my address
    And I enter my city
    And I select my state
    And I enter my zipcode
    And I enter additional information
    And I enter home phone number
    And I enter mobile phone number
    And I enter alias
    Then I verify register button is displayed
    And I validate the URL
    And I validate the Title
    And I Close the browser
