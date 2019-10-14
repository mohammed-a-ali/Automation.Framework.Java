package Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import utilites.Helper;

import java.util.concurrent.TimeUnit;

public class Driver {
    public static WebDriver driver;

    @Parameters("browser")
    public static void startDriver(String browserName)
    {
        if (browserName.equalsIgnoreCase("chrome")) {
           WebDriverManager.chromedriver().setup();
           driver = new ChromeDriver();
        }else if (browserName.equalsIgnoreCase("FireFox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }else if(browserName.equalsIgnoreCase("IE")){
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
        }else if(browserName.equalsIgnoreCase("Edge")){
            WebDriverManager.edgedriver().setup();
    }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.MILLISECONDS);
        driver.navigate().to("https://demo.nopcommerce.com/");
    }

    public static void stopDriver()
    {
        driver.quit();
    }
}
