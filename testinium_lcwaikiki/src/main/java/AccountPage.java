import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage extends BasePage {


    By onAccountPageLocator = By.name("Değişiklikleri Kaydet");
    public AccountPage(WebDriver driver) {
        super(driver);
    }

    public  boolean isOnAccountPage(){
        return  isDisplay(onAccountPageLocator);
    }

}
