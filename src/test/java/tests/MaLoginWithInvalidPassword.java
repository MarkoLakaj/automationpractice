package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * @author maja andjelkovic
 * @TestLink ID = ne mogu da vidim, ne radi test link
 * @Summary = lVerify that user can't be able to login with invalid password.
 */
public class MaLoginWithInvalidPassword {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void loginWithInvalidPassword() throws InterruptedException {
    driver.get("http://automationpractice.com");
    driver.findElement(By.xpath("//a[@class='login']")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("email")).sendKeys("maja.27@yahoo.com");
    driver.findElement(By.id("passwd")).sendKeys("aaa");
    driver.findElement(By.id("SubmitLogin")).click();

    String messageAlert = driver.findElement(By.xpath("//li[contains(text(),'Invalid password.')]")).getText();
    assertEquals(messageAlert, "Invalid password.");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
