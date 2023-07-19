package com.blue_CRM.step_definitions;

import com.blue_CRM.pages.US_13_accessDrivePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.List;

public class US_13_accessDrive {

    US_13_accessDrivePage us13AccessDrivePage = new US_13_accessDrivePage();

    @When("the user click on Drive")
    public void the_user_click_on_drive() {
    us13AccessDrivePage.driveButton.click();
    }


    @Then("the user should be able to see My Drive modules on the Drive page")
    public void theUserShouldBeAbleToSeeMyDriveModulesOnTheDrivePage() {
        us13AccessDrivePage.myDriveModule.isDisplayed();
    }

    @Then("the user should be able to see All Documents modules on the Drive page")
    public void theUserShouldBeAbleToSeeAllDocumentsModulesOnTheDrivePage() {
        us13AccessDrivePage.allDocumentsModule.isDisplayed();
    }

    @Then("the user should be able to see Company Drive modules on the Drive page")
    public void theUserShouldBeAbleToSeeCompanyDriveModulesOnTheDrivePage() {
        us13AccessDrivePage.companyDriveModule.isDisplayed();
    }

    @Then("the user should be able to see Sales and Marketing modules on the Drive page")
    public void theUserShouldBeAbleToSeeSalesAndMarketingModulesOnTheDrivePage() {
        us13AccessDrivePage.salesAndMarketingModule.isDisplayed();
    }

    @Then("the user should be able to see Top Management's documents modules on the Drive page")
    public void theUserShouldBeAbleToSeeTopManagementSDocumentsModulesOnTheDrivePage() {
        us13AccessDrivePage.topManagementsDocumentsModule.isDisplayed();
    }

    @Then("the user should be able to see Drive Cleanup modules on the Drive page")
    public void theUserShouldBeAbleToSeeDriveCleanupModulesOnTheDrivePage() {
        us13AccessDrivePage.driveCleanupModule.isDisplayed();
    }
}
