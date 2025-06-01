Feature: This is background demo


Background: user is logged into saucedemo app

Given user is accessing sauce demo login page
When user enters valid name and password
Then user should be able to navigate to homepage


Scenario: Test Menu Items

And click on the breadcrumb icon
Then the user should be able to see the menu items

Scenario: Verify add to cart functionality

And clicks on add to button
Then item should be added to the cart
