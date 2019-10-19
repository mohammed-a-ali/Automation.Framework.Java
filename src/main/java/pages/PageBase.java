package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase {

    protected WebDriver driver;

    //Create constructor
    public PageBase(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    //Click Button method
    protected static void clickButton(WebElement button)
    {
        button.click();
    }

    //Set text in a textbox
    protected static void setTextElementText(WebElement textElement, String value)
    {
        textElement.sendKeys(value);
    }
}
