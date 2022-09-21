package com.clipboardhealth.assignment.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt"
        },

        features = "src/test/resources/features",
        glue = "com/clipboardhealth/assignment/step_def",
        dryRun = false,
        tags = "@AmazonSearch"

)

public class CukesRunner {

}





