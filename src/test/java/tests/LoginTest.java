package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class LoginTest extends TestBase {
    @Test
    public void validLoginTest() {

        //Create an object of LoginPage to access web elements
        LoginPage loginPage = new LoginPage();

        //Send valid credentials
        ReusableMethods.waitFor(2);
        loginPage.usernameInput.sendKeys(ConfigReader.getProperty("validUsername"));
        ReusableMethods.waitFor(2);
        loginPage.passordInput.sendKeys(ConfigReader.getProperty("validPassword"));
        ReusableMethods.waitFor(2);
        //Click login button
        loginPage.loginButton.click();
        ReusableMethods.waitFor(2);
        //Verify that user is redirected to the dashboard or home page
        Assert.assertTrue(loginPage.loggedInSuccess.getText().contains("Logged"));
    }

    @Test
    public void negativeUsernameTest(){
        //Create an object of LoginPage to access web elements
        LoginPage loginPage = new LoginPage();

        //Send invalid credentials
        ReusableMethods.waitFor(2);
        loginPage.usernameInput.sendKeys(ConfigReader.getProperty("inValidUsername"));
        ReusableMethods.waitFor(2);
        loginPage.passordInput.sendKeys(ConfigReader.getProperty("validPassword"));
        ReusableMethods.waitFor(2);
        //Click login button
        loginPage.loginButton.click();
        ReusableMethods.waitFor(2);
        //Verify that user is redirected to the dashboard or home page
        Assert.assertTrue(loginPage.errorMessage.isDisplayed());
        ReusableMethods.takeScreenshot("negativeUserNameTest");

    }

    @Test
    public void negativePasswordTest(){
        //Create an object of LoginPage to access web elements
        LoginPage loginPage = new LoginPage();

        //Send invalid credentials
        ReusableMethods.waitFor(2);
        loginPage.usernameInput.sendKeys(ConfigReader.getProperty("validUsername"));
        ReusableMethods.waitFor(2);
        loginPage.passordInput.sendKeys(ConfigReader.getProperty("inValidPassword"));
        ReusableMethods.waitFor(2);
        //Click login button
        loginPage.loginButton.click();
        ReusableMethods.waitFor(2);
        //Verify that user is redirected to the dashboard or home page
        Assert.assertTrue(loginPage.errorMessage.isDisplayed());
        ReusableMethods.takeScreenshot("negativePasswordTest");
    }


}
