package stepdefinition;

import cucumber.api.java.en.Given;
import pages.LoginPage;

public class OpenPageSteps {

    LoginPage loginPage = new LoginPage();

    @Given("user open sentinel page")
    public void userOpenSentinelPage() {
        loginPage.openPage();
    }
}
