package com.blue_CRM.pages;

import com.blue_CRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddLinkInMessagePage {

    public AddLinkInMessagePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement iframe;

    @FindBy(xpath = "//span[text()='Message']")
    public WebElement MessageLink;

    @FindBy(xpath = "//span[@title='Link']")
    public WebElement addLinkToMessage;

    @FindBy(xpath = "//input[@id='linkidPostFormLHE_blogPostForm-href']")
    public WebElement inputLinkURLBox;

    @FindBy(xpath = "//input[@id='linkidPostFormLHE_blogPostForm-text']")
    public WebElement inputLinkTextBox;

    @FindBy(xpath = "//input[@id='undefined']")
    public WebElement saveButton;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement SendSubmitButton;

    @FindBy(xpath = "//a[.='Google']")
    public WebElement linkMessage;







}







