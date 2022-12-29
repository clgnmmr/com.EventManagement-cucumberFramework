package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class EditEventPage {
    public EditEventPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h1")
    public WebElement editEventTitle;
    @FindBy(xpath = "//input[@id='name']")
    public WebElement eventName;
    @FindBy(xpath = "//mat-error[@id='mat-error-0']")
    public WebElement eventNameError;

    @FindBy(xpath = "//input[@id='description']")
    public WebElement eventDescription;


    @FindBy(xpath = "//input[@id='mat-input-2']")
    public WebElement eventDate;
    @FindBy(xpath = "//mat-error[@id='mat-error-1']")
    public WebElement eventDateError;
    @FindBy(xpath = "//button[@class='mat-focus-indicator mat-flat-button mat-button-base']")
    public WebElement eventAddParticipant;

    @FindBy(xpath = "//p[@class='ng-star-inserted']")
    public WebElement eventAddParticipantError;


    @FindBy(xpath = "//mat-error[text()='Participant name is required']")
    public List<WebElement> eventFirstNameError;
    @FindBy(xpath = "//mat-error")
    public List<WebElement> eventErorList;
    @FindBy(xpath = "//mat-error[text()='Participant last name is required']")
    public List<WebElement> eventLastNameError;
    @FindBy(xpath = "//mat-error[text()='Please enter email or phone number']")
    public List<WebElement> eventContactError;
    @FindBy(xpath = "//button[@class='mat-focus-indicator mat-icon-button mat-button-base mat-warn']")
    public List<WebElement> eventDeleteButton;
    @FindBy(xpath = "(//button)[4]")
    public WebElement updateNewEventButton;
}
