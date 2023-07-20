package com.blue_CRM.step_definitions;

import com.blue_CRM.pages.LogOutPage;
import com.blue_CRM.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class LogoutStepDef {
    LogOutPage logOutPage =new LogOutPage();

    @When("user clicks on profile name button")
    public void userClicksOnProfileNameButton() {
        logOutPage.profileName.click();

    }

    @Then("user sees and clicks on the logout button")
    public void userSeesAndClicksOnTheLogoutButton() {
        logOutPage.logoutButton.click();

    }

    @Then("user sees five below options")
    public void userSeesFiveBelowOptions(List<String> expectedModules) {

        System.out.println("logOutPage.popUpOptions = " + logOutPage.popUpOptions);

        BrowserUtils.sleep(3);
        List<String> actualModules = new ArrayList<>();

        for (WebElement eachModule : logOutPage.popUpOptions) {

            actualModules.add(eachModule.getText());
        }

        Assert.assertTrue(actualModules.contains(expectedModules));
    }

}

