package com.centric.stepdefinition;

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
import com.centric.resources.Commonactions;

import cucumber.api.java.en.When;

public class QualityPageSteps extends Commonactions{
	
	HomePage hp = new HomePage();
	Commonactions ca = new Commonactions();
	MaterialSpecificationPage mp = new MaterialSpecificationPage();
	PopupPage pp = new PopupPage();
	SourcingPage sp = new SourcingPage();
    QualityPage  qp = new QualityPage();
	
	@When("User creates test spec under quality {string},{string},{string},{string}")
	public void user_creates_test_spec_under_quality(String string, String string2, String string3, String string4) throws Throwable {
	    
		//ca.eleToBeClickable();
		Commonactions.isElementPresent(qp.getRightArrow());
		ca.click(qp.getRightArrow());
		Commonactions.isElementPresent(qp.getQuality());
		ca.click(qp.getQuality());
		Commonactions.isElementPresent(qp.getSetup());
		ca.click(qp.getSetup());
		Commonactions.isElementPresent(qp.getTestSpecs());
		ca.click(qp.getTestSpecs());
		Commonactions.isElementPresent(qp.getNewTestSpecBtn());
		ca.click(qp.getNewTestSpecBtn());
		Commonactions.isElementPresent(qp.getTypeValue());
		ca.click(qp.getTypeValue());
		ca.eleToBeClickable();
		WebElement a = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a, string);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(qp.getTestSpecValue());
		ca.insertText(qp.getTestSpecValue(), string+" Spec");
		Commonactions.isElementPresent(qp.getTestSpecCode());
		ca.insertText(qp.getTestSpecCode(), string3);
		Commonactions.isElementPresent(qp.getTestSpecValue());
		ca.insertText(qp.getTestSpecDes(), string4);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		
		Commonactions.isElementPresent(qp.getNewTestSpecBtn());
		ca.click(qp.getNewTestSpecBtn());
		Commonactions.isElementPresent(qp.getTypeValue());
		ca.click(qp.getTypeValue());
		ca.eleToBeClickable();
		WebElement a1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a1, string2);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(qp.getTestSpecValue());
		ca.insertText(qp.getTestSpecValue(), string2+" Spec");
		Commonactions.isElementPresent(qp.getTestSpecCode());
		ca.insertText(qp.getTestSpecCode(), string3);
		Commonactions.isElementPresent(qp.getTestSpecDes());
		ca.insertText(qp.getTestSpecDes(), string4);
		Commonactions.isElementPresent(sp.getSaveandgo());
		ca.click(sp.getSaveandgo());
		
		ca.eleToBeClickable();
		ca.click(qp.getTags());
		ca.eleToBeClickable();
		WebElement a3 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a3, string4);
		Commonactions.isElementPresent(qp.getClickTags());
		ca.click(qp.getClickTags());
		Commonactions.isElementPresent(qp.getClickAgain());
		ca.click(qp.getClickAgain());
		Commonactions.isElementPresent(qp.getCheckDoc());
		ca.click(qp.getCheckDoc());
		Commonactions.isElementPresent(qp.getCheckWhUsed());
		ca.click(qp.getCheckWhUsed());
		
		
		Commonactions.isElementPresent(hp.getUser_homeBtn());
        ca.click(hp.getUser_homeBtn()); 
	     
	     System.out.println("home tab clicked successfully");
		Commonactions.isElementPresent(qp.getChemicalCopy());
		
		ca.click(qp.getChemicalCopy());
		Commonactions.isElementPresent(qp.getTestSpecValue());
		ca.insertText(qp.getTestSpecValue(), string + " Spec - Copy");
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		Commonactions.isElementPresent(qp.getChemicalTestAprv());
		ca.click(qp.getChemicalTestAprv());
		Commonactions.isElementPresent(qp.getIronTestApprv());
		ca.click(qp.getIronTestApprv());
		ca.eleToBeClickable();
		try{
			for(int i = 1; i <=150; i++ ){
				ca.click(driver.findElement(By.xpath("//div[contains(@class,'TestSpec')]//span[text()='+']/parent::div")));
			if(qp.getLatestState().isDisplayed()){
				
				ca.click(driver.findElement(By.xpath("//div[contains(@class,'TestSpec')]//span[text()='+']/parent::div")));
				ca.click(driver.findElement(By.xpath("//div[contains(@class,'TestSpec')]//span[text()='+']/parent::div")));
			Commonactions.getText(qp.getLatestState1()).equals("APPROVED");
			ca.eleToBeClickable();
			break;
			}
			}
		}catch (Exception exception) {
			// TODO: handle exception
		}
		
		System.out.println("Test Spec Created successfully");
		
	}

	@When("User creates test group {string},{string},{string},{string}")
	public void user_creates_test_group(String string, String string2, String string3, String string4) throws Throwable {
		
		Commonactions.isElementPresent(qp.getTestGrps());
		ca.click(qp.getTestGrps());
		Commonactions.isElementPresent(qp.getNewTestGrpBtn());
		ca.click(qp.getNewTestGrpBtn());
		ca.eleToBeClickable();
		WebElement a = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a, string + " Group");
		ca.eleToBeClickable();
		a.sendKeys(Keys.TAB);
		Commonactions.isElementPresent(qp.getNewSelTstSpecBtn());
		ca.click(qp.getNewSelTstSpecBtn());
		Commonactions.isElementPresent(qp.getChemChkbx());
		ca.click(qp.getChemChkbx());
		Commonactions.isElementPresent(qp.getChemCpyChkbx());
		ca.click(qp.getChemCpyChkbx());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		
		ca.click(qp.getChemTestGrpCpy());
		Commonactions.isElementPresent(qp.getGrp1());
		ca.click(qp.getGrp1());
		Commonactions.isElementPresent(qp.getGrp2());
		ca.click(qp.getGrp2());
		Commonactions.isElementPresent(qp.getChemTSGDel());
		ca.click(qp.getChemTSGDel());
		Commonactions.isElementPresent(pp.getDelete_Btn());
		ca.click(pp.getDelete_Btn());
		ca.eleToBeClickable();
		
		ca.click(qp.getNewTestGrpBtn());
		ca.eleToBeClickable();
		WebElement a1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a1, string2 + " Group");
		ca.eleToBeClickable();
		a1.sendKeys(Keys.TAB);
		Commonactions.isElementPresent(qp.getNewSelTstSpecBtn());
		ca.click(qp.getNewSelTstSpecBtn());
		Commonactions.isElementPresent(qp.getIronChkbx());
		ca.click(qp.getIronChkbx());
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		
		ca.click(qp.getSelTestSpecExpnd());
		Commonactions.isElementPresent(qp.getNewTestSpec());
		ca.click(qp.getNewTestSpec());
		Commonactions.isElementPresent(qp.getTypeValue());
		ca.click(qp.getTypeValue());
		ca.eleToBeClickable();
		WebElement a2 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a2, "Ironing Test");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(qp.getTestSpecValue());
		ca.insertText(qp.getTestSpecValue(), string2+ " Spec");
		Commonactions.isElementPresent(qp.getTestSpecCode());
		ca.insertText(qp.getTestSpecCode(), string3);
		Commonactions.isElementPresent(qp.getTestSpecDes());
		ca.insertText(qp.getTestSpecDes(), string4);
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		ca.eleToBeClickable();
		
		ca.click(qp.getWashCopy());
		ca.eleToBeClickable();
		ca.insertText(qp.getTestSpecValue(), string2+ " Spec - Copy");
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		Commonactions.isElementPresent(qp.getWashCpyDel());
		ca.click(qp.getWashCpyDel());
		Commonactions.isElementPresent(sp.getApproveicon1());
		ca.click(sp.getApproveicon1());
		Commonactions.isElementPresent(sp.getApprove1());
		ca.click(sp.getApprove1());
		Commonactions.isElementPresent(qp.getTestSpecs());
		
		System.out.println("Test Groups Created Successfully");
		
		ca.click(qp.getTestSpecs());
		Commonactions.isElementPresent(qp.getRefresh());
		ca.click(qp.getRefresh());
		ca.eleToBeClickable();
		System.out.println("Test Groups Validated Successfully");
	    
		
		
	}

	@When("User creates test templates {string},{string},{string},{string},{string}")
	public void user_creates_test_templates(String string, String string2, String string3, String string4, String string5) throws Throwable {
	    
		//===============================temp================================\\
		Commonactions.isElementPresent(qp.getRightArrow());
		ca.click(qp.getRightArrow());
		Commonactions.isElementPresent(qp.getQuality());
		ca.click(qp.getQuality());
		Commonactions.isElementPresent(qp.getSetup());
		ca.click(qp.getSetup());
		ca.eleToBeClickable();
		//===========================================================
		
		Commonactions.isElementPresent(qp.getTemplates());
		ca.click(qp.getTemplates());
		Commonactions.isElementPresent(qp.getNewTestRunTemp());
		ca.click(qp.getNewTestRunTemp());
		Commonactions.isElementPresent(qp.getTestRunValue());
		ca.insertText(qp.getTestRunValue(), string+ " Templates");
		Commonactions.isElementPresent(qp.getTypeRunGrp());
		ca.click(qp.getTypeRunGrp());
		ca.eleToBeClickable();
		WebElement a = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a, string + " Group");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(qp.getRespnsUser());
		ca.click(qp.getRespnsUser());
		ca.eleToBeClickable();
		WebElement a1 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a1, string4);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(qp.getTypeRunSupplier());
		ca.click(qp.getTypeRunSupplier());
		ca.eleToBeClickable();
		WebElement a2 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a2, string5);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(qp.getNext());
		ca.click(qp.getNext());
		ca.eleToBeClickable();
		
		
		Commonactions.isElementPresent(qp.getFinish());
		ca.click(qp.getFinish());
		Commonactions.isElementPresent(qp.getToolBar());
		Thread.sleep(4000);
		ca.click(qp.getToolBar());
		Commonactions.isElementPresent(qp.getCanvas());
		
		ca.click(qp.getCanvas());
		Commonactions.isElementPresent(qp.getCreateanewCanvas());
		ca.click(qp.getCreateanewCanvas());
		Commonactions.isElementPresent(qp.getRectangle());
		ca.click(qp.getRectangle());
		ca.eleToBeClickable();
		Actions actions = new Actions(driver);
		ca.eleToBeClickable();
		actions.doubleClick(qp.getDoubleClick()).perform();
		Commonactions.isElementPresent(qp.getSaveAndFinish());
		ca.click(qp.getSaveAndFinish());
		Commonactions.isElementPresent(qp.getTests());
		
		Thread.sleep(4000);
		
		ca.click(qp.getTests());
		Commonactions.isElementPresent(qp.getChmTestSpecCpy());
		ca.click(qp.getChmTestSpecCpy());
		ca.eleToBeClickable();
		WebElement a3 = ca.activeElement();
		ca.eleToBeClickable();
		a3.sendKeys(Keys.DELETE);
		ca.eleToBeClickable();
		ca.insertText(a3, "New Chemical Test");
		ca.eleToBeClickable();
		a3.sendKeys(Keys.TAB);
		Commonactions.isElementPresent(qp.getTDS());
		
		ca.click(qp.getTDS());
		Commonactions.isElementPresent(qp.getTDSRefresh());
		ca.click(qp.getTDSRefresh());
		ca.eleToBeClickable();
		
		
		Commonactions.isElementPresent(hp.getUser_homeBtn());
        ca.click(hp.getUser_homeBtn());
	     
	     System.out.println("home tab clicked successfully");
		Commonactions.isElementPresent(qp.getTemplates());
		
		ca.click(qp.getTemplates());
		Commonactions.isElementPresent(qp.getNewTestRunTemp());
		ca.click(qp.getNewTestRunTemp());
		Commonactions.isElementPresent(qp.getTestRunValue());
		ca.insertText(qp.getTestRunValue(), string2+ " Templates");
		Commonactions.isElementPresent(qp.getTypeRunGrp());
		ca.click(qp.getTypeRunGrp());
		ca.eleToBeClickable();
		WebElement a4 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a4, string3 + " Group");
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(qp.getRespnsUser());
		ca.click(qp.getRespnsUser());
		ca.eleToBeClickable();
		WebElement a5 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a5, string4);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		Commonactions.isElementPresent(qp.getTypeRunSupplier());
		ca.click(qp.getTypeRunSupplier());
		ca.eleToBeClickable();
		WebElement a6 = ca.activeElement();
		ca.eleToBeClickable();
		ca.insertText(a6, string5);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		//Commonactions.isElementPresent(qp.getNext());
		//ca.click(qp.getNext());
		System.out.println("next clicked");
		ca.eleToBeClickable();
		ca.click(qp.getFinish());
		Commonactions.isElementPresent(sp.getApproveActions());
		
		Thread.sleep(4000);
		
		ca.click(sp.getApproveActions());
		Commonactions.isElementPresent(sp.getApprove());
		ca.click(sp.getApprove());
		ca.eleToBeClickable();
		
		Commonactions.isElementPresent(hp.getUser_homeBtn());
        ca.click(hp.getUser_homeBtn());
	     
	     System.out.println("home tab clicked successfully");
		Commonactions.isElementPresent(qp.getChmTestTemCpy());
		
		ca.click(qp.getChmTestTemCpy());
		Commonactions.isElementPresent(qp.getTestRunValue());
		ca.insertText(qp.getTestRunValue(), string+" Templates - Copy");
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		Commonactions.isElementPresent(qp.getChmTestTemEdit());
		ca.click(qp.getChmTestTemEdit());
		Commonactions.isElementPresent(qp.getTestRunValue());
		ca.insertText(qp.getTestRunValue(), "Acid Test Templates - Copied");
		Commonactions.isElementPresent(mp.getSave_btn1());
		ca.click(mp.getSave_btn1());
		Commonactions.isElementPresent(qp.getChmTestTemdel());
		ca.click(qp.getChmTestTemdel());
		Commonactions.isElementPresent(pp.getDelete_Btn());
		ca.click(pp.getDelete_Btn());
		Commonactions.isElementPresent(qp.getChmTstTemApprve());
		ca.click(qp.getChmTstTemApprve());
		ca.eleToBeClickable();
		System.out.println("Test Templates Created Successfully");
	}

}
