package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductDetailPage {

    private By productDetailContainer = By.className("product-detail");
    private By sizeSelector = By.cssSelector("a[size = \"2XL\"]");
    private By addToCartButton = By.id("pd_add_to_cart");
    private By goTocartLink = By.cssSelector("a[href=\"https://www.lcwaikiki.com/tr-TR/TR/sepetim\"] .dropdown-label");
    private WebDriver driver;
    public ProductDetailPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isProductDisplayed() {
        return driver.findElement(productDetailContainer).isDisplayed();
    }

    public String getAddToCartText() {
        return driver.findElement(addToCartButton).getText();
    }

    public void selectSize() {
        WebElement sizeSelectorElement = driver.findElement(sizeSelector);
        sizeSelectorElement.click();
    }

    public void clickAddToCart() {
        WebElement addToCartButtonElement = driver.findElement(addToCartButton);
        addToCartButtonElement.click();
    }

    public CartPage clickCartLink() {
        WebElement goToCartElement = driver.findElement(goTocartLink);
        goToCartElement.click();
        return new CartPage(driver);
    }

}
