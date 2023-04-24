package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CategoriesPage;
import pages.PopupPage;
import utils.DriverManager;

public class PopupPageSteps {
    PopupPage popupPage = new PopupPage(DriverManager.getDriver());

    @When("taps {string} button on Popup")
    public void tapsButtonOnPopup(String button) {
        popupPage.clickButton(button);
    }


    @When("click cancel button on Popup")
    public void clickCancelButtonOnPopup() {
        popupPage.clickCancelButton();
    }
}

