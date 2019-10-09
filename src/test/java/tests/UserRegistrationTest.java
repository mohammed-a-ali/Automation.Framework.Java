package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.UserRegistrationPage;

public class UserRegistrationTest extends TestBase {

    HomePage homeObject;
    UserRegistrationPage registerObject;

    @Test
    public void UserCanRegisterSuccessfully()
    {
        homeObject = new HomePage(driver);
        homeObject.openRegistrationPage();
        registerObject = new UserRegistrationPage(driver);
        registerObject.userRegistration("Mohamed", "Ali", "mali@emailtsta.com","123456789");
        Assert.assertTrue(registerObject.successfulMessage.getText().contains("Your registration completed"));
    }
}
