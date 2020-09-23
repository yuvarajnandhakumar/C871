#Author: karthick@kripya.com
@Selenium @Sample
Feature: Style and Material Sample validation

  
  Scenario Outline: Style ColorSpec creation
    Given User launches centric application
    Then Go to homepage
    And verify user screen
    When User update property table with "<Code>","<Description>","<SizeRange>"
    And User creates colorway "<ColorSpec>","<ColorwayA>","<ColorwayB>","<Description>"

    Examples: 
      | Code | Description | SizeRange | ColorSpec   | ColorwayA        | ColorwayB         |
      |  123 | Automation  | MensJeans | GLASS GREEN | Blue Color faded | Green Color faded |

  #-----------------------------------------------------------------------------------------------------------------
 
  Scenario Outline: Style Sample Creation
   # Given User launches centric application
    Then Go to homepage
    And verify user screen
    Then Go to homepage
    And User creates style sample combination "<StyleSample>","<Style>","<DimensionA>","<DimensionB>"

    Examples: 
      | StyleSample          | DimensionA | DimensionB       | Style         |
      | Jeans Sample - Style | Colors     | Colors and Sizes | Style - Proto |

  #-----------------------------------------------------------------------------------------------------------------
 
  Scenario Outline: Style Quality Creation
   #  Given User launches centric application
    Then Go to homepage
    And verify user screen
    When User update quality types
    Then Go to homepage
    And User creates Style quality "<TestrunA>","<TestRunB>","<TestGrpA>","<TestGrpB>","<SampleA>","<SampleB>","<User>","<Supplier>"
    And User Creates test run templates
    And User approve test run "<Code>","<Description>","<Comment>"

    Examples: 
      | TestrunA          | TestRunB          | TestGrpA            | TestGrpB        | SampleA | SampleB | User          | Supplier               | Code | Description | Comment  |
      | Acid Test - Style | Wash Test - Style | Chemical Test Group | Wash Test Group | small   | EGRET   | Administrator | Supplier |  123 | Automation  | Test Run |

  #-----------------------------------------------------------------------------------------------------------------
 
  Scenario Outline: Material ColorSpec creation
    # Given User launches centric application
    Then Go to homepage
    And verify user screen
    When User update material property table with "<SizeRange>"
    And User creates material colorway "<ColorwayA>","<Description>"

    Examples: 
      | SizeRange | Description | ColorwayA     |
      | MensJeans | Automation  | Green CM - 01 |

  #-----------------------------------------------------------------------------------------------------------------
 
  Scenario Outline: Material Sample Creation
  #  Given User launches centric application
    Then Go to homepage
    And verify user screen
    And User creates material sample combination "<MaterialSample>","<Material>","<DimensionA>","<DimensionB>","<Code>"

    Examples: 
      | Code | Material         | MaterialSample          | DimensionA | DimensionB       |
      |  123 | Material - Proto | Jeans Sample - Material | Colors     | Sample per active color |

  #-----------------------------------------------------------------------------------------------------------------

  Scenario Outline: Material Quality Creation
    # Given User launches centric application
    Then Go to homepage
    And verify user screen
    And User creates Material quality "<TestrunA>","<TestRunB>","<TestGrpA>","<TestGrpB>","<SampleA>","<SampleB>","<User>","<Supplier>"
    And User approve material test run
    And User Creates material test run templates
    

    Examples: 
      | TestrunA             | TestRunB             | TestGrpA            | TestGrpB        | SampleA | SampleB | User          | Supplier               |
      | Acid Test - Material | Wash Test - Material | Chemical Test Group | Wash Test Group | Green   | EGRET   | Administrator | Supplier |

#-----------------------------------------------------------------------------------------------------------------
 
  Scenario Outline: Supplier Quote Creation
   # Given User launches centric application
    Then Go to homepage
    And verify user screen
    When User creates Style sourcing price list
    And User Creates Style Supplier Quotes "<Supplier>","<SQ-Template>","<Set>"
    And User creates Style product blended cost "<Product>"
 
    
   Examples:
   |Supplier|SQ-Template|Set|Product| 
   |Supplier|Supplier Quote - Template|SS - Supplier|Product Blend Cost|
   
 #-----------------------------------------------------------------------------------------------------------------
 
  Scenario Outline: Supplier Request Creation
   # Given User launches centric application
    Then Go to homepage
    And verify user screen  
    When User creates Supplier Requests "<RequestTemplate>","<RequestName>"
    And User creates copy templates "<CopyTemp>"
    Then Go to homepage
    And User add new inspiration products "<InspA>","<InspB>"
   
    
  Examples:
  |RequestTemplate|RequestName|InspA|InspB|CopyTemp|
  |SRT - Style|Apparel - SR|Auto Inspiration|New Inspiration| Copy Template - Inspiration |
  
   #--------------------------------------------------------------------------------------------------- 
    @sourcingpo 
  Scenario Outline: Documents validation1
  #  Given User launches centric application
    Then Go to homepage
    And verify user screen
   When Create PO Group and Supplier PO "<PoGroup>","<supplierpovalue1>","<supplierpovalue2>","<quotevalueBlue>","<quotevaluegreen>","<EditValue>","<dispoint>","<disvalue>","<allowancepoint>","<allowancevalue>"
    Then user creates shipment qc and set "<unitvalueb1>","<unitvalueg1>","<bshipvalue>","<qshipvalue>","<qcissue>","<selectset>","<gshipqty>","<bshipqty>"

    Examples: 
      | PoGroup        | supplierpovalue1    | supplierpovalue2     | EditValue  | quotevalueBlue         | quotevaluegreen         | dispoint | disvalue | allowancepoint | allowancevalue | unitvalueb1 | unitvalueg1 | bshipvalue | qshipvalue | qcissue | selectset   | gshipqty | bshipqty |
      | order po group | PO-AP1321-Not color | PO-AP1123-colorbased | Automation | blue color faded-large | green color faded-large |        1 |       10 |              2 |             20 |           3 |           5 |         50 |        100 | qc issue | SS-Shipment |       60 |       30 |

  #---------------------------------------------------------------------------------------------------
  @customerpo 
  Scenario Outline: Documents validation2
   # Given User launches centric application
    Then Go to homepage
    And verify user screen
    Then User creates customerpo and issue "<povalue>","<B_baseprice>","<G_baseprice>","<B_orderqty>","<G_orderqty>","<dispnt>","<disvalue>","<allowanpct>","<allowvalue>","<commission>","<payment>"
    Then Logout from the Application
 
    Examples: 
      | povalue             | B_baseprice | G_baseprice | B_orderqty | G_orderqty | dispnt | disvalue | allowanpct | allowvalue | commission | payment |
      | Target PO123#-color |         200 |         350 |         30 |         40 |      1 |      100 |          2 |         50 |          3 | cheque  |
  