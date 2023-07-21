package com.blue_CRM.pages;

import com.blue_CRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_11_ElizabethPage {


    public US_11_ElizabethPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@id='feed-add-post-form-link-text']")
    public WebElement MoreTab;

    @FindBy(xpath = "//div[@id='popup-window-content-menu-popup-feed-add-post-form-popup']//div[@class='menu-popup-items']/span[2]")

    public WebElement AppreciationButton;


    @FindBy(xpath = "//button[@id='blog-submit-button-cancel']")
    public WebElement CancelBtn;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement SendBtn;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement iframe;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement TextBox;

    @FindBy(xpath = "//span[@class='feed-add-post-del-but']")
    public WebElement allEmployees;

    @FindBy(xpath = "//div[@class='feed-add-error']/span[2]")
    public WebElement ErrorMessage;



    @FindBy(id = "bx-destination-tag")
    public WebElement addRecipient;

    @FindBy(id = "feed-add-post-destination-input")
    public WebElement enterRecipientText;

}


//


