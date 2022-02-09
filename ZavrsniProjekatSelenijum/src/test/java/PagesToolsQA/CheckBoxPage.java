package PagesToolsQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckBoxPage {

    public WebDriver driver;
    List<WebElement> dropDownButtons;
    List<WebElement> allCheckedCheckboxes;
    List<WebElement> allUncheckedCheckboxes;
    WebElement message;

    public CheckBoxPage(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> getDropDownButtons() {
        return driver.findElements(By.cssSelector(".rct-collapse.rct-collapse-btn"));
    }

    public List<WebElement> getAllCheckedCheckboxes() {
        return driver.findElements(By.cssSelector(".rct-icon.rct-icon-check"));
    }

    public List<WebElement> getAllUncheckedCheckboxes() {
        return driver.findElements(By.cssSelector(".rct-icon.rct-icon-uncheck"));
    }

    public WebElement getMessage() {
        return driver.findElement(By.className("text-success"));
    }


    //*************************************************

    public void clickOnDropdownButton(int i){
        getDropDownButtons().get(i).click();
    }

    public void clickOnUncheckedCheckboxButton(int i){
        getAllUncheckedCheckboxes().get(i).click();
    }

    public void clickOnCheckedCheckboxButton(int i){
        getAllUncheckedCheckboxes().get(i).click();
    }

    public int getUncheckedListSize(){
        return getAllUncheckedCheckboxes().size();
    }

    public int getCheckedListSize(){
        return getAllCheckedCheckboxes().size();
    }

}
