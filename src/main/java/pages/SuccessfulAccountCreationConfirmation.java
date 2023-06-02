package pages;

import base.Form;
import elements.Button;
import org.openqa.selenium.By;

public class SuccessfulAccountCreationConfirmation extends Form {
    private final Button continueButton = new Button(By.xpath("//a[@data-qa='continue-button']"), "Continue Button");

    public SuccessfulAccountCreationConfirmation() {
        super(By.xpath("//h2[@data-qa='account-created']"), "Successful Account Creation Page");
    }

    @Override
    public boolean isPageOpened() {
        return super.isPageOpened();
    }
    public void clickContinueButton(){
        continueButton.waitAndClick();

    }
}
