Feature: Test GMO Post 

@GMOHome 
Scenario: Enter GMO OnLine site 
	Given I am on GMO home page 
	When I Enter GMO site 
	Then I should see Catalog page displayed 
		
@Catalog 
Scenario Outline: Order an item from the catalog displayed 
	Given I am on Catalog page 
	When I order "<orderQty>" for item "<itemDesc>" 
	Then I should see quantity for "<itemDesc>" equals "<orderQty>" 
	Examples: 
		| orderQty | itemDesc       |
		|       10       | Hiking Boots |
		|      4          | 3 Person Dome Tent |
		
@SelectItems 
Scenario: Place the Order for items selected 
	Given I have selected the items 
	When I place order 
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