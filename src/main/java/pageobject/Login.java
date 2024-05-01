package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login extends Locators{
    public WebDriver driver;
    //конструктор класса
    public Login(WebDriver driver) {
        this.driver = driver;
    }


}
