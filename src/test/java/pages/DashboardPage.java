package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class DashboardPage {

    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(tagName = "strong")
    public WebElement welcomeMessage;
    @FindBy(xpath = "//button")
    public WebElement createEventButton;
    @FindBy(className = "mat-focus-indicator mat-icon-button mat-button-base mat-primary")
    public List<WebElement> eventEditButton;
    @FindBy(xpath = "//span[text()='Event created successfully']")
    public WebElement eventSuccessCreateMessage;
    @FindBy(xpath = "//span[text()='Event update successfully']")
    public WebElement eventSuccessUpdateMessage;
}
