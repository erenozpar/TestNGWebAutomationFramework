package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utilities.ConfigReader;
import utilities.Driver;

public abstract class TestBase {

    @BeforeMethod
    public void setUp() {
        //Navigate to the login page
        Driver.getDriver().navigate().to(ConfigReader.getProperty("url"));
        }

    @AfterMethod
    public void tearDown() {
        //This method runs after each test method
        Driver.closeDiver();
    }

}
