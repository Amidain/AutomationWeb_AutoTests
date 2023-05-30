package base;

import drivers.WebDriverFactory;
import logging.Log;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utils.DriverUtils;

public abstract class BaseTest {

    @BeforeTest
    public void setup(){
        Log.info(String.format("Starting test case: %s", getClass().getName()));
        DriverUtils.navigate("/url");
        DriverUtils.maximizeWindow();
    }

    @AfterTest
    public void tearup(){
        Log.info(String.format("Ending test case: %s", getClass().getName()));
        WebDriverFactory.getDriver().quit();
    }
}
