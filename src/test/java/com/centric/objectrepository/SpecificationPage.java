package com.centric.objectrepository;


import com.centric.resources.Commonactions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SpecificationPage extends Commonactions {

	public SpecificationPage() {
		PageFactory.initElements(Commonactions.driver, this);
	}

	

	@FindBy(how = How.CSS,using = "span[data-csi-tab='ApparelViews-Sizes']")
	private WebElement SizeTab;

	@FindBy(how = How.CSS,using = "table[data-csi-automation='plugin-ApparelViews-Sizes-ToolbarNewActions']")
	private WebElement NewSizeAction;

	@FindBy(how = How.CSS,using = "[data-csi-automation='field-ProductSize-Form-Node Name'] .dijitInputInner")
	private WebElement SizeInputBox;

	@FindBy(how = How.CSS,using = "[data-csi-automation='field-ProductSize-Form-DimensionType'] .dijitArrowButton")
	private WebElement DimensionType;

	@FindBy(how = How.XPATH,using = "//div[@data-csi-automation='field-ProductSize-Form-DimensionType'][1]//input[@class='dijitReset dijitInputInner']")
	private WebElement DimensionBox;

	@FindBy(how = How.CSS,using = "[data-csi-automation='field-ProductSize-Form-SizeCode'] .dijitInputInner")
	private WebElement SortOrderBox;

	@FindBy(how = How.XPATH,using = "//div[text()='Duplicate sizes are not allowed.']")
	private WebElement DuplicateSize;

	@FindBy(how = How.CSS,using = "span[data-csi-act='Cancel']")
	private WebElement Cancel;

	@FindBy(how = How.CSS,using = "input[name='IsTwoDim']")
	private WebElement TwoDimensionCheckBox;

	@FindBy(how = How.XPATH,using = "//div[@data-csi-automation='field-ProductSize-Form-Dimension1Size']//input[@class='dijitReset dijitInputInner']")
	private WebElement OneDimBox;

	@FindBy(how = How.XPATH,using = "//div[@data-csi-automation='field-ProductSize-Form-Dimension2Size']//input[@class='dijitReset dijitInputInner']")
	private WebElement SecondDimBox;

	@FindBy(how = How.CSS,using = "span[data-csi-tab='ApparelViews-SizeRanges']")
	private WebElement SizeRangeTab;

	@FindBy(how = How.CSS,using = "table[data-csi-automation='plugin-ApparelViews-SizeRanges-ToolbarNewActions']")
	private WebElement SizeRangeAction;

	@FindBy(how = How.CSS,using = "[data-csi-automation='field-SizeRange-Form-Node Name'] .dijitInputInner")
	private WebElement SizeRangeName;

	@FindBy(how = How.CSS,using = "input[name='Description']")
	private WebElement SizeRangeDescription;

	@FindBy(how = How.XPATH,using = "//div[@data-csi-automation='field-SizeRange-Form-Dimension1Type']//input[@class='dijitReset dijitInputInner']")
	private WebElement SizeRangeOneDimBox;

	@FindBy(how = How.XPATH,using = "//div[@data-csi-automation='field-SizeRange-Form-Dimension2Type']//input[@class='dijitReset dijitInputInner']")
	private WebElement SizeRangeSecondDimDox;

	@FindBy(how = How.CSS,using = "span[data-csi-act='SelectSizeChartSubSizeRanges']")
	private WebElement SubSizeRange;

	@FindBy(how = How.CSS,using = "span[data-csi-tab='SizeRange-SizeMaps']")
	private WebElement SRSizeMapTab;

	@FindBy(how = How.CSS,using = "table[data-csi-automation='plugin-SizeRange-SizeMaps-ToolbarNewActions']")
	private WebElement SRSizeMapAction;

	@FindBy(how = How.CSS,using = "div[data-csi-automation='field-SizeMap-Form-TargetSizeRange'] input.dijitInputInner")
	private WebElement TargetSizeRangeBox;

	@FindBy(how = How.CSS,using = "div[data-csi-automation='field-SizeMap-Form-Node Name'] input.dijitInputInner")
	private WebElement SRSizeMapName;

	@FindBy(how = How.XPATH,using = "//span[contains(text(),'Make active')]")
	private WebElement MakeActiveBtn;

	@FindBy(how = How.XPATH,using = "//span[@data-csi-tab='ApparelViews-ProductSpec']")
	private WebElement SpecificationTab;

	@FindBy(how = How.XPATH,using = "//div/textarea")
	private WebElement RF_InputText;

	@FindBy(how = How.XPATH,using = "//div[text()='Duplicate sizes are not allowed.']")
	private WebElement DuplicateSizeError;

	@FindBy(how = How.XPATH,using = "//div[text()='The Sort Order must be unique for each Dimension Type.']")
	private WebElement DuplicateSortOdError;

	@FindBy(how = How.XPATH,using = "//div[@data-csi-automation='field-SizeRange-Form-Dimension1Type'][1]//input[@class='dijitReset dijitInputInner']")
	private WebElement SRDimensionTypeBx;

	public WebElement getSRDimensionTypeBx() { return SRDimensionTypeBx; }

	public WebElement getDuplicateSortOdError() {
		return DuplicateSortOdError;
	}

	public WebElement getDuplicateSizeError() {
		return DuplicateSizeError;
	}

	public WebElement getRF_InputText() {
		return RF_InputText;
	}

	public WebElement getSpecificationTab() {
		return SpecificationTab;
	}


	public WebElement getMakeActiveBtn() {
		return MakeActiveBtn;
	}

	public WebElement getSRSizeMapName() {
		return SRSizeMapName;
	}

	public WebElement getTargetSizeRangeBox() {
		return TargetSizeRangeBox;
	}

	public WebElement getSRSizeMapAction() {
		return SRSizeMapAction;
	}

	public WebElement getSRSizeMapTab() {
		return SRSizeMapTab;
	}

	public WebElement getSubSizeRange() {
		return SubSizeRange;
	}

	public WebElement getSizeRangeOneDimBox() {
		return SizeRangeOneDimBox;
	}

	public WebElement getSizeRangeSecondDimDox() {
		return SizeRangeSecondDimDox;
	}

	public WebElement getSizeRangeDescription() {
		return SizeRangeDescription;
	}

	public WebElement getSizeRangeName() {
		return SizeRangeName;
	}

	public WebElement getSizeRangeAction() {
		return SizeRangeAction;
	}

	public WebElement getSizeRangeTab() {
		return SizeRangeTab;
	}

	public WebElement getSecondDimBox() {
		return SecondDimBox;
	}

	public WebElement getOneDimBox() {
		return OneDimBox;
	}

	public WebElement getTwoDimensionCheckBox() {
		return TwoDimensionCheckBox;
	}

	public WebElement getCancel() {
		return Cancel;
	}

	public WebElement getDuplicateSize() {
		return DuplicateSize;
	}

	public WebElement getSortOrderBox() {
		return SortOrderBox;
	}

	public WebElement getDimensionBox() {
		return DimensionBox;
	}

	public WebElement getDimensionType() {
		return DimensionType;
	}

	public WebElement getSizeTab() {
		return SizeTab;
	}

	public WebElement getNewSizeAction() {
		return NewSizeAction;
	}

	public WebElement getSizeInputBox() {
		return SizeInputBox;
	}
}

