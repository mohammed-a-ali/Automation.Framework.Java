package tests;

import data.JsonDataReader;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.UserRegistrationPage;

import java.io.IOException;

public class UserRegistrationTestWithDDTAndJSON extends TestBase {

    HomePage homeObject;
    UserRegistrationPage registerObject;

    @Test
    public void UserCanRegisterSuccessfully() throws IOException, ParseException {
        JsonDataReader jsonReader = new JsonDataReader();
        jsonReader.jsonReader();

        homeObject = new HomePage(driver);
        homeObject.openRegistrationPage();
        registerObject = new UserRegistrationPage(driver);
        registerObject.userRegistration(jsonReader.firstName, jsonReader.lastName, jsonReader.email,jsonReader.password);
        Assert.assertTrue(registerObject.successfulMessage.getText().contains("Your registration completed"));
        registerObject.logOt();
    }
}
