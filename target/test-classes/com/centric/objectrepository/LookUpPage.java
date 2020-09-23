package com.centric.objectrepository;

import com.centric.resources.Commonactions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LookUpPage extends Commonactions {

    public LookUpPage() {
        PageFactory.initElements(Commonactions.driver, this);
    }

    @FindBy(how = How.CSS,using = "[data-csi-tab='ApparelViews-LookupItems']")
    private WebElement LookUpTab;

    @FindBy(how = How.CSS,using = "[data-csi-automation='plugin-ApparelViews-LookupItems-ToolbarNewActions']")
    private WebElement LookUpActionBtn;

    @FindBy(how = How.CSS,using = "[data-csi-automation='field-LookupItem-Form-Subtype'] .dijitInputInner")
    private WebElement LookUpInputTxtBox;

    @FindBy(how = How.CSS,using = "[data-csi-automation='field-LookupItem-Form-Node Name'] .dijitInputInner")
    private WebElement LookUpNameTxtBox;

    @FindBy(how = How.CSS,using = "[data-csi-automation='field-LookupItem-Form-Code'] .dijitInputInner")
    private WebElement LookUpCodeTxtBox;

    @FindBy(how = How.CSS,using = "//textarea[@data-csi-automation='field-LookupItem-Form-Description']")
    private WebElement LookUpDescTxtBox;

    @FindBy(how = How.CSS,using = "[data-csi-tab='ApparelViews-ProductAlternativeSpecifications']")
    private WebElement ProductAlternativeTab;

    @FindBy(how = How.CSS,using = "[data-csi-automation='plugin-ApparelViews-ProductAlternativeSpecifications-ToolbarNewActions']")
    private WebElement ProductAlternativeActionBtn;

    public WebElement getProductAlternativeActionBtn() { return ProductAlternativeActionBtn; }
    public WebElement getProductAlternativeTab() { return ProductAlternativeTab;}

    public WebElement getLookUpDescTxtBox() { return LookUpDescTxtBox; }
    public WebElement getLookUpCodeTxtBox() { return LookUpCodeTxtBox; }
    public WebElement getLookUpNameTxtBox() { return LookUpNameTxtBox; }
    public WebElement getLookUpInputTxtBox() { return LookUpInputTxtBox; }
    public WebElement getLookUpActionBtn() { return LookUpActionBtn; }
    public WebElement getLookUpTab() { return LookUpTab;
    }
}
