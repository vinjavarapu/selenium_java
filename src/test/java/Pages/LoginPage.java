package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage  {
   public static WebDriver driver;
    By username = By.name("uid");
    By password = By.name("password");
    By LoginButton = By.name("btnLogin");

    public LoginPage(WebDriver driver){

        this.driver = driver;
    }

    public void enterUsername() {

        driver.findElement(username).sendKeys("test");
    }
    public void enterPassword() {

        driver.findElement(password).sendKeys("test");
    }
    public void ClickLoginButton() {

        driver.findElement(LoginButton).click();
    }

}
