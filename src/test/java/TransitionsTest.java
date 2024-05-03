import client.StellarBurgersClient;
import client.StellarBurgersClientImple;
import client.User;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import io.restassured.response.ValidatableResponse;
import org.junit.After;
import org.junit.Test;
import pageobject.Transitions;

import static org.hamcrest.Matchers.equalTo;

public class TransitionsTest extends AncestorTest{
    private StellarBurgersClient client;
    private String accessToken;
    private final Transitions transitions =new Transitions(driver);

    @After
    @Step("Удаление пользователя")
    public void deleteUser() {
        if(accessToken != null) {
            ValidatableResponse deleteUserResponse=client.deleteUser(accessToken);
            deleteUserResponse.assertThat().statusCode(202).and().body("success", equalTo(true));
        }
    }

    @Step("Создание пользователя")
    public void createUser() {
        client=new StellarBurgersClientImple();
        User user=User.create("puskin@yandex.ru", "123456", "Puskin");
        ValidatableResponse response=client.createUser(user);
        response.assertThat().statusCode(200).and().body("success", equalTo(true));
        accessToken=response.extract().jsonPath().getString("accessToken").substring(7);
    }

    @Step("Авторизация под пользователем")
    public void login() {
        createUser();
        transitions.clickPersonalArea();
        transitions.checkWindowLogin();
        transitions.clickButtonLogin();
        transitions.setEmail("puskin@yandex.ru");
        transitions.setPassword("123456");
    }

    @Step("Переход в личный кабинет.")
    public void clickPersonalArea() {
        transitions.clickButtonLogin();
        transitions.clickPersonalArea();
    }

    @Step("Проверка - раздел по умолчанию 'Булки'")
    public void checkDefaultSectionBuns() {
        transitions.checkSectionBunsCurrent();
    }

    @Step("Проверка - переход в раздел 'Булки'")
    public void clickSectionBuns() {
        transitions.clickSectionBuns();
        transitions.checkSectionBunsCurrent();
    }

    @Step("Проверка - переход в раздел 'Соусы'")
    public void clickSectionSauces() {
        transitions.clickSectionSauces();
        transitions.checkSectionSaucesCurrent();
    }

    @Step("Проверка - переход в раздел 'Начинки'")
    public void clickSectionFillings() {
        transitions.clickSectionFillings();
        transitions.checkSectionFillingsCurrent();
    }

    @Test
    @Description("Переход из личного кабинета в конструктор клик на конструктор")
    public void transitionFromPersonalAccountToTheConstructorClickConstructor(){
        login();
        clickPersonalArea();
        transitions.clickButtonConstructor();
        transitions.checkWindowAssembleTheBurger();
    }
    @Test
    @Description("Переход из личного кабинета в конструктор клик на логотип")
    public void transitionFromPersonalAccountToTheConstructorClickLogo(){
        login();
        clickPersonalArea();
        transitions.clickButtonLogo();
        transitions.checkWindowAssembleTheBurger();
    }

    @Test
    @Description("Проверка переходов к разделам 'Булки', 'Соусы', 'Начинки'")
    public void check(){
        checkDefaultSectionBuns();
        clickSectionSauces();
        clickSectionFillings();
        clickSectionBuns();
    }

}
