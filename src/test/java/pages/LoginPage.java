package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    public LoginPage() {
        //Constructor to initiliaze web elements using PageFactory
        //PageFactory links the element defined below with actual web elements on the page

        PageFactory.initElements(Driver.getDriver(), this);

    }

    //Web Elements on the login page
    @FindBy(id = "username")
    public WebElement usernameInput;

    @FindBy(id = "password")
    public WebElement passordInput;

    @FindBy(id="submit")
    public WebElement loginButton;

    @FindBy(id = "error")
    public WebElement errorMessage;
@FindBy(className = "post-title")
    public WebElement loggedInSuccess;

}

