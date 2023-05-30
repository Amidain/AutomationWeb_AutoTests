package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.SignUpLogin;

public class RegistrationTests extends BaseTest {

    @Test
    public void registerNewUserWithCorrectData() throws InterruptedException {
        MainPage mainPage = new MainPage();
        SignUpLogin signUpLogin = new SignUpLogin();

        Assert.assertTrue(mainPage.isPageOpened(), "Main Page has not been open!");
        mainPage.clickSignUpLoginButton();
        Assert.assertTrue(signUpLogin.isSignUpTextBoxVisible(), "New User Signup form is not displayed!");
        signUpLogin.putSignUpCredentials();
        signUpLogin.clickSignUpButton();

        Thread.sleep(5000);
    }
}
