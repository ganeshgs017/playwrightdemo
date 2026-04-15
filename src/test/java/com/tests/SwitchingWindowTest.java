package com.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.SwitchingWindowPage;
import com.utils.BaseClass;
import com.utils.ConfigProperties;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class SwitchingWindowTest extends BaseClass{


    private SwitchingWindowPage switchpage;


    @BeforeMethod
    public void launchdemobrowser(){

        setUp();
        getPage().navigate(ConfigProperties.get("baseurl2"));
        switchpage = new SwitchingWindowPage(getPage());
    }
    
    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Description("Switch to new tab and Navigate back")
    public void switchingframes(){

        switchpage.switchwindow();
        String actualheading = switchpage.getWindowTitle("[id='tabButton']");
        System.out.println("Actual Title : " + actualheading);
        Assert.assertEquals(actualheading, "This is a sample page" , "Title mismatch");



    }



}
