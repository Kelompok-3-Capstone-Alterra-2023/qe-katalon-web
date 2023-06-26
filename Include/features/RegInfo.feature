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

  @reginfo1
  Scenario Outline: Register with valid data
    Given I open website prevent for register personal info with valid data https://main--melodious-genie-0706de.netlify.app/
    When I navigated to register page for register account with valid data
    And I fill <email7>,<name1>,<NIK1>,<gender1>,<place1>,<dob1>,<religion1> for regist with valid data
    Then Successfully register with valid data and navigated to academic information page

    Examples: 
    	|	email7							|	name1		|	NIK1								| gender1		|	place1	|	dob1					|	religion1	|
      | dummy21@dummy.com 	| Dummy  	| 3176890102030405		|	Perempuan	|	Jakarta	|	01/06/1995		|	Islam			|	
      
  @reginfo2
  Scenario Outline: Register with empty data
    Given I open website prevent for register personal info with empty data https://main--melodious-genie-0706de.netlify.app/
    When I navigated to register page for register account with empty data
    And I fill <email8>,<name2>,<NIK2>,<gender2>,<place2>,<dob2>,<religion2> for regist with empty data
    Then Unsuccessfully register with empty data and navigated to academic information page

    Examples: 
    	|	email8							|	name2		|	NIK2								| gender2		|	place2	|	dob2				|	religion2		|
      | *null*						 	| *null*  | *null*							|	*null*		|	*null*	|	*null*			|	*null*			|	
      
  @reginfo3
  Scenario Outline: Register with not format email
    Given I open website prevent for register personal info with not format email https://main--melodious-genie-0706de.netlify.app/
    When I navigated to register page for register account with not format email
    And I fill <email9>,<name3>,<NIK3>,<gender3>,<place3>,<dob3>,<religion3> for regist with not format email
    Then Unsuccessfully register with not format email and navigated to academic information page

    Examples: 
    	|	email9							|	name3		|	NIK3								| gender3		|	place3	|	dob3					|	religion3	|
      | dummy21						 	| Dummy  	| 3176890102030405		|	Perempuan	|	Jakarta	|	01/06/1995		|	Islam			|	
      
  @reginfo4
  Scenario Outline: Register with name one character
    Given I open website prevent for register personal info with name one character https://main--melodious-genie-0706de.netlify.app/
    When I navigated to register page for register account with name one character
    And I fill <email10>,<name4>,<NIK4>,<gender4>,<place4>,<dob4>,<religion4> for regist with name one character
    Then Unsuccessfully register with name one character and navigated to academic information page

    Examples: 
    	|	email10							|	name4		|	NIK4								| gender4		|	place4	|	dob4					|	religion4	|
      | dummy21@dummy.com		| D		  	| 3176890102030405		|	Perempuan	|	Jakarta	|	01/06/1995		|	Islam			|
      
  @reginfo5
  Scenario Outline: Register with date of birth is date now
    Given I open website prevent for register personal info with date of birth is date now https://main--melodious-genie-0706de.netlify.app/
    When I navigated to register page for register account with date of birth is date now
    And I fill <email11>,<name5>,<NIK5>,<gender5>,<place5>,<dob5>,<religion5> for regist with name date of birth is date now
    Then Unsuccessfully register with date of birth is date now and navigated to academic information page

    Examples: 
    	|	email11							|	name5		|	NIK5								| gender5		|	place5	|	dob5					|	religion5	|
      | dummy21@dummy.com		| Dummy  	| 3176890102030405		|	Perempuan	|	Jakarta	|	25/06/2023		|	Islam			|
      	