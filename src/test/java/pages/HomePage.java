package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public String getProfileName() {
        return driver.findElement(By.xpath("//a[@class='account']")).getText();
    }
}
