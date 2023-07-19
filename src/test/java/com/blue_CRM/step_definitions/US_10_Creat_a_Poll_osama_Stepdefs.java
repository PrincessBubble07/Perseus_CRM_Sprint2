package com.blue_CRM.step_definitions;

import com.blue_CRM.pages.US_10_Creat_a_Poll_osama_Page;
import com.blue_CRM.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US_10_Creat_a_Poll_osama_Stepdefs {
    US_10_Creat_a_Poll_osama_Page poll = new US_10_Creat_a_Poll_osama_Page();

    @Given("user clicks poll tab under Active Stream")
    public void user_clicks_poll_tab_under_active_stream() {
        poll.poll.click();
    }

    @Then("user sees the delivery All employees by default.")
    public void user_sees_the_delivery_all_employees_by_default() {
        String allEmployeesExpected = "All employees";
        String allEmployeesActual = poll.allEmployees.getText();
        Assert.assertEquals(allEmployeesExpected, allEmployeesActual);
    }

    @Then("User creates a poll by adding {string} title and {string} and {string} and multiple answers{string}.")
    public void userCreatesAPollByAddingTitleAndAndMultipleAnswers(String message, String question, String answer,String recipient) {
        Driver.getDriver().switchTo().frame(poll.iframe);
        poll.textArea.sendKeys(message);
        Driver.getDriver().switchTo().defaultContent();
        poll.questionInput.sendKeys(question);
        poll.answerInput1.sendKeys(answer);

    }

    @When("user clicks send button.")
    public void user_clicks_send_button() {

        poll.sendButton.click();
    }

    @Then("user sees questions and multiple answers display")
    public void user_sees_questions_and_multiple_answers_display() {

    }


    @When("User selects Allow multiple choice checkbox.")
    public void user_selects_allow_multiple_choice_checkbox() {
        poll.checkbox.click();
    }

    @Then("user sees Allow multiple choice is selected")
    public void user_sees_allow_multiple_choice_is_selected() {
        Assert.assertTrue(poll.checkbox.isSelected());
    }


    @When("user does not specify {string}")
    public void userDoesNotSpecify(String type) {
        if (type.equals("recipient")){
            poll.removeAllEmployees.click();
        }
    }

    @Then("user sees this Error message {string}")
    public void userSeesThisErrorMessage(String errorMessage) {
        Assert.assertTrue(poll.messageTitleError.getText().contains(errorMessage));
    }



}
