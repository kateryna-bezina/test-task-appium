package pages.cart;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import pages.BasePage;

import static core.utils.LocatorFactory.byId;

//If the realisation is almost identical for Android and iOS, we can create one class
// and use platform-specific locators with the help of LocatorFactory
public class CartPage extends BasePage {
    //locator exampple
    private By checkoutButton = byId("android_checkout", "ios_checkout");

    public CartPage(AppiumDriver driver) {
        super(driver);
    }

    public void clickCheckoutButton() {
        driver.findElement(checkoutButton).click();
    }

    public void acceptPaymentTerms() {
    }
}
