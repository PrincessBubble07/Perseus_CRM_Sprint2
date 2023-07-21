package com.blue_CRM.pages;

import com.blue_CRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_04_MessagePage {

    public US_04_MessagePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


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

    @FindBy(xpath = "//a[@id='bx-destination-tag']")
    public WebElement addRecipientLink;

    @FindBy(id = "feed-add-post-destination-input")
    public WebElement enterRecipientTextBox;




}
