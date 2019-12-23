package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    By signIn = By.xpath("//a[@class='account']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getProfileName() {
        return driver.findElement(signIn).getText();
    }
}
