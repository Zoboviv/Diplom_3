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
    //локатор окна "Вход"
    final By windowAssembleTheBurger = By.xpath("//h1[text()='Соберите бургер']");
    //локатор окна "Регистрация"
    final By windowRegistration = By.xpath("//h2[text()='Регистрация']");
    //локатор окна "Восстановление пароля"
    final By windowPasswordRecovery = By.xpath("//h2[text()='Восстановление пароля']");
    //локатор "Email"
    final By emailField = By.xpath("//label[text()='Email']/following-sibling::input");
    //локатор "Пароль"
    final By passwordField = By.xpath("//label[text()='Пароль']/following-sibling::input");
    //локатор "Пароль"
    final By loginField = By.xpath("//label[text()='Логин']/following-sibling::input");
    //локатор "Имя"
    final By nameField = By.xpath("//label[text()='Имя']/following-sibling::input");
    //локатор псевдоссылки "Зарегистрироваться"
    final By buttonLinkRegister = By.xpath("//a[text()='Зарегистрироваться']");
    //локатор кнопка "Зарегистрироваться"
    final By buttonLogin = By.xpath("//button[text()='Войти']");
    //локатор кнопка "Зарегистрироваться"
    final By buttonRegister = By.xpath("//button[text()='Зарегистрироваться']");
    //локатор кнопка "Выход"
    final By buttonLogout = By.xpath("//button[text()='Выход']");
    //локатор кнопка "Восстановить пароль"
    final By buttonRestorePassword = By.xpath("//a[text()='Восстановить пароль']");
    //локатор ошибки "Некорректный пароль"
    final By textIncorrectPassword = By.xpath("//p[text()='Некорректный пароль']");
    //локатор кнопка "Зарегистрироваться"
    final By buttonConstructor = By.xpath("//p[text()='Конструктор']");
    //локатор кнопка "Зарегистрироваться"
    final By buttonLogo = By.xpath("//div[(@class = 'AppHeader_header__logo__2D0X2')]");
    //локатор раздел "Булки"
    final By sectionBuns = By.xpath("//span[(text()= 'Булки')]/parent::div");
    //локатор раздел "Соусы"
    final By sectionSauces = By.xpath("//span[(text()= 'Соусы')]/parent::div");
    //локатор раздел "Начинки"
    final By sectionFillings = By.xpath("//span[(text()= 'Начинки')]/parent::div");
    //локатор раздел "Булки"
    final By sectionBunsCurrent = By.xpath("//span[(text()= 'Булки')]/parent::div[contains(@class,'tab_tab_type_current')]");
    //локатор раздел "Соусы"
    final By sectionSaucesCurrent = By.xpath("//span[(text()= 'Соусы')]/parent::div[contains(@class,'tab_tab_type_current')]");
    //локатор раздел "Начинки"
    final By sectionFillingsCurrent = By.xpath("//span[(text()= 'Начинки')]/parent::div[contains(@class,'tab_tab_type_current')]");

}
