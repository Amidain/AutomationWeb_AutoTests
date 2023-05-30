package drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import logging.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import utils.DriverUtils;
import utils.JsonFileReader;

public class WebDriverFactory {
  private static WebDriver driver;
  private static JsonFileReader configReader = new JsonFileReader("src/main/resources/config.json");
  private static final String type = configReader.getValue("/browserName");

    public static WebDriver getDriver() {
        if(driver == null) {
            switch (type) {
                case "Firefox":
                    Log.info("Instantiate Firefox driver.");
                    WebDriverManager.firefoxdriver().setup();
                    FirefoxOptions firefoxOptions = new FirefoxOptions();
                    firefoxOptions.addArguments(configReader.getValue("/driverSettings/firefox/firefoxMode"));
                    driver = new FirefoxDriver(firefoxOptions);
                    break;
                case "Chrome":
                default:
                    Log.info("Instantiate Chrome driver.");
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions chromeOptions = new ChromeOptions();
                    chromeOptions.addArguments(configReader.getValue("/driverSettings/chrome/chromeMode"));
                    driver = new ChromeDriver(chromeOptions);
                    break;
            }
        }
            return driver;
        }
    }

