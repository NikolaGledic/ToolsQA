package PagesToolsQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    WebDriver driver;
    WebElement username;
    WebElement password;
    WebElement loginButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getUsername() {
        return driver.findElement(By.id("userName"));
    }

    public WebElement getPassword() {
        return driver.findElement(By.id("password"));
    }

    public WebElement getLoginButton() {
        return driver.findElement(By.id("login"));
    }

    //---------------------------------------

    public void insertUsername(String username){
        getUsername().clear();
        getUsername().sendKeys(username);
    }

    public void insertPassword(String password){
        getPassword().clear();
        getPassword().sendKeys(password);
    }

    public void clickLogin(){
        getLoginButton().click();
    }
}
