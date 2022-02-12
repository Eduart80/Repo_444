
Feature:

  Scenario: google text name
    When start google
    Then get page name
    And enter in search 'picture'
