package PagesToolsQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ElementsPage {

    public WebDriver driver;
    List<WebElement> allElementsTab;

    public ElementsPage(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> getAllElementsTab() {
        return driver.findElements(By.cssSelector(".btn.btn-light"));
    }

    //*****************************************

    public void clickOnTextBox(){
        getAllElementsTab().get(0).click();
    }

    public void clickOnCheckBox(){
        getAllElementsTab().get(1).click();
    }
    public void clickOnRadioButton(){
        getAllElementsTab().get(2).click();
    }
    public void clickOnWebTables(){
        getAllElementsTab().get(3).click();
    }
    public void clickOnButtons(){
        getAllElementsTab().get(4).click();
    }
    public void clickOnLinks(){
        getAllElementsTab().get(5).click();
    }
    public void clickOnBrokenLinks(){
        getAllElementsTab().get(6).click();
    }
    public void clickOnUploadAndDownload(){
        getAllElementsTab().get(7).click();
    }
    public void clickOnDynamicProperties(){
        getAllElementsTab().get(8).click();
    }
}
