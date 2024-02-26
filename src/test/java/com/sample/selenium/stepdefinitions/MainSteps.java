package com.sample.selenium.stepdefinitions;

import com.sample.selenium.utils.DriverFactory;
import com.sample.selenium.pageobjects.ResultsPage;
import com.sample.selenium.pageobjects.SearchPage;
import io.cucumber.java8.En;
import org.openqa.selenium.WebDriver;

public class MainSteps implements En {

    private WebDriver driver;
    private SearchPage googleSearchPage;
    private ResultsPage searchResultsPage;

    public MainSteps() {

        // Setting up WebDriver and page objects before each scenario
        Before(() -> {
            driver = DriverFactory.getDriver();
            googleSearchPage = new SearchPage(driver);
            searchResultsPage = new ResultsPage(driver);
        });

        // Step definition for "Given the user is on the Google search page"
        Given("^the user is on the Google search page$", () -> {
            googleSearchPage.openURL();
        });

        // Step definition for "When the user searches for Selenium"
        When("^the user searches for Selenium$", () -> {
            googleSearchPage.searchFor("Selenium");
        });

        // Step definition for "Then the user should see search results related to Selenium"
        Then("^the user should see search results related to Selenium$", () -> {
            boolean isSeleniumLinkPresent = searchResultsPage.isSeleniumLinkPresent();
            assert isSeleniumLinkPresent : "Selenium link not present in search results.";
        });

        // Clean up after each scenario
        After(() -> {
            if (driver != null) {
                driver.quit();
            }
        });
    }
}
