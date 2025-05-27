package pages.login;

import io.appium.java_client.AppiumDriver;
import pages.BasePage;

//If the realisation is different for Android and iOS, we crete different classes and one shared interface
public class LoginPageAndroid extends BasePage implements LoginPage {

    public LoginPageAndroid(AppiumDriver driver) {
        super(driver);
    }

    @Override
    public String getPagePlatform() {
        return "This is Android Login page";
    }
}
