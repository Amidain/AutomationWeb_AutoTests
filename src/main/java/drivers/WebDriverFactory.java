package drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import utils.JsonFileReader;
 /*
public class WebDriverFactory {
  private WebDriver driver;
    private String type;

    public WebDriver getDriver() {
        if(driver == null) {
            switch (type) {
                case "Firefox":
                    //Log.info("Instantiate Firefox driver.");
                    WebDriverManager.firefoxdriver().setup();
                    FirefoxOptions firefoxOptions = new FirefoxOptions();
                    firefoxOptions.addArguments(ConfigReader.getJsonObject().get("browser-mode").getAsString());
                    driver = new FirefoxDriver(firefoxOptions);
                    break;
                case "Chrome":
                default:
                    // Log.info("Instantiate Chrome driver.");
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions chromeOptions = new ChromeOptions();
                    chromeOptions.addArguments(JsonFileReader.getJsonObject().get("browser-mode").getAsString());
                    driver = new ChromeDriver(chromeOptions);
                    break;
            }
        }
            return driver;
        }
    }
}
*/