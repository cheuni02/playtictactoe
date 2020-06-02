package org.playtictactoe.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber", "junit:target/cucumber.xml"},
        features = "src/test/resources/org/playtictactoe/features",
        glue = {"org.playtictactoe.stepdefs"})
public class TicTacToeTest {
}
