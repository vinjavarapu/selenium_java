package Pages;


import Utility.Configreader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class LoginPage  {

    Configreader configreader = new Configreader();
   public static WebDriver driver;
    By username = By.name("uid");
    By password = By.name("password");
    By LoginButton = By.name("btnLogin");
    By ResetButton = By.name("btnReset");

    public LoginPage(WebDriver driver) throws IOException {

        this.driver = driver;
    }

    public void enterWrongUsername() {

        driver.findElement(username).sendKeys(configreader.GetWrongUsername());
    }
    public void enterWrongPassword() {

        driver.findElement(password).sendKeys(configreader.GetWrongPassword());
    }
    public void ClickLoginButton() {

        driver.findElement(LoginButton).click();
    }
    public void enterUsername() {

        driver.findElement(username).sendKeys(configreader.GetUserName());
    }
    public void enterPassword() {

        driver.findElement(password).sendKeys(configreader.GetPassword());
    }
    public void ClickResetButton() {

        driver.findElement(ResetButton).click();
    }


}
