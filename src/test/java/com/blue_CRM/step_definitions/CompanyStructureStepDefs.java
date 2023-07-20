package com.blue_CRM.step_definitions;
import com.blue_CRM.pages.CompanyStructurePage;
import com.blue_CRM.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
;

public class CompanyStructureStepDefs {


    CompanyStructurePage us_08_liuda = new CompanyStructurePage();


    @Then("the user see the Company Structure")
    public void theUserSeeTheCompanyStructure() {
        us_08_liuda.Employeeslink.isDisplayed();
        us_08_liuda.Employeeslink.click();
        us_08_liuda.CompanyStructurePageTitle.isDisplayed();
        us_08_liuda.companyStructure.isDisplayed();

    }

    @Then("user sees “ADD DEPARTMENT” option")
    public void userSeesADDDEPARTMENTOption() {
        us_08_liuda.addDepartmentButton.isDisplayed();
    }

    @Then("user adds Department from the Company Structure")
    public void userAddsDepartmentFromTheCompanyStructure() {
        us_08_liuda.AddDeppartClik.click();
        us_08_liuda.addDepartmentWindow.isSelected();
        us_08_liuda.departmentNameInputBox.click();
        us_08_liuda.departmentNameInputBox.sendKeys("Developers");
        us_08_liuda.ParentDepartmentList.click();

        us_08_liuda.SomeDepartment.click();
        us_08_liuda.SomeDepartment.isDisplayed();
        us_08_liuda.addButton.click();

    }

    @Then("There is no “ADD DEPARTMENT” option")
    public void thereIsNoADDDEPARTMENTOption() {
        BrowserUtils.verifyElementNotDisplayed(By.xpath("//span[.='Add department']"));

    }
}