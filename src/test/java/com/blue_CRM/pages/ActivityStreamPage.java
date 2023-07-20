package com.blue_CRM.pages;

import com.blue_CRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ActivityStreamPage {

    public ActivityStreamPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(xpath = "//a[@title='Activity Stream']")
    public WebElement activityStreamLink;

    //@FindBy(xpath = "//div[@class='microblog-top-tabs-visible']")

    @FindBy(xpath = "//span[contains(@id,'feed-add-post-form-tab' )][not (@style)]")
    public List<WebElement> AllTopLinks;

    @FindBy(xpath ="(//span[.= 'More'])[2]")
    public WebElement MORELink;

    //@FindBy(xpath = "//div[@class='menu-popup']")
   // @FindBy(xpath = "//div[@class='menu-popup-items']")

    @FindBy(xpath = "//span[@class='menu-popup-item-text']")
    public List<WebElement> AllMOREPopupElement;





}
