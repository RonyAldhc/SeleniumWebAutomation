package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginSentinel extends PageObject{

    public void openPage (){
        getDriver().get("https://kraken-biller.sumpahpalapa.com/");
    }

    public void inputCredentials (String userName, String password) {
        WebElement username = getDriver().findElement(By.className("input-group mb-3"));
        username.sendKeys(userName);

        WebElement Password = getDriver().findElement(By.className("input-group mb-1"));
        Password.sendKeys(password);
    }
}
