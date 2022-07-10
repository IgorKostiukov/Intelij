package com.syntax.class23;

public class webDriveTest {
    public static void main(String[] args) {
        WebDriver [] drivers= {new ChromeDriver(), new FirefoxDriver()};
        for (WebDriver driver:drivers){
            driver.openBrowser();
            driver.closeBrowser();
            driver.findElement();
            driver.maximizeWindow();
        }
    }
}
