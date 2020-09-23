#Author:Tharun
@TK @SizeSpec
Feature: Size Spec creation & validation

#  @RegressionCICD

  Scenario Outline: User create 2d sizes
    Given User launches centric application
    Then Go to homepage
    And verify user screen
    When user navigates to size spec tab
    And user creates the size spec "<SizeSpec>"
    Then Validate the options like copy and delete for size spec "<SizeSpecCopy>"
    Then Logout from the Application
    
    Examples:
      |SizeSpec         |SizeSpecCopy|
      |12,14,16,4*6,8x11|12          |