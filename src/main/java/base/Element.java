package base;

import drivers.WebDriverFactory;
import logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Waits;

import java.util.List;

public abstract class Element {
    By uniqueLocator;
    String name;

    public Element(By uniqueLocator, String name) {
        this.uniqueLocator = uniqueLocator;
        this.name = name;
    }
    public WebElement getElement(){
        return  WebDriverFactory.getDriver().findElement(uniqueLocator);
    }

    public String getName (){
        return name;
    }
    public void waitAndClick(){
        Log.info(String.format("Clicking on %s",  name));
        Waits.waitForElementToBeClickable(uniqueLocator);
        getElement().click();
    }

    public String getText(){
        Log.info(String.format("Getting text value from element: %s", name));
        Waits.waitForElementPresence(uniqueLocator);
        return getElement().getText();
    }

    public boolean isDisplayed(){
        Log.info(String.format("Checking if element: %s is displayed", name));
        Waits.waitForElementPresence(uniqueLocator);
        List<WebElement> uniqueElement = WebDriverFactory.getDriver().findElements(uniqueLocator);
        return uniqueElement.size() > 0;
    }

    public String getAttribute(String attributeName){
        Log.info(String.format("Attribute %s of element: %s found.", attributeName, name));
        Waits.waitForElementPresence(uniqueLocator);
        return getElement().getAttribute(attributeName);
    }
}
