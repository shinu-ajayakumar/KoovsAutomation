Feature: Signin Tests with valid credentials

Scenario: Test with a valid email and password
    Given I am on signin page
    When I enter email
    And I enter password
    And I click login button
    Then I should be in my home page