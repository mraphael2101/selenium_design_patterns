package com.udemy.sel_design_single_responsibility_principle.pages.components;

import com.udemy.sel_design_single_responsibility_principle.pages.components.common.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultSet extends AbstractComponent {

    @FindBy(id="resultSets")
    private WebElement stat;

    public ResultSet(WebDriver driver) {
        super(driver);
    }

    public String getStat() {
        return this.stat.getText();
    }

    @Override
    public boolean isDisplayed() {
        return this.wait.until((d) -> this.stat.isDisplayed());
    }
}
