#Author:Tharun
@TK @SizeLabel
Feature: Size Label creation & validation

#  @RegressionCICD

  Scenario Outline: User create 2d sizes
    Given User launches centric application
    Then Go to homepage
    And verify user screen
    When user navigates to size label tab
    And user creates the size label "<SizeLabel>"
    Then Validate the options like copy and delete for size label "Horizontal Size Label-COPY","<SizeLabelCopy>"
    Then Logout from the Application
    
    Examples:
      |SizeLabel                                |SizeLabelCopy        |
      |Horizontal Size Label,Vertical Size Label|Horizontal Size Label|