package com.blue_CRM.step_definitions;

import com.blue_CRM.pages.US_12_ASPage;
import com.blue_CRM.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.List;

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
    public void theUserShouldBeAbleToUploadFilesAndPictures(List<String> filesAndPictures) {
        us12AsPage.uploadFilesButton.click();
        for (String each : filesAndPictures) {

            String filePathPNG = System.getProperty("user.dir")+"/src/test/resources/filesToUpload/" + each;

            us12AsPage.uploadFilesAndImagesButton.sendKeys(filePathPNG);

        }

    }

    @Then("the user should be able to insert files and pictures into the text")
    public void theUserShouldBeAbleToInsertFilesAndPicturesIntoTheText(List<String> filesAndPictures) {
        us12AsPage.uploadFilesButton.click();
        for (String each : filesAndPictures) {

            String filePathPNG = System.getProperty("user.dir")+"/src/test/resources/filesToUpload/" + each;

            us12AsPage.uploadFilesAndImagesButton.sendKeys(filePathPNG);

            us12AsPage.insertInTextButton.click();


        }
    }

    @Then("the user should be able to remove files and images at any time before sending")
    public void theUserShouldBeAbleToRemoveFilesAndImagesAtAnyTimeBeforeSending(List<String> filesAndPictures) {
        us12AsPage.uploadFilesButton.click();
        for (String each : filesAndPictures) {

            String filePathPNG = System.getProperty("user.dir")+"/src/test/resources/filesToUpload/" + each;

            us12AsPage.uploadFilesAndImagesButton.sendKeys(filePathPNG);

            BrowserUtils.waitForClickAblility(us12AsPage.removeButton,2);

            us12AsPage.removeButton.click();
        }


    }
}
