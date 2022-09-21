@AmazonSearch
Feature: Amazon item search test

  Scenario: Using Amazon customer menu to locate Samsung TV listing
    Given User is on the Amazon main shopping page
    When  User clicks on customer menu
    And User selects "TV, Appliances, Electronics" under Shop By Department section
    And User selects "Televisions" from given options
    And User checks "Samsung" checkbox under Brands section
    And User sorts the Samsung results with "Price: High to Low"
    And User clicks on the item on position 2
    And User navigates to the selected listing page
    Then "About this item" section is displayed on the page






