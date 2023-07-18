package com.blue_CRM.step_definitions;

import com.blue_CRM.pages.US_09_LiudaPage;
import com.blue_CRM.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US_09_LiudaStepsDefs {

    US_09_LiudaPage us_09_liuda = new US_09_LiudaPage();


    @Then("the user should be able to see Activity Stream link")
    public void the_user_should_be_able_to_see_activity_stream_link() {

        System.out.println("Activity Stream Link.isDisplayed() = " + us_09_liuda.activityStreamLink.isDisplayed());
    }
    @Then("the user should be able to click Activity Stream link")
    public void the_user_should_be_able_to_click_activity_stream_link() {

        us_09_liuda.activityStreamLink.click();

    }
    @Then("user should be able to see following modules")
    public void user_should_be_able_to_see_following_modules(List<String> expectedModules) {

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
    @Then("the users view the following options under the MORE tab")
    public void the_users_view_the_following_options_under_the_more_tab(List<String> expectedModules) {

        BrowserUtils.sleep(3);
        List<String> actualModules = new ArrayList<>();
        for (WebElement eachModule : us_09_liuda.AllMOREPopupElement) {

            actualModules.add(eachModule.getText());
        }

        Assert.assertEquals(expectedModules, actualModules);
    }




    }


