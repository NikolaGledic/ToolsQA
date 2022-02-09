package PagesToolsQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SideBarPage {

    public WebDriver driver;
    List<WebElement> sideBar;

    public SideBarPage(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> getSideBar() {
        return driver.findElements(By.cssSelector(".card.mt-4.top-card"));
    }

    //***********************************************

    public void clickOnElements(){
        getSideBar().get(0).click();
    }

    public void clickOnForms(){
        getSideBar().get(1).click();
    }

    public void clickOnAlertsFrameAndWindows(){
        getSideBar().get(2).click();
    }

    public void clickOnWidgets(){
        getSideBar().get(3).click();
    }

    public void clickOnInteraction(){
        getSideBar().get(4).click();
    }

    public void clickOnBookStoreApp(){
        getSideBar().get(5).click();
    }

}
