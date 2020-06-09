package org.playtictactoe.stepdefs;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.playtictactoe.pages.TTTPage;

public class TryingToWinONeRowStepdefs {

    private Hooks hooks;
    private TTTPage tttPage;

    public TryingToWinONeRowStepdefs(Hooks hooks) {
        this.hooks = hooks;
    }

    @Given("^I load the tictactoe page$")
    public void iLoadTheTictactoePage() throws Throwable {
        WebDriver driver = hooks.getDriver();
        tttPage = new TTTPage(driver);
        tttPage.navigateToGame();
        Thread.sleep(5000);
    }

    @Before(value = "@tictactoe", order = 1)
    public void initTictactoePage() throws Throwable {

    }

    @When("^I select (\\d+),(\\d+)$")
    public void iSelect(int arg0, int arg1) throws Throwable{
    }

    @Then("^Computer Would stop me at (\\d+),(\\d+)$")
    public void computerWouldStopMeAt(int arg0, int arg1) {
    }
}
