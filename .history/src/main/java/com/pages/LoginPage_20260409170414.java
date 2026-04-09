package com.pages;

import com.microsoft.playwright.Page;
import com.utils.BaseClass;

public class LoginPage extends BaseClass {

    
private final String usernamelocator = "#first_name";
private final String lastnamelocator = "#last_name"


    public LoginPage(Page page){

        super();
    }


    public void loginActions(String username, String password){

        safeFillText(usernamelocator, username);
        safeFillText(username, password);
    }

}
