package org.playtictactoe.stepdefs;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.playtictactoe.pages.TTTPage;

public class TryingToWinONeRowStepdefs {
    private WebDriver driver;
    private TTTPage tttPage;
//    TTTPage tttPage = new TTTPage();
    @Before(value = "@web", order = 1)
    public void initWebdriver() throws Throwable {
        driver = new ChromeDriver();
    }

    @Before(value = "@tictactoe", order = 1)
    public void initTictactoePage() throws Throwable {
        tttPage = new TTTPage(driver);
    }

    @Given("^I load the tictactoe page$")
    public void iLoadTheTictactoePage() throws Throwable{
        tttPage.navigateToGame();
    }

    @When("^I select (\\d+),(\\d+)$")
    public void iSelect(int arg0, int arg1) throws Throwable{
    }

    @Then("^Computer Would stop me at (\\d+),(\\d+)$")
    public void computerWouldStopMeAt(int arg0, int arg1) {
    }
}
