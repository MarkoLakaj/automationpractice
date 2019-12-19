package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author : bojana bajovic
 * @TestLink ID = AP-15 : Login with invalid email, without @
 * @Summary = The test case is to check the login functionality with invalid email. Checks that returns alert message.
 */
public class BbLoginWithInvalidEmail {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void loginWithInvalidEmail() throws InterruptedException{

        driver.get("http://automationpractice.com/");
        driver.findElement(By.xpath("//a[@class='login']")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys("bokicabajovicyahoo.com");
        driver.findElement(By.id("passwd")).sendKeys("admin");
        driver.findElement(By.id("SubmitLogin")).click();

        String alertMessage = driver.findElement(By.xpath("//li[contains(text(),'Invalid email address.')]")).getText();
        assertEquals(alertMessage, "Invalid email address.");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
