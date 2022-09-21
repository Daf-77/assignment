package com.clipboardhealth.assignment.pages;

import com.clipboardhealth.assignment.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ListingPage extends BasePage {

    @FindBy(xpath = "//span[@id='a-autoid-0-announce']")
    public WebElement sortByDropDown;

    // @FindBy (linkText = "//a[.='Price: High to Low']")

    public WebElement DropDownOption(String optionName) {
        return Driver.getDriver().findElement(By.linkText(optionName));
    }

    public WebElement getSearchResultByIndex(int indexNumber) {
        return Driver.getDriver().findElement(By.xpath("//div[@data-index='" + indexNumber + "']"));
    }

    @FindBy(xpath = "//div[@id='feature-bullets']/h1")
    public WebElement aboutThisItem;


}
