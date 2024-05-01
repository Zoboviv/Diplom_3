package pageobject;

import io.qameta.allure.Step;
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

    @Step("Нажатие кнопки 'Личный кабинет'")
    public void clickPersonalArea() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(buttonPersonalArea));
        driver.findElement(buttonPersonalArea).click();
    }
    @Step("Нажатие кнопки 'Войти в аккаунт' на главной странице'")
    public void clickLoginToAccount() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(buttonLoginToAccount));
        driver.findElement(buttonLoginToAccount).click();
    }

    @Step("Проверка отображения заголовка 'Вход'")
    public void checkWindowLogin() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(windowLogin));
        assertTrue(driver.findElement(windowLogin).isDisplayed());
    }

    @Step("Нажатие псевдоссылки 'Зарегистрироваться'")
    public void clickButtonRegister() {
        driver.findElement(buttonRegister).click();
    }

    @Step("Нажатие кнопки 'Зарегистрироваться'")
    public void clickButtonLinkRegister() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(buttonLinkRegister));
        driver.findElement(buttonLinkRegister).click();
    }
    @Step("Проверка отображения заголовка 'Регистрация'")
    public void checkWindowRegistration() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(windowRegistration));
        assertTrue(driver.findElement(windowRegistration).isDisplayed());
    }
    @Step("Проверка отображения ошибки 'Некорректный пароль'")
    public void checkWindowTextIncorrectPassword() {
        assertTrue(driver.findElement(textIncorrectPassword).isDisplayed());
    }
    @Step("Ввод name")
    public void setName(String name) {
        driver.findElement(nameField).sendKeys(name);
    }
    @Step("Ввод email")
    public void setEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }
    @Step("Ввод password")
    public void setPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }


}
