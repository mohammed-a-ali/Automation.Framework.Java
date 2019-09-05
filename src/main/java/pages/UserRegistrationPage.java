package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegistrationPage extends pageBase {

    public UserRegistrationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "gender-male")
    WebElement genderRadio;

    @FindBy(id = "FirstName")
    WebElement fNameTextbox;

    @FindBy(id = "LastName")
    WebElement lNameTextbox;

    @FindBy(name = "DateOfBirthDay")
    WebElement Day;

    @FindBy(name = "DateOfBirthMonth")
    WebElement month;

    @FindBy(name = "DateOfBirthYear")
    WebElement year;

    @FindBy(id = "Email")
    WebElement emailTextbox;

    @FindBy(id = "Password")
    WebElement passwordTextbox;

    @FindBy(id = "ConfirmPassword")
    WebElement confirmPassword;

    @FindBy(id = "register-button")
    WebElement registerButton;

    @FindBy (className = "result")
    public WebElement successfullMessage;

    public void userRegistration(String firstName, String lastName, String email, String password)
    {
        clickButton(genderRadio);
        setTextElemntText(fNameTextbox, firstName);
        setTextElemntText(lNameTextbox, lastName);
        setTextElemntText(emailTextbox, email);
        setTextElemntText(passwordTextbox, password);
        setTextElemntText(confirmPassword, password);
        clickButton(registerButton);
    }
}
