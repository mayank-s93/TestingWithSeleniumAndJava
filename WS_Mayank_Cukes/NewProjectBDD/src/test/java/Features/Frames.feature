Feature: Test Frames

@FrameTest 
Scenario: Enter Selenium Dev site 
	Given I am on Selenium dev page 
	Then Count the number of frames 
	Then Print the name of all frames

	
	
	@classFrame 
Scenario: Enter Selenium Dev site 
	Given I am on Selenium dev page 
	Then Print the all links from all class frames
	
	
	@packageFrame 
Scenario: Enter Selenium Dev site 
	Given I am on Selenium dev page 
	Then Print the all links from all package frames
	
	
	@packageListFrame 
Scenario: Enter Selenium Dev site 
	Given I am on Selenium dev page 
	Then Print the all links from all package list frames
	