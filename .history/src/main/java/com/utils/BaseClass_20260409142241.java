package com.utils;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class BaseClass{

    private static ThreadLocal<Playwright> tlplaywright = new ThreadLocal<>();
    private static ThreadLocal<Browser> tlbrowser = new ThreadLocal<>();
    private static ThreadLocal<Page> tlpage = new ThreadLocal<>();


    public void setUp(){

        tlplaywright.set(Playwright.create());
        tlbrowser.set(tlplaywright.get().chromium().launch(
            new BrowserType.LaunchOptions().setHeadless(
                Boolean.parseBoolean(ConfigProperties.get("headless")))));

                t
                

        tlcontext
                

           
    }

    

}
