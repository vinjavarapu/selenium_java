package TestCases;

import Pages.LoginPage;
import Utility.Screenshots;
import org.testng.annotations.Test;

import java.io.IOException;

public class LaunchURL extends BaseClass {

    LoginPage login;

    @Test(priority=1)
    public void loginTest() throws InterruptedException, IOException {

        driver.get(baseURL);
        driver.manage().window().maximize();
         login = new LoginPage(driver);
        login.enterWrongUsername();
        Screenshots.Screenshot(driver,"ravi");
        login.enterWrongPassword();
        login.ClickLoginButton();

        driver.switchTo().alert().accept();

        Screenshots.Screenshot(driver,"loginmessage");


    }
    @Test(priority=2)
    public void validLogin() {

        driver.get(baseURL);
        login = new LoginPage(driver);
        login.enterUsername();
        login.enterPassword();
        login.ClickLoginButton();


    }
}


