package runner;

import Browser.Driver;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import utilites.Helper;

import static Browser.Driver.driver;

public class Hooks extends AbstractTestNGCucumberTests {
    @BeforeSuite
    public static void openBrowser(@Optional("chrome") String browserName){
        Driver.startDriver(browserName);
    }

    @AfterSuite
    public static void closeBrowser(){
        Driver.stopDriver();
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
