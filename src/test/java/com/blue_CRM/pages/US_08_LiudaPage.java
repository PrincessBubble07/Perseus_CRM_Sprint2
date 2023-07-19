package com.blue_CRM.pages;

import com.blue_CRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

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

    @FindBy(xpath = "//span[@class='webform-small-button-icon']")
    public WebElement AddDeppartClik;

    @FindBy(xpath = "//span[@class=\"popup-window-titlebar-text\"]")
    public WebElement addDepartmentWindow;

    @FindBy(id="NAME")
    public WebElement departmentNameInputBox;

    @FindBy(id="IBLOCK_SECTION_ID")
    public WebElement ParentDepartmentList;

    @FindBy(xpath = "//option[@value='339']")
    public WebElement instructorsDepartment;

    @FindBy(id="single-user-choice")
    public WebElement selectFromStrLink;

    @FindBy(xpath = "(//span[@class='finder-box-tab-text'])[2]")
    public WebElement companyBox;

    @FindBy(xpath = "(//div[@class='company-department-employee-name'])[201]")
    public WebElement supervisorNameNadir;


    @FindBy(xpath = "//div[@class='popup-window-hr popup-window-buttons-hr']")
    public List<WebElement> popupWindow;


    @FindBy(xpath = "//span[@class='popup-window-button popup-window-button-accept']")
    public WebElement addButton;







}
