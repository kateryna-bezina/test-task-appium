package flows.login;

import core.platform.PlatformManager;
import io.appium.java_client.AppiumDriver;
import pages.login.LoginPage;
import pages.login.LoginPageAndroid;
import pages.login.LoginPageIOS;

public class LoginFlow {
    private final LoginPage loginPage;

    public LoginFlow(AppiumDriver driver) {
        this.loginPage = PlatformManager.isIOS()
                ? new LoginPageIOS(driver)
                : new LoginPageAndroid(driver);
    }
}
