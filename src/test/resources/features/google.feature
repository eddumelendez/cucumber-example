@google
Feature: Searching google
Scenario: Search any text 'Test' in google page
Given I visit google search page 'http://www.google.com.pe'
When I type 'test' as a search string
Then I should get search results like 'test'