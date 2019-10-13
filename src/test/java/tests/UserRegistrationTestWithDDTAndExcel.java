package tests;

import data.ExcelReader;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.UserRegistrationPage;

import java.io.IOException;

public class UserRegistrationTestWithDDTAndExcel extends TestBase {

    HomePage homeObject;
    UserRegistrationPage registerObject;

    @DataProvider(name = "ExcelData")
    public Object [][] userRegisterData() throws IOException {
        //Get data from excel reader class
        ExcelReader er = new ExcelReader();
        return er.getExcelData();
    }

    @Test(priority = 1, alwaysRun = true, dataProvider = "ExcelData")
    public void UserCanRegisterSuccessfully(String firstName, String lastName, String email, String password)
    {
        homeObject = new HomePage(driver);
        homeObject.openRegistrationPage();
        registerObject = new UserRegistrationPage(driver);
        registerObject.userRegistration(firstName, lastName, email, password);
        Assert.assertTrue(registerObject.successfulMessage.getText().contains("Your registration completed"));
        registerObject.logOt();
    }
}
