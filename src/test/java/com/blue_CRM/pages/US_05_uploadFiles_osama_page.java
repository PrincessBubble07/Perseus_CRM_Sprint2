package com.blue_CRM.pages;

import com.blue_CRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_05_uploadFiles_osama_page {
    public US_05_uploadFiles_osama_page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//span[@id='feed-add-post-form-tab-message']")
    public WebElement messageTab;

    @FindBy(xpath = "//div[@id='post-buttons-bottom']/span[@id='bx-b-uploadfile-blogPostForm']")
    public WebElement uploadFileBtn;

    @FindBy(xpath = "//table[@class='diskuf-selector-table wd-fa-add-file-light-table']//td[1]//input[@name='bxu_files[]']")
    public WebElement uploadFileChosen;

}
