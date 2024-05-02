import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AncestorTest {

    WebDriver driver=getWebDriver(false);//true для FirefoxDriver

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

}
