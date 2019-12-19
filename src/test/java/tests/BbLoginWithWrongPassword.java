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
 * @TestLink ID = AP-15 : Login with wrong password
 * @Summary = The test case is to check the login functionality with wrong password. Checks that returns alert message.
 */
public class BbLoginWithWrongPassword {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void loginWithWrongPassword() throws InterruptedException{

        driver.get("http://automationpractice.com/");
        driver.findElement(By.xpath("//a[@class='login']")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys("bokicabajovic@yahoo.com");
        driver.findElement(By.id("passwd")).sendKeys("wrongpass");
        driver.findElement(By.id("SubmitLogin")).click();

        String alertMessage = driver.findElement(By.xpath("//li[contains(text(),'Authentication failed.')]")).getText();
        assertEquals(alertMessage, "Authentication failed.");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
