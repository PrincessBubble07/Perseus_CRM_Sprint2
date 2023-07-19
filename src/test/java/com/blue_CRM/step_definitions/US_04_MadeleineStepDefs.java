package com.blue_CRM.step_definitions;

import com.blue_CRM.pages.US_04_MadeleinePage;
import com.blue_CRM.utilities.ConfigurationReader;
import com.blue_CRM.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.time.Duration;

public class US_04_MadeleineStepDefs {

    US_04_MadeleinePage us_04_madeleinePage = new US_04_MadeleinePage();


    @Given("the user clicks the MESSAGE button")
    public void the_user_clicks_the_message_button() {
        us_04_madeleinePage.messageButton.click();
    }

    @Then("the user sees the message delivery is set to All employees")
    public void the_user_sees_the_message_delivery_is_set_to_all_employees() {
        us_04_madeleinePage.allEmployees.isDisplayed();
    }

    @When("the user enters text into the message body")
    public void the_user_enters_text_into_the_message_body() {
        Driver.getDriver().switchTo().frame(us_04_madeleinePage.iframe);
        us_04_madeleinePage.messageBody.sendKeys(ConfigurationReader.getProperty("test_message") + Keys.ENTER);
        Driver.getDriver().switchTo().parentFrame();
    }

    @When("the user deletes the recipient All employees")
    public void the_user_deletes_the_recipient_all_employees() {
        us_04_madeleinePage.removeAllEmployees.click();
    }

    @When("the user adds a recipient")
    public void the_user_adds_a_recipient() {
        us_04_madeleinePage.addRecipientLink.click();
        us_04_madeleinePage.enterRecipientTextBox.sendKeys(ConfigurationReader.getProperty("test_recipient") + Keys.ENTER);
        //Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
       // wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//div[@class='bx-finder-box-item-t7-name']"), 0));
        //Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


    }

    @When("the user clicks the SEND button")
    public void the_user_clicks_the_send_button() {
        us_04_madeleinePage.sendButton.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
    }

    @Then("the user should see the message they just sent at the top of the feed")
    public void the_user_should_see_the_message_they_just_sent_at_the_top_of_the_feed() {
        Assert.assertTrue(us_04_madeleinePage.sentMessage.getText().contains(ConfigurationReader.getProperty("test_message")));
    }

    @Then("the user should see the error message The message title is not specified.")
    public void the_user_should_see_the_error_message_the_message_title_is_not_specified() {
        Assert.assertTrue(us_04_madeleinePage.blankMessageError.isDisplayed());
    }

    @Then("the user should see the error message Please specify at least one person.")
    public void the_user_should_see_the_error_message_please_specify_at_least_one_person() {
        Assert.assertTrue(us_04_madeleinePage.noRecipientError.isDisplayed());
    }

    @When("the user clicks the CANCEL button")
    public void the_user_clicks_the_cancel_button() {
        us_04_madeleinePage.cancelButton.click();
    }

    @Then("the user will see the message area is collapsed and default text Send message … is displayed")
    public void the_user_will_see_the_message_area_is_collapsed_and_default_text_send_message_is_displayed() {
        Assert.assertTrue(us_04_madeleinePage.defaultSendMessageText.isDisplayed());
    }




}
