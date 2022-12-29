package stepdefinitions;

import io.cucumber.java.en.*;
import pages.DashboardPage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

import static utilities.ReusableMethods.*;

public class LoginModule {

    LoginPage event=new LoginPage();

    DashboardPage dashboardPage =new DashboardPage();
    @Given("User opens {string} link")
    public void user_opens_link(String string) {
        Driver.getDriver().get(ConfigReader.getProperty(string));

    }

    @When("User sees username,password and login titles")
    public void userSeeUsernamePasswordAndLoginTitles() {
        titleAssert(event.loginTitle);
        titleAssert(event.username);
        titleAssert(event.password);
        titleAssert(event.login);

    }

    @When("User should see validation errors")
    public void userShouldSeeValidationErrors() {
        event.login.click();
        waitForVisibility(event.usernameEror,5);
        titleAssert(event.usernameEror);
        titleAssert(event.passwordEror);
    }

    @And("User close pages")
    public void userClosePages() {
        Driver.closeDriver();
    }

    @When("User gives {string} and {string}")
    public void userGiveAnd(String name, String password) {
        inputText(event.username,ConfigReader.getProperty(name));
        inputText(event.password,ConfigReader.getProperty(password));

    }

    @Then("User clicks login button and sees message")
    public void userClicksLoginButtonAndSeesMessage() throws InterruptedException {
        event.login.click();
        titleAssert(dashboardPage.welcomeMessage);
    }
}
