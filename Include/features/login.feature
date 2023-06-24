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
@login
Feature: Login doctor prevent
  I want to use this feature to login web prevent

  @login1
  Scenario Outline: Login doctor with valid data
    Given I open website prevent for login with valid data https://main--starlit-lokum-26b84a.netlify.app/
    When I navigated to login page for login with valid data
    And I fill email <email1> and password <password1> for login with valid data
    Then I click button login and verify successfully login

    Examples: 
      | email1  							| password1 		|
      | rifkhihebat@upi.edu 	| vIdePLLyjL 		|
      
  @login2
  Scenario Outline: Login doctor with invalid data
    Given I open website prevent for login with invalid data https://main--starlit-lokum-26b84a.netlify.app/
    When I navigated to login page for login with invalid data
    And I fill email <email2> and password <password2> for login with invalid data
    Then I click button login and verify unsuccessfully login with invalid data

    Examples: 
      | email2  							| password2 		|
      | rifkhihebat@upi.edu 	| vIdePLLyjL1	 	|
      
  @login3
  Scenario Outline: Login doctor with blank data
    Given I open website prevent for login with blank data https://main--starlit-lokum-26b84a.netlify.app/
    When I navigated to login page for login with blank data
    And I fill email <email3> and password <password3> for login with blank data
    Then I click button login and verify unsuccessfully login with blank data

    Examples: 
      | email3  | password3 |
      | *null* 	| *null* 		|