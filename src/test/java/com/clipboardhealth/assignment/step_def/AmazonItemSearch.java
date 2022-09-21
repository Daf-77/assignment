package com.clipboardhealth.assignment.step_def;

import com.clipboardhealth.assignment.pages.BasePage;
import com.clipboardhealth.assignment.pages.ListingPage;
import com.clipboardhealth.assignment.pages.SideMenuPage;
import com.clipboardhealth.assignment.utils.ConfigurationReader;
import com.clipboardhealth.assignment.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class AmazonItemSearch {

    private WebDriver driver = Driver.getDriver();
    private String listingName;
    private String mainTab;
    BasePage basePage = new BasePage();
    SideMenuPage sideMenuPage = new SideMenuPage();
    ListingPage listingPage = new ListingPage();

    @Given("User is on the Amazon main shopping page")
    public void user_is_on_the_amazon_main_shopping_page() {
        driver.get(ConfigurationReader.getProperty("amazon.url"));
        assertTrue(driver.getTitle().contains("Amazon.in"));
    }

    @When("User clicks on customer menu")
    public void user_clicks_on_customer_menu() {
        basePage.burgerMenu.click();
    }

    @When("User selects {string} under Shop By Department section")
    public void user_selects_under_shop_by_department_section(String string) {
        sideMenuPage.getMainMenuOption(string).click();
    }

    @When("User selects {string} from given options")
    public void user_selects_from_given_options(String string) {
        sideMenuPage.getTVMenuOption(string).click();
    }

    @When("User checks {string} checkbox under Brands section")
    public void user_checks_checkbox_under_brands_section(String string) {
        sideMenuPage.getTVBrandOption(string).click();

    }

    @When("User sorts the Samsung results with {string}")
    public void user_sorts_the_samsung_results_with(String string) {
        listingPage.sortByDropDown.click();
        listingPage.DropDownOption(string).click();
        mainTab = driver.getWindowHandle();

    }

    @When("User clicks on the item on position {int}")
    public void userClicksOnTheItemOnPosition(int indexNum) {
        WebElement result = listingPage.getSearchResultByIndex(indexNum);
        listingName = result.getText();
        result.click();
    }

    @When("User navigates to the selected listing page")
    public void user_navigates_to_the_selected_listing_page() {
        ArrayList<String> newTab = new ArrayList(driver.getWindowHandles());
        newTab.remove(mainTab);
        driver.switchTo().window(newTab.get(0));
    }

    @Then("{string} section is displayed on the page")
    public void sectionIsDisplayedOnThePage(String aboutThisItem) {
        assertEquals(aboutThisItem, listingPage.aboutThisItem.getText());
    }


}
