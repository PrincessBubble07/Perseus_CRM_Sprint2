package com.blue_CRM.pages;

import com.blue_CRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_10_Creat_a_Poll_osama_Page {
    public US_10_Creat_a_Poll_osama_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@id='feed-add-post-form-tab-vote']")
    public WebElement poll;
    @FindBy(xpath = "//span[@class='feed-add-post-destination-text']")
    public WebElement allEmployees;
    @FindBy(xpath = "//span[@class='feed-add-post-del-but']")
    public WebElement removeAllEmployees;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement iframe;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement textArea;
    @FindBy(xpath = "//*[@id='question_0']")
    public WebElement questionInput;
    @FindBy(xpath = "//ol[@class='vote-answers']/li[@class='vote-block-inp-wrap']/input[@name='UF_BLOG_POST_VOTE_n0_DATA[QUESTIONS][0][ANSWERS][0][MESSAGE]']")
    public WebElement answerInput1;
    @FindBy(xpath = "//ol[@class='vote-answers']/li[@class='vote-block-inp-wrap']/input[@name='UF_BLOG_POST_VOTE_n0_DATA[QUESTIONS][0][ANSWERS][1][MESSAGE]']")
    public WebElement answerInput2;

    @FindBy(className = "feed-post-text-block-inner-inner")
    public WebElement messageTitle;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendButton;

    @FindBy(xpath = "//div[@class='vote-checkbox-wrap']/input[@type='checkbox']")
    public WebElement checkbox;
    @FindBy(xpath = "//div[@class='feed-add-error']/span[@class='feed-add-info-text']")
    public WebElement messageTitleError;
}
//div[@class='feed-post-text-block']/div[contains(@id,'feed-post-contentview')]/div[@class='feed-post-text-block-inner-inner']
//feed-add-post-del-but