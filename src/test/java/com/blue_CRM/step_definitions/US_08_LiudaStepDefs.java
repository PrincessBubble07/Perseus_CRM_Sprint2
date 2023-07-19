package com.blue_CRM.step_definitions;

import com.blue_CRM.pages.US_08_LiudaPage;
import com.blue_CRM.utilities.BrowserUtils;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
;

public class US_08_LiudaStepDefs {


    US_08_LiudaPage us_08_liuda = new US_08_LiudaPage();

    @When("the user should be able to see Employees link")
    public void theUserShouldBeAbleToSeeEmployeesLink() {
        us_08_liuda.Employeeslink.isDisplayed();
    }

    @Then("the user should be able click on the Employees link")
    public void theUserShouldBeAbleClickOnTheEmployeesLink() {
        us_08_liuda.Employeeslink.click();

    }

    @When("the user should be able to see Company Structure Title.")
    public void theUserShouldBeAbleToSeeCompanyStructureTitle() {
        us_08_liuda.pageTitle.isDisplayed();

    }


    @Then("the user should be able to see Visual Company Structure")
    public void theUserShouldBeAbleToSeeVisualCompanyStructure() {
        us_08_liuda.companyStructure.isDisplayed();

    }

    @When("the user should be able to see Add Department button")
    public void theUserShouldBeAbleToSeeAddDepartmentButton() {
        us_08_liuda.addDepartmentButton.isDisplayed();
    }

    @Then("the user should be able to click Add Department button")
    public void theUserShouldBeAbleToClickAddDepartmentButton() {
        us_08_liuda.AddDeppartClik.click();
    }

    @Then("the user should be able to see department window")
    public void theUserShouldBeAbleToSeeDepartmentWindow() {
        us_08_liuda.addDepartmentWindow.isSelected();
    }


    @Then("the user should be able click on departmentNameInputBox link")
    public void theUserShouldBeAbleClickOnDepartmentNameInputBoxLink() {
        us_08_liuda.departmentNameInputBox.click();
    }

    @And("the user should be able to print the {string} of department")
    public void theUserShouldBeAbleToPrintTheOfDepartment(String string) {
        us_08_liuda.departmentNameInputBox.sendKeys(string);
    }

    @Then("the user should be able click on the ParentDepartmentList")
    public void theUserShouldBeAbleClickOnTheParentDepartmentList() {
        us_08_liuda.ParentDepartmentList.click();
    }


    @Then("the user should be able to select {string}")
    public void theUserShouldBeAbleToSelect(String string) {
        us_08_liuda.instructorsDepartment.click();
    }

    @And("the user should be able to see {string} is selected")
    public void theUserShouldBeAbleToSeeIsSelected(String string) {
        us_08_liuda.instructorsDepartment.isSelected();

    }
    @And("the user should be able click on the Add button")
    public void theUserShouldBeAbleClickOnTheAddButton() {
        us_08_liuda.addButton.click();
    }

    @Then("There is no “ADD DEPARTMENT” option for Helpdesk and Marketing user.")
    public void there_is_no_add_department_option_for_helpdesk_and_marketing_user() {

        BrowserUtils.verifyElementNotDisplayed(By.xpath("//span[.='Add department']"));

    }


}