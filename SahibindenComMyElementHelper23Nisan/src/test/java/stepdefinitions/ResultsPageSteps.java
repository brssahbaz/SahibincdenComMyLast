package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PopupPage;
import pages.ResultsPage;
import utils.DriverManager;

public class ResultsPageSteps {
    ResultsPage resultsPage = new ResultsPage(DriverManager.getDriver());

    @Then("should see Results on Result Page")
    public void shouldSeeResultsOnResultPage() {
        resultsPage.checkShareIcon();
    }


    @Then("should {string} on Result Page")
    public void shouldOnResultPage(String text) {
        resultsPage.checkShareIcon();

    }


    @When("taps filters on Result Page")
    public void taps_filters_on_result_page() {
        resultsPage.clickButton();
    }


    @Then("write the  {string} results on  Result Page")
    public void writeTheResultsOnResultPage(String text) {

        resultsPage.showResults(text);
    }


    @When("taps {string} on Results Page")
    public void tapsOnResultsPage(String text) {
        resultsPage.clickTab(text);
    }

    @When("select {string} on Result Page")
    public void selectOnResultPage(String text) {
        resultsPage.chooseSorting(text);

    }


    @Then("should see The cars  price high to low on Result Page")
    public void shouldSeeTheCarsPriceHighToLowOnResultPage() {
        resultsPage.sortByPriceDescending();
    }
}


