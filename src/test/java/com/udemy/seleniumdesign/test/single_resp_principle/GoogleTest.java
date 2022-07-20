package com.udemy.seleniumdesign.test.single_resp_principle;

import com.udemy.sel_design_single_responsibility_principle.pages.main.GoogleMainPage;
import com.udemy.sel_design_single_responsibility_principle.pages.result.GoogleResultsPage;
import com.udemy.seleniumdesign.test.BaseTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class GoogleTest extends BaseTest {

    private GoogleMainPage googleMainPage;
    private GoogleResultsPage googleResultsPage;

    @BeforeTest
    public void initPages() {
        this.googleMainPage = new GoogleMainPage(driver);
        this.googleResultsPage = new GoogleResultsPage(driver);
    }

    @Test
    public void googleWorkflowTest() {
        String keyword = "selenium webdriver";
        int index = 3;

        googleMainPage.goTo();
        assertTrue(googleMainPage.getSearchWidget().isDisplayed());
        googleMainPage.getSearchWidget().enter(keyword);
        assertTrue(googleMainPage.getSearchSuggestion().isDisplayed());
        googleMainPage.getSearchSuggestion().clickSugesstionByIndex(index);
        assertTrue(googleResultsPage.getNavigationBar().isDisplayed());
        googleResultsPage.getSearchWidget().enter(keyword);
        assertTrue(googleResultsPage.getSearchSuggestion().isDisplayed());
        googleResultsPage.getSearchSuggestion().clickSugesstionByIndex(index);
        googleResultsPage.getNavigationBar().goToNews();
        System.out.println(googleResultsPage.getResultSet().getStat());
    }
}
