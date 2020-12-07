package pages;

public class LoginPage extends PageObject {

    public void openPage(){

        getDriver().get("https://www.google.com/");
        getDriver().quit();
    }

}
