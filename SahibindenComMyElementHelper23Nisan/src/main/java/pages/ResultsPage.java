package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.ElementHelper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ResultsPage {

    ElementHelper elementHelper;

    By shareIcon = By.id("com.sahibinden:id/action_share");
    By clickButton = By.id("com.sahibinden:id/tvFilter");
    By showResults = By.className("android.widget.TextView");
    By sortBy = By.className("android.widget.CheckedTextView");
    By showResultsByPrice = By.id("com.sahibinden:id/price");


    public ResultsPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }

    public void checkShareIcon() {
        elementHelper.checkElement(shareIcon);
    }

    public void clickButton() {
        elementHelper.click(clickButton);

    }

    public void showResults(String text) {
        System.out.println(elementHelper.clickElementWithTextContainWebElement(showResults, text).getText());
        // System.out.println(elementHelper.getText(showResults));

    }

    public void clickTab(String text) {

        elementHelper.clickElementWithText(showResults, text);
    }

    public void chooseSorting(String text) {
        elementHelper.clickElementWithText(sortBy, text);
    }

    public void sortByPriceDescending() {

        List<WebElement> cars = elementHelper.findElements(showResultsByPrice);

        List<Double> beforecarPrices = new ArrayList<>();
        for (WebElement car : cars) {

            beforecarPrices.add(Double.valueOf(car.getText().replaceAll("TL", "").replaceAll(",", "")));

        }
        System.out.println(beforecarPrices);

        List<Double> aftercarPrices = new ArrayList<>(beforecarPrices);
        Collections.sort(aftercarPrices, Collections.reverseOrder());
        System.out.println(aftercarPrices);

        Assert.assertEquals(beforecarPrices, aftercarPrices);

    }


}




