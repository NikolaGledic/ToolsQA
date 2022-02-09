package PagesToolsQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextBoxPage {

    public WebDriver driver;
    WebElement fullName;
    WebElement email;
    WebElement currentAddress;
    WebElement permanentAddress;
    WebElement submitButton;
    WebElement submittedName;
    WebElement submittedEmail;
    WebElement submittedCurrentAddress;
    WebElement submittedPermanentAddress;

    public TextBoxPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getFullName() {
        return driver.findElement(By.id("userName"));
    }

    public WebElement getEmail() {
        return driver.findElement(By.id("userEmail"));
    }

    public WebElement getCurrentAddress() {
        return driver.findElement(By.id("currentAddress"));
    }

    public WebElement getPermanentAddress() {
        return driver.findElement(By.id("permanentAddress"));
    }

    public WebElement getSubmitButton() {
        return driver.findElement(By.id("submit"));
    }

    public WebElement getSubmittedName() {
        return driver.findElement(By.id("name"));
    }

    public WebElement getSubmittedEmail() {
        return driver.findElement(By.id("email"));
    }

    public WebElement getSubmittedCurrentAddress() {
        return driver.findElement(By.id("currentAddress"));
    }

    public WebElement getSubmittedPermanentAddress() {
        return driver.findElement(By.id("permanentAddress"));
    }

    //**********************************************************

    public void insertFullName(String fullName){
        getFullName().clear();
        getFullName().sendKeys(fullName);
    }

    public void insertEmail(String fullName){
        getEmail().clear();
        getEmail().sendKeys(fullName);
    }

    public void insertCurrentAddress(String fullName){
        getCurrentAddress().clear();
        getCurrentAddress().sendKeys(fullName);
    }

    public void insertPermanentAddress(String fullName){
        getPermanentAddress().clear();
        getPermanentAddress().sendKeys(fullName);
    }

    public void clickOnSubmit(){
        getSubmitButton().click();
    }
}
