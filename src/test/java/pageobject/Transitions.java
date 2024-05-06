package pageobject;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class Transitions extends Locators{
    public WebDriver driver;


    //конструктор класса
    public Transitions(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Нажатие кнопки 'Личный кабинет'")
    public void clickPersonalArea() {
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.findElement(buttonPersonalArea).click();
    }

    @Step("Нажатие кнопки 'Войти'")
    public void clickButtonLogin() {
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.findElement(buttonLogin).click();
    }

    @Step("Проверка отображения заголовка 'Вход'")
    public void checkWindowLogin() {
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        assertTrue(driver.findElement(windowLogin).isDisplayed());
    }

    @Step("Ввод email")
    public void setEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    @Step("Ввод password")
    public void setPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    @Step("Нажатие кнопки 'Конструктор'")
    public void clickButtonConstructor() {
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.findElement(buttonConstructor).click();
    }

    @Step("Нажатие на 'Логотип'")
    public void clickButtonLogo() {
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.findElement(buttonLogo).click();
    }

    @Step("Проверка отображения заголовка 'Соберите бургер'")
    public void checkWindowAssembleTheBurger() {
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        assertTrue(driver.findElement(windowAssembleTheBurger).isDisplayed());
    }

    @Step("Нажатие на раздел 'Булки'")
    public void clickSectionBuns() {
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.findElement(sectionBuns).click();
    }

    @Step("Нажатие на раздел 'Соусы'")
    public void clickSectionSauces() {
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.findElement(sectionSauces).click();
    }

    @Step("Нажатие на раздел 'Начинки'")
    public void clickSectionFillings() {
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.findElement(sectionFillings).click();
    }

    @Step("Проверка - раздел 'Булки' текущий выбор")
    public void checkSectionBunsCurrent() {
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        assertTrue(driver.findElement(sectionBunsCurrent).isDisplayed());
    }
    @Step("Проверка - раздел 'Соусы' текущий выбор")
    public void checkSectionSaucesCurrent() {
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        assertTrue(driver.findElement(sectionSaucesCurrent).isDisplayed());
    }
    @Step("Проверка - раздел 'Начинки' текущий выбор")
    public void checkSectionFillingsCurrent() {
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        assertTrue(driver.findElement(sectionFillingsCurrent).isDisplayed());
    }

}
