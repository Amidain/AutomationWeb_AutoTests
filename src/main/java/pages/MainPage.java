package pages;

import base.Form;
import elements.Button;
import org.openqa.selenium.By;

public class MainPage extends Form {
    private final Button signUpLogin = new Button(By.xpath("//a[@href='/login']"), "SignUp / Login Button");
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
}
