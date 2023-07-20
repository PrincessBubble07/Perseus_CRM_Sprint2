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

    @FindBy(xpath = "//span[@class='menu-popup-item-text']")

    public WebElement AppreciationButton;


    @FindBy(xpath = "//span[@id='blog-submit-button-cancel']")
    public WebElement CancelBtn;

    @FindBy(xpath = "//span[@id='blog-submit-button-save']")
    public WebElement SendBtn;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement iframe;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement TextBox;

    @FindBy(xpath = "//span[@class='feed-add-post-destination-text']")
    public WebElement allEmployees;

    @FindBy(xpath = "//span[text()='The message title is not specified']")
    public WebElement ErrorMessage1;

    @FindBy(xpath = "//span[@class='feed-add-post-del-but']")
    public WebElement AllEmployersCancelSign;

    @FindBy(xpath = "//span[text()='Please specify at least one person.']")
    public WebElement ErrorMessage2;

    @FindBy(id = "bx-destination-tag")
    public WebElement addRecipient;

    @FindBy(id = "feed-add-post-destination-input")
    public WebElement enterRecipientText;

}


//


