package org.playtictactoe.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.playtictactoe.framework.BasePage;

public class TTTPage extends BasePage {

    private static final String TICTACTOEURL = "https://playtictactoe.org/";
    private static final By board = By.cssSelector(".game .board");
    private static final By squareTopLeft = By.cssSelector(".game .board .square.top.left");
    private static final By squareTop = By.cssSelector(".game .board [class='square top']");
    private static final By squareTopRight = By.cssSelector(".game .board .square.top.right");
    private static final By squareLeft = By.cssSelector(".game .board .square.left");
    private static final By square = By.cssSelector(".game .board [class=square]");
    private static final By squareRight = By.cssSelector(".game .board .square.right");
    private static final By squareBottomLeft = By.cssSelector(".game .board .square.bottom.left");
    private static final By squareBottomRight = By.cssSelector(".game .board .square.bottom.right");

    public TTTPage(WebDriver driver) {
        super(driver);
    }

    public void navigateToGame() {
        getDriver().navigate().to(TICTACTOEURL);
    }

    public void clickTopLeft(){
        WebElement topLeftField = getDriver().findElement(squareTopLeft);
        topLeftField.click();
    }

    public void clickTop(){
        WebElement topField = getDriver().findElement(squareTop);
        topField.click();
    }



}
