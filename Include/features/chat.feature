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
@chat
Feature: Chat for patient
  I want to use this feature for chat with patient
  @chat1
  Scenario Outline: Sending message with text
    Given I open website prevent for sending message with text https://main--starlit-lokum-26b84a.netlify.app/
    When I successfully login account with email <email1> and password <password1> and i choose feature chat in dashboard menu for sending message with text
    And I fill message with text 
    Then I click button send and verify successfully sending message with text

    Examples: 
      | email1  							| password1 		|
      | rifkhihebat@upi.edu 	| vIdePLLyjL 		|