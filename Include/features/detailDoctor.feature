@Detail-doctor
Feature: User can search doctor
		User can view detail doctor
		User can register for doctor

    
	@Search-a-doctor
  Scenario: Searching valid a doctor
    Given User launch website prevent on doctor page
    Then User can check for the valid name doctor
    
  @Search-a-doctor
  Scenario: Searching invalid a doctor
    Given User launch website prevent on doctor page
    Then User can check for the invalid name doctor

  @Click-detail
  Scenario: Click and view detail doctor
    Given User launch website prevent on doctor page 
		When User can click button detail
		Then On page detail doctor
		
	@Click-register-for-doctor
  Scenario: Click and view detail doctor
    Given User launch website prevent on are you doctor page 
		When User can click button daftar
		Then On page register doctor