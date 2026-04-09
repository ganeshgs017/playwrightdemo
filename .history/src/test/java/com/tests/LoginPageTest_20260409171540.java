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
        
        String firstname = JsonDataReader.get("login.validuser.firstname");
         String lastname = JsonDataReader.get("login.validuser.lastname");
          String email = JsonDataReader.get("login.validuser.email");
         String password = JsonDataReader.get("login.validuser.password");

         loginpage.loginActions(firstname,password);
    }

}
