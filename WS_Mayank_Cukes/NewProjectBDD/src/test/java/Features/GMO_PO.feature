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
		
  @CloseBroser
    Scenario: Closed driver
    Then Closed the driver