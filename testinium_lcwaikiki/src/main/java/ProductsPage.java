import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Collection;
import java.util.List;
import java.util.Random;

public class ProductsPage extends BasePage {

    By filterOptionLocator = By.id("filter-label");
    By productNameLocator = By.className("pantolan");
    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductPage() {
        return isDisplay(filterOptionLocator);
    }

    public void selectProduct(int i) {
      getAllProducts().get(i).click();
    }

    private List<WebElement> getAllProducts(){
        return findAll(productNameLocator);
    }


}
