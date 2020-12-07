package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginSentinel extends PageObject{

    public void openPage (){
        getDriver().get("https://kraken-biller.sumpahpalapa.com/");
    }

    public void inputCredentials (String userName, String password) {
        WebElement username = getDriver().findElement(By.xpath("//input[@placeholder='Username']"));
        username.sendKeys(userName);

        WebElement Password = getDriver().findElement(By.xpath("//input[@placeholder='Password']"));
        Password.sendKeys(password);
    }

    public void clickButtonLogin () {
        WebElement loginButton = getDriver().findElement(By.xpath("//button[@class='btn px-4 btn-primary']"));
        loginButton.click();
    }
}
