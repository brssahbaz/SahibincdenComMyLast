package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.ElementHelper;

import java.util.List;

public class PopupPage {

    ElementHelper elementHelper;

    By buttons = By.className("android.widget.Button");
    By cancelButton = By.id("com.sahibinden:id/anchor_view");

    public PopupPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }

    public void clickButton(String button) {

        elementHelper.clickElementWithText(buttons, button);
    }

    public void clickCancelButton() {
        elementHelper.click(cancelButton);

    }


}
