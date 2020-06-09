package org.playtictactoe.stepdefs;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    private static boolean initialized = false;
    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        if (!initialized) {
            // initialize the driver
            driver = new ChromeDriver();
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            initialized = true;
        }
    }

    public WebDriver getDriver() {
        return driver;
    }



//    @Before("@web")
//    public void initWebdriver() throws Throwable {
//        System.out.println("initialising hooks!...");
//        driver = new ChromeDriver();
////        driver = new FirefoxDriver();
//    }

//    @Before("@tictactoe")
//    public void initTictactoePage() throws Throwable {
//        tttPage = new TTTPage(driver);
//    }
//
//    @Before("@tictactoe")
//    public TTTPage getTttPage() {
//        return tttPage;
//    }

    @After(value = "@web")
    public void disposeWebDriver() throws Throwable {
        driver.close();
        driver.quit();
    }
}
