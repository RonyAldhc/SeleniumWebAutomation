package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginSentinel;

public class LoginSentinelSteps {

    LoginSentinel loginSentinel = new LoginSentinel();

    @Given("Open Website Sentinel")
    public void openWebsiteSentinel() {
        loginSentinel.openPage();
    }

    @When("User input username {string} and password {string}")
    public void userInputUsernameAndPassword(String username, String password) {
    }

    @Then("User success to login")
    public void userSuccessToLogin() {
    }
}
