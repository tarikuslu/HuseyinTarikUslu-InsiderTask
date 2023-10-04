package task;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.ManSweatshirtCategoryPage;
import pages.ProductDetailPage;
import static org.testng.Assert.assertTrue;
public class InsiderTaskTest extends BaseTests {

    @Test
    public void endToEndTest() {
        assertTrue(homePage.isHomePageDisplayed(), "Home page is not displayed");
        homePage.hoverManCategory();

        ManSweatshirtCategoryPage manSweatshirtCategoryPage = homePage.clickSweatshirtCategory();
        assertTrue(manSweatshirtCategoryPage.isCategoryPageDisplayed(),"Category page is not displayed.");

        ProductDetailPage productDetailPage = manSweatshirtCategoryPage.clickFirstProduct();
        assertTrue(productDetailPage.isProductDisplayed(),"Product detail page is not displayed.");
        productDetailPage.selectSize();
        productDetailPage.clickAddToCart();

        CartPage cartPage = productDetailPage.clickCartLink();
        assertTrue(cartPage.isCartDisplayed(), "Cart page is not displayed.");
        cartPage.clickHomePage();

        assertTrue(homePage.isHomePageDisplayed(), "Home page is not displayed");
    }
}
