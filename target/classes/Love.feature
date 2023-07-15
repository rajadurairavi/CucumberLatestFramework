

Feature: Love Feature
Scenario Outline: Love Scenario


Given User is exist on Google Page
When I Search For Selenium "<SearchText>"
And  I refresh the browser
Then I close the browser

Examples:
|SearchText|
|Selenium|



