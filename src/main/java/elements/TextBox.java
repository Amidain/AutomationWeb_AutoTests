package elements;

import base.Element;
import logging.Log;
import org.openqa.selenium.By;
import utils.Waits;

public class TextBox extends Element {

    public TextBox(By uniqueLocator, String name) {
        super(uniqueLocator, name);
    }

    public void sendText(String text){
        Log.info(String.format("Inputting value: '%s' into %s.", text, super.getName()));
        Waits.waitForElementToBeVisible(super.getElement());
        super.getElement().sendKeys(text);
    }
    public void clear (){
        Log.info(String.format("Clearing %s.", super.getName()));
        Waits.waitForElementToBeVisible(super.getElement());
        super.getElement().clear();
    }
}
