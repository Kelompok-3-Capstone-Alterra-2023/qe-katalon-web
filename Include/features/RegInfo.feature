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
@reginfo
Feature: Register doctor prevent
  I want to use this feature to Register website prevent as a doctor

  @register1
  Scenario Outline: Register with valid data
    Given User launch open website prevent for regist with valid data
    When User open register page for regist with valid data
    And User fill <email>,<name>,<NIK>,<gender>,<place>,<dob>,<religion> for regist with valid data
    Then Successfully register with valid data

    Examples: 
    	|	email1
      | dummy21@dummy.cpom | Dummy  | 3176890102030405		|	Perempuan	|	Jakarta	|	01/06/199		|	Islam			|	
      
      
   @register2
   Scenario Outline: Register with blank data
    Given User launch open website prevent for regist with blank data
    When User open register page for regist with blank data
    And User fill <email>,<name>,<NIK>,<gender>,<place>,<dob>,<religion>
    Then Unsuccessfully register with blank data
     Examples: 
      |									 	 |				|											|						|					|							|						|	
   
   @register3
   Scenario Outline: Register with blank data
   Given User launch open website prevent for regist with blank data
   When User open register page for regist with blank data
   And User fill <email>,<name>,<NIK>,<gender>,<place>,<dob>,<religion>
   Then Unsuccessfully register with blank data
     Examples: 
      | dummy21						 | Dummy 	| 3176890102030405    |	Perempuan	| Jakarta	|	01/06/1995	|	Islam			|	
      |	dummy21@dummy.com	 | D			|	3176890102030405		| Perempuan	|	Jakarta	| 01/06/1995	| Islam			|	
      |	dummy21@dummy.com	 | Dummy	|	3176890102030405		|	Perempuan	|	Jakarta	|	23/06/1995	|	Islam			|	