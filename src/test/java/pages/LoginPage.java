package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    // All Locate


    @FindBy(xpath = "//div[@class='login-header']")
    public WebElement loginTitle;
    @FindBy(xpath = "//input[@id='username']")
    public WebElement username;
    @FindBy(xpath = "//*[text()='Username field is required']")
    public WebElement usernameEror;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;
    @FindBy(xpath = "//*[text()='Password field is required']")
    public WebElement passwordEror;
    @FindBy(xpath = "//button")
    public WebElement login;

}
