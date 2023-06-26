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
@regacademic
Feature: Register doctor prevent with academic information
  I want to use this feature to Register website prevent as a doctor with academic information

  @regacademic1
  Scenario Outline: Register Academic with valid data
    Given I open website prevent for register academic information with valid data https://main--melodious-genie-0706de.netlify.app/
    When I successfully register personal info and navigated to register academic information with valid data
    And I fill <university1>,<major1>,<graduated1>,<office1>,<str1> for register academic information with valid data
    Then Successfully register academic information with valid data and navigated to document information page

    Examples: 
      | university1  					| major1 			| graduated1  	|	office1					| str1		|
      | Universitas Indonesia | Kedokteran 	| 2017				 	|	RSUD Kembangan	|	1234567	|
      
  @regacademic2
  Scenario Outline: Register Academic with empty data
    Given I open website prevent for register academic information with empty data https://main--melodious-genie-0706de.netlify.app/
    When I successfully register personal info and navigated to register academic information with empty data
    And I fill <university2>,<major2>,<graduated2>,<office2>,<str2> for register academic information with empty data
    Then Unsuccessfully register academic information with empty data 

    Examples: 
      | university2  					| major2 			| graduated2  	|	office2					| str2		|
      | *null*								| *null*		 	| *null*			 	|	*null*					|	*null*	|
      
  
  @regacademic3
  Scenario Outline: Register Academic with number str more than 20
    Given I open website prevent for register academic information with number str more than 20 https://main--melodious-genie-0706de.netlify.app/
    When I successfully register personal info and navigated to register academic information with number str more than 20
    And I fill <university3>,<major3>,<graduated3>,<office3>,<str3> for register academic information with number str more than 20
    Then Unsuccessfully register academic information with number str more than 20 

    Examples: 
      | university3  					| major3 			| graduated3  	|	office3					| str3									|
      | Universitas Indonesia | Kedokteran 	| 2017				 	|	RSUD Kembangan	|	123456789012345678901	|
      
  @regacademic4
  Scenario Outline: Register Academic with years graduated more than now 
    Given I open website prevent for register academic information with years graduated more than now https://main--melodious-genie-0706de.netlify.app/
    When I successfully register personal info and navigated to register academic information with years graduated more than now
    And I fill <university4>,<major3>,<graduated3>,<office3>,<str3> for register academic information with years graduated more than now
    Then Unsuccessfully register academic information with years graduated more than now

    Examples: 
      | university4  					| major4 			| graduated4  	|	office4					| str4		|
      | Universitas Indonesia | Kedokteran 	| 2027				 	|	RSUD Kembangan	|	1234567	|