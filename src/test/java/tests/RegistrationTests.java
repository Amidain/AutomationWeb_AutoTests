package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class RegistrationTests extends BaseTest {

    @Test
    public void registerNewUserWithCorrectData() throws InterruptedException {
        MainPage mainPage = new MainPage();
        SignUpLogin signUpLogin = new SignUpLogin();
        RegistrationDataInputPage registrationDataInputPage = new RegistrationDataInputPage();
        SuccessfulAccountCreationConfirmation successfulAccountCreationConfirmation = new SuccessfulAccountCreationConfirmation();
        AccountDeletionPage accountDeletionPage = new AccountDeletionPage();

        Assert.assertTrue(mainPage.isPageOpened(), "Main Page has not been open!");
        mainPage.clickSignUpLoginButton();
        Assert.assertTrue(signUpLogin.isSignUpTextBoxVisible(), "New User Signup form is not displayed!");
        signUpLogin.putSignUpCredentials();
        signUpLogin.clickSignUpButton();
        Assert.assertTrue(registrationDataInputPage.isPageOpened(), "Registration data input form has not been open!");
        registrationDataInputPage.fillOutRegistrationForm();
        registrationDataInputPage.clickCreateAccountButton();
        Assert.assertTrue(successfulAccountCreationConfirmation.isPageOpened(), "Account has not been successfully created!");
        successfulAccountCreationConfirmation.clickContinueButton();
        Assert.assertTrue(mainPage.isLoggedInAsTextBoxVisible(), "User has not been logged in to main page!");
        mainPage.clickDeleteAccountButton();
        Assert.assertTrue(accountDeletionPage.isPageOpened(), "Account has not been deleted!");
        accountDeletionPage.clickContinueButton();
        Assert.assertTrue(mainPage.isPageOpened(), "Main Page has not been open!");
    }
}
