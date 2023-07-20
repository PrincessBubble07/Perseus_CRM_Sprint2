package com.blue_CRM.step_definitions;

import com.blue_CRM.pages.US_05_uploadFiles_osama_page;
import com.blue_CRM.pages.US_10_Creat_a_Poll_osama_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

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

    }
    @Given("user clicks upload files and images box osama")
    public void user_clicks_upload_files_and_images_box_osama() {


    }
    @Given("user specific the {string} osama")
    public void user_specific_the_osama( List<String> files) {
        for (String eachFile : files) {
            uploadFiles.uploadFileBtn.click();
            uploadFiles.uploadFileChosen.click();
            uploadFiles.uploadFileChosen.sendKeys(eachFile);
            poll.sendButton.click();
        }
    }

    @Then("user sees the file display osama")
    public void user_sees_the_file_display_osama() {

    }





    @Given("user clicks Insert in text button osama")
    public void user_clicks_insert_in_text_button_osama() {

    }
    @Given("user clicks send button osama")
    public void user_clicks_send_button_osama() {

    }
    @Then("user sees the file display with message text osama")
    public void user_sees_the_file_display_with_message_text_osama() {

    }


    @Given("user specific the {string} osama")
    public void user_specific_the_osama(String string) {

    }
    @Given("user clicks x button osama")
    public void user_clicks_x_button_osama() {

    }
    @Then("user sees the file deleted osama")
    public void user_sees_the_file_deleted_osama() {

    }

}
