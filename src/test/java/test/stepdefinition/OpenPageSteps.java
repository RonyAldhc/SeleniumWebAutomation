package test.stepdefinition;

import cucumber.api.java.en.Given;
import test.pages.LoginPage;

public class OpenPageSteps {

    LoginPage loginPage = new LoginPage();

    @Given("user open google page")
    public void userOpenGooglePage() {
        loginPage.openPage();
    }
}
