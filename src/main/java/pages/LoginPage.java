package pages;

public class LoginPage extends PageObject {

    public void openPage(){

        getDriver().get("https://kraken-biller.sumpahpalapa.com/");
        getDriver().quit();
    }

}
