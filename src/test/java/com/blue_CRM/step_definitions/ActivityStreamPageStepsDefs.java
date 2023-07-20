package com.blue_CRM.step_definitions;

import com.blue_CRM.pages.ActivityStreamPage;
import com.blue_CRM.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ActivityStreamPageStepsDefs {

    ActivityStreamPage us_09_liuda = new ActivityStreamPage();


    @Then("user sees Activity Stream link")
    public void user_sees_activity_stream_link() {

        System.out.println("Activity Stream Link.isDisplayed() = " + us_09_liuda.activityStreamLink.isDisplayed());
    }
    @Then("user click Activity Stream link")
    public void user_click_activity_stream_link() {

        us_09_liuda.activityStreamLink.click();

    }
    @Then("user sees following modules")
    public void user_sees_following_modules(List<String> expectedModules) {

        BrowserUtils.sleep(3);
        List<String> actualModules = new ArrayList<>();
        for (WebElement eachModule : us_09_liuda.AllTopLinks) {

            actualModules.add(eachModule.getText());
        }

        Assert.assertEquals(expectedModules, actualModules);


    }
    @When("user click on the MORE tab on Activity Stream page")
    public void user_click_on_the_more_tab_on_activity_stream_page() {
        us_09_liuda.MORELink.click();

    }
    @Then("user views the following options under the MORE tab")
    public void user_views_the_following_options_under_the_more_tab(List<String> expectedModules) {

        BrowserUtils.sleep(3);
        List<String> actualModules = new ArrayList<>();
        for (WebElement eachModule : us_09_liuda.AllMOREPopupElement) {

            actualModules.add(eachModule.getText());
        }

        Assert.assertEquals(expectedModules, actualModules);
    }


    }


