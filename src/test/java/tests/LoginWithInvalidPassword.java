package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;

/**
 * @author : marko lakaj
 * @Summary = User should not be able to login with invalid password
 */
public class LoginWithInvalidPassword extends BaseTest{


	@Test
	public void loginWithValidCredentials() {

		//Initialize pages
		LoginPage loginPage = new LoginPage(getDriver());


		loginPage.navigateToLoginPage();
		loginPage.clickSignInButton();
		loginPage.enterUsername("marko");
		loginPage.enterPassword("lakaj");
		loginPage.clickLogInButton();

		Assert.assertEquals(loginPage.getAlertMessage(), "Invalid email address.");

	}
}
