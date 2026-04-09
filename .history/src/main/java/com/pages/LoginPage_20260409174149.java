package com.pages;

import com.microsoft.playwright.Page;
import com.utils.BaseClass;

public class LoginPage extends BaseClass {

    
private final String firstnamelocator = "[name='username']";
private final String lastnamelocator = "[name='password']";


    public LoginPage(Page page){

        super();
    }


    public void loginActions(String username, String password){

        safeFillText(firstnamelocator, username);
        safeFillText(lastnamelocator, password);
    }

}
