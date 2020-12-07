import login.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Execute {

    public static void main(String[] args) throws Exception {
        System.out.println("hallo");

        LoginPage loginPage = new LoginPage();
        loginPage.openPage();

    }
}
