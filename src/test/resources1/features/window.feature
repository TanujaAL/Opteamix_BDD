
Feature: Window page feature
 
Scenario: Button click on Parent page
Given User should be on Practice page
When User click on the Open Tab button
Then Page should navigate to the child page
And child page data should be displayed as "info@qaclickacademy.com"