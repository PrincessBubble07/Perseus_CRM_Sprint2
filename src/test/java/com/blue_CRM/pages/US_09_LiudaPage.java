package com.blue_CRM.pages;

import com.blue_CRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US_09_LiudaPage {

    public US_09_LiudaPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(xpath = "//a[@title='Activity Stream']")
    public WebElement activityStreamLink;

    @FindBy(xpath = "//div[@class='microblog-top-tabs-visible']")
    public List<WebElement> AllTopLinks;

    @FindBy(xpath ="(//span[.= 'More'])[2]")
    public WebElement MORELink;

    @FindBy(xpath = "//div[@class='menu-popup']")
    public List<WebElement> AllMOREPopupElement;





}
