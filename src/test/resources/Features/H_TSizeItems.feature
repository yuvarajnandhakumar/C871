#Author:Tharun
@TK @SizeItem
Feature: Size Item creation & validation

#  @RegressionCICD

  Scenario Outline: User create 2d sizes
    Given User launches centric application
    Then Go to homepage
    And verify user screen
    When user navigates to size items tab
    And user creates the size item "<SizeItem>","<SizeSpec>"
    Then Validate the options like copy and delete for size item "Reg_colorCopy","<SizeItemCopy>"
    And user creation of tags in the size item "<SizeItem>","<SizeItemTag>"
    Then Logout from the Application

    
    Examples:
      |SizeItem                                                |SizeItemCopy |SizeSpec                             |SizeItemTag             |
      |Armhole_Bound,Armhole_Faced,Belt Loops_Clean Finish Make|Armhole_Bound|Characteristic,Construction,Packaging|sleeve,armhole,waistband|