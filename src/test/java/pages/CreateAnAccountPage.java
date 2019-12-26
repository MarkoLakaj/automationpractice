package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;
import java.util.function.Function;

public class CreateAnAccountPage extends BasePage{

    public CreateAnAccountPage() {
    }

    Random randomEmail = new Random();
    int randomInt = randomEmail.nextInt(1000);

    public void setEmail(String strEmail) {

        WebElement element = waitF.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.id("email_create"));
            }
        });
        element.sendKeys("maja" + randomInt + "@yahoo.com");
    }

    public void clickCreateAnAccountButton() {
        By clickCreateAnAccountButtonLocator = By.xpath("//form[@id='create-account_form']//span[1]");
        clickOnElement(clickCreateAnAccountButtonLocator);
    }

    public void setFirstName(String strFirstName) {
        driver.findElement(By.id("customer_firstname")).sendKeys(strFirstName);
    }

    public void setLastName(String strLastName) {
        driver.findElement(By.id("customer_lastname")).sendKeys(strLastName);
    }

    public void checkRadioFemale() {
        By checkRadioFemaleLocator = By.id("id_gender2");
        clickOnElement(checkRadioFemaleLocator);
    }

    public void setPassword(String strPassword) {
        driver.findElement(By.id("passwd")).sendKeys(strPassword);
    }

    public void setDayOfBirth(String yourDay) {
        Select daysOfBirth = new Select(driver.findElement(By.id("days")));
        daysOfBirth.selectByValue(yourDay);
    }

    public void setMonthOfBirth(String yourMonth) {
        Select monthsOfBirth = new Select(driver.findElement(By.id("months")));
        monthsOfBirth.selectByValue(yourMonth);
    }

    public void setYearOfBirth(String yourYear) {
        Select yearsOfBirth = new Select(driver.findElement(By.id("years")));
        yearsOfBirth.selectByValue(yourYear);
    }

    public void clickNewsletter() {
        By clickNewsletterLocator = By.id("newsletter");
        clickOnCheckbox(clickNewsletterLocator);
    }

    public void clickSpecialOffers() {
        By clickSpecialOffersLocator = By.id("optin");
        clickOnCheckbox(clickSpecialOffersLocator);
    }

    public void setCompany(String strCompany) {
        driver.findElement(By.id("company")).sendKeys(strCompany);
    }

    public void setMainAddress(String strAddress1) {
        driver.findElement(By.id("address1")).sendKeys(strAddress1);
    }

    public void setSecondaryAddress(String strAddress2) {
        driver.findElement(By.id("address2")).sendKeys(strAddress2);
    }

    public void setCity(String strCity) {
        driver.findElement(By.id("city")).sendKeys(strCity);
    }

    public void setState(String strState) {
        driver.findElement(By.id("id_state")).sendKeys(strState);
    }

    public void setZip(String strZip) {
        driver.findElement(By.id("postcode")).sendKeys(strZip);
    }

    public void setCountry(String strCountry) {
        driver.findElement(By.id("id_country")).sendKeys(strCountry);
    }

    public void setInformations(String strInformations) {
        driver.findElement(By.id("other")).sendKeys(strInformations);
    }

    public void setHomePhone(String strHomePhone) {
        driver.findElement(By.id("phone")).sendKeys(strHomePhone);
    }

    public void setMobilePhone(String strMobilePhone) {
        driver.findElement(By.id("phone_mobile")).sendKeys(strMobilePhone);
    }

    public void setLastAddress(String strLastAddress) {
        driver.findElement(By.id("alias")).clear();
        driver.findElement(By.id("alias")).sendKeys(strLastAddress);
    }

    public void clickRegistrationButton() {
        By clickRegistrationButtonLocator = By.xpath("//span[contains(text(),'Register')]");
        clickOnElement(clickRegistrationButtonLocator);
    }

    public String getPageHeading() {
        return driver.findElement(By.xpath("//h1[@class='page-heading']")).getText();
    }
    }

