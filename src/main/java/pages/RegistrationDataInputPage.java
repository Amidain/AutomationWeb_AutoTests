package pages;

import base.Form;
import elements.Button;
import elements.TextBox;
import model.User;
import org.openqa.selenium.By;
import utils.JsonFileReader;
import utils.SelectUtils;

public class RegistrationDataInputPage extends Form {
    private final Button titleMrButton = new Button(By.id("id_gender1"), "Title 'Mr' Button");
    private final Button signUpForNewsletterButton = new Button(By.id("newsletter"), "Sign uo for Newsletter Button");
    private final Button receiveSpecialOffersButton = new Button(By.id("optin"), "Receive Special Offers Button");
    private final Button createAccountButton = new Button(By.cssSelector(".btn.btn-default"), "Create Account Button");
    private final TextBox passwordTextBox = new TextBox(By.id("password"), "Password TextBox");
    private final TextBox firstNameTextBox = new TextBox(By.id("first_name"), "First Name TextBox");
    private final TextBox lastNameTextBox = new TextBox(By.id("last_name"), "Last Name TextBox");
    private final TextBox companyTextBox = new TextBox(By.id("company"), "Company Name TextBox");
    private final TextBox address1TextBox = new TextBox(By.id("address1"), "Address1 TextBox");
    private final TextBox address2TextBox = new TextBox(By.id("address2"), "Address2 TextBox");
    private final TextBox stateTextBox = new TextBox(By.id("state"), "State TextBox");
    private final TextBox cityTextBox = new TextBox(By.id("city"), "City TextBox");
    private final TextBox zipcodeTextBox = new TextBox(By.id("zipcode"), "ZipCode TextBox");
    private final TextBox mobileNumberTextBox = new TextBox(By.id("mobile_number"), "Mobile Number TextBox");

    public RegistrationDataInputPage() {
        super(By.className("login-form"), "Registration Data Input Form");
    }

    @Override
    public boolean isPageOpened() {
        return super.isPageOpened();
    }
    public void fillOutRegistrationForm(){
        JsonFileReader jsonMapper = new JsonFileReader("src/main/resources/register-user.json");
        User user = jsonMapper.mapToClass(User.class);

        titleMrButton.waitAndClick();
        passwordTextBox.sendText(user.getPassword());
        SelectUtils.selectByValue(By.id("days"), user.getDateOfBirth().getDay());
        SelectUtils.selectByVisibleText(By.id("months"), user.getDateOfBirth().getMonth());
        SelectUtils.selectByValue(By.id("years"), user.getDateOfBirth().getYear());
        signUpForNewsletterButton.waitAndClick();
        receiveSpecialOffersButton.waitAndClick();
        firstNameTextBox.sendText(user.getFirstName());
        lastNameTextBox.sendText(user.getLastName());
        companyTextBox.sendText(user.getCompany());
        address1TextBox.sendText(user.getAddress().getStreet());
        SelectUtils.selectByVisibleText(By.id("country"), user.getAddress().getCountry());
        stateTextBox.sendText(user.getAddress().getState());
        cityTextBox.sendText(user.getAddress().getCity());
        zipcodeTextBox.sendText(user.getAddress().getZipCode());
        mobileNumberTextBox.sendText(user.getMobileNumber());
    }

    public void clickCreateAccountButton(){
        createAccountButton.waitAndClick();
    }
}
