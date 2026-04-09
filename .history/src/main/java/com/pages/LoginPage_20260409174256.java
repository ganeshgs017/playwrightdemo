package com.pages;

import com.microsoft.playwright.Page;
import com.utils.BaseClass;

public class LoginPage extends BaseClass {

    
private final String firstnamelocator = "[name='username']";
private final String lastnamelocator = "[name='password']";
private final String submitbtnlocator = "//input[@type"


    public LoginPage(Page page){

        super();
    }


    public void loginActions(String username, String password){

        safeFillText(firstnamelocator, username);
        safeFillText(lastnamelocator, password);
    }

}
