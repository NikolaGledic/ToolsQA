package TestsToolsQA;

import BaseToolsQA.BasePageToolsQA;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FormsTest extends BasePageToolsQA {

    @BeforeMethod
    public void setUpPage(){
        driver.manage().window().maximize();
        driver.navigate().to(homeURL);
        sideBarPage.clickOnForms();
    }

    @Test
    public void sendPracticeForm(){

        String firstName = excelReader.getStringData("Data", 2, 2);
        String lastName = excelReader.getStringData("Data", 2,3);
        String email = excelReader.getStringData("Data", 2, 1);
        int mobile = excelReader.getIntegerData("Data",2,9 );
        String date = excelReader.getStringData("Data",2,10);


        practiceFormPage.clickPracticeForm();

        practiceFormPage.insertMobile(mobile);
        practiceFormPage.selectGender("female");

    }

}
