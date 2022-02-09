package PagesToolsQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Locale;

public class PracticeFormPage {

    WebDriver driver;
    WebElement practiceForm;
    WebElement firstName;
    WebElement lastName;
    WebElement email;
    List<WebElement> gender;
    WebElement mobile;
    WebElement dateOfBirth;
    WebElement monthSelect;
    WebElement yearSelect;
    WebElement daySelect;
    WebElement subjects;
    List<WebElement> hobbies;
    WebElement addPicture;
    WebElement currentAddress;
    WebElement state;
    WebElement city;
    WebElement submitButton;
    WebElement closeButton;

    public PracticeFormPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getPracticeForm() {
        return driver.findElement(By.cssSelector(".show > ul:nth-child(1) > li:nth-child(1) > span:nth-child(2)"));
    }

    public WebElement getFirstName() {
        return driver.findElement(By.id("firstName"));
    }

    public WebElement getLastName() {
        return driver.findElement(By.id("lastName"));
    }

    public WebElement getEmail() {
        return driver.findElement(By.id("userEmail"));
    }

    public List<WebElement> getGender() {
        return driver.findElements(By.cssSelector(".custom-control.custom-radio.custom-control-inline"));
    }

    public WebElement getMobile() {
        return driver.findElement(By.id("userNumber"));
    }

    public WebElement getDateOfBirth() {
        return driver.findElement(By.id("dateOfBirthInput"));
    }

    public WebElement getSubjects() {
        return driver.findElement(By.id("subjectsContainer"));
    }

    public List<WebElement> getHobbies() {
        return driver.findElements(By.cssSelector(".custom-control.custom-checkbox.custom-control-inline"));
    }

    public WebElement getAddPicture() {
        return driver.findElement(By.id("uploadPicture"));
    }

    public WebElement getCurrentAddress() {
        return driver.findElement(By.id("currentAddress"));
    }

    public WebElement getState() {
        return driver.findElement(By.id("state"));
    }

    public WebElement getCity() {
        return driver.findElement(By.id("city"));
    }

    public WebElement getSubmitButton() {
        return driver.findElement(By.id("submit"));
    }

    public WebElement getMonthSelect() {
        return driver.findElement(By.className("react-datepicker__month-select"));
    }

    public WebElement getYearSelect() {
        return driver.findElement(By.className("react-datepicker__year-select"));
    }

    public WebElement getDaySelect() {
        return driver.findElement(By.cssSelector("react-datepicker__month"));
    }


    //**********************************************************

    public void clickPracticeForm(){
        getPracticeForm().click();
    }
    public void insertFirstName(String firstName) {
        getFirstName().clear();
        getFirstName().sendKeys(firstName);
    }

    public void insertLastName(String lastName) {
        getLastName().clear();
        getLastName().sendKeys(lastName);
    }

    public void insertEmail(String email) {
        getEmail().clear();
        getEmail().sendKeys(email);
    }

    public void selectGender(String gender) {
        if (gender.equalsIgnoreCase("male")){
            getGender().get(0).click();
        }
        else if (gender.equalsIgnoreCase("female")){
            getGender().get(1).click();
        }
        else{
            getGender().get(2).click();
        }
    }

    public void insertMobile(int mobile) {
        getMobile().clear();
        getMobile().sendKeys(String.valueOf(mobile));
    }

    /*public void insertMonthOfBirth(int month){
        Select drpMonth = new Select(getMonthSelect());
        drpMonth.selectByIndex(month-1);
    }
    public void insertDayOfBirth(String day){
        Select drpDay = new Select(getDaySelect());
        drpDay.selectByValue(day);
    }

    public void insertYearOfBirth(String year){
        Select drpYear = new Select(getYearSelect());
        drpYear.selectByValue(year);
    }

    public void insertDateOfBirth(String day, int month, String year){
        getDateOfBirth().click();
        insertMonthOfBirth(month);
        insertDayOfBirth(day);
        insertYearOfBirth(year);
    }*/

    public void insertCurrentAddress(String address){
        getCurrentAddress().clear();
        getCurrentAddress().sendKeys(address);
    }


}
