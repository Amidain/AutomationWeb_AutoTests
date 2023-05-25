package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BaseElement {
    By uniqueLocator;
    String name;

    public BaseElement(By uniqueLocator, String name) {
        this.uniqueLocator = uniqueLocator;
        this.name = name;
    }
}
