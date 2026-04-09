package com.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import com.pages.LoginPage;
import com.utils.BaseClass;
import com.utils.JsonDataReader;

public class LoginPageTest extends BaseClass {

    @BeforeClass
    public void launchBrowser() {

        setUp();

    }

    @Test
    public void testLogin(){

        LoginPage loginpage = new LoginPage(getPage());
        
        String firstname = JsonDataReader.get("login.validuser.username");
         String lastname = JsonDataReader.get("login.validuser.username");
          String firstname = JsonDataReader.get("login.validuser.username");
         String password = JsonDataReader.get("login.validuser.password");

         loginpage.loginActions(username,password);
    }

}
