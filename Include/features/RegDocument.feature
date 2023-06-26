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
@regdocument
Feature: Register doctor prevent with document information
  I want to use this feature to Register website prevent as a doctor with document information
  
  @regdocument1
  Scenario: Register with all field upload files format based on requirement can be register successfully
    Given I open website prevent for register academic information with files format based on requirement https://main--melodious-genie-0706de.netlify.app/
    When I successfully register personal info, academic information and navigated to document information page with files format based on requirement
    And I fill all field upload files format based on requirement  
    Then I verify successfully register with files format based on requirement
    
  @regdocument2
  Scenario: Register with all files using format docs
    Given I open website prevent for register academic information with all files using format docs https://main--melodious-genie-0706de.netlify.app/
    When I successfully register personal info, academic information and navigated to document information page with all files using format docs
    And I fill all field upload with all files using format docs
    Then I verify successfully register with all files using format docs
    
  @regdocument3
  Scenario: Register with all files using size file more than 2MB
    Given I open website prevent for register academic information with all files using size file more than 2MB https://main--melodious-genie-0706de.netlify.app/
    When I successfully register personal info, academic information and navigated to document information page all files using size file more than 2MB
    And I fill all field upload with all files using size file more than 2MB
    Then I verify successfully register with all files using size file more than 2MB