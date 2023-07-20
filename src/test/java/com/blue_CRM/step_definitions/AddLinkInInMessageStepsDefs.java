package com.blue_CRM.step_definitions;

import com.blue_CRM.pages.AddLinkInMessagePage;
import com.blue_CRM.utilities.BrowserUtils;
import com.blue_CRM.utilities.ConfigurationReader;
import com.blue_CRM.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AddLinkInInMessageStepsDefs {

    AddLinkInMessagePage us_06_liuda = new AddLinkInMessagePage();


    @When("user attaches {string} link to the {string} text")
    public void userAttachesLinkToTheText(String string, String text) {
        System.out.println("MessageLink.isDisplayed() = " + us_06_liuda.MessageLink.isDisplayed());

        us_06_liuda.MessageLink.click();

        System.out.println("Add Link To Message.isDisplayed() = " + us_06_liuda.addLinkToMessage.isDisplayed());

        us_06_liuda.addLinkToMessage.click();

        us_06_liuda.inputLinkURLBox.sendKeys(string);

        us_06_liuda.inputLinkTextBox.sendKeys(text);

        us_06_liuda.saveButton.click();

        us_06_liuda.SendSubmitButton.click();


    }

    @When("user clicks on the link")
    public void userClicksOnTheLink() {
        us_06_liuda.linkMessage.click();

    }
    @Then("user navigates to the correct URL")
    public void userNavigatesToTheCorrectURL() {

        BrowserUtils.sleep(3);
        BrowserUtils.switchToWindow(ConfigurationReader.getProperty("link_url_text"));




    }

    @Then("link opened in a new tab")
    public void linkOpenedInANewTab() {

        BrowserUtils.sleep(3);
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Google";
        BrowserUtils.sleep(3);
        Assert.assertEquals(expectedTitle,actualTitle);
    }


}
