package steps;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HomePage;
import pages.UserRegistrationPage;
import runner.Hooks;

import static Browser.Driver.driver;

public class UserRegistration extends Hooks {

    HomePage homeObject ;
    UserRegistrationPage registerObject;
    Faker fakeData = new Faker();
    String firstName = fakeData.name().firstName();
    String lastName = fakeData.name().lastName();
    String email = fakeData.internet().emailAddress();
    String password = fakeData.number().digits(8).toString();

    @Given("the user in the home page")
    public void the_user_in_the_home_page() {
        homeObject = new HomePage(driver);
        homeObject.openRegistrationPage();
    }

    @When("I click on register link")
    public void i_click_on_register_link() {
        Assert.assertTrue(driver.getCurrentUrl().contains("register"));
    }

    @And("I entered the user data")
    public void i_entered_the_user_data() {
        registerObject = new UserRegistrationPage(driver);
        registerObject.userRegistration(firstName, lastName, email, password);
    }

    @Then("The registration page displays successfully")
    public void the_registration_page_displays_successfully() {
        Assert.assertTrue(registerObject.successfulMessage.getText().contains("Your registration completed"));
        registerObject.logOt();
    }

    @And("I entered {string}, {string}, {string}, {string}")
    public void iEntered(String firstName, String lastName, String email, String password) {
        registerObject = new UserRegistrationPage(driver);
        registerObject.userRegistration(firstName, lastName, email, password);
    }
}
