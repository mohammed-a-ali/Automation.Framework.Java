package tests;

import com.opencsv.CSVReader;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.UserRegistrationPage;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UserRegistrationTestWithTDDAndCSV extends TestBase {

    HomePage homeObject;
    UserRegistrationPage registerObject;

    CSVReader reader ;

    @Test
    public void UserCanRegisterSuccessfully() throws IOException {
        //Get CSV File path
        String CSV_File = System.getProperty("user.dir") + "\\src\\test\\java\\data\\UserData.csv";
        reader = new CSVReader(new FileReader(CSV_File));
        String [] csvCell;
        //while loop will be executed till the last valus in the CSV file
        while ((csvCell = reader.readNext()) != null)
        {
            String firstName = csvCell[0];
            String lastName = csvCell[1];
            String email = csvCell[2];
            String passsword = csvCell[3];
            homeObject = new HomePage(driver);
            homeObject.openRegistrationPage();
            registerObject = new UserRegistrationPage(driver);
            registerObject.userRegistration(firstName, lastName, email,passsword);
            Assert.assertTrue(registerObject.successfulMessage.getText().contains("Your registration completed"));
            registerObject.logOt();
        }
    }
}
