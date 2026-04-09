package com.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pages.LoginPage;
import com.utils.BaseClass;

public class LoginPageTest extends BaseClass {

    @BeforeClass
    public void launchBrowser() {

        setUp();

    }

    @Test
    public void testLogin(){

        LoginPage loginpage = new LoginPage(getPage());
        loginpage.loginActions(null);
    }

}
