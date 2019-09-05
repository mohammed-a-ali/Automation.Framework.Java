package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class pageBase {

    protected WebDriver driver;

    //Create constructor
    public pageBase(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    //Click Button method
    protected static void clickButton(WebElement button)
    {
        button.click();
    }

    //Set text in a textbox
    protected static void setTextElemntText(WebElement textElemnt, String value)
    {
        textElemnt.sendKeys(value);
    }
}
