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
@receipt
Feature: Drugs receipt for patient 
  I want to use this feature for sending drugs receipt to patient

  @receipt1
  Scenario: Verify successfully obat added and next page to redirect chat page
		Given I open website prevent and successfully login account for sending drugs receipt to patient https://main--melodious-genie-0706de.netlify.app/
    When I choose feature chat in dashboard menu and click icon drugs receipt in button action for sending drugs receipt to patient
    And I click button plus for add drugs in daftar obat and drugs navigated to receipt obat 
    Then I click button selanjutnya in drugs receipt and redirect to chat page
    
  @receipt2
  Scenario: Verify user can edit resep obat can click icon edit in action
		Given I open website prevent and successfully login account for edit drugs receipt to patient https://main--melodious-genie-0706de.netlify.app/
    When I choose feature chat in dashboard menu and click icon drugs receipt in button action for edit drugs receipt to patient
    And I click button plus for add drugs in daftar obat and drugs navigated to receipt obat for edit
    Then I click icon edit in drugs receipt and drugs receipt can be edited

  @receipt3
  Scenario: Verify user can delete resep obat can click icon delete in action
		Given I open website prevent and successfully login account for delete drugs receipt to patient https://main--melodious-genie-0706de.netlify.app/
    When I choose feature chat in dashboard menu and click icon drugs receipt in button action for delete drugs receipt to patient
    And I click button plus for add drugs in daftar obat and drugs navigated to receipt obat for delete
    Then I click icon delete in drugs receipt and drugs receipt can be deleted