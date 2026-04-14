package com.tests;

import java.io.ByteArrayInputStream;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import com.utils.BaseClass;

import io.qameta.allure.Allure;

public class BaseTestClass extends BaseClass{


    @AfterMethod
    public void teardownTest(ITestResult result){

        if (result.getStatus()==ITestResult.FAILURE) {

            byte[]screenshot = getPage().screenshot();
            Allure.addAttachment("Failure Screenshot: ", new ByteArrayInputStream(screenshot));
            
        }
    }


  



}
