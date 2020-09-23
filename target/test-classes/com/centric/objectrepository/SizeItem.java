package com.centric.objectrepository;

import com.centric.resources.Commonactions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SizeItem extends Commonactions {

    public SizeItem() {
        PageFactory.initElements(Commonactions.driver, this);
    }

    @FindBy(how = How.CSS,using = "[data-csi-tab='ApparelViews-SpecificationItemDefinitions']")
    private WebElement SetupStyleItemTab;

    @FindBy(how = How.CSS,using = "[data-csi-automation='plugin-ApparelViews-SpecificationItemDefinitions-ToolbarNewActions']")
    private WebElement SetupStyleItemAction;

    @FindBy(how = How.CSS,using = "[data-csi-automation='field-SpecificationItemDefinition-Form-Subtype'] .dijitArrowButton")
    private WebElement SpecTypeOptionList;

    @FindBy(how = How.CSS,using = "[data-csi-automation='field-SpecificationItemDefinition-Form-Subtype'] .dijitInputInner")
    private WebElement SpecTypeInputTextBtn;

    @FindBy(how = How.CSS,using = "[data-csi-automation='field-SpecificationItemDefinition-Form-Node Name'] .dijitInputInner")
    private WebElement SpecItemInputTextBtn;

    public WebElement getSpecItemInputTextBtn() { return SpecItemInputTextBtn; }
    public WebElement getSpecTypeInputTextBtn() { return SpecTypeInputTextBtn; }
    public WebElement getSpecTypeOptionList() { return SpecTypeOptionList; }
    public WebElement getSetupStyleItemAction() { return SetupStyleItemAction; }
    public WebElement getSetupStyleItemTab() { return SetupStyleItemTab;
    }
}
