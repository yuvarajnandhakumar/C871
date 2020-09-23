#Author:Tharun
 @2DSizes 
Feature: 2D size creation and validation of complete flow

#  @RegressionCICD

Scenario Outline: User create 2d sizes
    Given User launches centric application
    When Setup Enum for size dimensions in setup page "<Enumeration>"
    Then Create the Enum value for the sizes "<Enumeration Value>","<Description>","<EnumerationValue2>","<Description2>"
    And User navigates to type config
   When user creates the size spec data for size label module "<SizeSpec>"
    And Update the Enum through partial configuration
    Then validate and accept the alert
    Then Go to homepage
    And verify user screen
    When User creates multiple sizes with different type for TwoDSizes "<Size>","<Size1>","<Size2>","<Size3>","<Size4>","<Size5>","<SortOrder>","<SortOrder1>","<SortOrder2>","<SortOrder3>","<SortOrder4>","<SortOrder5>"
    Then Create duplicate Sizes and verify the error message "<DuplicateSize>","<DupSortOrder>"
    And  Create twoD sizes with different type of dimension "<CompSize>","<CompSize2>","<CompSize3>","<CompSize4>","<CompSize5>","<CompSize6>","<DimensionType>","<DimensionType2>","<DimensionType3>","<DimensionType4>","<DimensionType5>","<DimensionType6>","<CompSizeSO1>","<CompSizeSO2>","<CompSizeSO3>","<CompSizeSO4>","<CompSizeSO5>","<CompSizeSO6>"
   When User selects the created sizes for TwoD sizes "<2DimensionSize1>","<2DimensionSize2>","<2DimensionSize3>","<2DimensionSize4>","<2DimensionSize5>","<2DimensionSize6>","<2DimensionSize7>","<2DimensionSize8>","<2DimensionSize9>","<CompSize>","<CompSize2>","<CompSize3>","<CompSize4>","<CompSize5>","<CompSize6>"
    And  Create size range for the sizes "<SizeRange>","<Description>","<EnumerationValue2>","<Enumeration Value>"
    Then User selects the sizes for the created size range "<2DimensionSize1>","<2DimensionSize2>","<2DimensionSize3>","<2DimensionSize4>","<2DimensionSize5>","<2DimensionSize6>","<2DimensionSize7>","<2DimensionSize8>","<2DimensionSize9>","<SizeRange>"
    And  User creates simple size range for validation "<SimpleSizeName1>","<SimpleSizeName2>","<CompSizeName>"
    Then Merging of composite size type "<Size>","<Size1>","<Size2>","<Size3>","<Size4>","<Size5>","<SimpleSizeName1>","<SimpleSizeName2>"
    And Selecting the sub ranges for composite sizes "<SimpleSizeName1>","<SimpleSizeName2>"
    Then Validate the options like copy and delete for size Range "<CopySizeName>","<CompSizeName>"
    And Create a Size Map and validate the status "<SizeRange>","<CompSizeName>","<SizeMapName>","<Size>"
   Then Logout from the Application


  Examples:
    |Enumeration      |Enumeration Value|Description|EnumerationValue2|Description2|Size  |SortOrder|Size1  |SortOrder1|Size2  |SortOrder2|Size3  |SortOrder3|Size4 |SortOrder4|Size5 |SortOrder5|DuplicateSize|DupSortOrder|CompSize|DimensionType|CompSize2|DimensionType2|CompSize3|DimensionType3|CompSize4|DimensionType4|CompSize5|DimensionType5|CompSize6|DimensionType6|CompSizeSO1|CompSizeSO2|CompSizeSO3|CompSizeSO4|CompSizeSO5|CompSizeSO6|2DimensionSize1|2DimensionSize2|2DimensionSize3|2DimensionSize4|2DimensionSize5|2DimensionSize6|2DimensionSize7|2DimensionSize8|2DimensionSize9|SizeRange    |SimpleSizeName1|SimpleSizeName2|CompSizeName |CopySizeName|SizeMapName|SizeSpec                             |
    |DimensionType (1)|Length           |2DSizeModul|Waist            |2DSize      |small |01       |medium |02        |large  |03        |SMALL  |04        |XL    |05        |XXL   |06        |SMALL        |04          |W1      |Waist        |W2       |Waist        |W3        |Waist         |L1       |Length        |L2       |Length        |L3       |Length        |11         |12         |13         |14         |15         |16         |W1/L1          |W1/L2          |W1/L3          |W2/L1          |W2/L2          |W2/L3          |W3/L1          |W3/L2          |W3/L3          |MensRegular  |MensPants      |MensJeans       |Childrenswear|2DSizesCopy |Elastic   |Characteristic,Construction,Packaging|
