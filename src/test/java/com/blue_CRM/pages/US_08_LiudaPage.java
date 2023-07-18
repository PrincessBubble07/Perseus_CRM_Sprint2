package com.blue_CRM.pages;

import com.blue_CRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_08_LiudaPage {


    public US_08_LiudaPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "(//span[@class='menu-item-link-text'])[10]")
    public WebElement Employeeslink;

    @FindBy(id="pagetitle")
    public WebElement pageTitle;

    @FindBy(id="bx_visual_structure")
    public WebElement companyStructure;


    @FindBy(xpath = "//span[.='Add department']")
    public WebElement addDepartmentButton;

    @FindBy(xpath = "//a[@class='webform-small-button webform-small-button-blue webform-small-button-add']")
    public WebElement AddDeppartClik;

    @FindBy(xpath = "//span[@class=\"popup-window-titlebar-text\"]")
    public WebElement addDepartmentWindow;

    @FindBy(id="NAME")
    public WebElement departmentNameInputBox;

    @FindBy(id="IBLOCK_SECTION_ID")
    public WebElement ParentDepartmentList;








}
