package TestCases;


import Utility.Configreader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class BaseClass {

    public static String baseURL = "http://demo.guru99.com/V4/";
    WebDriver driver;
    Configreader reader;
    @BeforeMethod
    public void Setup() throws IOException {

        reader = new Configreader();

     //   WebDriverManager.firefoxdriver().setup();
       WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
       // driver = new FirefoxDriver();

    }
    @AfterMethod
    public void teardown() {

        driver.quit();
    }
}
