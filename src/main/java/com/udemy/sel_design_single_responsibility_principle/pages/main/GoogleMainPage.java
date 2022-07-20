package com.udemy.sel_design_single_responsibility_principle.pages.main;

import com.udemy.sel_design_single_responsibility_principle.pages.components.common.SearchWidget;
import com.udemy.sel_design_single_responsibility_principle.pages.components.common.SearchSuggestion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GoogleMainPage {

    private WebDriver driver;
    private SearchWidget searchWidget;
    private SearchSuggestion searchSuggestion;

    public GoogleMainPage(final WebDriver driver) {
        this.driver = driver;
        // Using the driver obj create a new instance of the below components and assign them to objRefs
        this.searchWidget = PageFactory.initElements(driver, SearchWidget.class);
        this.searchSuggestion = PageFactory.initElements(driver, SearchSuggestion.class);
    }

    public void goTo() {
        this.driver.get("https://www.google.com");
    }

    public SearchWidget getSearchWidget() {
        return this.searchWidget;
    }

    public SearchSuggestion getSearchSuggestion() {
        return this.searchSuggestion;
    }

}
