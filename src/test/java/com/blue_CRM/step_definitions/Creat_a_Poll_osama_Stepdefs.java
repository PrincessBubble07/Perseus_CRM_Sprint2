package com.blue_CRM.step_definitions;

import com.blue_CRM.pages.Creat_a_Poll_osama_Page;
import com.blue_CRM.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Creat_a_Poll_osama_Stepdefs {
    Creat_a_Poll_osama_Page poll = new Creat_a_Poll_osama_Page();

    @Given("user clicks poll tab under Active Stream")
    public void user_clicks_poll_tab_under_active_stream() {
        poll.poll.click();
    }

    @Then("user sees the delivery All employees by default.")
    public void user_sees_the_delivery_all_employees_by_default() {
        String allEmployeesExpected = "All employees";
        String allEmployeesActual = poll.allEmployees.getText();
        Assert.assertEquals(allEmployeesExpected,allEmployeesActual);
    }



    @Then("User creates a poll by adding message title and questions and multiple answers.")
    public void user_creates_a_poll_by_adding_message_title_and_questions_and_multiple_answers() {

        Driver.getDriver().switchTo().frame(poll.iframe);
        poll.textArea.sendKeys("osama8765");
        Driver.getDriver().switchTo().defaultContent();
        poll.questionInput.sendKeys("how old are you?");
        //poll.answerInput1.sendKeys("78");
        //poll.answerInput2.sendKeys("56");
        //poll.answerInput3.sendKeys("31");

    }

    @When("user clicks send button.")
    public void user_clicks_send_button() {

        poll.sendButton.click();
    }

    @Then("user sees questions and multiple answers display")
    public void user_sees_questions_and_multiple_answers_display() {

        String expected = "osama8765";
       // String actual = poll.messageTitle.getText();
       // Assert.assertEquals(expected,actual);
       // System.out.println(actual);
    }


    @When("User selects Allow multiple choice checkbox.")
    public void user_selects_allow_multiple_choice_checkbox() {

    }

    @Then("user sees Allow multiple choice is selected")
    public void user_sees_allow_multiple_choice_is_selected() {

    }


    @When("user does not specify {string}")
    public void user_does_not_specify(String string) {

    }

    @Then("user sees this Error message {string}")
    public void user_sees_this_error_message(String string) {

    }
}
