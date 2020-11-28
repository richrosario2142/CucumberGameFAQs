package com.stepdefs;
import com.pages.HomePage;
import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LoginStepDef {

    ChromeDriver driver;

    @Before
    public void setUp(){
        driver = new ChromeDriver();
    }

    @Given("^User is on the GameFAQs home page$")
    public void user_is_on_the_GameFAQs_home_page() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.gamefaqs.com");
    }

    @When("^User searches for \"([^\"]*)\"$")
    public void user_searches_for(String game) {
        HomePage home = new HomePage(driver);
        home.searchGame(game);
    }

    @After
    public void cleanUp() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            driver.quit();
            driver = null;
        }
    }
}
