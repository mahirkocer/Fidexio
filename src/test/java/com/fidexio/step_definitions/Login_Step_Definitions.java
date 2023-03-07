package com.fidexio.step_definitions;

import com.fidexio.pages.LoginPage;
import com.fidexio.utilities.ConfigurationReader;
import com.fidexio.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Step_Definitions {
LoginPage login = new LoginPage();
    @Given("user goes to login page")
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

    }

}
