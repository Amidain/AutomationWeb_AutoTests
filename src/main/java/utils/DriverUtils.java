package utils;

import drivers.WebDriverFactory;
import logging.Log;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class DriverUtils {
    private static final WebDriver driver = WebDriverFactory.getDriver();
    private static final JsonFileReader configReader = new JsonFileReader("src/main/resources/config.json");

    public  DriverUtils() {
    }
    public static String getDriverType (){
        return configReader.getValue("/browserName");
    }
    public static void navigate(String pathToURL){
        final String URL = configReader.getValue(pathToURL);
        Log.info(String.format("Opening %s", URL));
        driver.get(URL);
    }
    public static void maximizeWindow (){
        Log.info("Maximizing window size.");
        driver.manage().window().maximize();
    }

    public static void switchTab (int tabNumber){
        Waits.waitForWindowToLoad();
        Log.info("Switching to another tab");
        ArrayList<String> openTabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(openTabs.get(tabNumber));
    }
    public static void closeTab(){
        Log.info("Closing current tab.");
        WebDriverFactory.getDriver().close();

    }
    public static void refreshWindow(){
        Log.info("Refreshing window.");
        WebDriverFactory.getDriver().navigate().refresh();
    }
}
