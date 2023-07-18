package com.blue_CRM.step_definitions;

import com.blue_CRM.pages.US_11_ElizabethPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class US_11_Elizabeth_StepDefs {

  US_11_ElizabethPage us11ElizabethPage = new US_11_ElizabethPage();


    @When("User click on More tab under Active stream")
    public void user_click_on_MoreTab_under_Active_stream() {
      us11ElizabethPage.MoreTab.click();


    }
    @When("User click on Appreciation button")
    public void user_click_AppreciationButton() {
      us11ElizabethPage.AppreciationButton.click();

    }

     @Then("user sees the delivery All employees by default.")
      public void user_sees_the_delivery_all_employees_by_default() {
       String allEmployeesExpected = "All employees";
       String allEmployeesActual = us11ElizabethPage.allEmployees.getText();
       Assert.assertEquals(allEmployeesExpected, allEmployeesActual);
     }

    @When("user types in the Mandatory fields")
    public void userTypesInTheMandatoryFields(String Hello){
      us11ElizabethPage.TextBox.sendKeys("Hello" + Keys.ENTER);

    }

    @Then("User should be able to send an appreciation by filling in the mandatory fields.")
    public void user_should_be_able_to_send_an_appreciation_by_filling_in_the_mandatory_fields() {
      us11ElizabethPage.SendBtn.click();

    }



    @Then("User able to cancel sending appreciation")
    public void user_able_to_cancel_sending_appreciation() {
      us11ElizabethPage.CancelBtn.click();

    }

  @When("User click on {string} tab")
  public void user_click_on_tab(String string) {



  }
  @When("User click {string} button")
  public void user_click_button(String string) {

  }




  }






