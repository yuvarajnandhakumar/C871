#Author:Tharun
@TK 
Feature: Size Chart creation & validation

#  @RegressionCICD
@SizeChart
  Scenario Outline: Data creation for the size chart
    Given User launches centric application
    Then Go to homepage
    And verify user screen
    When user navigates to size chart tab
    Then create the size charts "<SizeChart>","<SizeChartDec>","<SizeChartDecAlt>"

    Examples:
      |SizeChart                               |SizeChartDec                                                                                                                                                                           |SizeChartDecAlt                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      |
      |A15E,A16S,A25FE,A26FS,A29,C122,C123,U550|NECK WIDTH_EDGE TO EDGE,NECK WIDTH_SEAM TO SEAM,FRONT NECK DROP_EDGE TO EDGE,FRONT NECK DROP_SEAM TO SEAM,HPS DROP TO CLOSURE_LOW,WAIST_RIGID WAISTBAND,WAIST_ELASTIC BAND RELAXED,KNEE|Measure neck opening straight across from inside edge to inside edge,Measure neck opening straight across from seam to seam,Measure from high point shoulder to center front neck edge,Measure from high point shoulder seam to center front neck seam,Measure from high point shoulder to center of first button,Align top edge of waistband Measure straight across from inside edge to inside edge (waist closure must be fastened),Measure with elastic relaxed and top edge of waistband aligned straight across top edge from inside edge to inside edge (waist closure must be fastened),Measure straight across leg grain at point indicated on specification|

    #---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
@SizeChart
  Scenario Outline: SizeChart increment creation
    #Given User launches centric application
    Then Go to homepage
    And verify user screen
    When user navigates to size chart tab
    Then creates the increment for the size chart "<SizeIncrement>"
    Then Logout from the Application

    Examples:
      |SizeIncrement                        |
      |Womens alpha tops,2D Pants Grade Rule|

    #---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
@TRun @Jenkins
  Scenario Outline: Mapping of values increment Tab
    Given User launches centric application
    Then Go to homepage
    And verify user screen
    When user navigates to sizeRange tab for twoDsize validation "MensRegular"
    When user navigates to size chart tab
    Then user maps the size range for the increments "<SizeIncrement>","<SizeRange>"
    And user maps the dimensions inside the increments values "<Increment1>","<Increment2>","<dim1>","<dim2>","<dim3>","<dim4>","<dim5>","<dim6>","<dim7>"
    When user selects the base sizes for the increments "<Increment1>","<Increment2>","<baseSize1>","<baseSize2>"
    And user creation of tags in the dimension "<dim3>"
    Then user will create the product group
    Then Logout from the Application

    Examples:
      | SizeRange               |SizeIncrement                        |Increment1       |Increment2         |dim1|dim2|dim3|dim4|dim5 |dim6|dim7 |baseSize1|baseSize2|
      |Childrenswear,MensRegular|Womens alpha tops,2D Pants Grade Rule|Womens alpha tops|2D Pants Grade Rule|C122|C123|A15E|A16S|A25FE|A29 |A26FS|W2/L2    |large    |

