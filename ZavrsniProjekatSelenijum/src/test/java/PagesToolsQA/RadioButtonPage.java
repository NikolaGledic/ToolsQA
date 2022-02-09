package PagesToolsQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RadioButtonPage {

    WebDriver driver;
    List<WebElement> options;
    WebElement message;

    public RadioButtonPage(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> getOptions() {
        return driver.findElements(By.className("custom-control-label"));
    }

    public WebElement getMessage() {
        return driver.findElement(By.className("text-success"));
    }



    //****************************************************

    public void selectYes() {
        getOptions().get(0).click();
    }

    public void selectImpressive() {
        getOptions().get(1).click();
    }

    public void selectNo() {
        getOptions().get(2).click();
    }

    public String message(){
        return getMessage().getText();
    }



}
