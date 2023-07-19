package com.blue_CRM.step_definitions;

import com.blue_CRM.pages.LoginPage;
import com.blue_CRM.utilities.ConfigurationReader;
import com.blue_CRM.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }


    @Given("the user logged in as {string}")
    public void theUserLoggedInAs(String userType) {
        loginPage.loginDynamic(userType);
    }

}
