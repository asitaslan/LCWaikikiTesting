import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchBox extends BasePage {

    By searchLocator = By.id("search_input");
    By submitButtonLocator = By.name("Ara");

    public SearchBox(WebDriver driver) {
        super(driver);
    }

    public void search(String text) {
        type(searchLocator, text);
        click(submitButtonLocator);
    }
}
