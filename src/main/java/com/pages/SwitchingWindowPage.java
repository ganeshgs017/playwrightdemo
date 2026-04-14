package com.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.utils.BaseClass;

import io.qameta.allure.Step;

public class SwitchingWindowPage extends BaseClass {

    private final String alertsLocator = "Alerts, Frame & Windows";
    private final String browserwindowLocator = "Browser Windows";
    private final String newTabbutton = "[id='tabButton']";
    private final String pagetitle = "h1[id='sampleHeading']";

    public SwitchingWindowPage(Page page) {
        super();
    }

    @Step("Verify Switching window")
    public void switchwindow() {

        scrollbypixels(0,100);
        safeclickbytext(0, alertsLocator);
        safeclickbytext(0, browserwindowLocator);
        scrollbypixels(0, -100);
    

    }

    public String getWindowTitle(String newTabbutton){

        return switchnewtab(newTabbutton, pagetitle);


    }

    

}
