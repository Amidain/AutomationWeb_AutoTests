package pages;

import base.Form;
import elements.Button;
import org.openqa.selenium.By;

public class AccountDeletionPage extends Form {
    private final Button continueButton = new Button(By.xpath("//a[@data-qa='continue-button']"), "Continue Button");
    public AccountDeletionPage() {
        super(By.xpath("//h2[@data-qa='account-deleted']"), "Account Deletion Confirmation Page");
    }

    @Override
    public boolean isPageOpened() {
        return super.isPageOpened();
    }

    public void clickContinueButton(){
        continueButton.waitAndClick();
    }
}
