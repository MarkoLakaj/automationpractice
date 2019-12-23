package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class CreateAnAccount {
    WebDriver driver;

    public CreateAnAccount(WebDriver driver) {
        this.driver = driver;
    }

    Random randomEmail = new Random();
    int randomInt = randomEmail.nextInt(1000);

    public void setEmail(String strEmail) {
        driver.findElement(By.id("email_create")).sendKeys("maja" + randomInt + "@yahoo.com");
    }

    public void clickCreateAnAccountButton() {
        driver.findElement(By.xpath("//form[@id='create-account_form']//span[1]")).click();
    }

    public void setFirstName(String strFirstName) {
        driver.findElement(By.id("customer_firstname")).sendKeys(strFirstName);
    }

    public void setLastName(String strLastName) {
        driver.findElement(By.id("customer_lastname")).sendKeys(strLastName);
    }

    public void checkRadioFemale() {
        driver.findElement(By.id("id_gender2")).click();
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

    //TODO rename u tacnuradnju koju obavlja metoda
    public void clickCheck1() {
        driver.findElement(By.id("newsletter")).click();
    }

    //TODO rename u tacnuradnju koju obavlja metoda
    public void clickCheck2() {
        driver.findElement(By.id("optin")).click();
    }

    // TODO code formatting
    public void setCompany(String strCompany) {
        driver.findElement(By.id("company")).sendKeys(strCompany);
    }

    //TODO rename u tacnuradnju koju obavlja metoda
    public void setAddress1(String strAddress1) {
        driver.findElement(By.id("address1")).sendKeys(strAddress1);
    }

    //TODO rename u tacnuradnju koju obavlja metoda
    public void setAddress2(String strAddress2) {
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
        driver.findElement(By.xpath("//span[contains(text(),'Register')]")).click();
    }

    public String getPageHeading() {
        return driver.findElement(By.xpath("//h1[@class='page-heading']")).getText();
    }

    public void closeApp() {
        driver.quit();
    }
}
