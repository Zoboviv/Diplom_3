package pageobject;

import org.openqa.selenium.WebDriver;

public class Constructor extends Locators{
    public WebDriver driver;

    //конструктор класса
    public Constructor(WebDriver driver) {
        this.driver = driver;
    }


}
