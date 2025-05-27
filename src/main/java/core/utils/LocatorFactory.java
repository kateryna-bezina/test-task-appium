package core.utils;

import core.platform.PlatformManager;
import org.openqa.selenium.By;

//We can use this class to create locators for different platforms
public class LocatorFactory {

    public static By byId(String androidId, String iosId) {
        return PlatformManager.isIOS() ? By.id(iosId) : By.id(androidId);
    }

    //TODO: add more methods
}
