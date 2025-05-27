package core.platform;


public class PlatformManager {

    //TODO: add properties and update methods
    public static String getPlatformName() {
        return "";
    }

    public static boolean isAndroid() {
        return getPlatformName().equalsIgnoreCase("android");
    }

    public static boolean isIOS() {
        return getPlatformName().equalsIgnoreCase("ios");
    }
}
