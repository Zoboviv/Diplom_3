import client.Credentials;
import client.StellarBurgersClient;
import client.StellarBurgersClientImple;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import io.restassured.response.ValidatableResponse;
import org.junit.Test;
import pageobject.Registration;

import static org.hamcrest.Matchers.equalTo;

public class RegistrationTest extends AncestorTest{
    private StellarBurgersClient client;
    private String accessToken;
    private final Registration registration = new Registration(driver);


    @Step("Удаление пользователя")
    public void deleteUser() {
        ValidatableResponse deleteUserResponse=client.deleteUser(accessToken);
        deleteUserResponse.assertThat().statusCode(202).and().body("success", equalTo(true));
    }

    @Step("Логин под существующим пользователем")
    public void login() {
        client=new StellarBurgersClientImple();
        Credentials credentials=Credentials.authorization("puskin@yandex.ru", "123456");
        ValidatableResponse response=client.login(credentials);
        response.assertThat().statusCode(200).and().body("success", equalTo(true));
        accessToken=response.extract().jsonPath().getString("accessToken").substring(7);
    }

    @Test
    @Description("Проверка успешной регистрации")
    public void testSuccessfulRegistration(){
        registration.clickPersonalArea();
        registration.checkWindowLogin();
        registration.clickButtonLinkRegister();
        registration.checkWindowRegistration();
        registration.setName("Puskin");
        registration.setEmail("puskin@yandex.ru");
        registration.setPassword("123456");
        registration.clickButtonRegister();
        registration.checkWindowLogin();
        login();
        deleteUser();
    }

    @Test
    @Description("Регистрация. Проверка вывода ошибки при вводе пароля. Минимальный пароль — шесть символов.")
    public void testInvalidPassword(){
        registration.clickLoginToAccount();
        registration.checkWindowLogin();
        registration.clickButtonLinkRegister();
        registration.checkWindowRegistration();
        registration.setPassword("12345");
        registration.clickButtonRegister();
        registration.checkWindowTextIncorrectPassword();
    }

}
