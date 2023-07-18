package com.blue_CRM.pages;

import com.blue_CRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_13_accessDrivePage {
    public US_13_accessDrivePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "bx_left_menu_menu_files")
    public WebElement driveButton;

    @FindBy(id = "top_menu_id_docs_menu_my_disk")
    public WebElement myDriveModule;
    @FindBy(id = "top_menu_id_docs_63494979")
    public WebElement allDocumentsModule;
    @FindBy(id = "top_menu_id_docs_414529032")
    public WebElement companyDriveModule;
    @FindBy(id = "top_menu_id_docs_2673172489")
    public WebElement salesAndMarketingModule;
    @FindBy(id = "top_menu_id_docs_3526888156")
    public WebElement topManagementsDocumentsModule;
    @FindBy(id = "top_menu_id_docs_menu_my_disk_volume")
    public WebElement driveCleanupModule;

}
