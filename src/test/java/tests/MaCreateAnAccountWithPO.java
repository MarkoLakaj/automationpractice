package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.CreateAnAccountPage;
import pages.HomePage;
import pages.LoginPage;

import static org.testng.Assert.assertEquals;
import static pages.BasePage.*;


public class MaCreateAnAccountWithPO {

    @BeforeTest
    public void setup() {
        setUp();
    }

    @Test
    public void Create() throws InterruptedException {
        CreateAnAccountPage createAnAccountPage = new CreateAnAccountPage();
        HomePage homePage = new HomePage();
        navigateToUrl("http://automationpractice.com");
        LoginPage loginPage = new LoginPage();
        loginPage.clickSignInButton();
        createAnAccountPage.setEmail("");
        createAnAccountPage.clickCreateAnAccountButton();
        assertEquals(createAnAccountPage.getPageHeading(), "AUTHENTICATION");
        Thread.sleep(2000);
        createAnAccountPage.checkRadioFemale();
        createAnAccountPage.setFirstName("Maja");
        createAnAccountPage.setLastName("Andjelkovic");
        createAnAccountPage.setPassword("ksajdsakd");
        createAnAccountPage.setDayOfBirth("27");
        createAnAccountPage.setMonthOfBirth("5");
        createAnAccountPage.setYearOfBirth("1995");
        createAnAccountPage.clickNewsletter();
        createAnAccountPage.clickSpecialOffers();
        createAnAccountPage.setCompany("bla bla");
        createAnAccountPage.setMainAddress("Cirpanova");
        createAnAccountPage.setSecondaryAddress("Cirpanovaa");
        createAnAccountPage.setCity("Novi Sad");
        createAnAccountPage.setState("Alaska");
        createAnAccountPage.setZip("00000");
        createAnAccountPage.setInformations("Caoooooo, neka se iskucka tekst ovdeeeee bla bla bla");
        createAnAccountPage.setHomePhone("6565654848");
        createAnAccountPage.setMobilePhone("448426626");
        createAnAccountPage.setLastAddress("Cirpanovaaaaa");
        createAnAccountPage.clickRegistrationButton();
        assertEquals(homePage.getProfileName(), "Maja Andjelkovic");
        Thread.sleep(2000);
    }

    @AfterTest
    public void closeapp() {
        closeApp();
    }
}
