package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {
    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUrl(String url) {
        driver.get(url);
    }

    public void setUp() {
        driver.manage().window().maximize();
    }

//    public void clickOnElement() {
//        driver.findElement().click();
//    }
//
//    public void sendKeys() {
//        driver.findElement().sendKeys();
//        }



    }
