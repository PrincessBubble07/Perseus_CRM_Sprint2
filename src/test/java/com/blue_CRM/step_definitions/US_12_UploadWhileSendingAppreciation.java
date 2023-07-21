package com.blue_CRM.step_definitions;

import com.blue_CRM.pages.US_12_ASPage;
import com.blue_CRM.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class US_12_UploadWhileSendingAppreciation {

    US_12_ASPage us12AsPage = new US_12_ASPage();

    @Given("the user click on MORE tab")
    public void the_user_click_on_more_tab() {
    us12AsPage.moreButton.click();
    }
    @Given("the user click on Appreciation")
    public void the_user_click_on_appreciation() {
    us12AsPage.appreciationButton.click();
    }
    @Then("the user should be able to upload files and pictures")
    public void the_user_should_be_able_to_upload_files_and_pictures() {
    us12AsPage.uploadFilesButton.click();
    us12AsPage.uploadFilesAndImagesButton.sendKeys("C:\\Users\\cen98\\IdeaProjects\\Perseus_CRM_Sprint2\\src\\test\\resources\\filesToUpload\\testingFelix.txt");
        BrowserUtils.sleep(5);
    }
}
