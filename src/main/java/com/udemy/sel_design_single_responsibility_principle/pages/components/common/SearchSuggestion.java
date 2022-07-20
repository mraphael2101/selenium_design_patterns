package com.udemy.sel_design_single_responsibility_principle.pages.components.common;

import com.udemy.sel_design_single_responsibility_principle.pages.components.common.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchSuggestion extends AbstractComponent {

    @FindBy(css="li.sbct")
    private List<WebElement> suggestions;

    public SearchSuggestion(WebDriver driver) {
        super(driver);
    }

    public void clickSugesstionByIndex(int index) {
        this.suggestions.get(index - 1).click();
    }

    @Override
    public boolean isDisplayed() {
        // Alternatively, you can use the driver obj in the function and access the selenium methods directly
        // This approach is more flexible and powerful than using the ExpectedConditions class from Selenium
        return this.wait.until((d) -> this.suggestions.size() > 5);
    }

}
