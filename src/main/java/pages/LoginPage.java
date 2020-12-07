package pages;

import org.openqa.selenium.WebDriver;
import pages.PageObject;

public class LoginPage extends PageObject {

    public void openPage(){

        getDriver().get("https://www.google.com/");
        getDriver().quit();
    }

}
