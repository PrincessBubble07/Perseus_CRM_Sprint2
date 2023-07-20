package com.blue_CRM.step_definitions;

import com.blue_CRM.pages.EmployeesPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmployeesPageStepDefs {

    EmployeesPage employeesPage = new EmployeesPage();

    @When("the user click on Employees")
    public void the_user_click_on_employees() {
        employeesPage.employees.click();
    }

    @Then("the user should be able to see Company Structure on the Employee page")
    public void the_user_should_be_able_to_see_company_structure_on_the_employee_page() {
        employeesPage.companyStructure.isDisplayed();
    }

    @Then("the user should be able to see Find Employee on the Employee page")
    public void the_user_should_be_able_to_see_find_employee_on_the_employee_page() {
       employeesPage.findEmployee.isDisplayed();
    }

    @Then("the user should be able to see Telephone Directory on the Employee page")
    public void the_user_should_be_able_to_see_telephone_directory_on_the_employee_page() {
        employeesPage.telephoneDirectory.isDisplayed();
    }

    @Then("the user should be able to see Staff Changes on the Employee page")
    public void the_user_should_be_able_to_see_staff_changes_on_the_employee_page() {
        employeesPage.staffChanges.isDisplayed();
    }

    @Then("the user should be able to see Efficiency on the Employee page")
    public void the_user_should_be_able_to_see_efficiency_on_the_employee_page() {
       employeesPage.efficiencyReport.isDisplayed();
    }

    @Then("the user should be able to see Honored Employees on the Employee page")
    public void the_user_should_be_able_to_see_honored_employees_on_the_employee_page() {
       employeesPage.honoredEmployees.isDisplayed();
    }

    @Then("the user should be able to see Birthdays on the Employee page")
    public void the_user_should_be_able_to_see_birthdays_on_the_employee_page() {
       employeesPage.birthdays.isDisplayed();
    }

    @Then("the user should be able to see New page on the Employee page")
    public void the_user_should_be_able_to_see_new_page_on_the_employee_page() {
        employeesPage.newPage.isDisplayed();
    }


}







}







