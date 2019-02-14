Feature: Signin and Signup Tests with valid credentials

Scenario: Test login with a valid email and password
    Given I am on signin page
    When I enter email as "testemail@gmail.com"
    And I enter password as "testpassword"
    And I click login button
    Then I should be in my dashboard page
    
Scenario: Test Signup with a valid credentials
    Given I am on signup page
    When I enter a new name as "Test name"
    And I enter a new email as "testemail1@gmail.com"
    And I enter a new password as "testpassword"
    And I enter a new mobile number as "9995405012"
    And I click signup button
    Then I should be in my dashboard page
    
 Scenario: Test successful payment
 		Given I am on signin page
    When I enter email as "testemail@gmail.com"
    And I enter password as "testpassword"
    And I click login button
 		When I proceed with payment
 		And I enter card number as "123456789"
 		And I enter expiry month as "11"
 		And I enter expiry year as "2019"
 		And I enter CVV as "054"
 		And I click Pay now button 