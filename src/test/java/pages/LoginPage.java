package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;
    By email = By.id("email");
    By password = By.id("passwd");
    By login = By.id("SubmitLogin");
    By signin = By.xpath("//a[@class='login']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //    Set url
    public void navigateToUrl(String url) {
        driver.get(url);
    }

//    click sign in button
    public void clickSignInButton() {
    driver.findElement(signin).click();
    }

//    Set email in textbox
    public void setEmail(String email) {
        driver.findElement(this.email).sendKeys(email);
    }

//    Set password in textbox
    public void setPassword(String password) {
        driver.findElement(this.password).sendKeys(password);
    }

//    Click on login button
    public void clickLogin() {
        driver.findElement(login).click();
    }

//  Close app
    public void closeApp() {
        driver.quit();
    }

    public void LoginToAutomationPractice(String strEmail, String strPassword) {
        this.setEmail(strEmail);
        this.setPassword(strPassword);
        this.clickLogin();
    }
}
