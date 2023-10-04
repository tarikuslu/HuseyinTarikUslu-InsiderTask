package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ManSweatshirtCategoryPage {

    private By categoryPageContainer = By.className("product-list-container");
    private By firstProductLink = By.className("product-card");
    private WebDriver driver;
    public ManSweatshirtCategoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isCategoryPageDisplayed() {
        return driver.findElement(categoryPageContainer).isDisplayed();
    }
    public ProductDetailPage clickFirstProduct() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(firstProductLink));
        WebElement firstProductElement = driver.findElements(firstProductLink).get(0);
        firstProductElement.click();

        return new ProductDetailPage(driver);
    }

}
