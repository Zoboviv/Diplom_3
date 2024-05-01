import client.Credentials;
import client.StellarBurgersClient;
import client.StellarBurgersClientImple;
import client.User;
import io.qameta.allure.Step;
import io.restassured.response.ValidatableResponse;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.hamcrest.Matchers.equalTo;

public class AncestorTest {

    WebDriver driver=getWebDriver(false);//true для FirefoxDriver
    private StellarBurgersClient client;
    private String accessToken;

    public static WebDriver getWebDriver(boolean useFirefox) {
        if (useFirefox) {
            return new FirefoxDriver();
        } else {
            return new ChromeDriver();
        }
    }

    @Before
    public void setUp() {
        driver.get(Constants.WEBSITE);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Step("Удаление пользователя")
    public void deleteUser() {
        ValidatableResponse deleteUserResponse=client.deleteUser(accessToken);
        deleteUserResponse.assertThat().statusCode(202).and().body("success", equalTo(true));
    }

    @Step("Создание пользователя")
    public void createUser() {
        client=new StellarBurgersClientImple();
        User user=User.create("Puskin@yandex.ru", "123456", "Puskin");
        ValidatableResponse response=client.createUser(user);
        response.assertThat().statusCode(200).and().body("success", equalTo(true));
        accessToken=response.extract().jsonPath().getString("accessToken").substring(7);
    }

    @Step("Логин под существующим пользователем")
    public void login() {
        client=new StellarBurgersClientImple();
        Credentials credentials=Credentials.authorization("Puskin@yandex.ru", "123456");
        ValidatableResponse response=client.login(credentials);
        response.assertThat().statusCode(200).and().body("success", equalTo(true));
        accessToken=response.extract().jsonPath().getString("accessToken").substring(7);
    }

}
