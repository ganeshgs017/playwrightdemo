package com.pages;

import com.microsoft.playwright.Page;
import com.utils.BaseClass;

public class LoginPage extends BaseClass {

    
private final String firstnamelocator = "#first_name";
private final String lastnamelocator = "#last_name";


    public LoginPage(Page page){

        super();
    }


    public void loginActions(String , String password){

        safeFillText(firstnamelocator, username);
        safeFillText(lastnamelocator, password);
    }

}
