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


public class MaLoginWithValidCredentialsWithPO extends BasePage{
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();


    @BeforeTest
    public void setup() {
        setUp();
    }

    @Test
    public void Login() throws InterruptedException{
        navigateToUrl("http://automationpractice.com");
        Thread.sleep(2000);
        loginPage.clickSignInButton();
        loginPage.setEmail("maja.27@yahoo.com");
        loginPage.setPassword("caocaocao");
        loginPage.clickLogin();
        assertEquals(homePage.getProfileName(), "Maja Andjelkovic");
    }

    @AfterTest
    public void closeApp() {
    }
}




