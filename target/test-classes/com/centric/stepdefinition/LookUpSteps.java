package com.centric.stepdefinition;

import com.centric.objectrepository.*;
import com.centric.resources.Commonactions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LookUpSteps extends Commonactions {

    Commonactions ca = new Commonactions();
    SetupPageTK sp = new SetupPageTK();
    PopupPage pp = new PopupPage();
    HomePage hp = new HomePage();
    SpecificationPage spec = new SpecificationPage();
    SpecificationHierarchyPageTK shp = new SpecificationHierarchyPageTK();
    ColorSpecificationPageTK cp = new ColorSpecificationPageTK();
    PopupPage pup=new PopupPage();
    StylePage spk =new StylePage();
    SizeLabelPage sl = new SizeLabelPage();
    SIzeChartTK sc = new SIzeChartTK();
    LookUpPage lp = new LookUpPage();


    @When("user navigates to lookup tab")
    public void userNavigatesToLookupTab() throws Throwable {
        try {
            ca.eleToBeClickable();
            ca.click(spec.getSpecificationTab());
            jsWaitForPageLoad();
            ca.click(lp.getLookUpTab());
            jsWaitForPageLoad();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    @And("user creates the lookup {string},{string},{string},{string}")
    public void userCreatesTheLookup(String a, String b,String c, String d) throws Throwable {
        Actions actions = new Actions(driver);
        String[] loopUp,code;
        ca.eleToBeClickable();
        loopUp = a.split(",");
        code = c.split(",");
        ca.eleToBeClickable();
        for (int i = 0; i < loopUp.length; i++) {
            ca.eleToBeClickable();
            actions.moveToElement(lp.getLookUpActionBtn()).click(lp.getLookUpActionBtn()).build().perform();
            ca.eleToBeClickable();
            ca.insertText(lp.getLookUpInputTxtBox(), b);
            ca.eleToBeClickable();
            ca.insertText(lp.getLookUpNameTxtBox(),loopUp[i]);
            ca.eleToBeClickable();
            ca.insertText(lp.getLookUpCodeTxtBox(),code[i]);
            ca.eleToBeClickable();
            //ca.insertText(lp.getLookUpDescTxtBox(),d);
            //ca.eleToBeClickable();
            ca.click(pp.getSave_Btn());
            Thread.sleep(3000);
        }
    }

    @Then("Validate the options like copy and delete for lookup {string},{string}")
    public void validateTheOptionsLikeCopyAndDeleteForLookup(String a,String b) throws Throwable {
        java.util.List<WebElement> optionCount = driver.findElements(By.xpath("//span[@data-csi-act='Copy']"));
        optionCount.size();
        Thread.sleep(2000);
        WebElement copyBtn = driver.findElement(By.xpath("(//a[@class='browse' and text()='" + b + "']//following::span[@data-csi-act='Copy'])[1]"));
        Thread.sleep(3000);
        copyBtn.click();
        ca.eleToBeClickable();
        ca.insertText(lp.getLookUpNameTxtBox(), a);
        ca.eleToBeClickable();
        driver.findElement(By.xpath("//span[@data-csi-act='Save']")).click();
        ca.eleToBeClickable();
        WebElement delete = driver.findElement(By.xpath("//a[@class='browse' and text()='" + a + "']//following::span[@data-csi-act='Delete']"));
        Thread.sleep(1000);
        delete.click();
        driver.findElement(By.xpath("(//span[contains(text(),'Delete')])[2]")).click();
        System.out.println("The copy color specification is deleted ");
    }
}
