package com.pages;

import com.microsoft.playwright.Page;
import com.utils.BaseClass;

public class LoginPage extends BaseClass {

    
private final String firstnamelocator = "#first_name";
private final String lastnamelocator = "#last_name";
private final String emaillocator = "#email";
private final String passwordLLocator = "#password";
private final String submitbtnlocator = "//input[@type='submit']";


    public LoginPage(Page page){

        super();
    }


    public void loginActions(String firstname, String lastname, String email, String password){

        safeFillTextbyIndex(firstnamelocator, firstname,0);
        safeFillText(lastnamelocator, lastname);
        safeFillText(emaillocator, email);
        safeFillText(passwordLLocator, password);
        safeClickbyIndex(submitbtnlocator, 0);

    }

}
