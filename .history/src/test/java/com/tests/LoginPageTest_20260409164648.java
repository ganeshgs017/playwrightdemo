package com.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.utils.BaseClass;

public class LoginPageTest extends BaseClass {

    @BeforeClass
    public void launchBrowser() {

        setUp();

    }

    @Test
    public void testLogin()

}
