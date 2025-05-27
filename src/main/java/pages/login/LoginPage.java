package pages.login;

import pages.BasePage;

//Use interface in case if the realisation is too different for each platform to maintain it in one class
public interface LoginPage {

    String getPagePlatform();
}
