package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertTrue;

public class Registration extends Locators {
    public WebDriver driver;
    //конструктор класса
    public Registration(WebDriver driver) {
        this.driver = driver;
    }

    public void clickPersonalArea() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(buttonPersonalArea));
        driver.findElement(buttonPersonalArea).click();
    }
    public void checkWindowLogin() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(windowLogin));
        assertTrue(driver.findElement(windowLogin).isDisplayed());
    }
    public void clickButtonRegister() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(buttonRegister));
        driver.findElement(buttonRegister).click();
    }

    public void checkWindowRegistration() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(windowRegistration));
        assertTrue(driver.findElement(windowRegistration).isDisplayed());
    }

    public void setName(String name) {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(nameField));
        driver.findElement(nameField).sendKeys(name);
    }
    public void setEmail(String email) {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(emailField));
        driver.findElement(emailField).sendKeys(email);
    }
    public void setPassword(String password) {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(passwordField));
        driver.findElement(passwordField).sendKeys(password);
    }
}
