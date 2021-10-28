import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;

public class Test_Add_Product_To_Cart extends  BaseTest{

    HomePage homePage;
    ProductsPage productsPage;
    ProductDetailPage productDetailPage;
    CartPage cartPage;
    LoginPage loginPage;
    AccountPage accountPage;



    @Test
    @Order(1)
    public void checkLoginPage(){
        loginPage = new LoginPage(driver);
        Assertions.assertTrue(loginPage.isOnLoginPage(),
                "Not on log in page");
    }

    @Test
    @Order(2)
    public void isLogin(){
        accountPage = new AccountPage(driver);
        homePage.goToAccountPage();
        Assertions.assertTrue(accountPage.isOnAccountPage(),
                "Not on account page");

    }


    @Test
    @Order(3)
    public void search_product(){
        homePage = new HomePage(driver);
        productsPage = new ProductsPage(driver);
        homePage.searchBox().search("pantolan");
        Assertions.assertTrue(productsPage.isOnProductPage(),
                "Not on products page!");
    }
    @Test
    @Order(4)
    public void select_product(){
        productDetailPage = new ProductDetailPage(driver);
        productsPage.selectProduct(1);
        Assertions.assertTrue(productDetailPage.isOnProductDetailPage(),
                "Not on product detail page");
    }
    @Test
    @Order(5)
    public void add_product_to_cart(){
        productDetailPage.addToCart();
        Assertions.assertTrue(homePage.isProductCountUp(),
                "Product count did not increase!");

    }
    @Test
    @Order(6)
    public void go_to_cart(){
        cartPage = new CartPage(driver);
        homePage.goToCart();
        Assertions.assertTrue(cartPage.checkIfProductAdded(),
                "Product was not added to cart");
    }

}
