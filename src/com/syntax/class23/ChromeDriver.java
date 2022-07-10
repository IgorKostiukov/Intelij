package com.syntax.class23;

public class ChromeDriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("Open chrome browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close chrome browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("MaxWindow chrome browser");
    }

    @Override
    public void findElement() {
        System.out.println("FindElem in chrome browser");
    }
}
