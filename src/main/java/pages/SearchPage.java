package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchPage extends PageBase {
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "small-searchterms")
    WebElement searchTextbox;

    @FindBy(css = "input.button-1.search-box-button")
    WebElement searchButton;

    @FindBy(id = "ui-id-1")
    List<WebElement> productList;

    @FindBy(linkText = "Apple MacBook Pro 13-inch")
    WebElement productTitle;

    public void productSearch(String productName)
    {
        setTextElemntText(searchTextbox, productName);
        clickButton(searchButton);
    }

    public void openProductDetailsPage()
    {
        clickButton(productTitle);
    }

    public void productSearchUsingAutoSuggest(String searchText)
    {
        setTextElemntText(searchTextbox, searchText);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Error Occured" + e.getMessage());
        }
        productList.get(0).click();
    }
}
