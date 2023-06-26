@PostArtikel
Feature: User can search artikel
		User can edit the article
		User can deleted the article 
		Usrr can create a new article 

  @Search-article
  Scenario: Search article with valid and invalid data 
    Given User open website prevent for login  and go to article 
    When User check article with invalid data and verify data
    Then User check article with valid data and verify data

      
  @edit-article
  Scenario: Edit a article 
    Given User open website prevent for login  and go to article
    When User editing article
    Then success edited article


  @Delete-article
  Scenario: Delete a article
    Given User open website prevent for login  and go to article
    When User deleting article
    Then success deleted article

      
  @Create-a-new--article-with-valid-data
  Scenario: Create a new article with valid data
    Given User open website prevent for login  and go to article
    When User fill the field after click create a new article
    Then Successfully to create a new article
    
  @Create-a-new--article-with-invalid-data
  Scenario: Create a new article with invalid data
    Given User open website prevent for login  and go to article
    When User fill the field after click create a new article with invalid data
    Then Unsuccessfully to create a new article
