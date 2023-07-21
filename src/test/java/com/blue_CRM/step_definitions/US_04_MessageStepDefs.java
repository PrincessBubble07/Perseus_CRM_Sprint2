package com.blue_CRM.step_definitions;

import com.blue_CRM.pages.US_04_MessagePage;
import com.blue_CRM.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class US_04_MessageStepDefs {

    US_04_MessagePage us_04_messagePage = new US_04_MessagePage();


    @And("the user clicks the {string} tab")
    public void theUserClicksTheTab(String tab) throws InterruptedException {
        Driver.getDriver().findElement(By.xpath("//span[.='"+tab+"']")).click();
        Thread.sleep(5000);
    }

    @And("the user clicks the {string} button")
    public void theUserClicksTheButton(String button) throws InterruptedException {
        if(button.equals("Send")){
            us_04_messagePage.sendButton.click();
        }else if(button.equals("Cancel")){
            us_04_messagePage.cancelButton.click();
        }
        Thread.sleep(7000);
    }

    @Then("the user sees the message delivery is set to {string}")
    public void theUserSeesTheMessageDeliveryIsSetTo(String recipient) {
        String actualDefaultRecipient = Driver.getDriver().findElement(By.xpath("//span[.='"+recipient+"']")).getText();
        Assert.assertEquals(recipient, actualDefaultRecipient);
    }

    @When("the user enters {string} into the message body")
    public void theUserEntersIntoTheMessageBody(String message) {
        Driver.getDriver().switchTo().frame(us_04_messagePage.iframe);
        us_04_messagePage.messageBody.sendKeys(message);
        Driver.getDriver().switchTo().parentFrame();
    }

    @And("the user deletes the recipient {string}")
    public void theUserDeletesTheRecipient(String recipient) {
        Driver.getDriver().findElement(By.xpath("//span[.='"+recipient+"']/following-sibling::*/following-sibling::*")).click();

    }

    @And("the user adds {string} as a recipient")
    public void theUserAddsAsARecipient(String recipient) throws InterruptedException {
        us_04_messagePage.addRecipientLink.click();
        us_04_messagePage.enterRecipientTextBox.sendKeys((recipient) + Keys.ENTER);
        Thread.sleep(7000);
    }

    @Then("the user sees their message {string} at the top of the feed")
    public void theUserSeesTheirMessageAtTheTopOfTheFeed(String newestMessage) {
        Assert.assertEquals(newestMessage, us_04_messagePage.sentMessage.getText());
    }

    @Then("the user sees the error message {string}")
    public void theUserSeesTheErrorMessage(String errorMessage) {
        String actualErrorMessage = Driver.getDriver().findElement(By.xpath("//span[.='"+errorMessage+"']")).getText();
        Assert.assertEquals(actualErrorMessage, errorMessage);
    }

    @And("the user sees default text {string} is displayed in the collapsed message body")
    public void theUserSeesDefaultTextIsDisplayedInTheCollapsedMessageBody(String expectedDefaultMessageTest) {
        String actualDefaultMessageText = Driver.getDriver().findElement(By.xpath("//span[.='"+expectedDefaultMessageTest+"']")).getText();
        Assert.assertEquals(expectedDefaultMessageTest, actualDefaultMessageText);
    }


}
