package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import utilites.Helper;

import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver;

    @BeforeSuite
    @Parameters("browser")
    public void startDriver(@Optional("chrome") String browserName)
    {
        if (browserName.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            //System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }else if (browserName.equalsIgnoreCase("FireFox")){
            WebDriverManager.firefoxdriver().setup();
            //System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        }else if(browserName.equalsIgnoreCase("IE")){
            WebDriverManager.iedriver().setup();
            //System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "/drivers/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.MILLISECONDS);
        driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @AfterSuite
    public void stopDriver()
    {
        driver.quit();
    }
    
    //Take a screenshot when testcase fails and add it to the Screenshot folder
    @AfterMethod
    public void ScreenshotOnFailure(ITestResult result)
    {
        if (result.getStatus() == ITestResult.FAILURE)
        {
            System.out.println("Failed");
            System.out.println("Taking a Screenshot...");
            Helper.captureScreenShot(driver, result.getName());
        }
    }
}
