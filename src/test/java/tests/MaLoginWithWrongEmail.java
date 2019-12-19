package tests;

import static org.testng.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author maja andjelkovic
 * @TestLink ID = ne mogu da vidim, ne radi test link
 * @Summary = Verify if user will be able to login with wrong email.
 */
public class MaLoginWithWrongEmail {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void loginWithWrongEmail() throws InterruptedException {
        driver.get("http://automationpractice.com/");
        driver.findElement(By.xpath("//a[@class='login']")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys("maja@yahoo.com");
        driver.findElement(By.id("passwd")).sendKeys("caocaocao");
        driver.findElement(By.id("SubmitLogin")).click();

        String messageAlert = driver.findElement(By.xpath("//li[contains(text(),'Authentication failed.')]")).getText();
        assertEquals(messageAlert, "Authentication failed.");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
