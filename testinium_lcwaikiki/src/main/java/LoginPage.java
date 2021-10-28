import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    By loignUyeGirisiLocator = By.name("ÜYE GİRİŞİ");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnLoginPage() {
        return isDisplay(loignUyeGirisiLocator);
    }


}
