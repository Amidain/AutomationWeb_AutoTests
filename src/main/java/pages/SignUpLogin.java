package pages;

import base.Form;
import elements.Button;
import elements.TextBox;
import org.openqa.selenium.By;
import utils.JsonFileReader;

public class SignUpLogin extends Form {
    private final TextBox signUpTextBox = new TextBox(By.xpath("//*[contains(text(), 'New User Signup!')]"), "SignUp Page Message");
    private final TextBox signUpNameTextBox = new TextBox(By.xpath("//input[@data-qa='signup-name']"), "SignUp Name TextBox");
    private final TextBox signUpEmailAddressTextBox = new TextBox(By.xpath("//input[@data-qa='signup-email']"), "SignUp Email Address TextBox");
    private final Button signUpButton = new Button(By.xpath("//button[@data-qa='signup-button']"), "SignUp Button");
    private final JsonFileReader testDataReader = new JsonFileReader("src/main/resources/register-user.json");
    public SignUpLogin() {
        super(By.xpath("//li[4]//a[contains(@style,'orange')]"), "SignUp/Login Page");
    }

    @Override
    public boolean isPageOpened() {
        return super.isPageOpened();
    }
    public boolean isSignUpTextBoxVisible(){
        return signUpTextBox.isDisplayed();
    }

    public void putSignUpCredentials(){
        final String name = testDataReader.getValue("/name");
        final String email = testDataReader.getValue("/email");

        signUpNameTextBox.sendText(name);
        signUpEmailAddressTextBox.sendText(email);
    }
    public void clickSignUpButton(){
        signUpButton.waitAndClick();
    }
}
