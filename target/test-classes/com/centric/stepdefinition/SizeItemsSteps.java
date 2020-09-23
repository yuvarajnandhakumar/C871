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

public class SizeItemsSteps extends Commonactions {

    Commonactions ca = new Commonactions();
    SetupPageTK sp = new SetupPageTK();
    PopupPage pp = new PopupPage();
    HomePage hp = new HomePage();
    SpecificationPage spec = new SpecificationPage();
    SpecificationHierarchyPageTK shp = new SpecificationHierarchyPageTK();
    ColorSpecificationPageTK cp = new ColorSpecificationPageTK();
    PopupPage pup=new PopupPage();
    StylePage spk =new StylePage();
    SizeLabel sl = new SizeLabel();
    SIzeChartTK sc = new SIzeChartTK();
    SizeSpec ss = new SizeSpec();
    SizeItem si = new SizeItem();


    @When("user navigates to size items tab")
    public void userNavigatesToSizeItemsTab() throws Throwable {
        try {
            ca.eleToBeClickable();
            ca.click(spec.getSpecificationTab());
            jsWaitForPageLoad();;
            ca.click(si.getSetupStyleItemTab());
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    @And("user creates the size item {string},{string}")
    public void userCreatesTheSizeItem(String a,String b) throws Throwable {
        Thread.sleep(3000);
        Actions actions = new Actions(driver);
        String[] sizeItem,sizeSpec;
        ca.eleToBeClickable();
        sizeItem = a.split(",");
        sizeSpec = b.split(",");
        ca.eleToBeClickable();
        jsWaitForPageLoad();
        for (int i = 0; i < sizeItem.length; i++) {
            ca.eleToBeClickable();
            actions.moveToElement(si.getSetupStyleItemAction()).click(si.getSetupStyleItemAction()).build().perform();
            //ca.click(si.getSetupStyleItemAction());
            ca.eleToBeClickable();
            ca.click(si.getSpecTypeOptionList());
            ca.eleToBeClickable();
            ca.insertText(si.getSpecTypeInputTextBtn(),sizeSpec[i]);
            Thread.sleep(3000);
            actions.sendKeys(Keys.DOWN).build().perform();
            actions.sendKeys(Keys.ENTER).build().perform();
            ca.eleToBeClickable();
            ca.insertText(si.getSpecItemInputTextBtn(),sizeItem[i]);
            ca.eleToBeClickable();
            ca.click(pp.getSave_Btn());
            ca.eleToBeClickable();
        }
        System.out.println("Size items  are created");
    }

    @Then("Validate the options like copy and delete for size item {string},{string}")
    public void validateTheOptionsLikeCopyAndDeleteForSizeItem(String a, String colorName) throws Throwable {
        java.util.List<WebElement> optionCount = driver.findElements(By.xpath("//span[@data-csi-act='Copy']"));
        optionCount.size();
        Thread.sleep(2000);
        WebElement copyBtn = driver.findElement(By.xpath("(//a[@class='browse' and text()='" + colorName + "']//following::span[@data-csi-act='Copy'])[1]"));
        copyBtn.click();
        ca.eleToBeClickable();
        si.getSpecItemInputTextBtn().clear();
        Thread.sleep(200);
        ca.insertText(si.getSpecItemInputTextBtn(), a);
        ca.eleToBeClickable();
        Boolean save_Copy = driver.findElement(By.cssSelector("span[data-csi-act='Save_Copy']")).isDisplayed();
        System.out.println("The Popup contains Save&Copy button" + " -" + save_Copy);
        Boolean cancel = driver.findElement(By.cssSelector("span[data-csi-act='Cancel']")).isDisplayed();
        System.out.println("The Popup contains Cancel button" + "- " + cancel);
        ca.eleToBeClickable();
        ca.click(cp.getSaveBtn());
        WebElement delete = driver.findElement(By.xpath("//a[@class='browse' and text()='" + a + "']//following::span[@data-csi-act='Delete']"));
        Thread.sleep(1000);
        delete.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//span[contains(text(),'Delete')])[2]")).click();
        System.out.println("The copy color specification is deleted ");
    }

    @And("user creation of tags in the size item {string},{string}")
    public void userCreationOfTagsInTheSizeItem(String a,String b) throws Throwable {
        Actions actions = new Actions(driver);
        String[] sizeItem, tag;
        ca.eleToBeClickable();
        sizeItem = a.split(",");
        tag = b.split(",");
        for (int i = 0; i < sizeItem.length; i++) {
            driver.navigate().refresh();
            jsWaitForPageLoad();
            WebElement dimName1 = driver.findElement(By.xpath("(//a[@class='browse' and text()='" + sizeItem[i] + "']//following::td[@data-csi-act='Tags::0'])[1]"));
            dimName1.click();
            ca.eleToBeClickable();
            WebElement e = ca.activeElement();
            ca.eleToBeClickable();
            ca.insertText(e, tag[i]);
            Thread.sleep(2000);
            //driver.findElement(By.xpath("//input[@type='checkbox']//following::label[text()='" + tag[i] + "']")).click();
            actions.sendKeys(Keys.DOWN).build().perform();
            Thread.sleep(1000);
            actions.sendKeys(Keys.ENTER).build().perform();
            ca.eleToBeClickable();
            ca.click(si.getSetupStyleItemTab());
            jsWaitForPageLoad();
            Thread.sleep(3000);
        }
    }
}
