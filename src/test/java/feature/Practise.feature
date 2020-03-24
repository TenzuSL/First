Feature: Practise

@Newtest
Scenario: search and validate
Given land in greenkart
When select "cucumber" and select count as "5"
And add product to cart and checkout
Then validate the selected item