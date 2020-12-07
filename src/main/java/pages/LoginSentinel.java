package pages;

public class LoginSentinel extends PageObject{

    public void openPage (){
        getDriver().get("https://kraken-biller.sumpahpalapa.com/");
    }
}
