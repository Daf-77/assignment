package com.clipboardhealth.assignment.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/rerun.txt",
        glue = "com/clipboardhealth/assignment/step_def"
)


public class FailedTestsRunner {


}
