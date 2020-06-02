package org.playtictactoe.stepdefs;

import org.openqa.selenium.WebDriver;
import org.playtictactoe.pages.TTTPage;

public class TryingToWinONeRow {
    private WebDriver driver;
    private TTTPage tttpage;

    public TryingToWinONeRow() {
        Given("^I load the tictactoe page$", () -> {

        });

        When("^I select (\\d+),(\\d+)$", (Integer arg0, Integer arg1) -> {

        });

        Then("^Computer Would stop me at (\\d+),(\\d+)$", (Integer arg0, Integer arg1) -> {

        });
    }
}
