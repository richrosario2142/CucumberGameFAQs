package com.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage(ChromeDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //web elements
    @FindBy(name = "game")
    private WebElement searchBar;

    //@FindBy(how = How.CSS, using = ".checkout-button.alt")
    //private WebElement qAndA;

    //actions to be performed on home page
    public void searchGame(String game) {
        searchBar.sendKeys(game);
    }
}
