  #Author:Tharun
  @TK @LookUp 
  Feature: LookUp creation & validation

  Scenario Outline: Lookup creation & validation
  Given User launches centric application
  Then Go to homepage
  And verify user screen
  When user navigates to lookup tab
  And user creates the lookup "<LookUp>","<LookUpTypes>","<Code>","<desc>"
  And user creates the lookup "<LookUp1>","<LookUpTypes2>","<Code>","<desc>"
  And user creates the lookup "<LookUp2>","<LookUpTypes3>","<Code>","<desc>"
  Then Validate the options like copy and delete for lookup "Reg_colorCopy","<LookUpCopy>"
  Then Logout from the Application
  
  Examples:
  |LookUp                                                                                                        |LookUpCopy                              |LookUpTypes |LookUpTypes2    | LookUpTypes3       |LookUp1                                                                               |LookUp2                                                                                                                                                                                                               |Code      |desc     |
  |01_Low Cost Factor,02_Mid Cost Factor,03_High Cost Factor,04_Very High Cost Factor,05_Speciality Products Only|005a_Create Design BOM_Apparel_Carryover|Cost Factors|Holiday Calendar|User Task Lead Times|IND-Dussehra-2020,IND-Dussehra-2019,IND-Diwali-2020,IND-Diwali-2019,IND-Christmas-2020|001_Fill Set-up details_Apparel_Carryover,002_Review and Approve Style Targets_Apparel_Carryover,003_Create Colorways_Apparel_Carryover,004_Upload Sketches_Apparel_Carryover,005a_Create Design BOM_Apparel_Carryover|1,2,3,4,5|LookupData|

  #----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
