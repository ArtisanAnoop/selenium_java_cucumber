# Tags can be used to categorize features or scenarios. For example, tagging this feature as 'google-search'
@search @google @selenium
Feature: Selenium Cucumber Java Example

  # Providing a more detailed scenario description enhances clarity
  @google-search
  Scenario: Search for Selenium on Google
    Given the user is on the Google search page
    When the user searches for Selenium
    Then the user should see search results related to Selenium
