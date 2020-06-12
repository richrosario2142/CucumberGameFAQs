package com.run;
//testing git in intellij

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(
            //dryRun = true,
            monochrome = true,
            plugin = {"pretty",
                    "html:target/html_report",
                    "json:target/json_report.json",
                    "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html",
            },
            features = {"src/test/java/com/features"},
            glue = {"com/stepdefs"}
    )

public class Runner {

}
