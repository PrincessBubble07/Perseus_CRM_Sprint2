package com.blue_CRM.pages;

import com.blue_CRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

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

    @FindBy(xpath = "//table[@class='files-list']//td[@class='files-info']/span")
    public WebElement insertInTextBtn;

    @FindBy(xpath = "//table[@class='files-list']//td[@class='files-del-btn']/span")
    public WebElement removeFileBtn;

    @FindBy(xpath = "//div[@class='feed-item-wrap']//div[contains(@id,'blog_post_outer')]//span[2]")
    public WebElement messageTxtTitle;

    @FindBy(xpath = "//div[contains(@id,'disk-attach-block-Ny1b1Y')]")
    public WebElement filesInTheConsole;

    @FindBy(xpath = "//span[@class='feed-add-post-loading-wrap']/span[@class='feed-add-post-loading']")
    public WebElement loadingBar;

}
