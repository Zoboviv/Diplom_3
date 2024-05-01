import org.junit.Test;
import pageobject.Locators;
import pageobject.Registration;

public class RegistrationTest extends AncestorTest{
    @Test
    public void test(){
        Registration registration = new Registration(driver);
        registration.clickPersonalArea();
        registration.checkWindowLogin();
        registration.clickButtonRegister();
        registration.checkWindowRegistration();
        registration.setName("");
        registration.setEmail("");
        registration.setPassword("");
    }

}
