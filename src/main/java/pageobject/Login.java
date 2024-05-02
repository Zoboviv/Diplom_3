package pageobject;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;


public class Login extends Locators{
    public WebDriver driver;
    //конструктор класса
    public Login(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Нажатие кнопки 'Войти в аккаунт' на главной странице'")
    public void clickLoginToAccount() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(buttonLoginToAccount));
        driver.findElement(buttonLoginToAccount).click();
    }

    @Step("Нажатие кнопки 'Личный кабинет'")
    public void clickPersonalArea() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(buttonPersonalArea));
        driver.findElement(buttonPersonalArea).click();
    }

    @Step("Нажатие кнопки 'Зарегистрироваться'")
    public void clickButtonLinkRegister() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(buttonLinkRegister));
        driver.findElement(buttonLinkRegister).click();
    }

    @Step("Нажатие кнопки 'Войти'")
    public void clickButtonLogin() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(buttonLogin));
        driver.findElement(buttonLogin).click();
    }

    @Step("Нажатие псевдоссылки 'Войти'")
    public void clickLoginFromTheForms() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(buttonLoginFromTheForms));
        driver.findElement(buttonLoginFromTheForms).click();
    }

    @Step("Нажатие псевдоссылки 'Восстановить пароль'")
    public void clickButtonRestorePassword() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(buttonRestorePassword));
        driver.findElement(buttonRestorePassword).click();
    }

    @Step("Проверка отображения заголовка 'Вход'")
    public void checkWindowLogin() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(windowLogin));
        assertTrue(driver.findElement(windowLogin).isDisplayed());
    }

    @Step("Проверка отображения заголовка 'Регистрация'")
    public void checkWindowRegistration() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(windowRegistration));
        assertTrue(driver.findElement(windowRegistration).isDisplayed());
    }

    @Step("Проверка отображения заголовка 'Восстановление пароля'")
    public void checkWindowPasswordRecovery() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(windowPasswordRecovery));
        assertTrue(driver.findElement(windowPasswordRecovery).isDisplayed());
    }

    @Step("Ввод email")
    public void setEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }
    @Step("Ввод password")
    public void setPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    @Step("Получить значение поля login")
    public String getLogin() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(loginField));
        WebElement inputElement  = driver.findElement(loginField);
        return inputElement.getAttribute("value");
    }

}
