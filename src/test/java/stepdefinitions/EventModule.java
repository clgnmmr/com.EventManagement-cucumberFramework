package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CreateEventPage;
import pages.DashboardPage;
import pages.EditEventPage;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;
import static utilities.ReusableMethods.*;

public class EventModule {
    DashboardPage dashboardPage = new DashboardPage();
    CreateEventPage createEventPage = new CreateEventPage();
    EditEventPage editEventPage = new EditEventPage();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());

    @Then("User clicks the Create Event button")
    public void user_clicks_the_create_event_button() {
        dashboardPage.createEventButton.click();
    }

    @When("User sees the Create Event title")
    public void user_sees_the_create_event_title() {
        titleAssert(createEventPage.createEventTitle);
    }

    @Then("User views validation errors if click the Create Event button")
    public void userViewsValidationErrorsIfClickTheCreateEventButton() {
        createEventPage.createNewEventButton.click();

        for (WebElement element : createEventPage.eventErorList) {
            titleAssert(element);
        }

    }

    @Then("User adds new participant when clicks the Add Participant button")
    public void userAddsNewParticipantWhenClicksTheAddParticipantButton() {
        createEventPage.eventAddParticipant.click();
        assertTrue(createEventPage.eventParticipantList.size() > 1);
    }

    @Then("User views error messages if removes all participants")
    public void userViewsErrorMessagesIfRemovesAllParticipants() {

        for (int i = 0; i < createEventPage.eventDeleteButton.size(); i++) {
            createEventPage.eventDeleteButton.get(i).click();
        }
        titleAssert(createEventPage.eventAddParticipantError);

    }

    @Then("User fills out the form and sees the message Successfully created.")
    public void userFillsOutTheFormAndSeesTheMessageSuccessfullyCreated() {
        actions.click(createEventPage.eventName).sendKeys(faker.name().firstName()).
                sendKeys(Keys.TAB).
                sendKeys(faker.lorem().characters(10, 50)).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).sendKeys(Keys.ENTER).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(faker.name().firstName()).
                sendKeys(Keys.TAB).
                sendKeys(faker.name().lastName()).
                sendKeys(Keys.TAB).
                sendKeys(faker.internet().emailAddress()).perform();
        createEventPage.createNewEventButton.click();
        titleAssert(dashboardPage.eventSuccessCreateMessage);
    }

    @And("User clicks edit Event button")
    public void userClicksEditEventButton() {
        dashboardPage.eventEditButton.get(0).click();


    }

    @And("User checks that the edit page is opened.")
    public void userChecksThatTheEditPageIsOpened() {

        titleAssert(editEventPage.editEventTitle);
    }

    @And("User fills in the required fields and sees the update successful message")
    public void userFillsInTheRequiredFieldsAndSeesTheUpdateSuccessfulMessage() {
        actions.click(createEventPage.eventName).sendKeys(faker.name().firstName()).
                sendKeys(Keys.TAB).
                sendKeys(faker.lorem().characters(10, 50)).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).sendKeys(Keys.ENTER).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(faker.name().firstName()).
                sendKeys(Keys.TAB).
                sendKeys(faker.name().lastName()).
                sendKeys(Keys.TAB).
                sendKeys(faker.internet().emailAddress()).perform();
        createEventPage.createNewEventButton.click();
        waitForVisibility(dashboardPage.eventSuccessUpdateMessage, 10);
        titleAssert(dashboardPage.eventSuccessUpdateMessage);
    }
}
