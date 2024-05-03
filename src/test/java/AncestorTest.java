import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AncestorTest {

    WebDriver driver = getWebDriver(true);//true для Yandex

    public static ChromeDriver getWebDriver(boolean useYandex) {
        if (useYandex) {
            System.setProperty("webdriver.chrome.driver","D:\\WebDriver\\yandexdriver\\yandexdriver.exe");
        } else {
            System.setProperty("webdriver.chrome.driver","D:\\WebDriver\\chromedriver\\chromedriver.exe");
        }
        return new ChromeDriver();
    }

    @Before
    public void setUp() {
        driver.get(Constants.WEBSITE);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
