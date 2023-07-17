package com.blue_CRM.pages;


import com.blue_CRM.utilities.ConfigurationReader;
import com.blue_CRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@type='text']")
    public WebElement userName;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement password;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement submit;

    public void login(String username, String passwordInput) {
        userName.sendKeys(username);
        password.sendKeys(passwordInput);
        submit.click();
    }

    public void loginDynamic(String userType) {

        if (userType.contains(" ")) {
            userType = userType.replace(" ", "_");
        }
        String username = ConfigurationReader.getProperty(userType + "_username");
        String password = ConfigurationReader.getProperty(userType + "_password");

        login(username, password);
    }

    // verification that we logged
}


