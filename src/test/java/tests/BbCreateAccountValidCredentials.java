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
        driver.findElement(By.id("email_create")).sendKeys("dragana@yahoo.com");
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

    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
