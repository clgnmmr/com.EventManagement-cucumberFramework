package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DashboardPage {

    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(tagName = "strong")
    public WebElement welcomeMessage;
    @FindBy(xpath = "//button")
    public WebElement createEventButton;

}
