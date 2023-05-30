package base;

import drivers.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Waits;

import java.util.List;

public abstract class Form {
        private By uniqueLocator;
        private String name;

        public Form(By uniqueLocator, String name) {
            this.uniqueLocator = uniqueLocator;
            this.name = name;
        }
        public By getUniqueLocator() {
            return uniqueLocator;
        }
        public boolean isPageOpened(){
            Waits.waitForElementPresence(uniqueLocator);
            List<WebElement> uniqueElement = WebDriverFactory.getDriver().findElements(uniqueLocator);
            return uniqueElement.size() > 0;
        }
}
