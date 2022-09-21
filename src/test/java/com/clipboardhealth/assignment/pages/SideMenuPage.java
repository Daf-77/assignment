package com.clipboardhealth.assignment.pages;

import com.clipboardhealth.assignment.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SideMenuPage extends BasePage {

    public WebElement getMainMenuOption(String text) {
        return Driver.getDriver().findElement(By.xpath("//div[contains(text(),'" + text + "')]"));
    }

    public WebElement getTVMenuOption(String text) {
        return Driver.getDriver().findElement(By.xpath("//a[contains(text(),'" + text + "')]"));
    }

    public WebElement getTVBrandOption(String text) {
        return Driver.getDriver().findElement(By.xpath("//span[.= '" + text + "' ]/preceding-sibling::*"));
    }


}
