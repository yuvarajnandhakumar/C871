#Author: karthick@kripya.com
@Selenium  
Feature: Specification validation

@specification
  Scenario Outline: Specification Hierarchy creation
    Given User launches centric application
    Then Go to homepage
    And verify user screen
    When User Click on specification and creates hierarchy "<Brand>","<Collection>","<Department>","<Code>","<Description>"
    And User creates style template "<Style>","<StyleType>"

    Examples: 
      | Brand         | Collection        | Department        | Code             | Description | Style              | StyleType                |
      | Denim - Brand | Mens - collection | Mens - Department | 123 - Automation | Automation  | Apparel - Template | Apparel - Color and Size |

#-------------------------------------------------------------------------------------------------------------
@specification
  Scenario: Specification Classifier creation
  #  Given User launches centric application
    Then Go to homepage
    And verify user screen
    And User creates Classifier "Classifier"
    Then Logout from the Application
    
#-------------------------------------------------------------------------------------------------------------    
@Jenkins
  Scenario Outline: Color Specification creation
    Given User launches centric application
    Then Go to homepage
    And verify user screen
    And user creates color specification and validation "<Description>","<Color>","<RGB-Hex>"

    Examples: 
      | Description | Color | RGB-Hex |
      | Automation  | Black | #000000 |

#-------------------------------------------------------------------------------------------------------------
@Jenkins
  Scenario Outline: 
    Given User launches centric application
    Then Go to homepage
    And verify user screen
    And User setup enumeration configurtion "<Length>","<Waist>"
    And User update configuration
    When User creates Dimension-Type sizes "<Sizes>"
    And User creates Dimension-Type length "<LenSizes>","Length"
    And User creates two dimensional sizes
    And User creates size range and performing copy action "<SizeRange>","<Description>"
    And User creates two dimensional size range "<2DSizeRange>","<Description>"

    Examples: 
      | Length | Waist | Sizes    | LenSizes | Description | SizeRange              | 2DSizeRange |
      | Length | Waist | 30,32,34 | S,M,L    | Automation  | Simple SR 30 - 34 Auto | 2D SR -Auto |
      
#-------------------------------------------------------------------------------------------------------------      
