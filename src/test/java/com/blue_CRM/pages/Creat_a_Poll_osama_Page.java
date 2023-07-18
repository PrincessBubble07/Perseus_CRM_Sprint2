package com.blue_CRM.pages;

import com.blue_CRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Creat_a_Poll_osama_Page {
    public Creat_a_Poll_osama_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[@id='feed-add-post-form-tab-vote']")
    public WebElement poll;
    @FindBy(xpath = "//span[@class='feed-add-post-destination-text']")
    public WebElement allEmployees;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement iframe;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement textArea;
    @FindBy(xpath = "//*[@id='question_0']")
    public WebElement questionInput;
    @FindBy(xpath = "/html/body/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/table/tbody/tr/td/div/div[2]/div/div[1]/div/div/div[3]/div/div/form/div[2]/div[1]/div/div/ol/li/ol/li[1]")
    public WebElement answerInput1;
    @FindBy(xpath = "//div[@id='feed-add-post-content-message-add-ins']//ol[@class='vote-answers']/li[@class='vote-block-inp-wrap'][.//*[@id='answer_0__1_']]")
    public WebElement answerInput2;
    @FindBy(xpath = "//div[@id='feed-add-post-content-message-add-ins']//ol[@class='vote-answers']/li[@class='vote-block-inp-wrap'][.//*[@id='answer_0__2_']]")
    public WebElement answerInput3;

    @FindBy(xpath = "//div[@id='blg-post-img-2629']/div[3]/div[1]/div")
    public WebElement messageTitle;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendButton;
}
