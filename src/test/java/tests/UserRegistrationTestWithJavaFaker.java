package tests;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.UserRegistrationPage;

public class UserRegistrationTestWithJavaFaker extends TestBase {

    HomePage homeObject;
    UserRegistrationPage registerObject;
    Faker fakeData = new Faker();
    String firstName = fakeData.name().firstName();
    String lastName = fakeData.name().lastName();
    String email = fakeData.internet().emailAddress();
    String password = fakeData.number().digits(8).toString();

    @Test
    public void UserCanRegisterSuccessfully()
    {
        homeObject = new HomePage(driver);
        homeObject.openRegistrationPage();
        registerObject = new UserRegistrationPage(driver);
        registerObject.userRegistration(firstName, lastName, email, password);
        Assert.assertTrue(registerObject.successfulMessage.getText().contains("Your registration completed"));
        System.out.println("FirstName : "+ firstName + " LastName : " + lastName + " Email : " + email + " Password : " + password);
        registerObject.logOt();
    }
}
