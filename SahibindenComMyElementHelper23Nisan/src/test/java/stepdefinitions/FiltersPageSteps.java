package stepdefinitions;

import io.cucumber.java.en.When;
import pages.CategoriesPage;
import pages.FiltersPage;
import utils.DriverManager;

public class FiltersPageSteps {
    FiltersPage filtersPage = new FiltersPage(DriverManager.getDriver());

    @When("taps {string} on Filters Page")
    public void tapsOnFiltersPage(String button) {
        filtersPage.clickTab(button);
    }


    @When("sendkeys Max Price {string} on Filters Page")
    public void sendkeysMaxPriceOnFiltersPage(String maxFiyat) {
        filtersPage.sendKeysMaxFiyat(maxFiyat);
    }

    @When("click {string} on Filters Page")
    public void clickOnFiltersPage(String button) {
        filtersPage.clickOkTab(button);

    }

    @When("sendkeys Min Year {string} on Filters Page")
    public void sendkeysMinYearOnFiltersPage(String minYil) {
        filtersPage.sendKeysMinYil(minYil);

    }

    @When("choose {string} on Filters Page")
    public void chooseOnFiltersPage(String days) {
        filtersPage.chooseDay(days);


    }

    @When("taps Show Results Button on Filters Page")
    public void tapsShowResultsButtonOnFiltersPage() {
        filtersPage.clickResults();
    }
}
