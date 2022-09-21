package com.clipboardhealth.assignment.pages;

import com.clipboardhealth.assignment.utils.ConfigurationReader;
import com.clipboardhealth.assignment.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public static void amazonMainPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("amazon.url"));
    }

    @FindBy(xpath = "//a[@id='nav-hamburger-menu']")
    public WebElement burgerMenu;

}
