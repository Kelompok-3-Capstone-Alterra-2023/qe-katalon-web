@homepage
Feature: User can click all navigation and scroll for article on homepage and click hyperlink on homepage
 	User can searching with valid data
  User can't searching with invalid data


  @click-scroll
  Scenario: click all navigation and scroll
    Given User launch website prevent 
		Then User Can click and scroll all navigation and hyperlink 
    
	@search-article
  Scenario Outline: Searching article
    Given User launch website prevent
    When User check for the <value> in step
    Then User verify the <status> in step

    Examples: 
      | value 		| status |
      | Kesehatan | passed |
      | abc 			| failed | 