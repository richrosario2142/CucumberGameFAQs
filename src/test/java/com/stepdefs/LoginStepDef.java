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


    @When("^User enters the following in the corresponding fields$")
    public void user_enters_the_following_in_the_corresponding_fields() {
        HomePage home = new HomePage(driver);
        home.searchGame("zelda");
    }

    @Then("^The user sees the name is present in the field$")
    public void the_user_sees_the_name_is_present_in_the_field() {

    }

    @After
    public void cleanUp(){
        driver.quit();
        driver = null;
    }
}
