package PagesToolsQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WebTablesPage {

    WebDriver driver;
    WebElement addButton;
    WebElement searchBox;
    WebElement removeUser;
    WebElement editUser;
    WebElement firstName;
    WebElement lastName;
    WebElement email;
    WebElement age;
    WebElement salary;
    WebElement department;
    WebElement submitButton;
    List<WebElement> cell;
    List<WebElement> allElementsInWebTable;

    public WebTablesPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getAddButton() {
        return driver.findElement(By.id("addNewRecordButton"));
    }

    public WebElement getSearchBox() {
        return driver.findElement(By.id("searchBox"));
    }

    public WebElement getRemoveUser(int i) {
        return driver.findElement(By.id("delete-record-" + i));
    }

    public WebElement getEditUser(int i) {
        return driver.findElement(By.id("edit-record-" + i));
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

    public WebElement getAge() {
        return driver.findElement(By.id("age"));
    }

    public WebElement getSalary() {
        return driver.findElement(By.id("salary"));
    }

    public WebElement getDepartment() {
        return driver.findElement(By.id("department"));
    }

    public WebElement getSubmitButton() {
        return driver.findElement(By.id("submit"));
    }

    public List<WebElement> getCell() {
        return driver.findElements(By.className("rt-td"));
    }

    public List<WebElement> getAllElementsInWebTable() {
        return driver.findElements(By.className("rt-tr-group"));
    }

    //*************************************

    public void clickOnAddButton(){
        getAddButton().click();
    }

    public void searchTable(String search){
        getSearchBox().clear();
        getSearchBox().sendKeys(search);
    }

    public void clickOnEditUser(int i){
        getEditUser(i).click();
    }

    public String cellTextOutput(int i){
        return getCell().get(i).getText();
    }

    public void clickOnDeleteUser(int i){
        getRemoveUser(i).click();
    }

    public void deleteAllUsers(){
        int i = 1;
        while (!cellTextOutput(0).isBlank()){
            clickOnDeleteUser(i);
            i++;
        }
    }

    public void insertFirstName(String name){
        getFirstName().clear();
        getFirstName().sendKeys(name);
    }

    public void insertLastName(String lastName){
        getLastName().clear();
        getLastName().sendKeys(lastName);
    }
    public void insertAge(int age){
        getAge().clear();
        getAge().sendKeys(String.valueOf(age));
    }
    public void insertEmail(String email){
        getEmail().clear();
        getEmail().sendKeys(email);
    }
    public void insertSalary(int salary){
        getSalary().clear();
        getSalary().sendKeys(String.valueOf(salary));
    }
    public void insertDepartment(String department){
        getDepartment().clear();
        getDepartment().sendKeys(department);
    }

    public void clickOnSubmitButton(){
        getSubmitButton().click();
    }

    public int countTableSize() {
        int counter = 0;
        for (int i = 0; i < getAllElementsInWebTable().size(); i++) {
            if (!getAllElementsInWebTable().get(i).getText().isBlank()){
                counter++;
            }
            else {
                break;
            }
        }
        return counter;
    }
}
