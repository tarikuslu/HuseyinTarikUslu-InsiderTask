package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {

    private By cartContainer = By.className("cart-container");
    private By lcwaikikiLogo = By.className("main-header-logo");
    private WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isCartDisplayed() {
        return driver.findElement(cartContainer).isDisplayed();
    }

    public HomePage clickHomePage() {
        WebElement lcwaikikiLogoElement = driver.findElement(lcwaikikiLogo);
        lcwaikikiLogoElement.click();
        return new HomePage(driver);
    }
}
