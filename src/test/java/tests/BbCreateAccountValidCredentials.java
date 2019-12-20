package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

/**
 * @author : bojana bajovic
 * @TestLink ID = AP-15 : Create an account with blank email and password fields
 * @Summary = The test case is to check the login functionality with blank email and password fields. Checks that returns alert message.
 */
public class BbCreateAccountValidCredentials {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        //driver.manage().window().maximize();
    }

    @Test
    public void createAccountValidCredentials() throws InterruptedException {

        driver.get("http://automationpractice.com/");
        driver.findElement(By.xpath("//a[@class='login']")).click();
        Thread.sleep(2000);

        Random randomEmail = new Random();
        int randomInt = randomEmail.nextInt(1000);

        driver.findElement(By.id("email_create")).sendKeys("username"+ randomInt +"@gmail.com");
        driver.findElement(By.id("SubmitCreate")).click();
        Thread.sleep(2000);

        String createAccountTitle = driver.findElement(By.className("page-heading")).getText();
        assertTrue(createAccountTitle.contains("CREATE AN ACCOUNT"));

        WebElement radio1 = driver.findElement(By.id("id_gender2"));
        radio1.click();

        WebElement firstName = driver.findElement(By.id("customer_firstname"));
        firstName.sendKeys("Dragana");

        WebElement lastName = driver.findElement(By.id("customer_lastname"));
        lastName.sendKeys("Draganovic");

        WebElement password = driver.findElement(By.id("passwd"));
        password.sendKeys("dragana");

        Select days = new Select(driver.findElement(By.id("days")));
        //days.selectByVisibleText("10");
        days.selectByIndex(19);

        Select months = new Select(driver.findElement(By.id("months")));
        //months.selectByVisibleText("May");
        months.selectByIndex(4);

        Select years = new Select(driver.findElement(By.id("years")));
        //years.selectByVisibleText("1986");
        years.selectByIndex(35);

        WebElement newsletter = driver.findElement(By.id("newsletter"));
        newsletter.click();

//        WebElement firstNameAddress = driver.findElement(By.id("firstname"));
//        firstNameAddress.sendKeys("");

        WebElement company = driver.findElement(By.id("company"));
        company.sendKeys("Hybrid IT Solutions");

        WebElement address1 = driver.findElement(By.id("address1"));
        address1.sendKeys("Bulevar Oslobodjenja");


        WebElement address2 = driver.findElement(By.id("address2"));
        address2.sendKeys("Slovacka 15");
        Thread.sleep(2000);

        WebElement city = driver.findElement(By.id("city"));
        city.sendKeys("Novi Sad");

        Select state = new Select(driver.findElement(By.id("id_state")));
        state.selectByVisibleText("Alaska");

        WebElement zipCode = driver.findElement(By.id("postcode"));
        zipCode.sendKeys("21000");

        Select country = new Select(driver.findElement(By.id("id_country")));
        country.selectByVisibleText("United States");

        WebElement additionalInformation = driver.findElement(By.id("other"));
        additionalInformation.sendKeys("This is a text box to leave a message");

        WebElement homePhone = driver.findElement(By.id("phone"));
        homePhone.sendKeys("+381215556666");

        WebElement mobilePhone = driver.findElement(By.id("phone_mobile"));
        mobilePhone.sendKeys("+381654545254");

        WebElement alias = driver.findElement(By.id("alias"));
        alias.clear();
        alias.sendKeys("Bulevar Oslobodjenja 20");

       driver.findElement(By.xpath("//span[contains(text(),'Register')]")).click();
        //submitButton.click();
        Thread.sleep(2000);

        String profileName = driver.findElement(By.xpath("//a[@class ='account']")).getText();
        assertEquals(profileName, "Dragana Draganovic");

    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
