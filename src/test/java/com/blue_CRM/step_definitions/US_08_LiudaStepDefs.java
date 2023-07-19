package com.blue_CRM.step_definitions;

import com.blue_CRM.pages.US_08_LiudaPage;
import com.blue_CRM.utilities.BrowserUtils;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
;

public class US_08_LiudaStepDefs {


    US_08_LiudaPage us_08_liuda = new US_08_LiudaPage();

    @When("all users types should be able to display company structure.")
    public void all_users_types_should_be_able_to_display_company_structure() {
        us_08_liuda.Employeeslink.click();
        us_08_liuda.pageTitle.isDisplayed();
        us_08_liuda.companyStructure.isDisplayed();


    }
    @When("hr user should be able to add a department from the company structure.")
    public void the_user_should_be_able_to_add_a_department_from_the_company_structure() {

        us_08_liuda.addDepartmentButton.isDisplayed();


        us_08_liuda.AddDeppartClik.click();

        us_08_liuda.addDepartmentWindow.isSelected();

        us_08_liuda.departmentNameInputBox.click();
        us_08_liuda.departmentNameInputBox.sendKeys("Developers");
        us_08_liuda.ParentDepartmentList.click();
        us_08_liuda.instructorsDepartment.click();
        us_08_liuda.instructorsDepartment.isSelected();


        us_08_liuda.addButton.click();

    }
    @Then("There is no “ADD DEPARTMENT” option for Helpdesk and Marketing user.")
    public void there_is_no_add_department_option_for_helpdesk_and_marketing_user() {


        BrowserUtils.verifyElementNotDisplayed(By.xpath("//span[.='Add department']"));


    }

}
