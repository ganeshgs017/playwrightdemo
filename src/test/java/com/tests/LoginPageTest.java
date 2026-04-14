package com.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.pages.LoginPage;
import com.utils.BaseClass;
import com.utils.ConfigProperties;
import com.utils.JsonDataReader;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

@Epic("OrangeHRM User Creation and Deletion")
public class LoginPageTest extends BaseClass {

    private LoginPage loginpage;


    @BeforeMethod
    public void launchbrowser(){

        setUp();
        getPage().navigate(ConfigProperties.get("baseurl1"));
        loginpage = new LoginPage(getPage());

    }

    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Description("Test valid Login")
    public void verifyLogin(){


        String username = JsonDataReader.get("login.validuser.username");
        String password = JsonDataReader.get("login.validuser.password");
       String employee = JsonDataReader.get("login.validuser.employee");
       String addusername = JsonDataReader.get("login.validuser.addusername");
        String userpassword = JsonDataReader.get("login.validuser.userpassword");

        loginpage.loginUser(username, password,employee,addusername,userpassword);
       
    }

    

   

}
