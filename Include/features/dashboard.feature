@dashboard-pesanan
Feature: After login, user can click all menu dashboard
  User can manage patient on website prevent

@login-on-dashboard
  Scenario Outline: Login doctor with valid data
    Given I open website prevent for login 
    When User login page for login with valid data
    And User fill email <email1> and password <password1> for login with valid data
    Then On dashboard after login and can click all menu

    Examples: 
      | email1  							| password1 		|
      | rifkhihebat@upi.edu 	| vIdePLLyjL 		|
      
  @pesanan
  Scenario: User can view pesanan page
    Given On dashboard after login and click menu pesanan
    When User click to view 5 row data
    Then Already view 5 row data 
