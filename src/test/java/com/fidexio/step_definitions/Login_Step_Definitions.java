package com.fidexio.step_definitions;

import com.fidexio.pages.LoginPage;
import com.fidexio.utilities.BrowserUtils;
import com.fidexio.utilities.ConfigurationReader;
import com.fidexio.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Login_Step_Definitions {
    LoginPage login = new LoginPage();

    @Given("user opens a browser and goes to login page")
    public void user_goes_to_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));

    }

    @When("user enters valid {string} into username input box")
    public void user_enters_valid_into_username_input_box(String username) {
        login.inputUsername.sendKeys(username);
    }

    @When("user enters valid password into {string} password input box")
    public void user_enters_valid_password_into_password_input_box(String password) {
        login.inputPassword.sendKeys(password);
    }

    @When("user clicks Log in button")
    public void user_clicks_log_in_button() {
        login.loginButton.click();

    }

    @Then("user land on the home page")
    public void user_land_on_the_home_page() {
        BrowserUtils.verifyTitle("#Inbox - Odoo");
    }


    @When("user enters invalid {string} or invalid {string}")
    public void userEntersInvalidOrInvalid(String username, String password) {
        login.inputUsername.sendKeys(username);
        login.inputPassword.sendKeys(password);
    }


    @Then("Wrong login password message should be displayed")
    public void wrongLoginPasswordMessageShouldBeDisplayed() {
        Assert.assertTrue(login.wrongAlertMessage.isDisplayed());
        Assert.assertEquals("Wrong login/password",login.wrongAlertMessage.getText());

    }

    @When("user does not enter {string} or {string}")
    public void userDoesNotEnterOr(String username, String password) {
        login.inputUsername.sendKeys(username);
        login.inputPassword.sendKeys(password);

    }

    @Then("Please fill out this field message should be displayed")
    public void pleaseFillOutThisFieldMessageShouldBeDisplayed() {


    }

    @And("user enters valid {string} password input box")
    public void userEntersValidPasswordInputBox(String password) {
        login.inputPassword.sendKeys(password);
    }

    @And("user clicks on the enter key on keyboard")
    public void userClicksOnTheEnterKeyOnKeyboard() {
        login.inputPassword.sendKeys(Keys.ENTER);
    }
}
