package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.UserRegistrationPage;

public class UserRegistrationTestWithDDTAndDataProvider extends TestBase {

    HomePage homeObject;
    UserRegistrationPage registerObject;
    @DataProvider(name = "testData")
    public static Object [] [] UserData()
    {
        return new Object [][]{
                {"Mohamed", "Ali", "mail@emailtsts.com", "123456789"},
                { "Ahmed", "Khaled","akt@gmail.com", "mawraaaltabea"}
        };
    }
    @Test (priority = 1, alwaysRun = true, dataProvider = "testData")
    public void UserCanRegisterSuccessfully(String fName, String lName, String email, String password)
    {
        homeObject = new HomePage(driver);
        homeObject.openRegistrationPage();
        registerObject = new UserRegistrationPage(driver);
        registerObject.userRegistration(fName, lName, email, password);
        Assert.assertTrue(registerObject.successfulMessage.getText().contains("Your registration completed"));
    }
}
