package com.clipboardhealth.assignment.step_def;

import com.clipboardhealth.assignment.utils.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before


    @After
    public static void tearDownScenario(Scenario scenario) {

        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "img/png", scenario.getName());
        }

        Driver.closeDriver();
    }

}
