package com.blue_CRM.step_definitions;

import com.blue_CRM.pages.US_05_uploadFiles_osama_page;
import com.blue_CRM.pages.US_10_Creat_a_Poll_osama_Page;
import com.blue_CRM.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US_05_uploadFiles_osama_Stepdefs {
    US_05_uploadFiles_osama_page uploadFiles = new US_05_uploadFiles_osama_page();
    US_10_Creat_a_Poll_osama_Page poll = new US_10_Creat_a_Poll_osama_Page();

    @Given("user clicks message tab osama")
    public void user_clicks_message_tab_osama() {

        uploadFiles.messageTab.click();
    }

    @Given("user clicks upload files osama")
    public void user_clicks_upload_files_osama() {
        uploadFiles.uploadFileBtn.click();
    }


    @Given("user specific the {string} osama")
    public void user_specific_the_osama(String f, List<String> files) {
        for (String eachFile : files) {
            uploadFiles.uploadFileChosen.sendKeys(eachFile);
           BrowserUtils.sleep(1);
        }


    }

    @Given("user clicks send button osama")
    public void user_clicks_send_button_osama() {
        poll.sendButton.click();
    }

    @Then("user sees the file display osama")
    public void user_sees_the_file_display_osama() {

        Assert.assertTrue(uploadFiles.filesInTheConsole.isDisplayed());
    }


    @Given("user clicks Insert in text button osama")
    public void user_clicks_insert_in_text_button_osama() {
        uploadFiles.insertInTextBtn.click();
    }

    @Then("user sees the file display with message text osama")
    public void user_sees_the_file_display_with_message_text_osama() {
        String expected = "Day 10 Practice Tasks .pdf";
        Assert.assertTrue(uploadFiles.messageTxtTitle.isDisplayed());
    }


    @Given("user clicks x button osama")
    public void user_clicks_x_button_osama() {
        for (int i = 1; i <= 5; i++) {
        uploadFiles.removeFileBtn.click();
        }
    }



}
