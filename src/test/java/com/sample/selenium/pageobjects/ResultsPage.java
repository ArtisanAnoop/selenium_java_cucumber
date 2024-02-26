package com.sample.selenium.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * ResultsPage is a page object representing the search results page.
 * It provides methods to interact with various elements on the search results page.
 */
public class ResultsPage {

    private WebDriver driver;

    @FindBy(partialLinkText = "Selenium")
    private WebElement lnkSelenium;

    /**
     * Constructor for the ResultsPage.
     * @param driver the WebDriver instance to be used for interacting with the web elements
     */
    public ResultsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /**
     * Checks if the Selenium link is present in the search results.
     * @return true if the Selenium link is displayed, false otherwise
     */
    public boolean isSeleniumLinkPresent() {
        try {
            return lnkSelenium.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
