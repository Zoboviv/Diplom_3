package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationAndLogin {
    public WebDriver driver;
    //конструктор класса
    public RegistrationAndLogin(WebDriver driver) {
        this.driver = driver;
    }

    //локатор "Личный кабинет"
    private final By buttonPersonalArea = By.xpath("//p[text()='Личный Кабинет']");
    //локатор "Имя"
    private final By nameField = By.xpath("//label[text()='Имя']");
    //локатор "Email"
    private final By emailField = By.xpath("//label[text()='Email']");
    //локатор "Пароль"
    private final By passwordField = By.xpath("//label[text()='Пароль']");
    //локатор "Войти"
    private final By buttonLogin = By.xpath("//button[text()='Войти']");
    //локатор ссылка "Зарегистрироваться"
    private final By linkRegister = By.xpath("//a[text()='Зарегистрироваться']");
    //локатор кнопка "Зарегистрироваться"
    private final By buttonRegister = By.xpath("//button[text()='Зарегистрироваться']");
    //локатор окна "Регистрация"
    private final By windowRegistration = By.xpath("//h2[text()='Регистрация']");
    //локатор окна "Вход"
    private final By windowLogin = By.xpath("//h2[text()='Вход']");
    //локатор ошибки "Некорректный пароль"
    private final By textIncorrectPassword = By.xpath("//p[text()='Некорректный пароль']");

}
