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

import java.util.List;

public class SizeChartPage extends Commonactions {

    Commonactions ca = new Commonactions();
    SetupPageTK sp = new SetupPageTK();
    PopupPage pp = new PopupPage();
    HomePage hp = new HomePage();
    SpecificationPage spec = new SpecificationPage();
    SpecificationHierarchyPageTK shp = new SpecificationHierarchyPageTK();
    ColorSpecificationPageTK cp = new ColorSpecificationPageTK();
    PopupPage pup = new PopupPage();
    SIzeChartTK sc = new SIzeChartTK();


    @When("user navigates to size chart tab")
    public void userNavigatesToSizeChartTab() throws Throwable {
        try {
            ca.eleToBeClickable();
            ca.click(spec.getSpecificationTab());
            jsWaitForPageLoad();
            ca.eleToBeClickable();
            ca.click(sc.getSizeChartTab());
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    @Then("create the size charts {string},{string},{string}")
    public void createTheSizeCharts(String string, String desc, String descAlt) throws Throwable {
        String[] sizeChart, sizeDesc, sizeDescAlt;
        ca.eleToBeClickable();
        sizeChart = string.split(",");
        sizeDesc = desc.split(",");
        sizeDescAlt = descAlt.split(",");
        for (int i = 0; i < sizeChart.length; i++) {
            Thread.sleep(3000);
            ca.eleToBeClickable();
            ca.click(sc.getSizeChartActionBtn());
            ca.eleToBeClickable();
            ca.insertText(sc.getSizeChartInputBox(), sizeChart[i].trim());
            ca.eleToBeClickable();
            ca.insertText(sc.getSizeChartDescInputBox(), sizeDesc[i].trim());
            ca.eleToBeClickable();
            ca.click(pp.getSave_Btn());
            Thread.sleep(3000);
            WebElement descAltOptn = driver.findElement(By.xpath("//a[@class='browse' and text()='" + sizeChart[i] + "']//following::td[3][@data-csi-act='DimDescAlt1::0']"));
            descAltOptn.click();
            ca.insertText(spec.getRF_InputText(), sizeDescAlt[i].trim());
            ca.eleToBeClickable();
            ca.click(sc.getSizeChartTab());
        }
    }

    @Then("creates the increment for the size chart {string}")
    public void createsTheIncrementForTheSizeChart(String increment) throws Throwable {
        String[] SizeIncrement;
        ca.eleToBeClickable();
        ca.click(sc.getSizeChartIncrementTab());
        jsWaitForPageLoad();
        SizeIncrement = increment.split(",");
        for (int i = 0; i < SizeIncrement.length; i++) {
            Thread.sleep(3000);
            ca.eleToBeClickable();
            ca.click(sc.getSizeChartIncrementActionBtn());
            ca.eleToBeClickable();
            ca.insertText(sc.getSizeChartIncrementInputBox(), SizeIncrement[i].trim());
            ca.eleToBeClickable();
            ca.click(pp.getSave_Btn());
        }
    }

    @When("user navigates to sizeRange tab for twoDsize validation {string}")
    public void userNavigatesToSizeRangeTabForTwoDsizeValidation(String string) throws Throwable {
        try {
            ca.eleToBeClickable();
            ca.click(spec.getSpecificationTab());
            jsWaitForPageLoad();
            ca.eleToBeClickable();
            ca.click(spec.getSizeRangeTab());
            jsWaitForPageLoad();
        } catch (Exception e) {
            // TODO: handle exception
        }
        Thread.sleep(1000);
        WebElement statusChecker = driver.findElement(By.xpath("//a[@class='browse' and text()='" + string + "']//following::div[@data-csi-act='OKforSizeChart::0']"));

				Boolean check = statusChecker.isSelected();
		        Actions action = new Actions(driver);
		        if (check.equals(false)) {
		            Thread.sleep(3000);
		            try{
		            action.moveToElement(statusChecker).click(statusChecker).build().perform();
		            }catch(Exception e){
		            	Thread.sleep(3000);
		            	ca.clickjs(statusChecker);
		            }
		            Thread.sleep(3000);
		            System.out.println("The Meg's regular 2d size range is clicked the sizeChart option");
		        } else {
		            System.out.println("The Meg's regular 2d sizerange is not active for size chart");
		        }
			
		
        
    }

    @Then("user maps the size range for the increments {string},{string}")
    public void userMapsTheSizeRangeForTheIncrements(String incrementName, String sizeRange) throws Throwable {
        String[] SR, SizeIncrement;
        Actions actions = new Actions(driver);
        ca.eleToBeClickable();
        ca.click(sc.getSizeChartIncrementTab());
        jsWaitForPageLoad();
        SizeIncrement = incrementName.split(",");
        SR = sizeRange.split(",");
        for (int i = 0; i < SR.length; i++) {
            Thread.sleep(3000);
            WebElement incrementSR = driver.findElement(By.xpath("(//a[@class='browse' and text()='" + SizeIncrement[i] + "']//following::td[@data-csi-act='IncrementSizeRange::0'])[1]"));
            ca.click(incrementSR);
            Thread.sleep(3000);
            driver.findElement(By.xpath("//div[contains(text(),'" + SR[i] + "')]")).click();
            Thread.sleep(3000);
        }
        System.out.println("Size range has been mapped to the increment values");
    }

    @And("user maps the dimensions inside the increments values {string},{string},{string},{string},{string},{string},{string},{string},{string}")
    public void userMapsTheDimensionsInsideTheIncrementsValues(String incrementName1,String incrementName2, String dim1, String dim2, String dim3, String dim4, String dim5, String dim6,String dim7) throws Throwable {

            WebElement dimName1 = driver.findElement(By.xpath("(//a[@class='browse' and text()='" + incrementName1 + "']//following::td[@data-csi-act='Dimensions::0'])[1]"));
            ca.click(dimName1);
            driver.findElement(By.xpath("//input[@type='checkbox']//following::label[text()='" + dim1 + "']")).click();
            driver.findElement(By.xpath("//input[@type='checkbox']//following::label[text()='" + dim2 + "']")).click();
            ca.eleToBeClickable();
            ca.click(sc.getSizeChartIncrementTab());

            Thread.sleep(2500);
            WebElement dimName2 = driver.findElement(By.xpath("(//a[@class='browse' and text()='" + incrementName2 + "']//following::td[@data-csi-act='Dimensions::0'])[1]"));
            ca.click(dimName2);
            driver.findElement(By.xpath("//input[@type='checkbox']//following::label[text()='" + dim3 + "']")).click();
            driver.findElement(By.xpath("//input[@type='checkbox']//following::label[text()='" + dim4 + "']")).click();
            driver.findElement(By.xpath("//input[@type='checkbox']//following::label[text()='" + dim5 + "']")).click();
            driver.findElement(By.xpath("//input[@type='checkbox']//following::label[text()='" + dim6 + "']")).click();
            driver.findElement(By.xpath("//input[@type='checkbox']//following::label[text()='" + dim7 + "']")).click();
            ca.eleToBeClickable();
            ca.click(sc.getSizeChartIncrementTab());
            Thread.sleep(3000);

    }

    @When("user selects the base sizes for the increments {string},{string},{string},{string}")
    public void userSelectsTheBaseSizesForTheIncrements(String a, String b,String c,String d) throws Throwable {
        Thread.sleep(3000);
        WebElement dimName1 = driver.findElement(By.xpath("(//a[@class='browse' and text()='" + a + "']//following::td[@data-csi-act='BaseSize::0'])[1]"));
        ca.click(dimName1);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[contains(text(),'" + d + "')]")).click();
        Thread.sleep(2500);

        WebElement increment2 = driver.findElement(By.xpath("(//a[@class='browse' and text()='" + b + "']//following::td[@data-csi-act='BaseSize::0'])[1]"));
        ca.click(increment2);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[contains(text(),'" + c + "')]")).click();
    }

    @And("user creation of tags in the dimension {string}")
    public void userCreationOfTagsInTheDimension(String a) throws Throwable {
        ca.click(sc.getSizeChartDimensionTab());
        jsWaitForPageLoad();
        WebElement dimName1 = driver.findElement(By.xpath("(//a[@class='browse' and text()='" + a + "']//following::td[@data-csi-act='Tags::0'])[1]"));
        ca.click(dimName1);
        ca.eleToBeClickable();
        WebElement e = ca.activeElement();
        ca.eleToBeClickable();
        ca.insertText(e, "Neck");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='checkbox']//following::label[text()='Neck']")).click();
        ca.eleToBeClickable();
        ca.click(sc.getSizeChartTab());
        jsWaitForPageLoad();
    }

    @Then("user will create the product group")
    public void userWillCreateTheProductGroup() throws Throwable {
        Thread.sleep(3000);
        ca.eleToBeClickable();
        ca.click(sc.getSizeChartPGTab());
        jsWaitForPageLoad();
        ca.eleToBeClickable();
        ca.click(sc.getSizeChartPGActionBtn());
        ca.eleToBeClickable();
        ca.insertText(sc.getSizeChartPGInputBtn(),"NewPG");
        ca.eleToBeClickable();
        ca.insertText(sc.getSizeChartPGDescBtn(),"NewPG");
        ca.eleToBeClickable();
        ca.click(pp.getSave_Btn());
        Thread.sleep(3000);

    }
}
