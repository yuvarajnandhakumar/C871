package com.centric.stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.centric.objectrepository.DocumentPage;
import com.centric.objectrepository.HomePage;
import com.centric.objectrepository.MaterialSpecificationPage;
import com.centric.objectrepository.PopupPage;
import com.centric.objectrepository.QualityPage;
import com.centric.objectrepository.SourcingPage;
import com.centric.objectrepository.SpecificationHierarchyPage;
import com.centric.objectrepository.StyleMaterialSamplepage;
import com.centric.objectrepository.StylePage;
import com.centric.objectrepository.UserManagementPage;
import com.centric.resources.Commonactions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StyleMaterialSamplePageSteps extends Commonactions{
	
	HomePage hp = new HomePage();
	Commonactions ca = new Commonactions();
	MaterialSpecificationPage mp = new MaterialSpecificationPage();
	SpecificationHierarchyPage sh = new SpecificationHierarchyPage();
	PopupPage pp = new PopupPage();
	SourcingPage sp = new SourcingPage();
    QualityPage  qp = new QualityPage();
    StylePage st = new StylePage();
    StyleMaterialSamplepage sm = new StyleMaterialSamplepage();
    
    @When("User update property table with {string},{string},{string}")
    public void user_update_property_table_with(String string, String string2, String string3) throws Throwable {
        
    	Commonactions.isElementPresent(sm.getLeftArrow());
    	ca.click(sm.getLeftArrow());
    	Commonactions.isElementPresent(hp.getStyleBtn());
    	ca.click(hp.getStyleBtn());
    	Commonactions.isElementPresent(sm.getWinterSeason());
    	ca.click(sm.getWinterSeason());
    	Commonactions.isElementPresent(st.getStyles_Btn());
    	ca.click(st.getStyles_Btn());
    	Commonactions.isElementPresent(sm.getClrAndSize());
    	ca.click(sm.getClrAndSize());
    	Commonactions.isElementPresent(sp.getCntryCode());
    	ca.click(sp.getCntryCode());
    	ca.eleToBeClickable();
    	WebElement a = ca.activeElement();
    	ca.eleToBeClickable();
    	ca.insertText(a, string);
    	ca.eleToBeClickable();
    	a.sendKeys(Keys.TAB);
    	ca.eleToBeClickable();
    	WebElement a1 = ca.activeElement();
    	ca.eleToBeClickable();
    	ca.insertText(a1, string2);
    	ca.eleToBeClickable();
    	a1.sendKeys(Keys.TAB);
    	Commonactions.isElementPresent(sm.getSizeRange());
    	ca.click(sm.getSizeRange());
    	ca.eleToBeClickable();
    	WebElement a2 = ca.activeElement();
    	ca.eleToBeClickable();
    	ca.insertText(a2, string3);
    	ca.eleToBeClickable();
    	ca.jsMouseOver();
    	Commonactions.isElementPresent(sm.getEditIcon());
    	Commonactions.clickjs(sm.getEditIcon());
    	ca.eleToBeClickable();
    	
    	List<WebElement> size = driver.findElements(By.xpath("//th[contains(@class,'matrix')]/div/span"));
    	for (int i = 0; i < size.size(); i++) {
			int j= i+1;
			String text = driver.findElement(By.xpath("(//th[contains(@class,'matrix')]/div/span[1])["+j+"]")).getText();
    		System.out.println(text);
		}
    	Commonactions.isElementPresent(sm.getCloseBtn());
    	ca.click(sm.getCloseBtn());
    	
    	System.out.println("Style property table updated successfully");
    	
    }

    @When("User creates colorway {string},{string},{string},{string}")
    public void user_creates_colorway(String string, String string2, String string3, String string4) throws Throwable {
        
    	Commonactions.isElementPresent(sm.getColorways());
    	ca.click(sm.getColorways());
    	Commonactions.isElementPresent(sm.getNewColorexpand());
    	ca.click(sm.getNewColorexpand());
    	Commonactions.isElementPresent(sm.getNewFromColor());
    	ca.click(sm.getNewFromColor());
    	Commonactions.isElementPresent(sm.getEgretChkBx());
    	ca.click(sm.getEgretChkBx());
    	Commonactions.isElementPresent(sm.getVanillaChkbx());
    	ca.click(sm.getVanillaChkbx());
    	Commonactions.isElementPresent(sm.getAntiqueChkBx());
    	ca.click(sm.getAntiqueChkBx());
    	Commonactions.isElementPresent(mp.getSave_btn1());
    	ca.click(mp.getSave_btn1());
    	Commonactions.isElementPresent(mp.getSave_btn1());
    	ca.click(mp.getSave_btn1());
    	ca.eleToBeClickable();
    	Commonactions.isElementPresent(mp.getSave_btn1());
    	ca.click(mp.getSave_btn1());
    	ca.eleToBeClickable();
    	Commonactions.isElementPresent(mp.getSave_btn1());
    	ca.click(mp.getSave_btn1());
    	Commonactions.isElementPresent(sm.getJeans());
    	
    	ca.click(sm.getJeans());
    	Commonactions.isElementPresent(sm.getClrAndSize());
    	ca.jsScrollPageDown(sm.getClrAndSize());
    	Commonactions.isElementPresent(sm.getPopupClrWys());
    	ca.click(sm.getPopupClrWys());
    	Commonactions.isElementPresent(sm.getAntiqueDel());
    	ca.click(sm.getAntiqueDel());
    	Commonactions.isElementPresent(pp.getDelete_Btn());
    	ca.click(pp.getDelete_Btn());
    	Commonactions.isElementPresent(sm.getCloseBtn());
    	ca.click(sm.getCloseBtn());
    	Commonactions.isElementPresent(sm.getClrAndSize());
    	ca.click(sm.getClrAndSize());
    	Commonactions.isElementPresent(sm.getEgretCopy());
    	ca.click(sm.getEgretCopy());
    	ca.eleToBeClickable();
    	String text = driver.findElement(By.xpath("(//a[contains(text(),'EGRET')])[1]")).getText();
    	Commonactions.isElementPresent(sm.getColorwayvalue());
    	ca.insertText(sm.getColorwayvalue(), text+" - Copy");
    	Commonactions.isElementPresent(sm.getColorSpecValue());
    	ca.click(sm.getColorSpecValue());
    	ca.eleToBeClickable();
    	WebElement a = ca.activeElement();
    	ca.eleToBeClickable();
    	a.sendKeys(Keys.DELETE);
    	ca.eleToBeClickable();
    	ca.insertText(a, string);
    	ca.eleToBeClickable();
    	ca.jsMouseOver();
    	Commonactions.isElementPresent(mp.getSave_btn1());
    	ca.click(mp.getSave_btn1());
    	Commonactions.isElementPresent(sm.getNewColorwayBtn());
    	
    	ca.click(sm.getNewColorwayBtn());
    	Commonactions.isElementPresent(sm.getColorwayvalue());
    	ca.insertText(sm.getColorwayvalue(), string2);
    	Commonactions.isElementPresent(sm.getMDescription());
    	ca.insertText(sm.getMDescription(), string4);
    	Commonactions.isElementPresent(mp.getSave_btn1());
    	ca.click(mp.getSave_btn1());
    	Commonactions.isElementPresent(sm.getNewColorwayBtn());
    	
    	ca.click(sm.getNewColorwayBtn());
    	Commonactions.isElementPresent(sm.getColorwayvalue());
    	ca.insertText(sm.getColorwayvalue(), string3);
    	Commonactions.isElementPresent(sm.getMDescription());
    	ca.insertText(sm.getMDescription(), string4);
    	Commonactions.isElementPresent(sm.getCreateClrspecChkBx());
    	ca.click(sm.getCreateClrspecChkBx());
    	Commonactions.isElementPresent(mp.getSave_btn1());
    	ca.click(mp.getSave_btn1());
    	
    	System.out.println("Style colorway created successfully");
    	
    }

    @Then("User setup enumeration configurtion for Sample {string},{string}")
    public void user_setup_enumeration_configurtion_for_Sample(String string, String string2) throws Throwable {
        
    	Commonactions.isElementPresent(hp.getUser_setupBtn());
		ca.click(hp.getUser_setupBtn());
		Commonactions.isElementPresent(sh.getEnumeration());
		ca.click(sh.getEnumeration());
		Commonactions.isElementPresent(sh.getEnumeration_Search());
		ca.click(sh.getEnumeration_Search());
		Commonactions.isElementPresent(sm.getSampleType());
        ca.click(sm.getSampleType());
		Commonactions.isElementPresent(sh.getClick_Custom());
		ca.click(sh.getClick_Custom());
		Thread.sleep(2000);
		driver.navigate().refresh();
		Commonactions.jsWaitForPageLoad();
		Commonactions.isElementPresent(sh.getPlus_Icon_2());
		ca.click(sh.getPlus_Icon_2());
		Commonactions.isElementPresent(sh.getEnum_Value());
		ca.insertText(sh.getEnum_Value(), string);
		Commonactions.isElementPresent(pp.getConfig_save_Btn());
		ca.click(pp.getConfig_save_Btn());
		Commonactions.isElementPresent(sh.getEnumeration_Search());

        ca.click(sh.getEnumeration_Search());
		Commonactions.isElementPresent(sm.getMaterialSampleType());
        ca.click(sm.getMaterialSampleType());
		Commonactions.isElementPresent(sh.getClick_Custom());
		ca.click(sh.getClick_Custom());
		Commonactions.isElementPresent(sm.getEnumChkBx());
        ca.click(sm.getEnumChkBx());
		Commonactions.isElementPresent(sh.getPlus_Icon_2());
		Thread.sleep(6000);
		ca.click(sh.getPlus_Icon_2());
		Commonactions.isElementPresent(sh.getEnum_Value());
		ca.insertText(sh.getEnum_Value(), string2);
		Commonactions.isElementPresent(pp.getConfig_save_Btn());
		ca.click(pp.getConfig_save_Btn());
		ca.eleToBeClickable();
		
		System.out.println("Style and Material sample enumeration created successfully");

    }

    @Then("User creates style sample combination {string},{string},{string},{string}")
    public void user_creates_style_sample_combination(String string, String string2, String string3, String string4) throws Throwable {
        
    
    	Commonactions.isElementPresent(hp.getStyleBtn());
    	ca.click(hp.getStyleBtn());
    	Commonactions.isElementPresent(sm.getWinterSeason());
    	ca.click(sm.getWinterSeason());
    	Commonactions.isElementPresent(st.getStyles_Btn());
    	ca.click(st.getStyles_Btn());
    	Commonactions.isElementPresent(sm.getClrAndSize());
    	ca.click(sm.getClrAndSize());
    	Commonactions.isElementPresent(sm.getSamples());
    	ca.click(sm.getSamples());
    	Commonactions.isElementPresent(sm.getSampleBtn());
    	ca.click(sm.getSampleBtn());
    	ca.eleToBeClickable();
    	WebElement e = ca.activeElement();
    	ca.eleToBeClickable();
    	ca.insertText(e, "Supplier");
    	ca.eleToBeClickable();
    	ca.click(driver.findElement(By.xpath("//div[@role='option' and @item='1']/div")));
		ca.eleToBeClickable();
		e.sendKeys(Keys.TAB);
		Commonactions.isElementPresent(sm.getSampleValue());
    	ca.insertText(sm.getSampleValue(), string);
    	Commonactions.isElementPresent(sm.getSampleType1());
    	ca.click(sm.getSampleType1());
    	ca.eleToBeClickable();
    	WebElement a = ca.activeElement();
    	ca.eleToBeClickable();
    	ca.insertText(a, string2);
    	ca.eleToBeClickable();
    	ca.jsMouseOver();
    	Commonactions.isElementPresent(mp.getSave_btn1());
    	ca.click(mp.getSave_btn1());
    	ca.eleToBeClickable();
    	
    	ca.click(sm.getSampleBtn());
    	ca.eleToBeClickable();
    	WebElement e1 = ca.activeElement();
    	ca.eleToBeClickable();
    	ca.insertText(e1, "Supplier");
    	ca.eleToBeClickable();
    	ca.click(driver.findElement(By.xpath("//div[@role='option' and @item='1']/div")));
		ca.eleToBeClickable();
		e1.sendKeys(Keys.TAB);
		Commonactions.isElementPresent(sm.getSampleValue());
    	ca.insertText(sm.getSampleValue(), string);
    	Commonactions.isElementPresent(sm.getSampleType1());
    	ca.click(sm.getSampleType1());
    	ca.eleToBeClickable();
    	WebElement a1 = ca.activeElement();
    	ca.eleToBeClickable();
    	ca.insertText(a1, string2);
    	ca.eleToBeClickable();
    	ca.jsMouseOver();
    	Commonactions.isElementPresent(sm.getSampledimension());
    	ca.click(sm.getSampledimension());
    	ca.eleToBeClickable();
    	WebElement a2 = ca.activeElement();
    	ca.eleToBeClickable();
    	ca.insertText(a2, string3);
    	ca.eleToBeClickable();
    	ca.jsMouseOver();
    	ca.eleToBeClickable();
    	ca.click(sm.getColorsSel());
    	Commonactions.isElementPresent(sm.getGoTodialog1());
    	ca.click(sm.getGoTodialog1());
    	Commonactions.isElementPresent(sm.getEgretChkBx());
    	ca.click(sm.getEgretChkBx());
    	Commonactions.isElementPresent(sm.getVanillaChkbx());
    	ca.click(sm.getVanillaChkbx());
    	Commonactions.isElementPresent(mp.getSave_btn2());
    	ca.click(mp.getSave_btn2());
    	Commonactions.isElementPresent(mp.getSave_btn1());
    	ca.click(mp.getSave_btn1());
    	ca.eleToBeClickable();
    	
    	ca.click(sm.getSampleBtn());
    	ca.eleToBeClickable();
    	WebElement e2 = ca.activeElement();
    	ca.eleToBeClickable();
    	ca.insertText(e2, "Supplier");
    	ca.eleToBeClickable();
    	ca.click(driver.findElement(By.xpath("//div[@role='option' and @item='1']/div")));
		ca.eleToBeClickable();
		e2.sendKeys(Keys.TAB);
		Commonactions.isElementPresent(sm.getSampleValue());
    	ca.insertText(sm.getSampleValue(), string);
    	Commonactions.isElementPresent(sm.getSampleType1());
    	ca.click(sm.getSampleType1());
    	ca.eleToBeClickable();
    	WebElement a6 = ca.activeElement();
    	ca.eleToBeClickable();
    	ca.insertText(a6, string2);
    	ca.eleToBeClickable();
    	ca.jsMouseOver();
    	Commonactions.isElementPresent(sm.getSampledimension());
    	ca.click(sm.getSampledimension());
    	ca.eleToBeClickable();
    	WebElement a7 = ca.activeElement();
    	ca.eleToBeClickable();
    	ca.insertText(a7, "Sizes");
    	ca.eleToBeClickable();
    	ca.jsMouseOver();
    	ca.eleToBeClickable();
    	ca.click(sm.getSizesSel());
    	Commonactions.isElementPresent(sm.getGoTodialog1());
    	ca.click(sm.getGoTodialog1());
    	Commonactions.isElementPresent(sm.getMediumChkBx());
    	ca.click(sm.getMediumChkBx());
    	Commonactions.isElementPresent(sm.getLargeChkbx());
    	ca.click(sm.getLargeChkbx());
    	Commonactions.isElementPresent(mp.getSave_btn2());
    	ca.click(mp.getSave_btn2());
    	Commonactions.isElementPresent(mp.getSave_btn1());
    	ca.click(mp.getSave_btn1());
    	ca.eleToBeClickable();
    	
    	ca.click(sm.getSampleBtn());
    	ca.eleToBeClickable();
    	WebElement e3 = ca.activeElement();
    	ca.eleToBeClickable();
    	ca.insertText(e3, "Supplier");
    	ca.eleToBeClickable();
    	ca.click(driver.findElement(By.xpath("//div[@role='option' and @item='1']/div")));
		ca.eleToBeClickable();
		e3.sendKeys(Keys.TAB);
		Commonactions.isElementPresent(sm.getSampleValue());
    	ca.insertText(sm.getSampleValue(), string);
    	Commonactions.isElementPresent(sm.getSampleType1());
    	ca.click(sm.getSampleType1());
    	ca.eleToBeClickable();
    	WebElement a3 = ca.activeElement();
    	ca.eleToBeClickable();
    	ca.insertText(a3, string2);
    	ca.eleToBeClickable();
    	ca.jsMouseOver();
    	Commonactions.isElementPresent(sm.getSampledimension());
    	ca.click(sm.getSampledimension());
    	ca.eleToBeClickable();
    	WebElement a4 = ca.activeElement();
    	ca.eleToBeClickable();
    	ca.insertText(a4, string4);
    	ca.eleToBeClickable();
    	ca.jsMouseOver();
    	Commonactions.isElementPresent(sm.getQuantityChkBx());
    	ca.click(sm.getQuantityChkBx());
    	Commonactions.isElementPresent(sm.getEgret());
    	ca.insertText(sm.getEgret(),"1");
    	Commonactions.isElementPresent(sm.getEgretcopy());
    	ca.insertText(sm.getEgretcopy(), "1");
    	Commonactions.isElementPresent(sm.getEgretValue());
    	ca.insertText(sm.getEgretValue(), "1");
    	Commonactions.isElementPresent(mp.getSave_btn1());
    	ca.click(mp.getSave_btn1());
    	ca.eleToBeClickable();
    	
    	try{
    	Commonactions.isElementPresent(sm.getEgretClrCopy());
    	Commonactions.clickjs(sm.getEgretClrCopy());
    	ca.eleToBeClickable();
    	String text = driver.findElement(By.xpath("(//a[contains(text(),'EGRET-small')])[1]")).getText();
    	Commonactions.isElementPresent(sm.getSampleValue());
    	ca.insertText(sm.getSampleValue(), text+" - Copy");
    	Commonactions.isElementPresent(mp.getSave_btn1());
    	ca.click(mp.getSave_btn1());
    	}catch(Exception exp){
    		
    	}
    	System.out.println("Style Sample created successfully");
    	
    	
    }

    @When("User update quality types")
    public void user_update_quality_types() throws Throwable {
        
    	Commonactions.isElementPresent(qp.getRightArrow());
    	ca.click(qp.getRightArrow());
    	Commonactions.isElementPresent(qp.getQuality());
    	ca.click(qp.getQuality());
    	Commonactions.isElementPresent(qp.getSetup());
    	ca.click(qp.getSetup());
    	Commonactions.isElementPresent(qp.getTestSpecs());
    	ca.click(qp.getTestSpecs());
    	Commonactions.isElementPresent(sm.getApplyChemTypes());
    	ca.click(sm.getApplyChemTypes());
    	Commonactions.isElementPresent(sm.getGoTodialog());
    	ca.click(sm.getGoTodialog());
    	Commonactions.isElementPresent(sm.getQualityClrChkBx());
    	ca.click(sm.getQualityClrChkBx());
    	Commonactions.isElementPresent(sm.getQualityStandChkbc());
    	ca.click(sm.getQualityStandChkbc());
    	Commonactions.isElementPresent(mp.getSave_btn1());
    	ca.click(mp.getSave_btn1());
    	Commonactions.isElementPresent(sm.getApplyIronTypes());
    	
    	ca.click(sm.getApplyIronTypes());
    	Commonactions.isElementPresent(sm.getGoTodialog());
    	ca.click(sm.getGoTodialog());
    	Commonactions.isElementPresent(sm.getQualityClrChkBx());
    	ca.click(sm.getQualityClrChkBx());
    	Commonactions.isElementPresent(mp.getSave_btn1());
    	ca.click(mp.getSave_btn1());
    	Commonactions.isElementPresent(sm.getApplyWashTypes());
    	
    	ca.click(sm.getApplyWashTypes());
    	Commonactions.isElementPresent(sm.getGoTodialog());
    	ca.click(sm.getGoTodialog());
    	Commonactions.isElementPresent(sm.getQualityClrChkBx());
    	ca.click(sm.getQualityClrChkBx());
    	Commonactions.isElementPresent(sm.getQualityStandChkbc());
    	ca.click(sm.getQualityStandChkbc());
    	Commonactions.isElementPresent(mp.getSave_btn1());
    	ca.click(mp.getSave_btn1());
    	ca.eleToBeClickable();
    	
    	System.out.println("quality types updated successfully");
    	
    }

    @When("User creates Style quality {string},{string},{string},{string},{string},{string},{string},{string}")
    public void user_creates_Style_quality(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) throws Throwable {
        
    	Commonactions.isElementPresent(sm.getLeftArrow());
    	ca.click(sm.getLeftArrow());
    	Commonactions.isElementPresent(hp.getStyleBtn());
    	ca.click(hp.getStyleBtn());
    	Commonactions.isElementPresent(sm.getWinterSeason());
    	ca.click(sm.getWinterSeason());
    	Commonactions.isElementPresent(st.getStyles_Btn());
    	ca.click(st.getStyles_Btn());
    	Commonactions.isElementPresent(sm.getClrAndSize());
    	ca.click(sm.getClrAndSize());
    	Commonactions.isElementPresent(sm.getStyleQuality());
    	
    	ca.click(sm.getStyleQuality());
    	Commonactions.isElementPresent(sm.getNewTestRunBtn());
    	ca.click(sm.getNewTestRunBtn());
    	Commonactions.isElementPresent(sm.getTestRunValue());
    	ca.insertText(sm.getTestRunValue(), string);
    	Commonactions.isElementPresent(sm.getTestGrp());
    	ca.click(sm.getTestGrp());
    	ca.eleToBeClickable();
    	WebElement a = ca.activeElement();
    	ca.eleToBeClickable();
    	ca.insertText(a, string3);
    	ca.eleToBeClickable();
    	ca.jsMouseOver();
    	Commonactions.isElementPresent(sm.getTestRunSample());
    	ca.click(sm.getTestRunSample());
    	ca.eleToBeClickable();
    	WebElement a1 = ca.activeElement();
    	ca.eleToBeClickable();
    	ca.insertText(a1, string5);
    	ca.eleToBeClickable();
    	ca.jsMouseOver();
    	Commonactions.isElementPresent(sm.getResponsibleUser());
    	ca.click(sm.getResponsibleUser());
    	ca.eleToBeClickable();
    	WebElement a2 = ca.activeElement();
    	ca.eleToBeClickable();
    	ca.insertText(a2, string7);
    	ca.eleToBeClickable();
    	ca.jsMouseOver();
    	Commonactions.isElementPresent(sm.getSupplier());
    	ca.click(sm.getSupplier());
    	ca.eleToBeClickable();
    	WebElement a3 = ca.activeElement();
    	ca.eleToBeClickable();
    	ca.insertText(a3, string8);
    	ca.eleToBeClickable();
    	ca.jsMouseOver();
    	Commonactions.isElementPresent(sm.getQuantityTestChkBx());
    	ca.click(sm.getQuantityTestChkBx());
    	Commonactions.isElementPresent(sm.getTestVannilaChkBx());
    	ca.insertText(sm.getTestVannilaChkBx(),"1");
    	Commonactions.isElementPresent(qp.getNext());
    	ca.click(qp.getNext());
    	ca.eleToBeClickable();
    	Commonactions.isElementPresent(qp.getFinish());
    	ca.click(qp.getFinish());
    	ca.eleToBeClickable();
    	Commonactions.isElementPresent(sm.getNewTestRunBtn());
    	
    	ca.click(sm.getNewTestRunBtn());
    	Commonactions.isElementPresent(sm.getTestRunValue());
    	ca.insertText(sm.getTestRunValue(), string2);
    	Commonactions.isElementPresent(sm.getTestGrp());
    	ca.click(sm.getTestGrp());
    	ca.eleToBeClickable();
    	WebElement a4 = ca.activeElement();
    	ca.eleToBeClickable();
    	ca.insertText(a4, string4);
    	ca.eleToBeClickable();
    	ca.jsMouseOver();
    	Commonactions.isElementPresent(sm.getTestRunSample());
    	ca.click(sm.getTestRunSample());
    	ca.eleToBeClickable();
    	WebElement a5 = ca.activeElement();
    	ca.eleToBeClickable();
    	ca.insertText(a5, string6);
    	ca.eleToBeClickable();
    	ca.jsMouseOver();
    	Commonactions.isElementPresent(sm.getResponsibleUser());
    	ca.click(sm.getResponsibleUser());
    	ca.eleToBeClickable();
    	WebElement a6 = ca.activeElement();
    	ca.eleToBeClickable();
    	ca.insertText(a6, string7);
    	ca.eleToBeClickable();
    	ca.jsMouseOver();
    	Commonactions.isElementPresent(sm.getSupplier());
    	ca.click(sm.getSupplier());
    	ca.eleToBeClickable();
    	WebElement a7 = ca.activeElement();
    	ca.eleToBeClickable();
    	ca.insertText(a7, string8);
    	ca.eleToBeClickable();
    	ca.jsMouseOver();
    	Commonactions.isElementPresent(sm.getTestColorsSel());
    	ca.click(sm.getTestColorsSel());
    	Commonactions.isElementPresent(sm.getGoTodialog());
    	ca.click(sm.getGoTodialog());
    	Commonactions.isElementPresent(sm.getEgretChkBx());
    	ca.click(sm.getEgretChkBx());
    	Commonactions.isElementPresent(sm.getEgretCpyChkBx());
    	ca.click(sm.getEgretCpyChkBx());
    	Commonactions.isElementPresent(mp.getSave_btn1());
    	ca.click(mp.getSave_btn1());
    	Commonactions.isElementPresent(qp.getNext());
    	ca.click(qp.getNext());
    	Commonactions.isElementPresent(qp.getFinish());
    	ca.click(qp.getFinish());
    	ca.eleToBeClickable();
    	
    	System.out.println("Style quality created successfully");
    }

    @When("User Creates test run templates")
    public void user_Creates_test_run_templates() throws Throwable {
        
    	Commonactions.isElementPresent(sm.getTestRunexpand());
    	ca.click(sm.getTestRunexpand());
    	Commonactions.isElementPresent(sm.getTestRunTemplate());
    	ca.click(sm.getTestRunTemplate());
    	Commonactions.isElementPresent(sm.getIronTempChkBx());
    	ca.click(sm.getIronTempChkBx());
    	Commonactions.isElementPresent(mp.getSave_btn1());
    	ca.click(mp.getSave_btn1());
    	Commonactions.isElementPresent(sm.getTestColorsSel());
    	ca.click(sm.getTestColorsSel());
    	Commonactions.isElementPresent(sm.getGoTodialog());
    	ca.click(sm.getGoTodialog());
    	Commonactions.isElementPresent(sm.getEgretChkBx());
    	ca.click(sm.getEgretChkBx());
    	Commonactions.isElementPresent(sm.getEgretCpyChkBx());
    	ca.click(sm.getEgretCpyChkBx());
    	Commonactions.isElementPresent(mp.getSave_btn2());
    	ca.click(mp.getSave_btn2());
    	Commonactions.isElementPresent(mp.getSave_btn1());
    	ca.click(mp.getSave_btn1());
    	ca.eleToBeClickable();
    	
    	System.out.println("Style test run templates created successfully");
    	
    }
    
    DocumentPage dp = new DocumentPage();
    UserManagementPage up = new UserManagementPage();

    @When("User approve test run {string},{string},{string}")
    public void user_approve_test_run(String string, String string2, String string3) throws Throwable {
        
    	Commonactions.isElementPresent(sm.getWashname());
    	ca.click(sm.getWashname());
    	Commonactions.isElementPresent(sm.getTestCode());
    	ca.click(sm.getTestCode());
    	ca.eleToBeClickable();
    	WebElement a = ca.activeElement();
    	ca.eleToBeClickable();
    	ca.insertText(a, string);
    	ca.eleToBeClickable();
    	a.sendKeys(Keys.TAB);
    	ca.eleToBeClickable();
    	WebElement a1 = ca.activeElement();
    	ca.eleToBeClickable();
    	ca.insertText(a1, string2);
    	ca.eleToBeClickable();
    	a1.sendKeys(Keys.TAB);
    	Commonactions.isElementPresent(qp.getCanvas());


        ca.click(qp.getCanvas());
		Commonactions.isElementPresent(qp.getCreateanewCanvas());
		ca.click(qp.getCreateanewCanvas());
		Commonactions.isElementPresent(qp.getRectangle());
		ca.click(qp.getRectangle());
		ca.eleToBeClickable();
		Actions actions = new Actions(driver);
		Commonactions.isElementPresent(qp.getDoubleClick());
		actions.doubleClick(qp.getDoubleClick()).perform();
		Commonactions.isElementPresent(qp.getSaveAndFinish());
		ca.click(qp.getSaveAndFinish());
		ca.eleToBeClickable();
                
		ca.click(dp.getDocandComm());
		Commonactions.isElementPresent(sp.getApproveActions());
		ca.click(sp.getApproveActions());
		Commonactions.isElementPresent(sp.getApprove());
		ca.click(sp.getApprove());
		Commonactions.isElementPresent(sm.getApparel());

		ca.click(sm.getApparel());
		
		System.out.println("Style quality approved successfully");
    	
    }

    @When("User update material property table with {string}")
    public void user_update_material_property_table_with(String string) throws Throwable {
        
    	Commonactions.isElementPresent(hp.getMaterialBtn());
    	ca.click(hp.getMaterialBtn());
    	Commonactions.isElementPresent(sm.getCottonName());
    	ca.click(sm.getCottonName());
    	Commonactions.isElementPresent(sm.getMproperties());
    	ca.click(sm.getMproperties());
    	Commonactions.isElementPresent(sm.getMsizeRange());
    	ca.click(sm.getMsizeRange());
    	ca.eleToBeClickable();
    	WebElement a = ca.activeElement();
    	ca.eleToBeClickable();
    	ca.insertText(a, string);
    	ca.eleToBeClickable();
    	ca.jsMouseOver();
    	ca.eleToBeClickable();
    	
    	System.out.println("material property table updated successfully");
    	
    }

    @When("User creates material colorway {string},{string}")
    public void user_creates_material_colorway(String string, String string2) throws Throwable {
        
    	Commonactions.isElementPresent(sm.getNewClrdMatBtnexp());
    	ca.click(sm.getNewClrdMatBtnexp());
    	Commonactions.isElementPresent(sm.getNewFromColor());
    	ca.click(sm.getNewFromColor());
    	Commonactions.isElementPresent(sm.getEgretChkBx());
    	ca.click(sm.getEgretChkBx());
    	Commonactions.isElementPresent(sm.getVanillaChkbx());
    	ca.click(sm.getVanillaChkbx());
    	Commonactions.isElementPresent(mp.getSave_btn1());
    	ca.click(mp.getSave_btn1());
    	Commonactions.isElementPresent(mp.getSave_btn1());
    	ca.click(mp.getSave_btn1());
    	ca.eleToBeClickable();
    	Commonactions.isElementPresent(mp.getSave_btn1());
    	ca.click(mp.getSave_btn1());
    	ca.eleToBeClickable();
    	Commonactions.isElementPresent(sm.getNewColorwayBtn());
    	
    	ca.click(sm.getNewColorwayBtn());
    	Commonactions.isElementPresent(sm.getMcoloredValue());
    	ca.insertText(sm.getMcoloredValue(), string);
    	Commonactions.isElementPresent(sm.getMDescription());
    	ca.insertText(sm.getMDescription(), string2);
    	Commonactions.isElementPresent(mp.getSave_btn1());
    	ca.click(mp.getSave_btn1());
    	Commonactions.isElementPresent(sm.getMCopy());
    	ca.click(sm.getMCopy());
    	Commonactions.isElementPresent(sm.getMcoloredValue());
    	ca.insertText(sm.getMcoloredValue(), string+" - Copy");
    	Commonactions.isElementPresent(mp.getSave_btn1());
    	ca.click(mp.getSave_btn1());
    	Commonactions.isElementPresent(sm.getMCopy());
    	ca.click(sm.getMCopy());
    	Commonactions.isElementPresent(sm.getMcoloredValue());
    	ca.insertText(sm.getMcoloredValue(), string+" - New");
    	Commonactions.isElementPresent(mp.getSave_btn1());
    	ca.click(mp.getSave_btn1());
    	Commonactions.isElementPresent(sm.getMDelete());
    	ca.click(sm.getMDelete());
    	Commonactions.isElementPresent(pp.getDelete_Btn());
    	ca.click(pp.getDelete_Btn());
    	ca.eleToBeClickable();
    	
    	System.out.println("Material colorway created sucessfully");
    	
    }

    @Then("User creates material sample combination {string},{string},{string},{string},{string}")
    public void user_creates_material_sample_combination(String string, String string2, String string3, String string4, String string5) throws Throwable {
        
    	Commonactions.isElementPresent(hp.getMaterialBtn());
    	ca.click(hp.getMaterialBtn());
    	Commonactions.isElementPresent(sm.getCottonName());
    	ca.click(sm.getCottonName());
    	ca.eleToBeClickable();
    	Commonactions.isElementPresent(sm.getMSamples());
    	ca.click(sm.getMSamples());
    	Commonactions.isElementPresent(sm.getSampleBtn());
    	ca.click(sm.getSampleBtn());
    	ca.eleToBeClickable();
    	WebElement e3 = ca.activeElement();
    	ca.eleToBeClickable();
    	ca.insertText(e3, "Supplier");
    	ca.eleToBeClickable();
    	ca.click(driver.findElement(By.xpath("//div[@role='option' and @item='1']/div")));
		ca.eleToBeClickable();
		e3.sendKeys(Keys.TAB);
		Commonactions.isElementPresent(sm.getSampleValue());
    	ca.insertText(sm.getSampleValue(), string);
    	Commonactions.isElementPresent(sm.getSampleType1());
    	//ca.insertText(sp.getCntryCode(), string5);
    	//ca.eleToBeClickable();
    	ca.click(sm.getSampleType1());
    	ca.eleToBeClickable();
    	WebElement a = ca.activeElement();
    	ca.eleToBeClickable();
    	ca.insertText(a, string2);
    	ca.eleToBeClickable();
    	ca.jsMouseOver();
    	Commonactions.isElementPresent(mp.getSave_btn1());
    	ca.click(mp.getSave_btn1());
    	Commonactions.isElementPresent(sm.getMSamples());
    	
    	ca.click(sm.getMSamples());
    	Commonactions.isElementPresent(sm.getSampleBtn());
    	ca.click(sm.getSampleBtn());
    	ca.eleToBeClickable();
    	WebElement e4 = ca.activeElement();
    	ca.eleToBeClickable();
    	ca.insertText(e4, "Supplier");
    	ca.eleToBeClickable();
    	ca.click(driver.findElement(By.xpath("//div[@role='option' and @item='1']/div")));
		ca.eleToBeClickable();
		e4.sendKeys(Keys.TAB);
		Commonactions.isElementPresent(sm.getSampleValue());
    	ca.insertText(sm.getSampleValue(), string);
    	Commonactions.isElementPresent(sm.getSampleType1());
    	//ca.insertText(sp.getCntryCode(), string5);
    	//ca.eleToBeClickable();
    	ca.click(sm.getSampleType1());
    	ca.eleToBeClickable();
    	WebElement a1 = ca.activeElement();
    	ca.eleToBeClickable();
    	ca.insertText(a1, string2);
    	ca.eleToBeClickable();
    	ca.jsMouseOver();
    	Commonactions.isElementPresent(sm.getSampledimension());
    	ca.click(sm.getSampledimension());
    	ca.eleToBeClickable();
    	WebElement a2 = ca.activeElement();
    	ca.eleToBeClickable();
    	ca.insertText(a2, string3);
    	ca.eleToBeClickable();
    	ca.jsMouseOver();
    	Commonactions.isElementPresent(sm.getColorsSel());
    	ca.click(sm.getColorsSel());
    	Commonactions.isElementPresent(sm.getGoTodialog1());
    	ca.click(sm.getGoTodialog1());
    	Commonactions.isElementPresent(sm.getEgretChkBx());
    	ca.click(sm.getEgretChkBx());
    	Commonactions.isElementPresent(sm.getVanillaChkbx());
    	ca.click(sm.getVanillaChkbx());
    	Commonactions.isElementPresent(mp.getSave_btn2());
    	ca.click(mp.getSave_btn2());
    	Commonactions.isElementPresent(mp.getSave_btn1());
    	ca.click(mp.getSave_btn1());
    	ca.eleToBeClickable();
    	
    	ca.click(sm.getSampleBtn());
    	ca.eleToBeClickable();
    	WebElement e5 = ca.activeElement();
    	ca.eleToBeClickable();
    	ca.insertText(e5, "Supplier");
    	ca.eleToBeClickable();
    	ca.click(driver.findElement(By.xpath("//div[@role='option' and @item='1']/div")));
		ca.eleToBeClickable();
		e5.sendKeys(Keys.TAB);
		Commonactions.isElementPresent(sm.getSampleValue());
    	ca.insertText(sm.getSampleValue(), string);
    	Commonactions.isElementPresent(sm.getSampleValue());
    //	ca.insertText(sp.getCntryCode(), string5);
    	//ca.eleToBeClickable();
    	ca.click(sm.getSampleType1());
    	ca.eleToBeClickable();
    	WebElement a3 = ca.activeElement();
    	ca.eleToBeClickable();
    	ca.insertText(a3, string2);
    	ca.eleToBeClickable();
    	ca.jsMouseOver();
    	Commonactions.isElementPresent(sm.getSampledimension());
    	ca.click(sm.getSampledimension());
    	ca.eleToBeClickable();
    	WebElement a4 = ca.activeElement();
    	ca.eleToBeClickable();
    	ca.insertText(a4, string4);
    	ca.eleToBeClickable();
    	ca.jsMouseOver();
/*    	Commonactions.isElementPresent(sm.getQuantityChkBx());
    	ca.click(sm.getQuantityChkBx());
    	Commonactions.isElementPresent(sm.getEgret());
    	ca.insertText(sm.getEgret(),"1");
    	Commonactions.isElementPresent(sm.getGreenValue());
    	ca.insertText(sm.getGreenValue(), "1");
    	Commonactions.isElementPresent(sm.getEgretValue());
    	ca.insertText(sm.getEgretValue(), "1");*/
    	Commonactions.isElementPresent(mp.getSave_btn1());
    	ca.click(mp.getSave_btn1());
    	ca.eleToBeClickable();
    	
    //	WebElement egret = driver.findElement(By.xpath("(//a[contains(text(),'EGRET')]//parent::td//following-sibling::td/div/span[@data-csi-act='Copy'])[1]"));
    //	ca.jsScrollPageDown(sm.getEgretClrCopy1());
    	Commonactions.isElementPresent(sm.getEgretClrCopy1());
    	ca.click(sm.getEgretClrCopy1());
    	ca.eleToBeClickable();
    	String text = driver.findElement(By.xpath("(//a[contains(text(),'EGRET')])[2]")).getText();
    	Commonactions.isElementPresent(sm.getSampleValue());
    	ca.insertText(sm.getSampleValue(), text+" - Copy");
    	Commonactions.isElementPresent(mp.getSave_btn1());
    	ca.click(mp.getSave_btn1());
    	ca.eleToBeClickable();
    	Commonactions.isElementPresent(sm.getEgretClrCopyDel1());
    	ca.click(sm.getEgretClrCopyDel1());
    	Commonactions.isElementPresent(pp.getDelete_Btn());
    	ca.click(pp.getDelete_Btn());
    	ca.eleToBeClickable();
    	
    	System.out.println("Material sample created successfully");
    	
    }

    @Then("User creates Material quality {string},{string},{string},{string},{string},{string},{string},{string}")
    public void user_creates_Material_quality(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) throws Throwable {
       
    	Commonactions.isElementPresent(hp.getMaterialBtn());
    	ca.click(hp.getMaterialBtn());
    	Commonactions.isElementPresent(sm.getCottonName());
    	ca.click(sm.getCottonName());
    	Commonactions.isElementPresent(sm.getStyleQuality());
    	ca.click(sm.getStyleQuality());
    	Commonactions.isElementPresent(sm.getNewTestRunBtn());
    	ca.click(sm.getNewTestRunBtn());
    	Commonactions.isElementPresent(sm.getTestRunValue());
    	ca.eleToBeClickable();
    	ca.insertText(sm.getTestRunValue(), string);
    	Commonactions.isElementPresent(sm.getTestGrp());
    	ca.click(sm.getTestGrp());
    	ca.eleToBeClickable();
    	WebElement a = ca.activeElement();
    	ca.eleToBeClickable();
    	ca.insertText(a, string3);
    	ca.eleToBeClickable();
    	ca.jsMouseOver();
    	Commonactions.isElementPresent(sm.getTestRunSample());
    	ca.click(sm.getTestRunSample());
    	ca.eleToBeClickable();
    	WebElement a1 = ca.activeElement();
    	ca.eleToBeClickable();
    	ca.insertText(a1, string5);
    	ca.eleToBeClickable();
    	ca.jsMouseOver();
    	Commonactions.isElementPresent(sm.getResponsibleUser());
    	ca.click(sm.getResponsibleUser());
    	ca.eleToBeClickable();
    	WebElement a2 = ca.activeElement();
    	ca.eleToBeClickable();
    	ca.insertText(a2, string7);
    	ca.eleToBeClickable();
    	ca.jsMouseOver();
    	Commonactions.isElementPresent(sm.getSupplier());
    	ca.click(sm.getSupplier());
    	ca.eleToBeClickable();
    	WebElement a3 = ca.activeElement();
    	ca.eleToBeClickable();
    	ca.insertText(a3, string8);
    	ca.eleToBeClickable();
    	ca.jsMouseOver();
    	Commonactions.isElementPresent(sm.getQuantityTestChkBx());
    	ca.click(sm.getQuantityTestChkBx());
    	Commonactions.isElementPresent(sm.getTestVannilaChkBx());
    	ca.insertText(sm.getTestVannilaChkBx(),"1");
    	Commonactions.isElementPresent(qp.getNext());
    	ca.eleToBeClickable();
    	ca.click(qp.getNext());
    	Commonactions.isElementPresent(qp.getFinish());
    	ca.eleToBeClickable();
    	ca.click(qp.getFinish());
    	ca.eleToBeClickable();
    	
    	ca.click(sm.getNewTestRunBtn());
    	Commonactions.isElementPresent(sm.getTestRunValue());
    	ca.insertText(sm.getTestRunValue(), string2);
    	Commonactions.isElementPresent(sm.getTestGrp());
    	ca.click(sm.getTestGrp());
    	ca.eleToBeClickable();
    	WebElement a4 = ca.activeElement();
    	ca.eleToBeClickable();
    	ca.insertText(a4, string4);
    	ca.eleToBeClickable();
    	ca.jsMouseOver();
    	Commonactions.isElementPresent(sm.getTestRunSample());
    	ca.click(sm.getTestRunSample());
    	ca.eleToBeClickable();
    	WebElement a5 = ca.activeElement();
    	ca.eleToBeClickable();
    	ca.insertText(a5, string6);
    	ca.eleToBeClickable();
    	ca.jsMouseOver();
    	Commonactions.isElementPresent(sm.getResponsibleUser());
    	ca.click(sm.getResponsibleUser());
    	ca.eleToBeClickable();
    	WebElement a6 = ca.activeElement();
    	ca.eleToBeClickable();
    	ca.insertText(a6, string7);
    	ca.eleToBeClickable();
    	ca.jsMouseOver();
    	Commonactions.isElementPresent(sm.getSupplier());
    	ca.click(sm.getSupplier());
    	ca.eleToBeClickable();
    	WebElement a7 = ca.activeElement();
    	ca.eleToBeClickable();
    	ca.insertText(a7, string8);
    	ca.eleToBeClickable();
    	ca.jsMouseOver();
    	Commonactions.isElementPresent(sm.getTestColorsSel());
    	ca.click(sm.getTestColorsSel());
    	Commonactions.isElementPresent(sm.getGoTodialog());
    	ca.click(sm.getGoTodialog());
    	Commonactions.isElementPresent(sm.getEgretChkBx());
    	ca.click(sm.getEgretChkBx());
    	Commonactions.isElementPresent(sm.getVanillaChkbx());
    	ca.click(sm.getVanillaChkbx());
    	Commonactions.isElementPresent(mp.getSave_btn1());
    	ca.click(mp.getSave_btn1());
    	Commonactions.isElementPresent(qp.getNext());
    	ca.click(qp.getNext());
    	ca.eleToBeClickable();
    	Commonactions.isElementPresent(qp.getFinish());
    	ca.click(qp.getFinish());
    	ca.eleToBeClickable();
    	
    	System.out.println("Material quality created successfully");
    	
    	
    }

    @Then("User approve material test run")
    public void user_approve_material_test_run() throws Throwable {
    	
    	Commonactions.isElementPresent(sm.getAcidTest());
    	ca.click(sm.getAcidTest());
    	Commonactions.isElementPresent(sm.getMTDS());
        ca.click(sm.getMTDS());
        Commonactions.isElementPresent(qp.getCanvas());
        
        ca.click(qp.getCanvas());
		Commonactions.isElementPresent(qp.getCreateanewCanvas());
		ca.click(qp.getCreateanewCanvas());
		Commonactions.isElementPresent(qp.getRectangle());
		ca.click(qp.getRectangle());
		ca.eleToBeClickable();
		Actions actions = new Actions(driver);
		Commonactions.isElementPresent(qp.getDoubleClick());
		actions.doubleClick(qp.getDoubleClick()).perform();
		Commonactions.isElementPresent(qp.getSaveAndFinish());
		ca.click(qp.getSaveAndFinish());
		Commonactions.isElementPresent(dp.getDocandComm());
                
		ca.click(dp.getDocandComm());
		Commonactions.isElementPresent(sp.getApproveActions());
		ca.click(sp.getApproveActions());
		Commonactions.isElementPresent(sp.getApprove());
		ca.click(sp.getApprove());
		ca.eleToBeClickable();

		
		System.out.println("Material quality approved successfully");
    	
    }

    @Then("User Creates material test run templates")
    public void user_Creates_material_test_run_templates() throws Throwable {
        
    	Commonactions.isElementPresent(sm.getTestRun());
    	ca.click(sm.getTestRun());
    	Commonactions.isElementPresent(sm.getSaveAsTemp());
    	ca.click(sm.getSaveAsTemp());
    	ca.eleToBeClickable();
    	String text = driver.findElement(By.xpath("(//a[contains(text(),'EGRET')])[1]")).getText();
    	Commonactions.isElementPresent(sm.getTestRunValue());
    	ca.insertText(sm.getTestRunValue(), text+" - Copy");
    	Commonactions.isElementPresent(mp.getSave_btn1());
    	ca.click(mp.getSave_btn1());
    	ca.eleToBeClickable();
    	
    	System.out.println("Material test run templates created successfully");
    	
    } 
    
    
    @When("User creates Style sourcing price list")
    public void user_creates_Style_sourcing_price_list() throws Throwable {

    	Commonactions.isElementPresent(hp.getStyleBtn());
    	ca.click(hp.getStyleBtn());
    	Commonactions.isElementPresent(sm.getWinterSeason());
    	ca.click(sm.getWinterSeason());
    	Commonactions.isElementPresent(st.getStyles_Btn());
    	ca.click(st.getStyles_Btn());
    	Commonactions.isElementPresent(sm.getClrAndSize());
    	ca.click(sm.getClrAndSize());
    	ca.eleToBeClickable();
    	
    	Commonactions.isElementPresent(sp.getSeasonsourcing());
    	ca.click(sp.getSeasonsourcing());
    	Commonactions.isElementPresent(sp.getSupplierquotes());
    	ca.click(sp.getSupplierquotes());
    	Commonactions.isElementPresent(sp.getNewPriceList());
    	ca.click(sp.getNewPriceList());
    	ca.eleToBeClickable();
    	WebElement a = ca.activeElement();
    	ca.eleToBeClickable();
    	a.sendKeys(Keys.TAB);
    	
    	System.out.println("Style Sourcing Price List Created successfully");
    	
    }

    @When("User Creates Style Supplier Quotes {string},{string},{string}")
    public void user_Creates_Style_Supplier_Quotes(String string, String string2, String string3) throws Throwable {
        
    	Commonactions.isElementPresent(sp.getNewSuplrqute());
    	ca.click(sp.getNewSuplrqute());
    	ca.eleToBeClickable();
    	ca.insertText(sp.getSupplierValue(), string);
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//div[@role='option' and @item='1']/div")));
		ca.eleToBeClickable();
		WebElement a = ca.activeElement();
		a.sendKeys(Keys.TAB);
		Commonactions.isElementPresent(sp.getSupplierQteValue());
		ca.insertText(sp.getSupplierQteValue(), string2);
		Commonactions.isElementPresent(sp.getColorSIze());
		ca.click(sp.getColorSIze());
		ca.eleToBeClickable();
    	WebElement a7 = ca.activeElement();
    	ca.eleToBeClickable();
    	ca.insertText(a7, "Colors And Sizes");
    	ca.eleToBeClickable();
    	ca.jsMouseOver();
    	Commonactions.isElementPresent(sp.getSuppItemColorSel());
    	ca.click(sp.getSuppItemColorSel());
    	Commonactions.isElementPresent(sp.getSuppItemDialog());
    	ca.click(sp.getSuppItemDialog());
    	Commonactions.isElementPresent(sp.getBlueChkBx());
    	ca.click(sp.getBlueChkBx());
    	Commonactions.isElementPresent(sp.getGreenChkBx());
    	ca.click(sp.getGreenChkBx());
    	Commonactions.isElementPresent(mp.getSave_btn2());
    	ca.click(mp.getSave_btn2());
    	Commonactions.isElementPresent(sp.getSizes());
    	ca.click(sp.getSizes());
    	Commonactions.isElementPresent(sp.getSuppSizesDialog());
    	ca.click(sp.getSuppSizesDialog());
    	Commonactions.isElementPresent(sm.getMediumChkBx());
    	ca.click(sm.getMediumChkBx());
    	Commonactions.isElementPresent(sm.getLargeChkbx());
    	ca.click(sm.getLargeChkbx());
    	Commonactions.isElementPresent(mp.getSave_btn2());
    	ca.click(mp.getSave_btn2());
    	Commonactions.isElementPresent(mp.getSave_btn1());
    	ca.click(mp.getSave_btn1());
    	ca.eleToBeClickable();
    	
    	ca.click(sp.getNewSupplQteName());
    	Commonactions.isElementPresent(sp.getSelectSet());
    	ca.click(sp.getSelectSet());
    	Commonactions.isElementPresent(sp.getSelectsetBtn());
    	Thread.sleep(5000);
    	ca.click(sp.getSelectsetBtn());
    	Commonactions.isElementPresent(sp.getSelectsetvalue());
    	ca.insertText(sp.getSelectsetvalue(), string3);
    	Commonactions.isElementPresent(mp.getSave_btn1());
    	ca.click(mp.getSave_btn1());
    	
        System.out.println("Supplier Quote created successfully");
    	
    }

    @When("User creates Style product blended cost {string}")
    public void user_creates_Style_product_blended_cost(String string) throws Throwable {

    	Commonactions.isElementPresent(sp.getApparealcoroandsizename());
    	ca.click(sp.getApparealcoroandsizename());
    	Commonactions.isElementPresent(sp.getNewproductbendcost());
    	ca.click(sp.getNewproductbendcost());
    	ca.eleToBeClickable();
    	WebElement a = ca.activeElement();
    	ca.eleToBeClickable();
    	ca.insertText(a, string);
    	ca.eleToBeClickable();
    	a.sendKeys(Keys.TAB);
    	Commonactions.isElementPresent(sp.getProductPlusIcon());
    	ca.click(sp.getProductPlusIcon());
    	Commonactions.isElementPresent(sp.getBlendcostcheckbox());
    	ca.click(sp.getBlendcostcheckbox());
    	Commonactions.isElementPresent(sp.getBlendcostAction());
    	ca.click(sp.getBlendcostAction());
    	Commonactions.isElementPresent(sp.getSelectsuppQuotes());
    	ca.click(sp.getSelectsuppQuotes());
    	Commonactions.isElementPresent(sp.getSelectsupquotechecckbox());
    	ca.click(sp.getSelectsupquotechecckbox());
    	Commonactions.isElementPresent(mp.getSave_btn1());
    	ca.click(mp.getSave_btn1());
    	
    	System.out.println("Product Blend Cost Created successfully");
    	
    }
    
    @When("User creates Supplier Requests {string},{string}")
    public void user_creates_Supplier_Requests(String string, String string2) throws Throwable {
        ca.eleToBeClickable();
    	Commonactions.isElementPresent(hp.getStyleBtn());
    	ca.click(hp.getStyleBtn());
    	Commonactions.isElementPresent(sm.getWinterSeason());
    	ca.click(sm.getWinterSeason());
    	Commonactions.isElementPresent(st.getStyles_Btn());
    	ca.click(st.getStyles_Btn());
    	Commonactions.isElementPresent(sm.getClrAndSize());
    	ca.click(sm.getClrAndSize());
    	ca.eleToBeClickable();
    	
    	Commonactions.isElementPresent(sp.getSeasonsourcing());
    	ca.click(sp.getSeasonsourcing());
    	Commonactions.isElementPresent(sp.getSupplierrequest());
    	ca.click(sp.getSupplierrequest());
    	Commonactions.isElementPresent(sp.getNewsupplierrequestbtn());
    	ca.click(sp.getNewsupplierrequestbtn());
    	Commonactions.isElementPresent(sp.getSrttemplateExpand());
    	ca.click(sp.getSrttemplateExpand());
    	ca.eleToBeClickable();
    	WebElement a = ca.activeElement();
    	ca.eleToBeClickable();
    	ca.insertText(a, string);
    	ca.eleToBeClickable();
    	ca.jsMouseOver();
    	Commonactions.isElementPresent(sp.getSupplierreqvalue());
    	ca.insertText(sp.getSupplierreqvalue(), string2);
    	Commonactions.isElementPresent(sp.getSaveAndGoBtn());
    	ca.click(sp.getSaveAndGoBtn());
    	ca.eleToBeClickable();
    	ca.click(driver.findElement(By.xpath("(//table[contains(@data-csi-automation,'plugin-SupplierRequest-Quotes-ToolbarNewActions')]//div/div)[2]")));
    	Commonactions.isElementPresent(mp.getSave_btn1());
    	ca.click(mp.getSave_btn1());
    	ca.eleToBeClickable();
    	

    	System.out.println("Supplier Request created successfully");
    	
    }

    @When("User creates copy templates {string}")
    public void user_creates_copy_templates(String string) throws Throwable {

    	Commonactions.isElementPresent(hp.getUser_setupBtn());
		ca.click(hp.getUser_setupBtn());
		Commonactions.isElementPresent(sp.getCopyTemplate());
		ca.click(sp.getCopyTemplate());
		 Commonactions.isElementPresent(sp.getNewstylecopytemplatebtn());
		ca.click(sp.getNewstylecopytemplatebtn());
		 Commonactions.isElementPresent(sp.getStylecopytempvalue());
		ca.insertText(sp.getStylecopytempvalue(), string);
		 Commonactions.isElementPresent(sp.getStyletypevalue());
		ca.click(sp.getStyletypevalue());
		ca.eleToBeClickable();
		WebElement a = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a, "Apparel - Color and Size");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		 Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		 Commonactions.isElementPresent(sp.getCopTemViews());
		
		ca.click(sp.getCopTemViews());
		 Commonactions.isElementPresent(sp.getCopTemManViews());
		ca.click(sp.getCopTemManViews());
		 Commonactions.isElementPresent(up.getUsrMgmt_Copy());
		ca.click(up.getUsrMgmt_Copy());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy_Value());
		ca.insertText(up.getUsrMgmt_Copy_Value(), "Automation");
		Commonactions.isElementPresent(sp.getOKforAdoption());
        ca.click(sp.getOKforAdoption());
        Commonactions.isElementPresent(sp.getAdd());
		ca.click(sp.getAdd());
		Commonactions.isElementPresent(mp.getSave_btn1());
        ca.jsScrollPageDown(mp.getSave_btn1());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
        ca.click(sp.getOkforadoptionchecckbox());
        ca.eleToBeClickable();
        
        System.out.println("Copy Template created successfully");
    }

    @When("User add new inspiration products {string},{string}")
    public void user_add_new_inspiration_products(String string, String string2) throws Throwable {
    	
    	Commonactions.isElementPresent(hp.getStyleBtn());
    	ca.click(hp.getStyleBtn());
    	Commonactions.isElementPresent(sm.getWinterSeason());
    	ca.click(sm.getWinterSeason());
    	Commonactions.isElementPresent(st.getStyles_Btn());
    	ca.click(st.getStyles_Btn());
    	Commonactions.isElementPresent(sm.getClrAndSize());
    	ca.click(sm.getClrAndSize());
    	Commonactions.isElementPresent(sp.getSuppRequstName());
    	ca.click(sp.getSuppRequstName());
    	Commonactions.isElementPresent(sp.getSupplierRequestPlus());
    	ca.click(sp.getSupplierRequestPlus());
    	Commonactions.isElementPresent(sp.getSetup());
    	
    	ca.click(sp.getSetup());
    	Commonactions.isElementPresent(sp.getAddproduct());
    	ca.click(sp.getAddproduct());
    	Commonactions.isElementPresent(sp.getAddprodcutcheckbox());
    	ca.click(sp.getAddprodcutcheckbox());
    	Commonactions.isElementPresent(mp.getSave_btn1());
    	ca.click(mp.getSave_btn1());
    	
    	Commonactions.isElementPresent(sp.getAddproductExpand());
    	ca.click(sp.getAddproductExpand());
    	Commonactions.isElementPresent(sp.getNewInspirationStyle());
    	ca.click(sp.getNewInspirationStyle());
    	Commonactions.isElementPresent(sp.getNewinspirationstyleValue());
    	ca.insertText(sp.getNewinspirationstyleValue(), string);
    	Commonactions.isElementPresent(mp.getSave_btn1());
    	ca.click(mp.getSave_btn1());
    	Commonactions.isElementPresent(sp.getSupplierreq());
    	
    	ca.click(sp.getSupplierreq());
    	Commonactions.isElementPresent(sp.getSupplierQuteViews());
    	ca.click(sp.getSupplierQuteViews());
    	Commonactions.isElementPresent(sp.getSupplierQteManageViews());
    	ca.click(sp.getSupplierQteManageViews());
    	Commonactions.isElementPresent(up.getUsrMgmt_Copy());
    	ca.click(up.getUsrMgmt_Copy());
		Commonactions.isElementPresent(up.getUsrMgmt_Copy_Value());
		ca.insertText(up.getUsrMgmt_Copy_Value(), "Automation");
		Commonactions.isElementPresent(sp.getAdoptedStyle());
        ca.click(sp.getAdoptedStyle());
        Commonactions.isElementPresent(sp.getAdd());
		ca.click(sp.getAdd());
		Commonactions.isElementPresent(sp.getAdoption());
        ca.click(sp.getAdoption());
		Commonactions.isElementPresent(sp.getAdd());
		ca.click(sp.getAdd());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.jsScrollPageDown(mp.getSave_btn1());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
    	ca.click(driver.findElement(By.xpath("(//table[contains(@data-csi-automation,'plugin-SupplierRequest-Quotes-ToolbarNewActions')]//div/div)[2]")));
    	Commonactions.isElementPresent(mp.getSave_btn1());
    	ca.click(mp.getSave_btn1());
    	ca.eleToBeClickable();
    	
        for (int i = 0; i <=50; i++) {
        	
        	ca.click(sp.getSupplierRequestPlus());
        	if(sp.getActionAdoption().isDisplayed()){
        		
        		Commonactions.mouseOver(sp.getActionAdoption());
        		Commonactions.isElementPresent(sp.getAdoptAsstyle());
        		ca.click(sp.getAdoptAsstyle());
        		Commonactions.isElementPresent(mp.getSave_btn1());
        		ca.click(mp.getSave_btn1());
        		ca.eleToBeClickable();
        		break;
        		
        	}
			
		}
        ca.eleToBeClickable();
        ca.click(sp.getAdoptCopy());
        Commonactions.isElementPresent(sp.getSupplierQteValue());
        ca.insertText(sp.getSupplierQteValue(), string+" - Copy Adopted");
        Commonactions.isElementPresent(mp.getSave_btn1());
        ca.click(mp.getSave_btn1());
        Commonactions.isElementPresent(sp.getSetup());
        
        ca.click(sp.getSetup());
    	Commonactions.isElementPresent(sp.getAddproductExpand());
    	ca.click(sp.getAddproductExpand());
    	Commonactions.isElementPresent(sp.getNewInspirationStyle());
    	ca.click(sp.getNewInspirationStyle());
    	Commonactions.isElementPresent(sp.getNewinspirationstyleValue());
    	ca.insertText(sp.getNewinspirationstyleValue(), string2);
    	Commonactions.isElementPresent(mp.getSave_btn1());
    	ca.click(mp.getSave_btn1());
    	ca.eleToBeClickable();
    	Commonactions.isElementPresent(sp.getSupplierreq());
    	
    	ca.click(sp.getSupplierreq());
    	ca.eleToBeClickable();
    	ca.click(driver.findElement(By.xpath("(//table[contains(@data-csi-automation,'plugin-SupplierRequest-Quotes-ToolbarNewActions')]//div/div)[2]")));
    	Commonactions.isElementPresent(mp.getSave_btn1());
    	ca.click(mp.getSave_btn1());
    	ca.eleToBeClickable();
    	Commonactions.isElementPresent(sp.getApproveActions());
    	ca.click(sp.getApproveActions());
    	Commonactions.isElementPresent(sp.getMassadoptasstyle());
    	ca.click(sp.getMassadoptasstyle());
    	ca.eleToBeClickable();
    	ca.click(driver.findElement(By.xpath("(//td[contains(text(),'New Inspiration')]//preceding-sibling::td)[1]//input")));
    	Commonactions.isElementPresent(mp.getSave_btn1());
    	ca.click(mp.getSave_btn1());
    	ca.eleToBeClickable();
    	Commonactions.isElementPresent(mp.getSave_btn1());
    	ca.click(mp.getSave_btn1());
    	
    	
    	System.out.println("Inspiration product created successfully");
    }
    
	String file,name,filter;



	@When("Create PO Group and Supplier PO {string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void create_PO_Group_and_Supplier_PO(String poorder, String po_nocolor, String po_colorbased, String quotevalueBlue, String quotevaluegreen, String EditValue, String dispct, String disvalue, String allowancepct, String allowancevalue) throws Throwable {

		Commonactions.isElementPresent(hp.getSourcingBtn());
		click(hp.getSourcingBtn());
		Commonactions.isElementPresent(sp.getSupplierpo());
		System.out.println("sourcing clicked");
		click(sp.getSupplierpo());
		Commonactions.isElementPresent(sp.getPogroup());
		click(sp.getPogroup());
		Commonactions.isElementPresent(sp.getNewpogroupbtn());
		click(sp.getNewpogroupbtn());
		ca.eleToBeClickable();
		WebElement e = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e, poorder +Keys.TAB);
		ca.eleToBeClickable();

		click(sp.getDeletepogroup());
		Commonactions.isElementPresent(pp.getDelete_Btn());
		click(pp.getDelete_Btn());
		Commonactions.isElementPresent(sp.getNewpogroupbtn());
		click(sp.getNewpogroupbtn());
		ca.eleToBeClickable();
		WebElement e1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e1, poorder+Keys.TAB);
		ca.activeElement();

		click(sp.getSupplierpotab());
		Commonactions.isElementPresent(sp.getNewsupplierpobtn());
		click(sp.getNewsupplierpobtn());
		Commonactions.isElementPresent(sp.getSupplierPOVaule());

		insertText(sp.getSupplierPOVaule(), po_nocolor +Keys.TAB);
		Commonactions.isElementPresent(sp.getSupplierexpand());
		click(sp.getSupplierexpand());
		Commonactions.isElementPresent(sp.getSuppliervalue());
		click(sp.getSuppliervalue());
		Commonactions.isElementPresent(sp.getFactoryexpand());
		click(sp.getFactoryexpand());
		Commonactions.isElementPresent(sp.getFactoryvaluepo());
		click(sp.getFactoryvaluepo());
		Commonactions.isElementPresent(sp.getSAVEANDGO());
		click(sp.getSAVEANDGO());
		Commonactions.isElementPresent(hp.getUser_homeBtn());

		click(hp.getUser_homeBtn());
		Commonactions.isElementPresent(sp.getNewsupplierpobtn());
		click(sp.getNewsupplierpobtn());
		Commonactions.isElementPresent(sp.getSupplierPOVaule());
		insertText(sp.getSupplierPOVaule(), po_colorbased +Keys.TAB);
		Commonactions.isElementPresent(sp.getSupplierexpand());
		click(sp.getSupplierexpand());
		Commonactions.isElementPresent(sp.getSuppliervalue());
		click(sp.getSuppliervalue());
		Commonactions.isElementPresent(sp.getFactoryexpand());
		click(sp.getFactoryexpand());
		Commonactions.isElementPresent(sp.getFactoryvaluepo());
		click(sp.getFactoryvaluepo());
		Commonactions.isElementPresent(sp.getColorbasedcheckbox());
		click(sp.getColorbasedcheckbox());
		Commonactions.isElementPresent(mp.getSave_btn1());
		click(mp.getSave_btn1());
		Commonactions.isElementPresent(dp.getNameofcreateddoc());

		click(dp.getNameofcreateddoc());
		Commonactions.isElementPresent(sp.getPohead());
		click(sp.getPohead());
		ca.eleToBeClickable();
		WebElement e2 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e2, poorder);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getCommissionrate());


		click(sp.getCommissionrate());
		ca.eleToBeClickable();
		WebElement e3 = ca.activeElement();
		ca.eleToBeClickable();
		e3.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(e3, "10");
		ca.eleToBeClickable();
		e3.sendKeys(Keys.TAB);	
		ca.eleToBeClickable();

	//	ca.click(sp.getPaymentterm());
		WebElement e4 = ca.activeElement();
		ca.eleToBeClickable();
		e4.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(e4, "cheque");
		ca.eleToBeClickable();
		e4.sendKeys(Keys.TAB);
		ca.eleToBeClickable();


		Commonactions.mouseOver(sp.getNewdividerbtn());
		Commonactions.isElementPresent(sp.getNewdeviceexpand());
		ca.click(sp.getNewdeviceexpand());
		Commonactions.isElementPresent(sp.getNewcolorwayorder());
		ca.click(sp.getNewcolorwayorder());
		Commonactions.isElementPresent(sp.getReset());
		ca.click(sp.getReset());
		Commonactions.isElementPresent(sp.getStyleselect());
		ca.click(sp.getStyleselect());
		Commonactions.isElementPresent(sp.getApparealcheckbox());
		ca.click(sp.getApparealcheckbox());
		Commonactions.isElementPresent(sp.getdisplay());
		ca.click(sp.getdisplay());
		Commonactions.isElementPresent(sp.getBluecheckbox1());
		ca.click(sp.getBluecheckbox1());
		Commonactions.isElementPresent(sp.getGreencheckbox1());
		ca.click(sp.getGreencheckbox1());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		Commonactions.isElementPresent(sp.getInstruction());

		Commonactions.mouseOver(sp.getInstruction());
		Commonactions.isElementPresent(sp.getB_supplierquote());

		ca.click(sp.getB_supplierquote());
		WebElement sq = ca.activeElement();
		ca.eleToBeClickable();
		try {
			ca.insertText(sq, quotevalueBlue);
			ca.eleToBeClickable();
			ca.jsMouseOver();
			ca.eleToBeClickable();
		}
		catch(Exception q) {
			System.out.println(q);
			System.out.println("supplier quote selection not selected @ supplier po");
		}
		



		ca.click(sp.getG_supplierquote());
		WebElement sg = ca.activeElement();
		ca.eleToBeClickable();
		try {
			ca.insertText(sg, quotevaluegreen);
			ca.eleToBeClickable();
			ca.jsMouseOver();
			ca.eleToBeClickable();
		}
		catch(Exception q) {
			System.out.println(q);
			System.out.println("supplier quote selection not selected @ supplier po");
		}


		for(int i=0;i<100;i++)
		{
			ca.click(sp.getPlusicon());
		}

        ca.eleToBeClickable();
		Commonactions.clickjs(sp.getB_discountpct());
		WebElement e5 = ca.activeElement();
		ca.eleToBeClickable();
		e5.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(e5, dispct);
		ca.eleToBeClickable();
		Commonactions.clickjs(sp.getHeader());
		Commonactions.isElementPresent(sp.getB_discountvalue());

		Commonactions.clickjs(sp.getB_discountvalue());
		WebElement e6 = ca.activeElement();
		ca.eleToBeClickable();
		e6.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(e6,disvalue);
		ca.eleToBeClickable();
		Commonactions.clickjs(sp.getHeader());
		ca.eleToBeClickable();


		Commonactions.clickjs(sp.getB_allowancepercentage());
		ca.eleToBeClickable();
		WebElement e7 = ca.activeElement();
		ca.eleToBeClickable();
		e7.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(e7, allowancepct);
		ca.eleToBeClickable();
		Commonactions.clickjs(sp.getHeader());
		ca.eleToBeClickable();


		Commonactions.clickjs(sp.getB_allowancevalue());
		WebElement e8 = ca.activeElement();
		ca.eleToBeClickable();
		e8.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(e8, allowancevalue);
		ca.eleToBeClickable();
		Commonactions.clickjs(sp.getHeader());
		ca.eleToBeClickable();


		Commonactions.clickjs(sp.getG_discountpct());
		WebElement e9 = ca.activeElement();
		ca.eleToBeClickable();
		e9.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(e9, dispct);
		ca.eleToBeClickable();
		Commonactions.clickjs(sp.getHeader());
		ca.eleToBeClickable();


		Commonactions.clickjs(sp.getG_discountvalue());
		WebElement e10 = ca.activeElement();
		ca.eleToBeClickable();
		e10.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(e10, disvalue);
		ca.eleToBeClickable();
		Commonactions.clickjs(sp.getHeader());
		ca.eleToBeClickable();


		Commonactions.clickjs(sp.getG_allowancepercentage());
		WebElement e11 = ca.activeElement();
		ca.eleToBeClickable();
		e11.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(e11, allowancepct);
		ca.eleToBeClickable();
		Commonactions.clickjs(sp.getHeader());
		ca.eleToBeClickable();


		Commonactions.clickjs(sp.getG_allowancevalue());
		WebElement e12 = ca.activeElement();
		ca.eleToBeClickable();
		e12.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(e12, allowancevalue);
		ca.eleToBeClickable();
		Commonactions.clickjs(sp.getHeader());
		ca.eleToBeClickable();

		Commonactions.isElementPresent(sp.getPOHeader());
		Commonactions.mouseOver(sp.getPOHeader());
		Commonactions.isElementPresent(sp.getEdit());
		ca.click(sp.getEdit());
		Commonactions.isElementPresent(sp.getEditText());
		insertText(sp.getEditText(), EditValue );
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		Commonactions.isElementPresent(sp.getInstruction());

		Commonactions.mouseOver(sp.getInstruction());
		ca.activeElement();
		ca.click(sp.getEdit());
		Commonactions.isElementPresent(sp.getEditText());
		insertText(sp.getEditText(), EditValue);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		Commonactions.isElementPresent(sp.getNewcomment());

		Commonactions.mouseOver(sp.getNewcomment());
		Commonactions.isElementPresent(sp.getNewcomment());
		click(sp.getNewcomment());
		Commonactions.isElementPresent(sp.getNewcommentsubject());
		insertText(sp.getNewcommentsubject(), "subject");
		Commonactions.isElementPresent(sp.getEditText());
		insertText(sp.getEditText(), EditValue);
		Commonactions.isElementPresent(mp.getSave_btn1());
		click(mp.getSave_btn1());
		ca.eleToBeClickable();

	}


	@Then("user creates shipment qc and set {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_creates_shipment_qc_and_set(String bunitvalue, String gunitvalue,String bshipvalue,String gshipvalue,String qcissue,String selectset,String gshipqty,String bshipqty) throws Throwable {

		
		
        ca.eleToBeClickable();
		Commonactions.mouseOver(sp.getOrders());
		Commonactions.isElementPresent(sp.getOrders());
		click(sp.getOrders());
		ca.eleToBeClickable();

		
		for(int i=0;i<30;i++)
		{
			ca.click(driver.findElement(By.xpath("(//div[contains(@class,'PurchasedOrder-Orders csiDnd')]//span[text()='+']/parent::div)[2]")));
		}

		for(int i=1;i<=3;i++) {
			
				int k= i+3;
				ca.click(driver.findElement(By.xpath("(//td[text()='Green Color faded']/following-sibling::td[(@data-csi-act='QuantityPerSize::0')])["+i+"]")));
			
			ca.eleToBeClickable();
			int bb = Integer.parseInt(gshipqty);
			bb=bb+(i*10);
			String qnty = Integer.toString(bb);
			ca.eleToBeClickable();
			WebElement e13 = ca.activeElement();
			ca.eleToBeClickable();
			e13.sendKeys(Keys.DELETE);
			ca.eleToBeClickable();
			ca.insertText(e13, qnty);
			ca.eleToBeClickable();
			ca.click(sp.getPoextracolumn1());
		}

		for(int i=1;i<=3;i++) {
			
			
				int j= i+3;
				ca.click(driver.findElement(By.xpath("(//td[text()='Blue Color faded']/following-sibling::td[(@data-csi-act='QuantityPerSize::0')])["+i+"]")));
			
			ca.eleToBeClickable();
			int bb = Integer.parseInt(bshipqty);
			bb=bb+(i*10);
			String qnty = Integer.toString(bb);
			ca.eleToBeClickable();
			WebElement e14 = ca.activeElement();
			ca.eleToBeClickable();
			e14.sendKeys(Keys.DELETE);
			ca.eleToBeClickable();
			ca.insertText(e14, qnty);
			ca.eleToBeClickable();
			ca.click(sp.getPoextracolumn1());
		}



		try {	ca.click(sp.getUnitpackBlue2());	}
		catch(Exception Bu)
		{	ca.click(sp.getUnitpackBlue1());	}
		WebElement e13 = ca.activeElement();
		ca.eleToBeClickable();
		e13.sendKeys(Keys.DELETE);
		ca.insertText(e13, bunitvalue);
		ca.click(sp.getPoextracolumn1());
		try {		ca.click(sp.getUnitpackGreen2());	}
		catch(Exception Gu)
		{ 	ca.click(sp.getUnitpackGreen1());}
		WebElement e14 = ca.activeElement();
		ca.eleToBeClickable();
		e14.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(e14, gunitvalue);
		ca.eleToBeClickable();
		ca.click(sp.getPoextracolumn1());
		Commonactions.isElementPresent(sp.getOrdersummary());

		ca.click(sp.getOrdersummary());
		Commonactions.isElementPresent(sp.getShipment());
		ca.click(sp.getShipment());
		Commonactions.isElementPresent(sp.getNewshipmentexpand());
		ca.click(sp.getNewshipmentexpand());
		Commonactions.isElementPresent(sp.getSelectshipment());
		ca.click(sp.getSelectshipment());
		Commonactions.isElementPresent(sp.getCheckbox());
		ca.click(sp.getCheckbox());
		ca.eleToBeClickable();
		click(mp.getSave_btn1());
		Commonactions.isElementPresent(sp.getNewshipmentorder());

		ca.click(sp.getNewshipmentorder());
		Commonactions.isElementPresent(sp.getBluecheckbox1());
		ca.click(sp.getBluecheckbox1());
		Commonactions.isElementPresent(sp.getGreencheckbox1());
		ca.click(sp.getGreencheckbox1());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		Commonactions.isElementPresent(sp.getBlueshipmentqty());

		try {		ca.click(sp.getBlueshipmentqty());	}
		catch(Exception bs)
		{	Commonactions.clickjs(sp.getBlueshipmentqty1());	}
		WebElement e15 = ca.activeElement();
		ca.eleToBeClickable();
		e15.sendKeys(Keys.DELETE);
		ca.insertText(e15, bshipvalue);
		ca.click(sp.getShipment());
		try	{		ca.click(sp.getGreenShipmentqty());	}
		catch(Exception bs)
		{	ca.click(sp.getGreenShipmentqty1());	}
		WebElement e16 = ca.activeElement();
		ca.eleToBeClickable();
		e16.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(e16, gshipvalue);
		ca.eleToBeClickable();
		ca.click(sp.getShipment());
		ca.eleToBeClickable();

		ca.click(sp.getQualitycontrol());
		Commonactions.isElementPresent(sp.getNewQCIssue());
		ca.click(sp.getNewQCIssue());

		ca.eleToBeClickable();
		WebElement e17 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(e17, qcissue);
		ca.eleToBeClickable();
		e17.sendKeys(Keys.TAB);
		ca.eleToBeClickable();

		ca.click(sp.getQccopy());
		Commonactions.isElementPresent(sp.getQcdelete());
		ca.click(sp.getQcdelete());
		Commonactions.isElementPresent(pp.getDelete_Btn());
		ca.click(pp.getDelete_Btn());
		ca.eleToBeClickable();


		ca.click(sp.getSelectSet());
		Commonactions.isElementPresent(sp.getSelectsetBtn());
		ca.click(sp.getSelectsetBtn());
		Commonactions.isElementPresent(sp.getSelectsetvalue());
		insertText(sp.getSelectsetvalue(), selectset);	
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		Commonactions.isElementPresent(hp.getUser_homeBtn());

		ca.click(hp.getUser_homeBtn());
		ca.eleToBeClickable();
	}
	
	
	@Then("User creates customerpo and issue {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_creates_customerpo_and_issue(String povalue, String B_baseprice, String G_baseprice, String B_orderqty, String G_orderqty, String dispnt, String disvalue, String allopct, String allovalue, String commission, String payment) throws Throwable {

		ca.eleToBeClickable();
		ca.click(hp.getSourcingBtn());
		Commonactions.isElementPresent(sp.getCustomerPO());

		ca.click(sp.getCustomerPO());
		Commonactions.isElementPresent(sp.getNewcustomerPObtn());
		ca.click(sp.getNewcustomerPObtn());
		Commonactions.isElementPresent(sp.getCustomerPOvalue());
		insertText(sp.getCustomerPOvalue(), povalue);
		Commonactions.isElementPresent(sp.getCustomerexpand());
		ca.click(sp.getCustomerexpand());
		Commonactions.isElementPresent(sp.getSelecttarget());
		ca.click(sp.getSelecttarget());
		Commonactions.isElementPresent(sp.getColorbasedcheckbox());
		ca.click(sp.getColorbasedcheckbox());
		Commonactions.isElementPresent(sp.getSAVEANDGO());
		ca.click(sp.getSAVEANDGO());
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getOrders());

		ca.click(sp.getOrders());
		Commonactions.isElementPresent(sp.getNewdividerexpand());
		ca.click(sp.getNewdividerexpand());
		Commonactions.isElementPresent(sp.getNewcolorwaybtn());
		ca.click(sp.getNewcolorwaybtn());
		Commonactions.isElementPresent(sp.getStyleselect());

		ca.click(sp.getStyleselect());
		Commonactions.isElementPresent(sp.getApparealcheckbox());
		ca.click(sp.getApparealcheckbox());
		Commonactions.isElementPresent(sp.getdisplay());
		ca.click(sp.getdisplay());
		Commonactions.isElementPresent(sp.getBluecheckbox1());
		ca.click(sp.getBluecheckbox1());
		Commonactions.isElementPresent(sp.getGreencheckbox1());
		ca.click(sp.getGreencheckbox1());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		Commonactions.isElementPresent(sp.getPlusicon());


		for(int i=0;i<100;i++)
		{
			ca.click(sp.getPlusicon());
		}
		ca.eleToBeClickable();
		Commonactions.clickjs(sp.getB_quantity());
		WebElement c = ca.activeElement();
		ca.eleToBeClickable();
		c.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(c, B_orderqty);
		Commonactions.isElementPresent(sp.getOrders());
		ca.click(sp.getOrders());
		Commonactions.isElementPresent(sp.getB_baseprice());

		Commonactions.clickjs(sp.getB_quantity());
		WebElement cx = ca.activeElement();
		ca.eleToBeClickable();
		cx.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(cx, B_orderqty);
		Commonactions.isElementPresent(sp.getOrders());
		ca.click(sp.getOrders());
		Commonactions.isElementPresent(sp.getB_baseprice());
		
		Commonactions.clickjs(sp.getB_baseprice());
		WebElement c1 = ca.activeElement();
		ca.eleToBeClickable();
		c1.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(c1, B_baseprice);
		Commonactions.isElementPresent(sp.getOrders());
		ca.click(sp.getOrders());
		Commonactions.isElementPresent(sp.getB_discountpct());

		Commonactions.clickjs(sp.getB_discountpct());
		WebElement c2 = ca.activeElement();
		ca.eleToBeClickable();
		c2.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(c2, dispnt);
		Commonactions.isElementPresent(sp.getOrders());
		ca.click(sp.getOrders());
		Commonactions.isElementPresent(sp.getB_discountvalue());

		Commonactions.clickjs(sp.getB_discountvalue());
		WebElement c3 = ca.activeElement();
		ca.eleToBeClickable();
		c3.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(c3, disvalue);
		Commonactions.isElementPresent(sp.getOrders());
		ca.click(sp.getOrders());
		Commonactions.isElementPresent(sp.getB_allowancepercentage());

		Commonactions.clickjs(sp.getB_allowancepercentage());
		WebElement c4 = ca.activeElement();
		ca.eleToBeClickable();
		c4.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(c4, allopct);
		Commonactions.isElementPresent(sp.getOrders());
		ca.click(sp.getOrders());
		ca.eleToBeClickable();

		Commonactions.clickjs(sp.getB_allowancevalue());
		WebElement c5 = ca.activeElement();
		ca.eleToBeClickable();
		c5.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(c5, allovalue);
		Commonactions.isElementPresent(sp.getOrders());
		ca.click(sp.getOrders());
		Commonactions.isElementPresent(sp.getG_quantity());

		Commonactions.clickjs(sp.getG_quantity());
		WebElement c6 = ca.activeElement();
		ca.eleToBeClickable();
		c6.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(c6, G_orderqty);
		Commonactions.isElementPresent(sp.getOrders());
		ca.click(sp.getOrders());
		Commonactions.isElementPresent(sp.getG_baseprice());

		Commonactions.clickjs(sp.getG_baseprice());
		WebElement c7 = ca.activeElement();
		ca.eleToBeClickable();
		c7.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(c7, "300");
		Commonactions.isElementPresent(sp.getOrders());
		ca.click(sp.getOrders());
		Commonactions.isElementPresent(sp.getG_discountpct());

		Commonactions.clickjs(sp.getG_discountpct());
		WebElement c8 = ca.activeElement();
		ca.eleToBeClickable();
		c8.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(c8, dispnt);
		Commonactions.isElementPresent(sp.getOrders());
		ca.click(sp.getOrders());
		Commonactions.isElementPresent(sp.getG_discountvalue());

		Commonactions.clickjs(sp.getG_discountvalue());
		WebElement c9 = ca.activeElement();
		ca.eleToBeClickable();
		c9.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(c9, disvalue);
		Commonactions.isElementPresent(sp.getOrders());
		ca.click(sp.getOrders());
		Commonactions.isElementPresent(sp.getG_allowancepercentage());

		Commonactions.clickjs(sp.getG_allowancepercentage());
		WebElement c10 = ca.activeElement();
		ca.eleToBeClickable();
		c10.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(c10, allopct);
		Commonactions.isElementPresent(sp.getOrders());
		ca.click(sp.getOrders());
		Commonactions.isElementPresent(sp.getG_allowancevalue());

		Commonactions.clickjs(sp.getG_allowancevalue());
		WebElement c11 = ca.activeElement();
		ca.eleToBeClickable();
		c11.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(c11, allovalue);
		Commonactions.isElementPresent(sp.getOrders());
		ca.click(sp.getOrders());
		Commonactions.isElementPresent(sp.getOrdersummary());

		Commonactions.clickjs(sp.getOrdersummary());
		Commonactions.isElementPresent(sp.getProperties());
		ca.click(sp.getProperties());
		Commonactions.isElementPresent(sp.getCommissionrate());

		ca.click(sp.getCommissionrate());
		ca.eleToBeClickable();
		WebElement c12 = ca.activeElement();
		ca.eleToBeClickable();
		c12.sendKeys(Keys.DELETE);
		ca.insertText(c12, commission);
		Commonactions.isElementPresent(sp.getProperties());
		Commonactions.clickjs(sp.getProperties());
		Commonactions.isElementPresent(sp.getPaymentterm());

		ca.click(sp.getPaymentterm());
		ca.eleToBeClickable();
		WebElement c13 = ca.activeElement();
		ca.eleToBeClickable();
		c13.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(c13, payment);
		Commonactions.isElementPresent(sp.getProperties());
		ca.click(sp.getProperties());
		Commonactions.isElementPresent(hp.getUser_homeBtn());


		ca.click(hp.getUser_homeBtn());
		Commonactions.isElementPresent(hp.getStyleBtn());

		ca.click(hp.getStyleBtn());
		Commonactions.isElementPresent(st.getSeason_Btn());
		ca.click(st.getSeason_Btn());
		Commonactions.isElementPresent(sp.getWinterseason());
		ca.click(sp.getWinterseason());
		Commonactions.isElementPresent(st.getStyles_Btn());
		ca.click(st.getStyles_Btn());
		Commonactions.isElementPresent(sp.getColorandsizename());
		ca.click(sp.getColorandsizename());
		Commonactions.isElementPresent(hp.getSourcingBtn());
		ca.click(hp.getSourcingBtn());
		Commonactions.isElementPresent(sp.getPos());
		ca.click(sp.getPos());
		Commonactions.isElementPresent(sp.getSupplierpos());
		ca.click(sp.getSupplierpos());
		ca.eleToBeClickable();
		try {
			ca.click(driver.findElement(By.xpath("(//td[contains(@data-csi-heading,'Node Name')]/a[text()='PO-AP1123-colorbased'])[2]")));
			ca.eleToBeClickable();
			ca.click(driver.findElement(By.xpath("(//span[contains(text(),'Issues')]/parent::div/parent::div/parent::div/preceding-sibling::div)[2]")));
		}
		catch(Exception e){
			try {				
	     ca.click(driver.findElement(By.xpath("(//td[contains(@data-csi-heading,'Node Name')]/a[text()='PO-AP1123-colorbased'])")));	
	     ca.eleToBeClickable();
			ca.click(driver.findElement(By.xpath("(//span[contains(text(),'Issues')]/parent::div/parent::div/parent::div/preceding-sibling::div)[2]")));
	
			
			}
			
			
			catch(Exception ee)	{	System.out.println(ee +"colorbased value not clicked"); 	}
		}
		Commonactions.isElementPresent(sp.getSupplierpo());
		ca.click(sp.getSupplierpo());
		Commonactions.isElementPresent(sp.getNegotiationarrow());
		
		
		try {			ca.click(sp.getNegotiationarrow());
		System.out.println("negatiation arrow clicked successfully");
		}
		catch(Exception neg)
		{	System.out.println(neg);}
		ca.eleToBeClickable();
		Commonactions.isElementPresent(sp.getReadyArrow());
		try {			
			
			
			ca.click(sp.getReadyArrow());
		System.out.println("ready arrow clicked successfully");
		}
		catch(Exception red)
		{	System.out.println(red);}
		ca.eleToBeClickable();
		
		try {	
			//ca.click(sp.getIssuedArrow());
			//ca.eleToBeClickable();
			ca.click(driver.findElement(By.xpath("//span[@data-csi-act='POToIssued' and text()='arrow_forward']")));
			
		System.out.println("issued successfully");
		
		}
		catch(Exception iss)
		{	System.out.println(iss);}
		ca.eleToBeClickable();
		
	
			//ca.click(sp.getErrormessage());
			Commonactions.isElementPresent(pp.getOK_Btn());
			ca.click(pp.getOK_Btn());
		//	Commonactions.isElementPresent(sp.getInstruction());
		//	Commonactions.mouseOver(sp.getInstruction());
			ca.eleToBeClickable();
			ca.jsScrollPageDown(sp.getBlue_supplierquote());
			ca.eleToBeClickable();
			Commonactions.isElementPresent(sp.getBlue_supplierquote());

			ca.click(sp.getBlue_supplierquote());
			ca.eleToBeClickable();
			Commonactions.isElementPresent(sp.getApproveActions());
			Commonactions.clickjs(sp.getApproveActions());
			
			try{
			Commonactions.isElementPresent(sp.getApprove());
			Commonactions.clickjs(sp.getApprove());
			}catch(Exception exp){
				
			}
			
			Commonactions.isElementPresent(sp.getColorandsizename());
		


	
			ca.click(sp.getColorandsizename());
			ca.eleToBeClickable();
		
		

		try {
			ca.click(driver.findElement(By.xpath("(//td[contains(@data-csi-heading,'Node Name')]/a[text()='PO-AP1123-colorbased'])[2]")));
		}
		catch(Exception e){
			try {				
				ca.click(driver.findElement(By.xpath("(//td[contains(@data-csi-heading,'Node Name')]/a[text()='PO-AP1123-colorbased'])")));	}
			catch(Exception ee)	{	
				System.out.println(ee +"colorbased value not clicked"); 	}
		}
		ca.eleToBeClickable();
	//	Commonactions.isElementPresent(sp.getReadyArrow());

		ca.jsScrollPageDown(sp.getGreen_supplierquote());
				Commonactions.isElementPresent(sp.getGreen_supplierquote());

				ca.click(sp.getGreen_supplierquote());
				ca.eleToBeClickable();
				Commonactions.isElementPresent(sp.getApproveActions());
				Commonactions.clickjs(sp.getApproveActions());
				Commonactions.isElementPresent(sp.getApprove());
				ca.clickjs(sp.getApprove());
				Commonactions.isElementPresent(sp.getColorandsizename());
				ca.click(sp.getColorandsizename());
				ca.eleToBeClickable();
			

		try {
			ca.click(driver.findElement(By.xpath("(//td[contains(@data-csi-heading,'Node Name')]/a[text()='PO-AP1123-colorbased'])[2]")));
		}
		catch(Exception e){
			try {				ca.click(driver.findElement(By.xpath("(//td[contains(@data-csi-heading,'Node Name')]/a[text()='PO-AP1123-colorbased'])")));	}
			catch(Exception ee)	{	System.out.println(e +"colorbased value not clicked"); 	}
		}
		ca.eleToBeClickable();
		ca.eleToBeClickable();
		try 
		{		
			ca.click(sp.getIssuedArrow());
			ca.eleToBeClickable();
			System.out.println("issued successfully");
		}
		catch(Exception issue)
		{
			System.out.println(issue);
		}


	}

}
