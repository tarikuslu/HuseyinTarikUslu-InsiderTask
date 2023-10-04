package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    private By homePageContainer = By.className("homepage-container");
    private By manCategoryLink = By.cssSelector("a[href = \"https://www.lcwaikiki.com/tr-TR/TR/lp/32-33-erkek\"]");
    private By manSweatshirtLink = By.cssSelector("a[href=\"/tr-TR/TR/kategori/erkek/Sweatshirt\"]");
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isHomePageDisplayed() {
        return driver.findElement(homePageContainer).isDisplayed();
    }

    public void hoverManCategory() {
        WebElement manCategoryElement = driver.findElement(manCategoryLink);
        Actions actions = new Actions(driver);
        actions.moveToElement(manCategoryElement).perform();
    }

    public ManSweatshirtCategoryPage clickSweatshirtCategory() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        WebElement manSweatshirtElement = driver.findElement(manSweatshirtLink);
        wait.until(ExpectedConditions.visibilityOf(manSweatshirtElement));
        manSweatshirtElement.click();
        return new ManSweatshirtCategoryPage(driver);
    }

}
