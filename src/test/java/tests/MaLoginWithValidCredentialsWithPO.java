package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;
import pages.BasePage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import static org.testng.Assert.*;


public class MaLoginWithValidCredentialsWithPO {
    WebDriver driver = new ChromeDriver();
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    BasePage basePage = new BasePage(driver);

    @BeforeTest
    public void setUp() {
       basePage.setUp();
    }

    @Test
    public void Login() throws InterruptedException{
        basePage.navigateToUrl("http://automationpractice.com");
        Thread.sleep(2000);
        loginPage.clickSignInButton();
        loginPage.setEmail("maja.27@yahoo.com");
        loginPage.setPassword("caocaocao");
        loginPage.clickLogin();
        assertEquals(homePage.getProfileName(), "Maja Andjelkovic");
    }

    @AfterTest
    public void closeApp() {}
}




