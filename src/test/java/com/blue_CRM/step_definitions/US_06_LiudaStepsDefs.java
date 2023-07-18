package com.blue_CRM.step_definitions;

import com.blue_CRM.pages.US_06_LiudaPage;
import com.blue_CRM.utilities.BrowserUtils;
import com.blue_CRM.utilities.ConfigurationReader;
import com.blue_CRM.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class US_06_LiudaStepsDefs {

    US_06_LiudaPage us_06_liuda = new US_06_LiudaPage();

    @When("User should be able to attach a link to the specified text.")
    public void user_should_be_able_to_attach_a_link_to_the_specified_text() {



       // Driver.getDriver().switchTo().frame(us_06_liuda.iframe);
        us_06_liuda.MessageLink.click();
        us_06_liuda.addLinkToMessage.click();
        us_06_liuda.inputLinkURLBox.sendKeys(ConfigurationReader.getProperty("link_url"));
        us_06_liuda.inputLinkTextBox.sendKeys(ConfigurationReader.getProperty("link_url_text"));
        us_06_liuda.saveButton.click();
        us_06_liuda.SendSubmitButton.click();




    }

    @Then("By clicking on the link user should be able to navigate to the correct URL.")
    public void by_clicking_on_the_link_user_should_be_able_to_navigate_to_the_correct_url() {


        us_06_liuda.linkMessage.click();





    }

    @Then("Link should open in a new tab")
    public void link_should_open_in_a_new_tab() {


        BrowserUtils.switchToWindow(ConfigurationReader.getProperty("link_url_text"));

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = ConfigurationReader.getProperty("link_url_text");
        BrowserUtils.sleep(3);
        Assert.assertEquals(expectedTitle,actualTitle);

    }







}
