import client.StellarBurgersClient;
import client.StellarBurgersClientImple;
import client.User;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import io.restassured.response.ValidatableResponse;
import org.junit.After;
import org.junit.Test;
import pageobject.Login;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;

public class LoginTest extends AncestorTest{
    private StellarBurgersClient client;
    private String accessToken;
    private final Login login =new Login(driver);

    @After
    @Step("Удаление пользователя")
    public void deleteUser() {
        ValidatableResponse deleteUserResponse=client.deleteUser(accessToken);
        deleteUserResponse.assertThat().statusCode(202).and().body("success", equalTo(true));
    }

    @Step("Создание пользователя")
    public void createUser() {
        client=new StellarBurgersClientImple();
        User user=User.create("puskin@yandex.ru", "123456", "Puskin");
        ValidatableResponse response=client.createUser(user);
        response.assertThat().statusCode(200).and().body("success", equalTo(true));
        accessToken=response.extract().jsonPath().getString("accessToken").substring(7);
    }
    @Step("Переход в личный кабинет. Проверка - вход выполнен под созданным пользователем")
    public void checkLoginUsingTheCreatedUser() {
        login.clickButtonLogin();
        login.clickPersonalArea();
        assertEquals("puskin@yandex.ru", login.getLogin());
        assertEquals("Puskin", login.getName());
    }
    @Step("Выход по кнопке «Выйти» в личном кабинете")
    public void logout() {
        login.clickButtonLogout();
        login.checkWindowLogin();
    }


    @Test
    @Description("Вход по кнопке «Войти в аккаунт» на главной")
    public void test1(){
        createUser();
        login.clickLoginToAccount();
        login.checkWindowLogin();
        login.setEmail("puskin@yandex.ru");
        login.setPassword("123456");
        checkLoginUsingTheCreatedUser();
        logout();
    }

    @Test
    @Description("Вход через кнопку «Личный кабинет»")
    public void test2(){
        createUser();
        Login login =new Login(driver);
        login.clickPersonalArea();
        login.checkWindowLogin();
        login.setEmail("puskin@yandex.ru");
        login.setPassword("123456");
        checkLoginUsingTheCreatedUser();
        logout();
    }

    @Test
    @Description("Вход через кнопку в форме регистрации")
    public void test3(){
        createUser();
        Login login =new Login(driver);
        login.clickPersonalArea();
        login.clickButtonLinkRegister();
        login.checkWindowRegistration();
        login.clickLoginFromTheForms();
        login.setEmail("puskin@yandex.ru");
        login.setPassword("123456");
        checkLoginUsingTheCreatedUser();
        logout();
    }

    @Test
    @Description("Вход через кнопку в форме восстановления пароля")
    public void test4(){
        createUser();
        Login login =new Login(driver);
        login.clickPersonalArea();
        login.clickButtonRestorePassword();
        login.checkWindowPasswordRecovery();
        login.clickLoginFromTheForms();
        login.setEmail("puskin@yandex.ru");
        login.setPassword("123456");
        checkLoginUsingTheCreatedUser();
        logout();
    }

}
