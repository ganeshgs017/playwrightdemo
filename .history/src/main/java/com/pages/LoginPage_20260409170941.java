package com.pages;

import com.microsoft.playwright.Page;
import com.utils.BaseClass;

public class LoginPage extends BaseClass {

    
private final String firstnamelocator = "#first_name";
private final String lastnamelocator = "#last_name";
private final String emaillocator = "#email";
private final String passwordLLocator = "#password";


    public LoginPage(Page page){

        super();
    }


    public void loginActions(String firstname, String lastname, String email, String password){

        safeFillText(firstnamelocator, firstname);
        safeFillText(lastnamelocator, lastname);
        

    }

}
