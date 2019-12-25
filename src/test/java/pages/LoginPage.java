package pages;
import org.openqa.selenium.By;

public class LoginPage extends BasePage{

    public LoginPage() {
    }

    //    click sign in button
    public void clickSignInButton() {
        By signInButtonLocator = By.xpath("//a[@class='login']");
        clickOnElement(signInButtonLocator);
    }

//    Set email in textbox
    public void setEmail(String email) {
        By emailLocator = By.id("email");
        sendKeysInElement(emailLocator, email);
    }

//    Set password in textbox
    public void setPassword(String password) {
        By passwordLocator = By.id("passwd");
        sendKeysInElement(passwordLocator, password);
    }

//    Click on login button
    public void clickLogin() {
        By clickLoginLocator = By.id("SubmitLogin");
        clickOnElement(clickLoginLocator);
    }

}
