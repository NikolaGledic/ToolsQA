package TestsToolsQA;

import BaseToolsQA.BasePageToolsQA;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ElementsTest extends BasePageToolsQA {


    @BeforeMethod
    public void setUpPage(){
        driver.manage().window().maximize();
        driver.navigate().to(homeURL);
        sideBarPage.clickOnElements();
    }

    @Test
    public void textBoxSubmit() {    //verify that user can successfully submit text box
        String fullName = excelReader.getStringData("Data", 1,0);
        String email = excelReader.getStringData("Data", 1,1);
        String currentAddress = excelReader.getStringData("Data", 1,4);
        String permanentAddress = excelReader.getStringData("Data", 1,5);

        elementsPage.clickOnTextBox();
        textBoxPage.insertFullName(fullName);
        textBoxPage.insertEmail(email);
        textBoxPage.insertCurrentAddress(currentAddress);
        textBoxPage.insertPermanentAddress(permanentAddress);
        textBoxPage.clickOnSubmit();

        String actualName = textBoxPage.getSubmittedName().getText().replaceAll("Name:","");
        String actualEmail = textBoxPage.getSubmittedEmail().getText().replaceAll("Email:","");
        String actualCurrentAddress = textBoxPage.getSubmittedCurrentAddress().getText().replaceAll("Current Address " +
                ":", "");
        String actualPermanentAddress = textBoxPage.getSubmittedPermanentAddress().getText().replaceAll("Permanent " +
                "Address :","");

        Assert.assertTrue(driver.findElement(By.id("output")).isDisplayed());
        Assert.assertEquals(actualName, fullName);
        Assert.assertEquals(actualEmail,email);
        //Assert.assertEquals(actualCurrentAddress, currentAddress);
        //Assert.assertEquals(actualPermanentAddress, permanentAddress);

    }

    @Test
    public void checkBoxTest() {    //verify that when user selects "Home" all child files and folders are selected

        elementsPage.clickOnCheckBox();

    }

    @Test
    public void radioButtonCheck(){ // verify that user has selected impressive radio button
        String impressiveMessage = excelReader.getStringData("Other", 0,1);
        elementsPage.clickOnRadioButton();
        radioButtonPage.selectImpressive();

        String actualMessage = radioButtonPage.message();

        Assert.assertTrue(radioButtonPage.getMessage().isDisplayed());
        Assert.assertEquals(actualMessage, impressiveMessage);

    }

    @Test
    public void webTablesDeleteTest(){  //verify that user can delete existing element in web table
        elementsPage.clickOnWebTables();
        webTablesPage.clickOnDeleteUser(2);

        Assert.assertEquals(2, webTablesPage.countTableSize());
        // jos neki assert treba smisliti
    }

    @Test
    public void webTablesAddUserTest(){ // verify that user can successfully add data to table

        elementsPage.clickOnWebTables();
        webTablesPage.deleteAllUsers();
        int j = 0;

        for (int i = 1; i < excelReader.getLastRow("Data"); i++) {

            String firstName = excelReader.getStringData("Data", i, 2);
            String lastName = excelReader.getStringData("Data", i, 3);
            int age = excelReader.getIntegerData("Data", i, 6);
            String email = excelReader.getStringData("Data", i, 1);
            int salary = excelReader.getIntegerData("Data", i, 7);
            String department = excelReader.getStringData("Data", i, 8);

            webTablesPage.clickOnAddButton();
            webTablesPage.insertFirstName(firstName);
            webTablesPage.insertLastName(lastName);
            webTablesPage.insertAge(age);
            webTablesPage.insertEmail(email);
            webTablesPage.insertSalary(salary);
            webTablesPage.insertDepartment(department);
            webTablesPage.clickOnSubmitButton();

            Assert.assertEquals(webTablesPage.cellTextOutput(j), firstName);
            Assert.assertEquals(webTablesPage.cellTextOutput(j+1), lastName);
            Assert.assertEquals(webTablesPage.cellTextOutput(j+2), String.valueOf(age));
            Assert.assertEquals(webTablesPage.cellTextOutput(j+3), email);
            Assert.assertEquals(webTablesPage.cellTextOutput(j+4), String.valueOf(salary));
            Assert.assertEquals(webTablesPage.cellTextOutput(j+5), department);

            j +=7;
        }
    }

    @Test
    public void checkBoxAllCheckedTest() {      //verify that when parent checkbox is selected all child checkboxes are
                                                // selected

        int actualNumberOfUncheckedItems = 0;
        int actualNumberOfCheckedItems = 17;

        elementsPage.clickOnCheckBox();
        checkBoxPage.clickOnUncheckedCheckboxButton(0);



        for (int i = 0; i < 6; i++) {
            checkBoxPage.clickOnDropdownButton(i);
        }

        Assert.assertTrue(checkBoxPage.getMessage().isDisplayed());
        Assert.assertEquals(actualNumberOfCheckedItems, checkBoxPage.getCheckedListSize());
        Assert.assertEquals(actualNumberOfUncheckedItems, checkBoxPage.getUncheckedListSize());
    }



}
