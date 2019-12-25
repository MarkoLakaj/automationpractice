package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.HomePage;
import pages.LoginPage;

import static org.testng.Assert.assertEquals;


public class MaLoginWithValidCredentialsWithPO extends BasePage {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();


    @BeforeTest
    public void setup() {
        setUp();
    }

    @Test
    public void Login() {
        navigateToUrl("http://automationpractice.com");
        loginPage.clickSignInButton();
        loginPage.setEmail("maja.27@yahoo.com");
        loginPage.setPassword("caocaocao");
        loginPage.clickLogin();
        assertEquals(homePage.getProfileName(), "Maja Andjelkovic");
    }

    @AfterTest
    public void closeapp() {
        closeApp();
    }
}




