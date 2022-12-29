package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.CreateEventPage;
import pages.DashboardPage;
import utilities.Driver;

import static utilities.ReusableMethods.titleAssert;

public class DashboardModule {
    DashboardPage dashboardPage=new DashboardPage();
    CreateEventPage createEventPage=new CreateEventPage();
    Actions actions=new Actions(Driver.getDriver());
    Faker faker=new Faker();
    @Then("User views dashboard if authenticated")
    public void user_views_dashboard_if_authenticated() {
       titleAssert(dashboardPage.eventsTitle);
    }

    @And("User views Events list or error message")
    public void userViewsEventsListOrErrorMessage() {
        try {
            if (dashboardPage.dashboardError.isDisplayed()){
                titleAssert(dashboardPage.dashboardError);
            }
        } catch (Exception e) {
            for (WebElement element :dashboardPage.dashboardEventsList) {
                titleAssert(element);
            }
        }
    }

    @Then("User clicks the create event button and fills out the form")
    public void userClicksTheCreateEventButtonAndFillsOutTheForm() {
        dashboardPage.createEventButton.click();
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
    }

    @And("User clicks delete button")
    public void userClicksDeleteButton() {
        for (int i = 0; i <dashboardPage.eventdeleteButton.size() ; i++) {
            dashboardPage.eventdeleteButton.get(i).click();
        }
        titleAssert(dashboardPage.dashboardError);
    }

    @And("User clicks participants button")
    public void userClicksParticipantsButton() {
        dashboardPage.eventParticitipansButton.get(0).click();
        titleAssert(dashboardPage.particitipanstitle);
        for (WebElement element:dashboardPage.particitipansList) {
            titleAssert(element);
        }
    }
}
