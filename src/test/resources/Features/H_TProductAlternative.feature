  #Author:Tharun
  @TK @ProductAlternative 
  Feature: Product alternative creation & validation

  Scenario Outline: Product alternative & validation
  Given User launches centric application
  Then Go to homepage
  And verify user screen
  When user navigates to lookup tab
  Then user creates the product alternative data "<ProductAlternative>"
  Then Validate the options like copy and delete for size label "China-COPY","<ProductAlternativeCopy>"
  Then Logout from the Application

  Examples:
  |ProductAlternative            |ProductAlternativeCopy|
  |China,Italy,Vietnam (no qoute)|China                 |

  #-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

