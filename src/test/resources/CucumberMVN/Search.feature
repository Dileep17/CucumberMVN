Feature: Search

  Scenario: Search for a specific product
    Given I opened automationpractice.com
    When I searched for Printed Dress
    Then I should see below products in search results
      | Printed Summer Dress  |
      | Printed Dress         |
      | Printed Chiffon Dress |
      | Printed Summer Dress  |
      | Printed Dress         |