package pageobject;

import org.openqa.selenium.By;

public class Locators {

    //локатор кнопка «Войти в аккаунт» на главной
    final By buttonLoginToAccount = By.xpath("//button[text()='Войти в аккаунт']");
    //локатор кнопки "Личный кабинет"
    final By buttonPersonalArea = By.xpath("//p[text()='Личный Кабинет']");
    //локатор псевдоссылки "Войти" в формах регистрации и восстановления пароля
    final By buttonLoginFromTheForms = By.xpath("//a[text()='Войти']");
    //локатор окна "Вход"
    final By windowLogin = By.xpath("//h2[text()='Вход']");
    //локатор окна "Регистрация"
    final By windowRegistration = By.xpath("//h2[text()='Регистрация']");
    //локатор окна "Восстановление пароля"
    final By windowPasswordRecovery = By.xpath("//h2[text()='Восстановление пароля']");
    //локатор "Email"
    final By emailField = By.xpath("//label[text()='Email']/following-sibling::*");
    //локатор "Пароль"
    final By passwordField = By.xpath("//label[text()='Пароль']/following-sibling::*");
    //локатор "Пароль"
    final By loginField = By.xpath("//label[text()='Логин']/following-sibling::input");
    //локатор "Имя"
    final By nameField = By.xpath("//label[text()='Имя']/following-sibling::*");
    //локатор псевдоссылки "Зарегистрироваться"
    final By buttonLinkRegister = By.xpath("//a[text()='Зарегистрироваться']");
    //локатор кнопка "Зарегистрироваться"
    final By buttonLogin = By.xpath("//button[text()='Войти']");
    //локатор кнопка "Зарегистрироваться"
    final By buttonRegister = By.xpath("//button[text()='Зарегистрироваться']");
    //локатор кнопка "Восстановить пароль"
    final By buttonRestorePassword = By.xpath("//a[text()='Восстановить пароль']");
    //локатор ошибки "Некорректный пароль"
    final By textIncorrectPassword = By.xpath("//p[text()='Некорректный пароль']");

}
