package com.pages;

import com.microsoft.playwright.Page;
import com.utils.BaseClass;

import io.qameta.allure.Step;

public class LoginPage extends BaseClass {

    private final String usernamelocator = "Username";
    private final String passwordlocator = "Password";
    private final String submitbtnlocator = "button[type='submit']";
    private final String adminLocator = "Admin";
    private final String adduserBtn = "button[class='oxd-button oxd-button--medium oxd-button--secondary']";
    private final String selectuserlocator = "[class='oxd-select-text oxd-select-text--active']";
    private final String employeee = "Type for hints...";
    private final String addusernamelocator = "input[class='oxd-input oxd-input--active']";
    private final String addpasswordLocator = "input[type='password']";

    public LoginPage(Page page) {

        super();
    }

    @Step("Verify Login")
    public void loginUser(String username, String password, String employeeusername, String addusername,
            String userpassword) {

        safeFillbyPlaceholder(usernamelocator, username);
        safeFillbyPlaceholder(passwordlocator, password);
        safeClick(submitbtnlocator);
        safeclickbytext(0, adminLocator);
        safeClickbyIndex(adduserBtn, 0);
        pressdownselect(selectuserlocator, 0);
        safeFillbyPlaceholder(employeee, employeeusername);
        pressdownselect(selectuserlocator, 1);
        safeFillTextbyIndex(addusernamelocator, addusername, 1);
        safeFillTextbyIndex(addpasswordLocator, userpassword, 0);
        safeFillTextbyIndex(addpasswordLocator, userpassword, 1);
        safeClick(submitbtnlocator);
            }

        


}
