package com.blue_CRM.pages;

import com.blue_CRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_12_ASPage {

    public US_12_ASPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id = "feed-add-post-form-link-text")
    public WebElement moreButton;

    @FindBy(xpath = "(//span[@class='menu-popup-item-text'])[2]")
    public WebElement appreciationButton;

    @FindBy(xpath = "//div[@id='post-buttons-bottom']/span[@id='bx-b-uploadfile-blogPostForm']")
    public WebElement uploadFilesButton;

    @FindBy(xpath = "//table[@class='diskuf-selector-table wd-fa-add-file-light-table']//td[1]//input[@name='bxu_files[]']")
    public WebElement uploadFilesAndImagesButton;

    @FindBy(xpath = "//tbody[@class='diskuf-placeholder-tbody']//td[4]//span[.='Insert in text']")
    public WebElement insertInTextButton;

    @FindBy(xpath = "//tbody[@class='diskuf-placeholder-tbody']//tr//td[5]//span")
    public WebElement removeButton;
}
