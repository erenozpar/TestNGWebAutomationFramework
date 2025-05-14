package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {
    private Driver() {
    }

    //Singleton design pattern is used to ensure only one WebDriver instance is active
    private static WebDriver driver;

    //Returns the same diver instance every time it is called
    public static WebDriver getDriver() {
        if (driver == null) {
            //Get browser type from configuration file
            String browser = ConfigReader.getProperty("browser");

            switch (browser) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "safari":
                    WebDriverManager.safaridriver().setup();
                    driver = new FirefoxDriver();
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
            }
            //This method runs before each test method
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
        return driver;
    }

    public static void closeDiver() {
        if (driver != null) {
            driver.close();
            driver = null;
        }
    }

    public static void quiteDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
