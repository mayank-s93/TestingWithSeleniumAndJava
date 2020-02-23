Feature: Test GMO Post

@GMOHome
Scenario: Enter GMO OnLine site
Given I am on GMO Home Page
When I Enter GMO site
Then I should see Catalog page displayed

@Catalog
Scenario: Order an item from the cataolg displayed
Given I am on Catalog page
When I order  for items
 |   Glacier Sun Glasses     |4 |
 |   3 Person Dome Tent      |2 |
 |   Padded Socks            |2 |
And I place order
Then Order should get placed

  
 
  
  @SelectItems
  Scenario: Place the order for item selected
  Given I have selected the items
  When I place the order
  Then I should see place order page displayed
  
  @PlaceOrder
  Scenario: Proceed with Order confirmation
  Given I am on Place Order page
  And I confirm my orders and proceed to billing
  Then I should see billing page
  
  @Billing
  Scenario: Provided billing address and checkout
  Given I am on Billing page
  When I input customer billing details 
  And  I placed the order
  Then I reciept page should display
  
  @Receipt
  Scenario: Confirm receipt and return to GMO home page
  Given I am in Receipt page
  When I opt to return to home page
  Then I should navigate to GMO home page
  
  
  