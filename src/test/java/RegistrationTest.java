import io.qameta.allure.Description;
import org.junit.Test;
import pageobject.Registration;

public class RegistrationTest extends AncestorTest{

    @Test
    @Description("Проверка успешной регистрации")
    public void testSuccessfulRegistration(){
        Registration registration = new Registration(driver);
        registration.clickPersonalArea();
        registration.checkWindowLogin();
        registration.clickButtonLinkRegister();
        registration.checkWindowRegistration();
        registration.setName("Puskin");
        registration.setEmail("Puskin@yandex.ru");
        registration.setPassword("123456");
        registration.clickButtonRegister();
        registration.checkWindowLogin();
        login();
        deleteUser();
    }

    @Test
    @Description("Регистрация. Проверка вывода ошибки при вводе пароля. Минимальный пароль — шесть символов.")
    public void testInvalidPassword(){
        Registration registration = new Registration(driver);
        registration.clickLoginToAccount();
        registration.checkWindowLogin();
        registration.clickButtonLinkRegister();
        registration.checkWindowRegistration();
        registration.setPassword("12345");
        registration.clickButtonRegister();
        registration.checkWindowTextIncorrectPassword();
    }

}
