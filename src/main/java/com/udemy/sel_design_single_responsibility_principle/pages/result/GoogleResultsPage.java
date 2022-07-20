package com.udemy.sel_design_single_responsibility_principle.pages.result;

import com.udemy.sel_design_single_responsibility_principle.pages.components.ResultSet;
import com.udemy.sel_design_single_responsibility_principle.pages.components.common.SearchWidget;
import com.udemy.sel_design_single_responsibility_principle.pages.components.NavigationBar;
import com.udemy.sel_design_single_responsibility_principle.pages.components.common.SearchSuggestion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GoogleResultsPage {

    private WebDriver driver;
    private SearchWidget searchWidget;
    private SearchSuggestion searchSuggestion;

    private NavigationBar navigationBar;

    private ResultSet resultSet;

    public GoogleResultsPage(final WebDriver driver) {
        this.driver = driver;
        // Using the driver obj create a new instance of the below components and assign them to objRefs
        this.searchWidget = PageFactory.initElements(driver, SearchWidget.class);
        this.searchSuggestion = PageFactory.initElements(driver, SearchSuggestion.class);
        this.navigationBar = PageFactory.initElements(driver, NavigationBar.class);
        this.resultSet = PageFactory.initElements(driver, ResultSet.class);
    }

    public SearchWidget getSearchWidget() {
        return this.searchWidget;
    }

    public SearchSuggestion getSearchSuggestion() {
        return this.searchSuggestion;
    }

    public NavigationBar getNavigationBar() {
        return this.navigationBar;
    }

    public ResultSet getResultSet() {
        return this.resultSet;
    }
}
