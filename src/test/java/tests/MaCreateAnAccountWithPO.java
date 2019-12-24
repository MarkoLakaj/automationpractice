package tests;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CreateAnAccountPage;
import pages.HomePage;
import pages.LoginPage;
import pages.BasePage;


public class MaCreateAnAccountWithPO extends BasePage{
    CreateAnAccountPage createAnAccount = new CreateAnAccountPage();
    HomePage HomePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @BeforeTest
    public void setUp() {
        setUp();
    }

    @Test
    public void Create() throws InterruptedException {
        navigateToUrl("http://automationpractice.com");
        loginPage.clickSignInButton();
        Thread.sleep(2000);
        createAnAccount.setEmail("");
        Thread.sleep(2000);
        createAnAccount.clickCreateAnAccountButton();
        assertEquals(createAnAccount.getPageHeading(), "AUTHENTICATION");
        Thread.sleep(2000);
        createAnAccount.checkRadioFemale();
        createAnAccount.setFirstName("Maja");
        createAnAccount.setLastName("Andjelkovic");
        createAnAccount.setPassword("ksajdsakd");
        createAnAccount.setDayOfBirth("27");
        createAnAccount.setMonthOfBirth("5");
        createAnAccount.setYearOfBirth("1995");
        createAnAccount.clickNewsletter();
        createAnAccount.clickSpecialOffers();
        createAnAccount.setCompany("bla bla");
        createAnAccount.setMainAddress("Cirpanova");
        createAnAccount.setSecondaryAddress("Cirpanovaa");
        createAnAccount.setCity("Novi Sad");
        createAnAccount.setState("Alaska");
        createAnAccount.setZip("00000");
        createAnAccount.setInformations("Caoooooo, neka se iskucka tekst ovdeeeee bla bla bla");
        createAnAccount.setHomePhone("6565654848");
        createAnAccount.setMobilePhone("448426626");
        createAnAccount.setLastAddress("Cirpanovaaaaa");
        createAnAccount.clickRegistrationButton();
        assertEquals(HomePage.getProfileName(), "Maja Andjelkovic");
        Thread.sleep(2000);
    }

    @AfterTest
    public void closeApp() {}
}
