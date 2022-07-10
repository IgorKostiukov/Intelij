package com.syntax.class23;

public class FirefoxDriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("Open firefox browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("close firefox browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("MaxWind in  firefox browser");
    }

    @Override
    public void findElement() {
        System.out.println("findElem in firefox browser");
    }
}
