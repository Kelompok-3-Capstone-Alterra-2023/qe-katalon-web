@detail-article
Feature: User can view detail article
  User can send the comment on page article

  @view-articleAnd-send-comment
  Scenario: view article And send comment
    Given User launch website prevent artikel
    When User fill valid comment, first name and lastname 
    Then User can click button komentar to send on page article and comment already on page article

    @invalis-send-comment
  Scenario: invalid send comment article
    Given User launch website prevent artikel
    When User fill blank comment, fill first name and lastname 
    Then User cannot send comment