package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAnAccountHomePage {
    WebDriver driver;

    public CreateAnAccountHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getProfileName() {
        return driver.findElement(By.xpath("//a[@class='account']")).getText();
    }
}
