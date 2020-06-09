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
            initialized = true;
        }
    }

    public WebDriver getDriver() {
        return driver;
    }

    @After(value = "@web")
    public void disposeWebDriver() throws Throwable {
        driver.close();
        driver.quit();
    }
}
