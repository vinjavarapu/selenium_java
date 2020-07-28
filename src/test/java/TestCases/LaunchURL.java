package TestCases;

import Pages.LoginPage;
import Utility.Configreader;
import Utility.Screenshots;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class LaunchURL extends BaseClass {

    LoginPage login;


    @Test(priority=1)
    public void loginTest() throws InterruptedException, IOException {

        driver.get(reader.GetApplicationURL());
        driver.manage().window().maximize();
         login = new LoginPage(driver);
        Configreader reader = new Configreader();
        login.enterWrongUsername();
        Screenshots.Screenshot(driver,"ravi");
        login.enterWrongPassword();
        login.ClickLoginButton();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.switchTo().alert().accept();

        Screenshots.Screenshot(driver,"loginmessage");


    }
    @Test(priority=2)
    public void validLogin() throws IOException {

        driver.get(reader.GetApplicationURL());
        login = new LoginPage(driver);
        login.enterUsername();
        login.enterPassword();
        login.ClickLoginButton();


    }
    @Test(priority=3)
    public void ResetLogin() throws IOException {

        driver.get(reader.GetApplicationURL());
        login = new LoginPage(driver);
        login.enterUsername();
        login.enterPassword();
        login.ClickResetButton();
    }

}


