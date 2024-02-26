package com.sample.selenium.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * SearchPage is a page object representing the Google search page.
 * It provides methods to perform actions on the page like opening the page and searching for a term.
 */
public class SearchPage {

    private WebDriver driver;

    @FindBy(name = "q")
    private WebElement searchBox;

    /**
     * Constructor for SearchPage.
     * @param driver the WebDriver instance to be used for interacting with the web elements
     */
    public SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /**
     * Opens the Google search page.
     */
    public void openURL() {
        driver.get("https://www.google.com/");
    }

    /**
     * Searches for a given term on the Google search page.
     * @param searchTerm the term to search for
     */
    public void searchFor(String searchTerm) {
        searchBox.sendKeys(searchTerm + Keys.RETURN);
    }
}
