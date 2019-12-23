package tests;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CreateAnAccount;
import pages.CreateAnAccountHomePage;

public class MaCreateAnAccount1 {
    String basePath = "http://automationpractice.com";
    WebDriver driver = new ChromeDriver();
    CreateAnAccount createAnAccount = new CreateAnAccount(driver);
    CreateAnAccountHomePage createAnAccountHomePage = new CreateAnAccountHomePage(driver);

    @BeforeTest
    public void setUp() {
        driver.manage().window().maximize();
    }

    @Test
    public void Create() throws InterruptedException {
        createAnAccount.navigateToUrl(basePath);
        createAnAccount.clickSignInButton();
        Thread.sleep(2000);
        createAnAccount.setEmail("");
        Thread.sleep(2000);
        createAnAccount.clickCreateAnAccountButton();
        assertEquals(createAnAccount.getPageHeading(), "AUTHENTICATION");
        Thread.sleep(2000);
        createAnAccount.checkRadio1();
        createAnAccount.setFirstName("Maja");
        createAnAccount.setLastName("Andjelkovic");
        createAnAccount.setPassword("ksajdsakd");
        createAnAccount.setDayOfBirth("27");
        createAnAccount.setMonthOfBirth("5");
        createAnAccount.setYearOfBirth("1995");
        createAnAccount.clickCheck1();
        createAnAccount.clickCheck2();
        createAnAccount.setCompany("bla bla");
        createAnAccount.setAddress1("Cirpanova");
        createAnAccount.setAddress2("Cirpanovaa");
        createAnAccount.setCity("Novi Sad");
        createAnAccount.setState("Alaska");
        createAnAccount.setZip("00000");
        createAnAccount.setInformations("Caoooooo, neka se iskucka tekst ovdeeeee bla bla bla");
        createAnAccount.setHomePhone("6565654848");
        createAnAccount.setMobilePhone("448426626");
        createAnAccount.setLastAddress("Cirpanovaaaaa");
        createAnAccount.clickRegistrationButton();
        assertEquals(createAnAccountHomePage.getProfileName(), "Maja Andjelkovic");
        Thread.sleep(2000);
    }

    @AfterTest
    public void closeApp() {}
}