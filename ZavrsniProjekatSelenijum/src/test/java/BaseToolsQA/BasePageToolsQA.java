package BaseToolsQA;

import PagesToolsQA.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.time.Duration;

public class BasePageToolsQA {

    public WebDriver driver;
    public WebDriverWait wdwait;
    public ExcelReader excelReader;
    public String homeURL;
    public SideBarPage sideBarPage;
    public ElementsPage elementsPage;
    public TextBoxPage textBoxPage;
    public RadioButtonPage radioButtonPage;
    public WebTablesPage webTablesPage;
    public PracticeFormPage practiceFormPage;
    public CheckBoxPage checkBoxPage;
    public LoginPage loginPage;

    @BeforeClass
    public void setUp() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(15));
        excelReader = new ExcelReader("ToolsQA.xlsx");
        homeURL = excelReader.getStringData("URL", 1,0);
        sideBarPage = new SideBarPage(driver);
        elementsPage = new ElementsPage(driver);
        textBoxPage = new TextBoxPage(driver);
        radioButtonPage = new RadioButtonPage(driver);
        webTablesPage = new WebTablesPage(driver);
        practiceFormPage = new PracticeFormPage(driver);
        checkBoxPage = new CheckBoxPage(driver);
        loginPage = new LoginPage(driver);
    }


   @AfterClass
    public void tearDown(){
        driver.manage().deleteAllCookies();
        driver.close();
        driver.quit();
    }

    public void hardClick(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", element);
    }

    public boolean isElementDisplayed(WebElement element){
        return element.isDisplayed();
    }

    public void waiter(WebElement element){
        wdwait.until(ExpectedConditions.visibilityOf(element));
    }

}
