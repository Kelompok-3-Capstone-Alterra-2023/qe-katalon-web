#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@forgotpassword
Feature: Forgot password account doctor
  I want to use this feature to forgot password account

  @forgotpassword1
  Scenario Outline: Failed created new password if user input email with invalid email
    Given I open website prevent for forgot password account with invalid data https://main--melodious-genie-0706de.netlify.app/
    When I navigated to forgot password page for created new password with invalid data
    And I fill invalid email <email4> for created new password
    Then I click button login and verify unsuccessfully created new password with invalid data

    Examples: 
      | email4      |
      | rifkhihebat |
      
  @forgotpassword2
  Scenario Outline: Failed created new password if user input email with blank data
    Given I open website prevent for forgot password account with blank data https://main--melodious-genie-0706de.netlify.app/
    When I navigated to forgot password page for created new password with blank data
    And I fill email with blank data <email5> for created new password
    Then I I click button login and verify unsuccessfully created new password with blank data

    Examples: 
      | email5 	|
      | *null* 		|

  @forgotpassword1
  Scenario Outline: Failed created new password if user input email with valid email
    Given I open website prevent for forgot password account with valid data https://main--melodious-genie-0706de.netlify.app/
    When I navigated to forgot password page for created new password with valid data
    And I fill valid email <email6> for created new password
    Then I I click button login and verify successfully created new password with valid data

    Examples: 
      | email6              	|
      | rifkhihebat@gmail.com |