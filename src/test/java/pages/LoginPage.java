package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage extends BasePage{

	private static final String LOGIN_PAGE_URL = "http://automationpractice.com";
	private By signInButton = By.xpath("//a[@class='login']");
	private By username = By.id("email");
	private By password = By.id("passwd");
	private By submitLoginButton = By.id("SubmitLogin");
	private By alertMessage = By.xpath("//li[.='Invalid email address.']");

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public void navigateToLoginPage() {
		driver.get(LOGIN_PAGE_URL);
	}

	public void clickSignInButton() {
		waitForElementToAppear(driver.findElement(signInButton));
		driver.findElement(signInButton).click();
	}

	public void enterUsername(String username) {
		waitForElementToAppear(driver.findElement(this.username));
		driver.findElement(this.username).sendKeys(username);
	}

	public void enterPassword(String password) {
		waitForElementToAppear(driver.findElement(this.password));
		driver.findElement(this.password).sendKeys(password);
	}

	public void clickLogInButton() {
		waitForElementToAppear(driver.findElement(submitLoginButton));
		driver.findElement(submitLoginButton).click();
	}

	public String getAlertMessage() {
		waitForElementToAppear(driver.findElement(alertMessage));
		return driver
			.findElement(alertMessage).getText();
	}
}
