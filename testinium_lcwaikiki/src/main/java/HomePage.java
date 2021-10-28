import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Stack;

public class HomePage extends BasePage {

    SearchBox searchBox;
    By cartCountLocator = By.className("header-icon-label");
    By cartConteinerLocator = By.name("Sepetim");
    By accountCheckLocator = By.className("header-profile-icon");

    public HomePage(WebDriver driver) {
        super(driver);
        searchBox = new SearchBox(driver);
    }

    public SearchBox searchBox() {
        return this.searchBox;
    }

    public boolean isProductCountUp() {
        return getCartCount() > 0;
    }

    public void goToCart() {
        click(cartCountLocator);
    }

    private  int getCartCount(){
        String count = find(cartCountLocator).getText();
        return Integer.parseInt(count);
    }

    public void goToAccountPage() {
        click(accountCheckLocator);
    }
}
