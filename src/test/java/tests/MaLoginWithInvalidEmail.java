package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.BasePage;

import static org.testng.Assert.assertEquals;

/**
 * @author: maja andjelkovic
 * @TestLink ID = ne mogu da vidim, ne radi test link
 * @Summary = Verify that user can't be able to login with invalid email.
 */
public class MaLoginWithInvalidEmail extends BasePage {

    @BeforeClass
    public void setup() {
        setUp();
    }

    @Test
    public void loginWithInvalidEmail() {

        driver.get("http://automationpractice.com/");
        driver.findElement(By.xpath("//a[@class='login']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
        driver.findElement(By.id("email")).sendKeys("maja.27yahoo.com");
        driver.findElement(By.id("passwd")).sendKeys("caocaocao");
        driver.findElement(By.id("SubmitLogin")).click();

        String messageAlert = driver.findElement(By.xpath("//li[contains(text(),'Invalid email address.')]")).getText();
        assertEquals(messageAlert, "Invalid email address.");
    }

    @AfterClass
    public void tearDown() {
        closeApp();
    }
}
