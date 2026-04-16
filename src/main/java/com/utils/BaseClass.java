package com.utils;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;

public class BaseClass {

    private static ThreadLocal<Playwright> tlplaywright = new ThreadLocal<>();
    private static ThreadLocal<Browser> tlbrowser = new ThreadLocal<>();
    private static ThreadLocal<BrowserContext> tlbrowsercontext = new ThreadLocal<>();
    private static ThreadLocal<Page> tlpage = new ThreadLocal<>();

    public void setUp() {

        tlplaywright.set(Playwright.create());
        tlbrowser.set(tlplaywright.get().chromium().launch(
                new BrowserType.LaunchOptions().setHeadless(
                        Boolean.parseBoolean(ConfigProperties.get("headless")))));

        tlbrowsercontext.set(tlbrowser.get().newContext());
        tlpage.set(tlbrowsercontext.get().newPage());

        // tlpage.get().navigate(ConfigProperties.get("baseurl1"));

    }

    public void safeClick(String locator) {

        getPage().locator(locator).click();
    }

    public void safeClickbyIndex(String locator, int i) {

        getPage().locator(locator).nth(i).click();

    }

    public void waitforelement(String locator) {

        getPage().locator(locator).waitFor();
    }

    public void safeclickbytext(int i, String text) {

        getPage().getByText(text).nth(i).click();
    }

    public void pressdownselect(String locator, int i) {

        Locator element = getPage().locator(locator).nth(i);
        element.press("ArrowDown");
        element.press("Enter");
    }

    public void safeFillText(String locator, String text) {

        getPage().locator(locator).fill(text);
    }

    public void safeFillTextbyIndex(String locator, String text, int i) {

        getPage().locator(locator).nth(i).fill(text);
    }

    public void safeFillbyPlaceholder(String locator, String text) {

        getPage().getByPlaceholder(locator).fill(text);
    }

    public void safeFillbyPlaceholderIndex(String locator, String text, int i) {

        Locator element = getPage().getByPlaceholder(locator).nth(i);

        element.fill(text);
        element.press("Enter");

    }

    public void scrollbypixels(int x, int y) {

        getPage().mouse().wheel(0, y);
    }

    public void safefillplaceholderBytext(String locator, String text, String name) {

        getPage().getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(name)).fill(text);
    }

    public String switchnewtab(String tablocator, String textLocator) {
        Page original = getPage();

        // original.click(locator);
        // original.waitForLoadState();

        Page newPage = original.context().waitForPage(() -> {
            original.click(tablocator);

        });

        newPage.waitForLoadState();
        String text = newPage.locator(textLocator).textContent();
        newPage.close();
        original.bringToFront();
        System.out.println("Return to Original tab");
        return text;

    }

    public void retryLocator(String locator) {

        int max = 3;

        for (int i = 0; i < max; i++) {
            try {

                getPage().click(locator);
                break;

            } catch (Exception e) {
                System.out.println("Retrying......");
            }

        }
    }

   
    public void teardowm(){

        tlpage.get().close();
        tlbrowsercontext.get().close();
        tlbrowser.get().close();
        tlplaywright.get().close();


    }

    public Page getPage() {

        return tlpage.get();
    }

}
