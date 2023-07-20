package com.blue_CRM.pages;

import com.blue_CRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_04_MadeleinePage {

    public US_04_MadeleinePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[text()='Message']")
    public WebElement messageButton;

    @FindBy(className = "feed-add-post-destination-text")
    public WebElement allEmployees;

    @FindBy(className = "bx-editor-iframe")
    public WebElement iframe;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement messageBody;

    @FindBy(id = "blog-submit-button-save")
    public WebElement sendButton;

    @FindBy(xpath = "//div[starts-with(@id, 'blog_post_body_')]")
    public WebElement sentMessage;

    @FindBy(id = "blog-submit-button-cancel")
    public WebElement cancelButton;

    @FindBy(className = "feed-add-post-del-but")
    public WebElement removeAllEmployees;

    @FindBy(id = "bx-destination-tag")
    public WebElement addRecipientLink;

    @FindBy(id = "feed-add-post-destination-input")
    public WebElement enterRecipientTextBox;



    @FindBy(xpath = "//span[text()='The message title is not specified']")
    public WebElement blankMessageError;

    @FindBy(xpath = "//span[text()='Please specify at least one person.']")
    public WebElement noRecipientError;

    @FindBy(xpath = "//span[text()='Send message …']")
    public WebElement defaultSendMessageText;















}
