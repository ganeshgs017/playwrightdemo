package com.utils;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class BaseClass{

    private static ThreadLocal<Playwright> tlplaywright = new ThreadLocal<>();
    private static ThreadLocal<Browser> tlbrowser = new ThreadLocal<>();
    private Static ThreadLocal<BrowserContext> tlbrowsercontext = new ThreadLocal<>();
    private static ThreadLocal<Page> tlpage = new ThreadLocal<>();


    public void setUp(){

        tlplaywright.set(Playwright.create());
        
    }

    

}
