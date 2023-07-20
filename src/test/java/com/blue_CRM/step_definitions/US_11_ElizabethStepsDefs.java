package com.blue_CRM.step_definitions;

import com.blue_CRM.pages.US_11_ElizabethPage;
import com.blue_CRM.utilities.ConfigurationReader;
import com.blue_CRM.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.time.Duration;

public class US_11_ElizabethStepsDefs {
    
    US_11_ElizabethPage us_11_elizabethPage = new US_11_ElizabethPage();


    @Given("the user click on More tab under Active stream")
    public void the_user_click_on_More_tab_under_Active_stream() {
        us_11_elizabethPage.MoreTab.click();

    }

    @When("User click Appreciation button")
    public void user_click_Appreciation_button() {

        us_11_elizabethPage.AppreciationButton.click();
    }

    @Then("User should be able to send an appreciation by filling in the mandatory fields.")
    public void user_should_be_able_to_send_an_appreciation_by_filling_in_the_mandatory_fields() {

            Driver.getDriver().switchTo().frame(us_11_elizabethPage.iframe);
            us_11_elizabethPage.TextBox.sendKeys(ConfigurationReader.getProperty("text_test") + Keys.ENTER);
            Driver.getDriver().switchTo().parentFrame();
        }

    @When("User click Cancel button")
    public void user_click_Cancel_button() {
        us_11_elizabethPage.CancelBtn.click();
    }

    @Then("User able to cancel sending appreciation")
    public void user_able_to_cancel_sending_appreciation() {
        us_11_elizabethPage.CancelBtn.click();
    }

    @When("the user enters text into the text box")
    public void the_user_enters_text_into_the_text_box() {

        Driver.getDriver().switchTo().frame(us_11_elizabethPage.iframe);
        us_11_elizabethPage.TextBox.sendKeys(ConfigurationReader.getProperty("text_test") + Keys.ENTER);
        Driver.getDriver().switchTo().parentFrame();
    }


    @And("the user should see send message to All employees by default")
    public void the_user_should_see_send_message_to_All_Employees_By_Default() {
        String allEmployeesExpected = "All employees";
        String allEmployeesActual = us_11_elizabethPage.allEmployees.getText();
        Assert.assertEquals(allEmployeesExpected, allEmployeesActual);
    }


    @And("the user deletes the All employees")
    public void the_user_deletes_the_all_employees() {
        us_11_elizabethPage.AllEmployersCancelSign.click();

    }

    @And("the user clicks the Send button")
    public void the_user_clicks_the_Send_button() {
        us_11_elizabethPage.CancelBtn.click();
    }

    @Then("the user should see the Error Please specify at least one person.")
    public void the_user_should_see_the_Error_please_specify_at_least_one_person() {
        Assert.assertTrue(us_11_elizabethPage.ErrorMessage2.isDisplayed());

    }

    @When("the user remove the recipient All employees")
    public void the_user_remove_the_recipient_All_Employees() {
        us_11_elizabethPage.AllEmployersCancelSign.click();
    }

    @And("the user add a recipient")
    public void the_user_add_a_recipient() {
        us_11_elizabethPage.addRecipient.click();
        us_11_elizabethPage.enterRecipientText.sendKeys(ConfigurationReader.getProperty("recipient"));
        us_11_elizabethPage.enterRecipientText.sendKeys(Keys.ENTER);

    }

    @And("the user click the SEND button")
    public void the_user_click_the_Send_button() {
        us_11_elizabethPage.SendBtn.click();
    }

    @Then("the user should see the Error The message title is not specified.")
    public void the_user_should_see_the_Error_the_message_title_is_not_specified() {
        String actualErrorMessage = us_11_elizabethPage.ErrorMessage1.getText();

        String expectedErrorMessage = "The message title is not specified.";
        Assert.assertEquals(actualErrorMessage,expectedErrorMessage);
    }
    }



