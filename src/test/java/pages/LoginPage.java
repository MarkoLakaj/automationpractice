package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

//    click sign in button
    public void clickSignInButton() {
    driver.findElement(By.xpath("//a[@class='login']")).click();
    }

//    Set email in textbox
    public void setEmail(String email) {
        driver.findElement(By.id("email")).sendKeys(email);
    }

//    Set password in textbox
    public void setPassword(String password) {
        driver.findElement(By.id("passwd")).sendKeys(password);
    }

//    Click on login button
    public void clickLogin() {
        driver.findElement(By.id("SubmitLogin")).click();
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
