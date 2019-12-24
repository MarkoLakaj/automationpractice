package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

   public static WebDriver driver;

    public BasePage() {
    }

    public void navigateToUrl(String url) {
        driver.get(url);
    }

    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void closeApp() {
        driver.quit();
    }

//    public void clickOnElement() {
//        driver.findElement().click();
//    }
//
//    public void sendKeys() {
//        driver.findElement().sendKeys();
//        }



    }
