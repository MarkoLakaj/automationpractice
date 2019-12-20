package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Random;

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

        Random randomEmail = new Random();
        int randomInt = randomEmail.nextInt(1000);

        driver.findElement(By.id("email_create")).sendKeys("username"+ randomInt + "@yahoo.com");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//form[@id='create-account_form']//span[1]")).click();

//      checking if we are on the right page
//        String createAnAccountTittle = driver.findElement(By.className("page-heading")).getText();
//        assertEquals(createAnAccountTittle, "AUTHENTICATION");
//        assertTrue(createAnAccountTittle.contains("CREATE AN ACCOUNT"));
        assertTrue(driver.getCurrentUrl().contains("account-creation"));

        Thread.sleep(2000);

//      checking radio button
        WebElement radio1 = driver.findElement(By.id("id_gender2"));
        radio1.click();

        driver.findElement(By.id("customer_firstname")).sendKeys("Kristina");
        driver.findElement(By.id("customer_lastname")).sendKeys("Kristinic");
        driver.findElement(By.id("passwd")).sendKeys("caocaocao");

//        selecting from drop-down menu
        Select dateOfBirth = new Select(driver.findElement(By.id("days")));
        dateOfBirth.selectByValue("27");

        Select dateOfBirth1 = new Select(driver.findElement(By.id("months")));
        dateOfBirth1.selectByValue("5");

        Select dateOfBirth2 = new Select(driver.findElement(By.id("years")));
        dateOfBirth2.selectByValue("1995");

        WebElement check1 = driver.findElement(By.id("newsletter"));
        WebElement check2 = driver.findElement(By.id("optin"));
        check1.click();
        check2.click();

        driver.findElement(By.id("company")).sendKeys("Zara");
        driver.findElement(By.id("address1")).sendKeys("Cirpanova");
        driver.findElement(By.id("address2")).sendKeys("Cirpanovaaa");
        driver.findElement(By.id("city")).sendKeys("Novi Sad");

        Select state = new Select(driver.findElement(By.id("id_state")));
        state.selectByVisibleText("Vermont");

        driver.findElement(By.id("postcode")).sendKeys("00000");

        Select country = new Select(driver.findElement(By.id("id_country")));
        country.selectByValue("21");

        WebElement text1 = driver.findElement(By.id("other"));
        text1.clear();
        text1.sendKeys("My name is Kristina. I work in Zara and I love fashion.");

        driver.findElement(By.id("phone")).sendKeys("063123456");
        driver.findElement(By.id("phone_mobile")).sendKeys("063456789");

        driver.findElement(By.id("alias")).clear();
        driver.findElement(By.id("alias")).sendKeys("Cirpanovaaaa");
        driver.findElement(By.xpath("//span[contains(text(),'Register')]")).click();

//        checking with string if we are on the right page
        String profileName = driver.findElement(By.xpath("//a[@class='account']")).getText();
        assertEquals(profileName, "Kristina Kristinic");
    }

        @AfterClass
        public void tearDown() {
           driver.quit();
        }

}
