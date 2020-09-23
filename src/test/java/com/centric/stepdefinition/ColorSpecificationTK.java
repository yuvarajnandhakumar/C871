package com.centric.stepdefinition;

import com.centric.objectrepository.*;
import com.centric.resources.Commonactions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class ColorSpecificationTK extends Commonactions {

    Commonactions ca = new Commonactions();
    SetupPageTK sp = new SetupPageTK();
    PopupPage pp = new PopupPage();
    HomePage hp = new HomePage();
    SpecificationPage spec = new SpecificationPage();
    ColorSpecificationPageTK cp = new ColorSpecificationPageTK();


    @Then("Validate the options like copy and delete {string},{string}")
    public void validateThOptionsLikeCopyDelete(String a, String colorName) throws Throwable {
        java.util.List<WebElement> optionCount = driver.findElements(By.xpath("//span[@data-csi-act='Copy']"));
        optionCount.size();
        Thread.sleep(2000);
        WebElement copyBtn = driver.findElement(By.xpath("(//a[@class='browse' and text()='" + colorName + "']//following::span[@data-csi-act='Copy'])[1]"));
        copyBtn.click();
        ca.eleToBeClickable();
        cp.getColorSpecInputBox().clear();
        Thread.sleep(200);
        ca.insertText(cp.getColorSpecInputBox(), a);
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

    @When("User delete the merged colour spec and verify the error message {string}")
    public void userDeleteTheMergedColourSpecAndVerifyTheErrorMessage(String a) throws InterruptedException {
        WebElement delete = driver.findElement(By.xpath("//a[@class='browse' and text()='" + a + "']//following::span[@data-csi-act='Delete']"));
        Thread.sleep(2000);
        Actions builder = new Actions(driver);
        builder.moveToElement(delete).click(delete);
        builder.perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//span[contains(text(),'Delete')])[2]")).click();
        Thread.sleep(1000);
        String errorMessage = driver.findElement(By.xpath("//div[@class='csi-message-txt']")).getText();
        System.out.println("User unable to delete the merged color spec, please find the error message -" + " " + errorMessage);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[contains(text(),'OK')]")).click();
    }



    @And("User enters the RBG value and verify the colour in the table {string},{string}")
    public void userEntersTheRBGValueAndVerifyTheColourInTheTable(String colorName, String RGBno) throws InterruptedException {
            Thread.sleep(2000);
            WebElement nameNode = driver.findElement(By.xpath("//a[@class='browse' and text()='" + colorName + "']"));
            WebElement values = driver.findElement(By.xpath("(//a[@class='browse' and text()='" + colorName + "'])/parent::td"));
            String storeNode = values.getAttribute("data-csi-url");
            WebElement codeCell = driver.findElement(By.xpath("//tr[@data-csi-result='" + storeNode + "']/td[@data-csi-heading='RGBHex::0']"));
            Thread.sleep(2000);
            codeCell.click();
            Thread.sleep(2000);
            WebElement RGB = driver.findElement(By.xpath("//a[@class='browse' and text()='" + colorName + "']//following::td[@data-csi-heading='RGBHex::0']"));
            Thread.sleep(1000);
            Actions builder = new Actions(driver);
            builder.moveToElement(RGB).click(RGB);
            builder.perform();
            Thread.sleep(2000);
            ca.insertText(spec.getRF_InputText(), RGBno);
            Thread.sleep(1000);
            ca.click(cp.getColorSpecificationTab());
            Thread.sleep(2000);
            System.out.println("The RBG colour is has been successfully added to the colour specification");
            Thread.sleep(2000);
        WebElement statusChecker = driver.findElement(By.xpath("//a[@class='browse' and text()='" + colorName + "']//following::div[@data-csi-act='Active::0'][1]"));
        Boolean check = statusChecker.isSelected();
        if (check.equals(false)) {
            statusChecker.click();
            Thread.sleep(1000);
        } else {
            System.out.println("The Size Map status is not active");
        }
    }


    @And("Merge the color specification and validate the status after merging {string}")
    public void mergeTheColorSpecificationAndValidateTheStatusAfterMerging(String a) throws Throwable {
        java.util.List<WebElement> optionCount = driver.findElements(By.xpath("//span[@data-csi-act='ReplaceColorSpecifications']"));
        optionCount.size();
        driver.findElement(By.xpath("(//span[@data-csi-act='ReplaceColorSpecifications'])[1]")).click();
        ca.eleToBeClickable();
        driver.findElement(By.xpath("//td[text()='" + a + "']")).click();
        ca.eleToBeClickable();
        ca.click(cp.getSaveBtn());
        Thread.sleep(3000);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        WebElement activeStatus = driver.findElement(By.xpath("//a[@class='browse' and text()='" + a + "']//following::td[1]"));
        jse.executeScript("arguments[0].scrollIntoView(true);", activeStatus);
        WebElement statusChecker = driver.findElement(By.xpath("//a[@class='browse' and text()='" + a + "']//following::input[@aria-checked='false']"));
        Boolean check = statusChecker.isSelected();
        if (check.equals(false)) {
            System.out.println("The color specification merge was successful");
        } else {
            System.out.println("The color specification merge was not successful");
        }
    }


    @Then("Click on specification tab and create color specification {string},{string},{string},{string},{string},{string},{string},{string},{string}")
    public void clickOnSpecificationTabAndCreateColorSpecification(String ColorName, String Code, String Description, String ColorName2, String Code2, String Description2,String ColorName3,String ColorName4,String ColorName5) throws Throwable {
        Thread.sleep(3000);
        ca.eleToBeClickable();
        ca.click(spec.getSpecificationTab());
        jsWaitForPageLoad();
        ca.click(cp.getColorSpecificationTab());
        jsWaitForPageLoad();
        Thread.sleep(3000);
        ca.click(cp.getNewColorSpec_btn());
        Thread.sleep(4000);
        if (cp.getNewColorSpec_btn().isDisplayed() && cp.getNewColorSpec_btn().isEnabled()) {
            String expectedHeader = "New Color Specification";
            String message = cp.getColorSpecPOPHeader().getText();
            Assert.assertTrue("New Color Specification", message.contains(expectedHeader));
            System.out.println("Color Specification header verified Successfully");
            ca.click(cp.getCancelBtn());
        }
        ca.eleToBeClickable();
        ca.click(cp.getNewColorSpec_btn());
        Thread.sleep(1000);
        ca.eleToBeClickable();
        ca.insertText(cp.getColorSpecInputBox(),ColorName);
        ca.eleToBeClickable();
        ca.click(cp.getSaveBtn());
        Thread.sleep(1000);
        WebElement nameNode = driver.findElement(By.xpath("//a[@class='browse' and text()='" + ColorName + "']"));
        WebElement values = driver.findElement(By.xpath("(//a[@class='browse' and text()='" + ColorName + "'])/parent::td"));
        String storeNode = values.getAttribute("data-csi-url");
        WebElement codeCell = driver.findElement(By.xpath("//tr[@data-csi-result='" + storeNode + "']/td[@data-csi-heading='Code::0']"));
        ca.eleToBeClickable();
        codeCell.click();
        Thread.sleep(1000);
        ca.insertText(spec.getRF_InputText(),Code);
        Thread.sleep(1000);
        ca.click(spec.getSpecificationTab());
        Thread.sleep(1000);
        WebElement description = driver.findElement(By.xpath("//tr[@data-csi-result='" + storeNode + "']/td[@data-csi-heading='Description::0']"));
        description.click();
        Thread.sleep(1000);
        ca.insertText(spec.getRF_InputText(), Description);
        Thread.sleep(1000);
        ca.click(spec.getSpecificationTab());

        ca.eleToBeClickable();
        ca.click(cp.getNewColorSpec_btn());
        Thread.sleep(1000);
        ca.eleToBeClickable();
        ca.insertText(cp.getColorSpecInputBox(),ColorName2);
        ca.eleToBeClickable();
        ca.click(cp.getSaveBtn());
        Thread.sleep(1000);
        WebElement nameNode1 = driver.findElement(By.xpath("//a[@class='browse' and text()='" + ColorName2 + "']"));
        WebElement values1 = driver.findElement(By.xpath("(//a[@class='browse' and text()='" + ColorName2 + "'])/parent::td"));
        String storeNode1 = values1.getAttribute("data-csi-url");
        WebElement codeCell1 = driver.findElement(By.xpath("//tr[@data-csi-result='" + storeNode1 + "']/td[@data-csi-heading='Code::0']"));
        ca.eleToBeClickable();
        codeCell1.click();
        Thread.sleep(1000);
        ca.insertText(spec.getRF_InputText(),Code2);
        Thread.sleep(1000);
        ca.click(spec.getSpecificationTab());
        Thread.sleep(1000);
        WebElement description1 = driver.findElement(By.xpath("//tr[@data-csi-result='" + storeNode1 + "']/td[@data-csi-heading='Description::0']"));
        description1.click();
        Thread.sleep(1000);
        ca.insertText(spec.getRF_InputText(), Description2);
        Thread.sleep(1000);
        ca.click(spec.getSpecificationTab());


        ca.eleToBeClickable();
        ca.click(cp.getNewColorSpec_btn());
        Thread.sleep(1000);
        ca.eleToBeClickable();
        ca.insertText(cp.getColorSpecInputBox(),ColorName3);
        ca.eleToBeClickable();
        ca.click(cp.getSaveBtn());
        Thread.sleep(1000);
        WebElement nameNode3 = driver.findElement(By.xpath("//a[@class='browse' and text()='" + ColorName3 + "']"));
        WebElement values3 = driver.findElement(By.xpath("(//a[@class='browse' and text()='" + ColorName3 + "'])/parent::td"));
        String storeNode3 = values3.getAttribute("data-csi-url");
        WebElement codeCell3 = driver.findElement(By.xpath("//tr[@data-csi-result='" + storeNode3 + "']/td[@data-csi-heading='Code::0']"));
        ca.eleToBeClickable();
        codeCell3.click();
        Thread.sleep(1000);
        ca.insertText(spec.getRF_InputText(),"24");
        Thread.sleep(1000);
        ca.click(spec.getSpecificationTab());
        /*
        Thread.sleep(1000);
        WebElement description3 = driver.findElement(By.xpath("//tr[@data-csi-result='" + storeNode3 + "']/td[@data-csi-heading='Description::0']"));
        description1.click();
        Thread.sleep(2000);
        ca.insertText(spec.getRF_InputText(), Description2);
        Thread.sleep(1000);
         */

        ca.eleToBeClickable();
        ca.click(cp.getNewColorSpec_btn());
        Thread.sleep(1000);
        ca.eleToBeClickable();
        ca.insertText(cp.getColorSpecInputBox(),ColorName4);
        ca.eleToBeClickable();
        ca.click(cp.getSaveBtn());
        Thread.sleep(1000);
        WebElement nameNode4 = driver.findElement(By.xpath("//a[@class='browse' and text()='" + ColorName4 + "']"));
        WebElement values4 = driver.findElement(By.xpath("(//a[@class='browse' and text()='" + ColorName4 + "'])/parent::td"));
        String storeNode4 = values4.getAttribute("data-csi-url");
        WebElement codeCell4 = driver.findElement(By.xpath("//tr[@data-csi-result='" + storeNode4 + "']/td[@data-csi-heading='Code::0']"));
        ca.eleToBeClickable();
        codeCell4.click();
        Thread.sleep(1000);
        ca.insertText(spec.getRF_InputText(),"25");
        Thread.sleep(1000);
        ca.click(spec.getSpecificationTab());
        /*
        Thread.sleep(1000);
        WebElement description4 = driver.findElement(By.xpath("//tr[@data-csi-result='" + storeNode4 + "']/td[@data-csi-heading='Description::0']"));
        description1.click();
        Thread.sleep(2000);
        ca.insertText(spec.getRF_InputText(), Description2);
        Thread.sleep(1000);
        ca.click(spec.getSpecificationTab());
         */

        ca.eleToBeClickable();
        ca.click(cp.getNewColorSpec_btn());
        Thread.sleep(1000);
        ca.eleToBeClickable();
        ca.insertText(cp.getColorSpecInputBox(),ColorName5);
        ca.eleToBeClickable();
        ca.click(cp.getSaveBtn());
        Thread.sleep(1000);
        WebElement nameNode5 = driver.findElement(By.xpath("//a[@class='browse' and text()='" + ColorName5 + "']"));
        WebElement values5 = driver.findElement(By.xpath("(//a[@class='browse' and text()='" + ColorName5 + "'])/parent::td"));
        String storeNode5 = values5.getAttribute("data-csi-url");
        WebElement codeCell5 = driver.findElement(By.xpath("//tr[@data-csi-result='" + storeNode5 + "']/td[@data-csi-heading='Code::0']"));
        ca.eleToBeClickable();
        codeCell5.click();
        Thread.sleep(1000);
        ca.insertText(spec.getRF_InputText(),"26");
        Thread.sleep(1000);
        ca.click(spec.getSpecificationTab());
        /*
        Thread.sleep(1000);
        WebElement description5 = driver.findElement(By.xpath("//tr[@data-csi-result='" + storeNode5 + "']/td[@data-csi-heading='Description::0']"));
        description1.click();
        Thread.sleep(2000);
        ca.insertText(spec.getRF_InputText(), Description2);
        Thread.sleep(1000);
        ca.click(spec.getSpecificationTab());
         */
    }

    @Then("User creates the Custom view and add the options to the table {string}")
    public void userCreatesTheCustomViewAndAddTheOptionsToTheTable(String arg0) throws Throwable {
        ca.eleToBeClickable();
        ca.click(cp.getCustomViewBtn());
        Thread.sleep(2000);
        ca.click(cp.getManageViews_CV());
        Thread.sleep(2000);
        ca.eleToBeClickable();
        ca.click(cp.getCopyCV_Option());
        Thread.sleep(2000);
        ca.eleToBeClickable();
        cp.getCopyNameTxt_bx().clear();
        Thread.sleep(1000);
        ca.insertText(cp.getCopyNameTxt_bx(), "CV_Copy");
        Select dropdown = new Select(cp.getAttributesBox());
        Thread.sleep(1000);
        dropdown.selectByVisibleText(arg0);
        Thread.sleep(1000);
        ca.click(cp.getCV_AddBtn());
        Thread.sleep(2000);
        ca.click(cp.getCV_PopUpSaveBtn());
        Thread.sleep(3000);
    }

    @But("User deletes the unwanted attributes from custom views column {string},{string},{string},{string}")
    public void userDeletesTheUnwantedAttributesFromCustomViewsColumn(String arg0, String arg1, String arg2, String arg3) throws Throwable {
        Thread.sleep(2000);
        ca.eleToBeClickable();
        Actions actions = new Actions(driver);
        actions.moveToElement(cp.getCustomViewBtn()).click(cp.getCustomViewBtn()).build().perform();
        Thread.sleep(2000);
        ca.click(cp.getManageViews_CV());
        Thread.sleep(2000);
        Select dropdown = new Select(cp.getSelectedAttributesBox());
        Thread.sleep(1000);
        dropdown.selectByVisibleText(arg0);
        dropdown.selectByVisibleText(arg1);
        dropdown.selectByVisibleText(arg2);
        dropdown.selectByVisibleText(arg3);
        Thread.sleep(1000);
        ca.click(cp.getCV_RemoveBtn());
        Thread.sleep(2000);
        ca.click(cp.getCV_PopUpSaveBtn());
        System.out.println("The custom view is created successfully with the given options");
    }

    @Then("User enters the RBG value and colour in the table {string},{string},{string},{string}")
    public void userEntersTheRBGValueAndColourInTheTable(String color2, String color3, String color4, String color5) throws Throwable {
        ArrayList<String> colors=new ArrayList<String>();
        colors.add(color2);
        colors.add(color3);
        colors.add(color4);
        colors.add(color5);
        ArrayList<String> RGBX=new ArrayList<String>();
        RGBX.add("#EFEFDF");
        RGBX.add("#EFEAD7");
        RGBX.add("#F2EFDC");
        RGBX.add("#EFEFD5");
        int list = colors.size();
        for (int i = 0; i <list ; i++) {
        	
            WebElement colorSpecs = driver.findElement(By.xpath("//a[@class='browse' and text()='" + colors.get(i) + "']//following::td[@data-csi-heading='RGBHex::0'][1]"));
            Thread.sleep(4000);
            ca.jsScrollPageDown(colorSpecs);
            Actions builder = new Actions(driver);
            builder.moveToElement(colorSpecs).click(colorSpecs);
            builder.perform();
            Thread.sleep(4000);
            ca.insertText(spec.getRF_InputText(), RGBX.get(i));
            Thread.sleep(2000);
            ca.click(cp.getColorSpecificationTab());

        }
        System.out.println("The RBG colour is has been successfully added to all the colour specifications");
    }
}




