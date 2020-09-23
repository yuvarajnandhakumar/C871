#Author:Tharun
@ColorSpec 
Feature: As a user I want to do regression cases for the color specification module

#  @RegressionCICD

  Scenario Outline: Colour specification Creation and regression scenario
    Given User launches centric application
    Then Go to homepage
    And verify user screen
    Then Click on specification tab and create color specification "<ColorSpecificationName1>","<Code>","<Description>","<ColorSpecificationName2>","<CCode>","<CDescription>","<ColorSpecificationName3>","<ColorSpecificationName4>","<ColorSpecificationName5>"
    And Merge the color specification and validate the status after merging "<ColorSpecificationName1>"
    Then Validate the options like copy and delete "Reg_colorCopy","<ColorSpecificationName1>"
    When User delete the merged colour spec and verify the error message "<ColorSpecificationName5>"
    Then User creates the Custom view and add the options to the table "<AvailableAttributes>"
    But User deletes the unwanted attributes from custom views column "<SelectedAttributes1>","<SelectedAttributes2>","<SelectedAttributes3>","<SelectedAttributes4>"
    And User enters the RBG value and verify the colour in the table "<ColorSpecificationName1>","<RGB Hex>"
    Then User enters the RBG value and colour in the table "<ColorSpecificationName2>","<ColorSpecificationName3>","<ColorSpecificationName4>","<ColorSpecificationName5>"
    Then Logout from the Application

    Examples:
      |ColorSpecificationName1|Code |Description          |ColorSpecificationName2|CCode |CDescription        |AvailableAttributes|SelectedAttributes1|SelectedAttributes2|SelectedAttributes3|SelectedAttributes4|ColorName |RGB Hex|ColorSpecificationName3|ColorSpecificationName4|ColorSpecificationName5|
      |11-0103 EGRET          |022  |RegressionValidation |11-0104 VANILLA ICE    |023   |RegressionValidation|RGB Hex            |Pantone            |Pantone TC         |Libraries          |Tags               |Reg_color2|#323232|11-0105 ANTIQUE WHITE  |11-0107 PAPYRUS        |11-0205 GLASS GREEN    |
