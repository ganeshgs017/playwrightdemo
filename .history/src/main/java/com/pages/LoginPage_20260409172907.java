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

        safeFillTextbyIndex(firstnamelocator, firstname,2);
        safeFillTextbyIndex(lastnamelocator, lastname,0);
        safeFillTextbyIndex(emaillocator, email,0);
        safeFillTextbyIndex(passwordLLocator, password,0);
        safeClickbyIndex(submitbtnlocator, 0);

    }

}
