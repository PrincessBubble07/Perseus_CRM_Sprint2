package com.blue_CRM.pages;

import com.blue_CRM.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class LogOutPage {

    public LogOutPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@id='user-block']")
    public WebElement profileName;


    @FindBy(xpath = "//span[.='Log out']")
    public WebElement logoutButton;

    @FindBy(xpath = "//div[@class='menu-popup']")
    public List<WebElement> popUpOptions;


}







