package com.utils;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class BaseClass{

    private static ThreadLocal<Playwright> tlplaywright = new ThreadLocal<>();
    private static ThreadLocal<Browser> tlbrowser = new ThreadLocal<>();
    private static ThreadLocal<BrowserContext> tlbrowsercontext = new ThreadLocal<>();
    private static ThreadLocal<Page> tlpage = new ThreadLocal<>();


    @BeforeMethod
    public void setUp(){

        tlplaywright.set(Playwright.create());
        tlbrowser.set(tlplaywright.get().chromium().launch(
            new BrowserType.LaunchOptions().setHeadless(
                Boolean.parseBoolean(ConfigProperties.get("headless")))
            )
        );

        tlbrowsercontext.set(tlbrowser.get().newContext());
        tlpage.set(tlbrowsercontext.get().newPage());

        tlpage.get().navigate(ConfigProperties.get("baseUrl"));
           
    }

    @AfterMethod
    public void teardowm(){

        tlpage.get().close();
        tlbrowsercontext.get().close();
        tlbrowser.get().close();
        tlplaywright.get().close();


    }

    public Page getPage(){

        return tlpage.get();
    }

    

}
