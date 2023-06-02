package utils;

import drivers.WebDriverFactory;
import logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectUtils {

    private static Select getSelectElement(By locator){
        return new Select(WebDriverFactory.getDriver().findElement(locator));
    }

    public static void selectByValue(By locator, String value){
        Log.info(String.format("Selecting value: %s", value));
        getSelectElement(locator).selectByValue(value);
    }
    public static void selectByVisibleText(By locator, String value){
        Log.info(String.format("Selecting value: %s", value));
        getSelectElement(locator).selectByVisibleText(value);
    }

    public static void selectByIndex(By locator, int index){
        Log.info(String.format("Selecting value with index: %s", index));
        getSelectElement(locator).selectByIndex(index);
    }

    public static List<WebElement> getAllOptions(By locator){
       return getSelectElement(locator).getOptions();
    }

    public static List<WebElement> getAllSelectedOptions(By locator){
        return getSelectElement(locator).getAllSelectedOptions();
    }

}
