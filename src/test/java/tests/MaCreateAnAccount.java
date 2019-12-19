package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * @author maja andjelkovic
 * @TestLink ID = ne mogu da vidim, ne radi test link
 * @Summary = Verify that user can create an account with valid
 */
public class MaCreateAnAccount {
    WebDriver driver;

    @BeforeClass
    public void setUp () {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void createAnAccountWithValidCredentials () throws InterruptedException {
        driver.get("http://automationpractice.com/");
        driver.findElement(By.xpath("//a[@class='login']")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("email_create")).sendKeys("maja@yahoo.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//form[@id='create-account_form']//span[1]")).click();

        String createAnAccountTittle = driver.findElement(By.className("page-heading")).getText();
        assertEquals(createAnAccountTittle, "AUTHENTICATION");
//        assertTrue(createAnAccountTittle.contains("CREATE AN ACCOUNT"));

        WebElement radio1 = driver.findElement(By.id("uniform-id_gender2"));
        radio1.click();

    }

    //@AfterClass
    //public void tearDown() {
    //   driver.quit();
    //}

}
