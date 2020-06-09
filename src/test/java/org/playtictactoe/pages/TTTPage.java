package org.playtictactoe.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.playtictactoe.framework.BasePage;

public class TTTPage extends BasePage {
    private BasePage basePage;

    private static final String TICTACTOEURL = "https://playtictactoe.org/";
    private static final By board = By.className(".game .board");
    private static final By squareTopLeft = By.className(".game .board .square.top.left");
    private static final By squareTopRight = By.className(".game .board .square.top.right");
    private static final By squareLeft = By.className(".game .board .square.left");
    private static final By square = By.className(".game .board [class=square]");
    private static final By squareRight = By.className(".game .board .square.right");
    private static final By squareBottomLeft = By.className(".game .board .square.bottom.left");
    private static final By squareBottomRight = By.className(".game .board .square.bottom.right");

    public TTTPage(WebDriver driver) {
        super(driver);
        basePage = new BasePage(driver);
    }

    public void navigateToGame() {
        getDriver().navigate().to(TICTACTOEURL);
    }

    public void clickTopLeft(){
        WebElement topLeftField = getDriver().findElement(squareTopLeft);
    }



}
