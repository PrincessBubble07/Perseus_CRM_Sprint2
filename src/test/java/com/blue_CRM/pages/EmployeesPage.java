package com.blue_CRM.pages;

import com.blue_CRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeesPage {

    public EmployeesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//span[@class='menu-item-link-text'][7]")
    public WebElement employees;

    @FindBy(xpath = "//span[text()='Company Structure'][1]")
    public WebElement companyStructure;

    @FindBy(xpath = "//span[text()='Find Employee']")
    public WebElement findEmployee;

    @FindBy(xpath = "//span[text()='Telephone Directory']")
    public WebElement telephoneDirectory;

    @FindBy(xpath = "//span[text()='Staff Changes']")
    public WebElement staffChanges;

    @FindBy(xpath = "//span[text()='Efficiency Report']")
    public WebElement efficiencyReport;

    @FindBy(xpath = "//span[text()='Honored Employees']")
    public WebElement honoredEmployees;

    @FindBy(xpath = "//span[text()='Birthdays']")
    public WebElement birthdays;

    @FindBy(xpath = "//span[text()='New page']")
    public WebElement newPage;





}
