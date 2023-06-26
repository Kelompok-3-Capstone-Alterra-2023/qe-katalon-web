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
  Scenario: Sending message with text
    Given I open website prevent for sending message with text https://main--melodious-genie-0706de.netlify.app/
    When I successfully login account and i choose feature chat in dashboard menu for sending message with text
    And I fill message with text for patient
    Then I click button send and message with text successfully sent 
    
  @chat2
  Scenario: Sending message with image
    Given I open website prevent for sending message with image https://main--melodious-genie-0706de.netlify.app/
    When I successfully login account and i choose feature chat in dashboard menu for sending message with image
    And I fill message with image for patient
    Then I click button send and message with image successfully sent

  @chat3
  Scenario: Verify successfully click button action in message
    Given I open website prevent for click button action in message https://main--melodious-genie-0706de.netlify.app/
    When I successfully login account and i choose feature chat in dashboard menu for click button action in message
    And I click button action in message
    Then I successfully click button action
    
  @chat4
  Scenario: Verify successfully click icon resep obat in message
    Given I open website prevent for click icon resep obat in message https://main--melodious-genie-0706de.netlify.app/
    When I successfully login account and i choose feature chat in dashboard menu for click icon resep obat in message
    And I click icon resep obat in message
    Then I successfully click icon resep obat
    
  @chat5
  Scenario: Verify successfully click icon tutup sesi in message
    Given I open website prevent for click icon tutup sesi in message https://main--melodious-genie-0706de.netlify.app/
    When I successfully login account and i choose feature chat in dashboard menu for click icon tutup sesi in message
    And I click icon tutup sesi in message
    Then I successfully click icon tutup sesi