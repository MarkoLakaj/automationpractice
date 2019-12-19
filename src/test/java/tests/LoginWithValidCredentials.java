package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author : marko lakaj
 * @TestLink ID = AP-15 : Login with correct email and password
 * @Summary = The test case is to check the login functionality with valid email and password.
 */
public class LoginWithValidCredentials {

	WebDriver driver;

	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
	}

	@Test
	public void loginWithValidCredentials() throws InterruptedException{

		driver.get("http://automationpractice.com/");
		driver.findElement(By.xpath("//a[@class='login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("bokicabajovic@yahoo.com");
		driver.findElement(By.id("passwd")).sendKeys("admin");
		driver.findElement(By.id("SubmitLogin")).click();

		String profileName = driver.findElement(By.xpath("//a[@class = 'account']/span")).getText();
		assertEquals(profileName, "Bojana Bajovic");
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
