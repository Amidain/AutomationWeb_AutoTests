package pages;

import base.Form;
import elements.Button;
import elements.TextBox;
import org.openqa.selenium.By;

public class MainPage extends Form {
    private final Button signUpLogin = new Button(By.xpath("//a[@href='/login']"), "SignUp / Login Button");
    private final Button deleteAccountButton = new Button(By.xpath("//a[@href='/delete_account']"), "Delete Account Button");
    private final TextBox loggedAsTextBox = new TextBox(By.cssSelector(".fa.fa-user"), "Logged As (...) TextBox");
    public MainPage() {
        super(By.xpath("//li[1]//a[contains(@style,'orange')]"), "Main Page");
    }

    @Override
    public boolean isPageOpened() {
        return super.isPageOpened();
    }

    public void clickSignUpLoginButton(){
        signUpLogin.waitAndClick();
    }

    public boolean isLoggedInAsTextBoxVisible(){
        return loggedAsTextBox.isDisplayed();
    }
    public void clickDeleteAccountButton(){
        deleteAccountButton.waitAndClick();
    }
}
