Feature: Client has a question or need support,so
  she/he needs to contact us with one of the options we have
@ui
  Scenario: Client clicks on contact us page and choose and
    clicks on Optum Care patient Support

    Given  the client is on homepage
    When the client scrolls down
    And clicks on Contact Us page
    Then chooses Optum Care patient support
