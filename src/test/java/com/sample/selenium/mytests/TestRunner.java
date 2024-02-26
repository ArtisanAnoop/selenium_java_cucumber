package com.sample.selenium.mytests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * TestRunner class is used to run Cucumber mytests.
 * It specifies the location of feature files and step definitions.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:features/Google.feature"}, // Path to the feature files
        glue = {"com.sample.selenium.stepdefinitions"}, // Path to the step definitions
        plugin = {"json:target/cucumber-report.json", "html:target/cucumber-html"}, // Plugins for test report generation
        monochrome = true // Better console output
)
public class TestRunner {
    // This class should be empty, step definitions are in separate classes
}
