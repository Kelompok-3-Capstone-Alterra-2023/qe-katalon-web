@Detail-doctor
Feature: User can search doctor
		User can view detail doctor
		User can register for doctor

    
	@Search-a-docotr
  Scenario Outline: Searching a doctor
    Given User launch website prevent on doctor page
    When User check for the <value> doctor
    Then User verify the <status> doctor

    Examples: 
      | value 		| status |
      | Kesehatan | passed |
      | abc 			| failed | 
      
  @Click-detail
  Scenario: Click and view detail doctor
    Given User launch website prevent on doctor page 
		When User can click button detail
		Then On page detail doctor
		
	@Click-register-for-doctor
  Scenario: Click and view detail doctor
    Given User launch website prevent on are you doctor page 
		When User can click button detail
		Then On page detail doctor