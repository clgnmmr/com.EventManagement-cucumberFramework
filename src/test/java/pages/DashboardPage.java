package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class DashboardPage {

    public DashboardPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(tagName = "strong")
    public WebElement welcomeMessage;

    @FindBy(xpath = "//button")
    public WebElement createEventButton;
    @FindBy(xpath = "//span[text()='Events']")
    public WebElement eventsTitle;
    @FindBy(xpath = "//*[@class='mat-card-content']")
    public WebElement dashboardError;
    @FindBy(xpath = "//tr[@class='mat-row cdk-row ng-star-inserted']")
    public List<WebElement> dashboardEventsList;
    @FindBy(xpath = "//tr[@class='ng-star-inserted']")
    public List<WebElement> particitipansList;
    @FindBy(xpath = "//button[@class='mat-focus-indicator mat-icon-button mat-button-base mat-primary']")
    public List<WebElement> eventEditButton;
    @FindBy(xpath = "//button[@class='mat-focus-indicator mat-icon-button mat-button-base mat-accent']")
    public List<WebElement> eventdeleteButton;
    @FindBy(xpath = "//button[@class='mat-focus-indicator mat-icon-button mat-button-base mat-warn']")
    public List<WebElement> eventParticitipansButton;
    @FindBy(xpath = "//h2")
    public WebElement particitipanstitle;
    @FindBy(xpath = "//span[text()='Event created successfully']")
    public WebElement eventSuccessCreateMessage;
    @FindBy(xpath = "//span[text()='Event updated successfully']")
    public WebElement eventSuccessUpdateMessage;
}
