package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class FiltersPage {

    ElementHelper elementHelper;

    By tabs = By.id("com.sahibinden:id/util_primary_text");
    By maxFiyatW = By.id("com.sahibinden:id/maxAmountEditText");
    By minYilW = By.id("com.sahibinden:id/minValueEditText");
    By tamamButton = By.id("android:id/button1");
    By chooseDay = By.id("android:id/text1");
    By resultsButton = By.id("com.sahibinden:id/search_button");


    public FiltersPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }

    //  }

    public void clickTab(String tab) {

        elementHelper.clickElementWithText(tabs, tab);
    }

    public void sendKeysMaxFiyat(String maxFiyat) {

        elementHelper.sendKeys(maxFiyatW, maxFiyat);

    }

    public void clickOkTab(String tab) {

        elementHelper.click(tamamButton);
    }

    public void sendKeysMinYil(String minYil) {

        elementHelper.sendKeys(minYilW, minYil);

    }

    public void chooseDay(String days) {

        elementHelper.clickElementWithText(chooseDay, days);

    }

    public void clickResults() {

        elementHelper.click(resultsButton);
    }





}
