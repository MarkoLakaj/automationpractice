package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class MaLoginWithValidCredentials1 {
    String basePath = "http://automationpractice.com";
    WebDriver driver = new ChromeDriver();
    LoginPage loginPage = new LoginPage(driver);

    @BeforeTest
    public void setUp() {
        driver.manage().window().maximize();
    }

    @Test
    public void Login() throws InterruptedException{
        loginPage.navigateToUrl(basePath);
        Thread.sleep(2000);
        loginPage.clickSignInButton();
        loginPage.setEmail("maja.27@yahoo.com");
        loginPage.setPassword("caocaocao");
        loginPage.clickLogin();
    }

    @AfterTest
    public void closeApp() {
        driver.quit();
    }
}




