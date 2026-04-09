package com.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.gson.stream.JsonReader;
import com.pages.LoginPage;
import com.utils.BaseClass;
import com.utils.JSONData;

public class LoginPageTest extends BaseClass {

    @BeforeClass
    public void launchBrowser() {

        setUp();

    }

    @Test
    public void testLogin(){

        LoginPage loginpage = new LoginPage(getPage());
        
        String username = 
    }

}
