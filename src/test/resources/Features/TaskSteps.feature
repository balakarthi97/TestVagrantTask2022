#Author: your.email@your.domain.com
#Keywords Summary :

Feature: Find movie release date and location

  @imdb
  Scenario: IMDB
    Given Verify user is on imdp page
    When Search movie name and click pushpa
    And scrolldown imdb page to get movie name and date

  @wiki
  Scenario: WIKI
    Given Verify user is on wikipedia page
    When Search movie name on wikipedia
    And scrolldown wikipedia page to get movie name and date
    Then validate the imdb text with wikipedia
