Feature: Test GMO Post 

@GMOHome 
Scenario: Enter GMO OnLine site 
	Given I am on GMO home page 
	When I Enter GMO site 
	Then I should see Catalog page displayed 
	
@Catalog 
Scenario: Order an item from the catalog displayed 
	Given I am on Catalog page 
	When I order for items 
		|  3 Person Dome Tent  | 2 |
		|  External Frame Backpack | 3 |
		|  Glacier Sun Glasses | 4 |
	And I place order
	Then I should expect Place order page displayed
		
@PlaceOrder 
Scenario: Proceed with Order confirmation 
	Given I am on Place Order page 
	And I confirm my orders and proceed to billing 
	Then I should see billing page 
	
@Billing 
Scenario: Provide billing address and checkout 
	Given I am on Billing page 
	When I input correct billing address 
	And I checkout 
	Then I should be taken to receipt page 
	
@Receipt 
Scenario: confirm receipt and return to GMO home page 
	Given I am in Receipt page 
	When I opt to return to home page 
	Then I should be navigated to GMO home page